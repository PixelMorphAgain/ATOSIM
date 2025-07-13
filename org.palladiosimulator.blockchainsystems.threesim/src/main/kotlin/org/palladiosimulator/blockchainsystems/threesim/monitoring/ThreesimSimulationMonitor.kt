package org.palladiosimulator.blockchainsystems.threesim.monitoring

import org.palladiosimulator.blockchainsystems.core.block.abstractions.BlockType
import org.palladiosimulator.blockchainsystems.core.blockchain.BlockAppendedTraceEvent
import org.palladiosimulator.blockchainsystems.core.blockchain.BlockTypeChangedTraceEvent
import org.palladiosimulator.blockchainsystems.core.network.MessageDroppedTraceEvent
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLogOrigin
import org.palladiosimulator.blockchainsystems.core.geography.GeographicalRegions
import org.palladiosimulator.blockchainsystems.core.mining.BlockMinedTraceEvent
import org.palladiosimulator.blockchainsystems.core.monitoring.abstractions.SimulationMonitor
import org.palladiosimulator.blockchainsystems.core.simulation.termination.LongestChainExceededMaxLengthCondition
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystem
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemNode
import org.palladiosimulator.blockchainsystems.threesim.behavior.BlockUtils
import org.palladiosimulator.blockchainsystems.core.propagation.transaction.TransactionSentTraceEvent
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction
import org.palladiosimulator.blockchainsystems.threesim.simulation.termination.ThreesimNodeTerminationState
import org.palladiosimulator.blockchainsystems.threesim.utils.BlocksMap

/**
 * Monitor for the 3SIM simulation.
 *
 * @author Davis Riedel
 */
class ThreesimSimulationMonitor(
  private val maxBlockchainLengthCondition: LongestChainExceededMaxLengthCondition,
  private val numberOfRequiredSecurityConfirmations: Int
) : SimulationMonitor {

//  private val nodeTerminationStates: MutableMap<String, ThreesimNodeTerminationState> = HashMap()

  private val blocksProposedPerNode: MutableMap<String, Int> = mutableMapOf()

  // TODO: Is there a way to make them initialize once only
  private var includedBlocks: BlocksMap? = null
  private var confirmedBlocks: BlocksMap? = null
  private var staleBlocks: BlocksMap? = null
  private var forkedBlocks: BlocksMap? = null

  private var nodes: MutableSet<BlockchainSystemNode> = mutableSetOf()

  private var geographicalRegions: GeographicalRegions? = null

  private var numberOfSubmittedTransactions: Int = 0

  private var throughputTimer: Long = 0L

  override fun initialize(blockchainSystem: BlockchainSystem) {
    nodes = blockchainSystem.nodes
    geographicalRegions = blockchainSystem.geographicalRegions

//    nodes.forEach {
//      nodeTerminationStates.put(it.id, ThreesimNodeTerminationState(it, numberOfRequiredSecurityConfirmations))
//    }

    includedBlocks = BlocksMap(calculateMajorityThreshold())
    confirmedBlocks = BlocksMap(calculateMajorityThreshold())
    staleBlocks = BlocksMap(calculateMajorityThreshold())
    forkedBlocks = BlocksMap(calculateMajorityThreshold())
  }

  fun getFinalState(): ThreesimSimulationMonitorState {
    return ThreesimSimulationMonitorState(
      nodes = nodes,
      hashPowerPerNode = calculateHashPowerPerNode(),
      blocksProposedPerNode = calculateBlocksProposedPerNode(),
      geographicalRegions = geographicalRegions ?: throw IllegalStateException("geographicalRegions not initialized"),
      numberOfNodesPerRegion = calculateNumberOfNodesPerRegion(),
      numberOfSubmittedTransactions = numberOfSubmittedTransactions,
      numberOfConfirmedTransactions = calculateNumberOfConfirmedTransactions(),
      transactionConfirmationDurations = calculateTransactionConfirmationDurations(),
      blockProposalTimeAndConfirmationTimePerConfirmedBlock = calculateBlockProposalTimeAndConfirmationTimePerConfirmedBlock(),
//      meanTimeToFailure = TODO(),
//      meanTimeToRepair = TODO(),
      numberOfStaleBlocks = calculateNumberOfStaleBlocks(),
      numberOfConfirmedBlocks = calculateNumberOfConfirmedBlocks(),
//      tokensHeldPerNode = TODO()
    )
  }

  override fun onTraceEventOccurred(
    event: TraceEvent,
    logOrigin: TraceEventLogOrigin
  ) {
    when (event.eventType) {
      // TODO: Implement all trace event handling logic, e.g. check fails etc.

      BlockMinedTraceEvent.EVENT_TYPE -> {
        val e = event as BlockMinedTraceEvent
        val block = e.block

        if (BlockUtils.isBlockForked(block)) {
          forkedBlocks?.addNodeToBlock(block.hash, logOrigin.id, e.occurrenceTime)
        }

        blocksProposedPerNode[logOrigin.id] = (blocksProposedPerNode[logOrigin.id] ?: 0) + 1
      }

      BlockAppendedTraceEvent.EVENT_TYPE -> {
        val e = event as BlockAppendedTraceEvent

        val nodeId = logOrigin.id
        val blockHash = e.appendedBlock.hash

        when (e.appendedBlockType) {
          BlockType.IncludedBlock -> includedBlocks
          BlockType.ConfirmedBlock -> confirmedBlocks
          BlockType.StaleBlock -> staleBlocks
          BlockType.ForkingBlock -> forkedBlocks
        }?.addNodeToBlock(blockHash, nodeId, e.occurrenceTime)

        // TODO: This is called on each node, but it is only no longer stale, if accepted by majority of nodes, i.e. in the canonical chain.
        // TODO: We need another way to determine if a block is part of the canonical chain.

        maxBlockchainLengthCondition.onBlockAppended(e.blockPosition)
      }

      BlockTypeChangedTraceEvent.EVENT_TYPE -> {
        val e = event as BlockTypeChangedTraceEvent

        val nodeId = logOrigin.id
        val blockHash = e.block.hash

        when (e.oldBlockType) {
          BlockType.IncludedBlock -> includedBlocks
          BlockType.ConfirmedBlock -> confirmedBlocks
          BlockType.StaleBlock -> staleBlocks
          BlockType.ForkingBlock -> forkedBlocks
        }?.removeNodeFromBlock(blockHash, nodeId)

        when (e.newBlockType) {
          BlockType.IncludedBlock -> includedBlocks
          BlockType.ConfirmedBlock -> confirmedBlocks
          BlockType.StaleBlock -> staleBlocks
          BlockType.ForkingBlock -> forkedBlocks
        }?.addNodeToBlock(blockHash, nodeId, e.occurrenceTime)
      }

      TransactionSentTraceEvent.EVENT_TYPE -> {
        numberOfSubmittedTransactions++
      }

      MessageDroppedTraceEvent.EVENT_TYPE -> {
        // TODO: Calculate the time the system was inoperative
      }
    }

//    nodeTerminationStates[logOrigin.id]?.onTraceEventOccurred(event)
  }

  override fun shouldTerminate(): Boolean {
    // TODO: Implement other termination conditions if needed
    return maxBlockchainLengthCondition.hasLengthExceeded()
  }

//  fun getCanonicalChain(): List<AppendedBlock>? {
//    return nodes
//      .map { node ->
//        // longest chain of each node, associated by the last block in the chain
//        node.blockchain.getLongestChains().associateBy { it.last() }
//      }
//      // count how many nodes have a longest chain ending with the same block
//      // returns a map where the last block of a longest chain is the key and the value is a pair of the corresponding longest chain (first found is used)
//      // and the number of nodes that have this chain
//      .fold(emptyMap<AppendedBlock, Pair<List<AppendedBlock>, Int>>()) { acc, map ->
//        map.forEach {
//          if (acc.containsKey(it.key)) {
//            acc[it.key] = Pair(acc[it.key]!!.first, acc[it.key]!!.second + 1)
//          } else {
//            acc[it.key] = Pair(it.value, 1)
//          }
//        }
//        acc
//      }
//      // find the longest chain that is present in the most nodes
//      .maxByOrNull { it.value.second }
//      ?.value?.first
//  }

  private fun calculateMajorityThreshold(): Int {
    return (nodes.size / 2) + 1
  }

  private fun calculateNumberOfConfirmedBlocks(): Int {
    return confirmedBlocks?.getNumberOfValidBlocks() ?: throw IllegalStateException("confirmedBlocks not initialized")
  }

  private fun getConfirmedTransactions(): Collection<Pair<Set<Transaction>, Long?>> {
    return confirmedBlocks?.getValidBlocks()?.map { Pair(it.first.transactions, it.second) }
      ?: throw IllegalStateException("confirmedBlocks not initialized")
  }

  private fun calculateNumberOfConfirmedTransactions(): Int {
    return getConfirmedTransactions().size
  }

  private fun calculateNumberOfStaleBlocks(): Int {
    return staleBlocks?.getNumberOfValidBlocks()
      ?: throw IllegalStateException("staleBlocks not initialized")
  }

  private fun calculateBlocksProposedPerNode(): Collection<Int> {
    return blocksProposedPerNode.values
  }

  private fun calculateHashPowerPerNode(): Collection<Double> {
    return nodes.map { it.resourcePower }
  }

  private fun calculateNumberOfNodesPerRegion(): Collection<Int> {
    return nodes
      .groupingBy { it.geographicalRegion.region }
      .eachCount().values
  }

  private fun calculateTransactionConfirmationDurations(): Collection<Long> {
    return confirmedBlocks?.getValidBlocks()
      ?.flatMap { (block, confirmationTime) ->
        block.transactions.map { confirmationTime - it.creationTime }
      }
      ?: throw IllegalStateException("confirmedBlocks not initialized")
  }

  private fun calculateBlockProposalTimeAndConfirmationTimePerConfirmedBlock(): Collection<Pair<Long, Long>> {
    return confirmedBlocks?.getValidBlocks()
      ?.map { Pair(it.first.blockMinedTimestamp, it.second) }
      ?: throw IllegalStateException("confirmedBlocks not initialized")
  }
}