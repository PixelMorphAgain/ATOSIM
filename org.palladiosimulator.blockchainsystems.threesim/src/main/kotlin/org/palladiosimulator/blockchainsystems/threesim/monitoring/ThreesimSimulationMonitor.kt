package org.palladiosimulator.blockchainsystems.threesim.monitoring

import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block
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
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.AverageThroughputCalculator
import org.palladiosimulator.blockchainsystems.threesim.utils.BlockchainSystemFailureLog
import org.palladiosimulator.blockchainsystems.threesim.utils.BlocksMap

/**
 * Monitor for the 3SIM simulation.
 *
 * @author Davis Riedel
 */
class ThreesimSimulationMonitor(
  private val maxBlockchainLengthCondition: LongestChainExceededMaxLengthCondition,
  private val throughputMonitoringInterval: Long,
  private val failureThroughputThreshold: Double
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

  private var includedBlocksSinceLastThroughputCheck: BlocksMap? = null

  private val failureLog = BlockchainSystemFailureLog()

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

    includedBlocksSinceLastThroughputCheck = BlocksMap(calculateMajorityThreshold())
  }

  fun getFinalState(
    finalSystemTime: Long,
  ): ThreesimSimulationMonitorState {
    return ThreesimSimulationMonitorState(
      numberOfNodes = nodes.size,
      hashPowerPerNode = calculateHashPowerPerNode(),
      blocksProposedPerNode = calculateBlocksProposedPerNode(),
      numberOfGeographicalRegions = calculateNumberOfGeographicalRegions(),
      numberOfNodesPerRegion = calculateNumberOfNodesPerRegion(),
      numberOfSubmittedTransactions = numberOfSubmittedTransactions,
      numberOfConfirmedTransactions = calculateNumberOfConfirmedTransactions(),
      transactionConfirmationDurations = calculateTransactionConfirmationDurations(),
      blockProposalTimeAndConfirmationTimePerConfirmedBlock = calculateBlockProposalTimeAndConfirmationTimePerConfirmedBlock(),
      meanTimeBetweenFailures = calculateMeanTimeBetweenFailures(finalSystemTime).toLong(),
      meanTimeToRepair = failureLog.calculateMeanFailureDuration().toLong(),
      numberOfStaleBlocks = calculateNumberOfStaleBlocks(),
      numberOfConfirmedBlocks = calculateNumberOfConfirmedBlocks(),
      tokensHeldPerNode = TODO()
    )
  }

  private fun addBlock(blockType: BlockType, block: Block, nodeId: String, occurrenceTime: Long) {
    when (blockType) {
      BlockType.IncludedBlock -> includedBlocks
      BlockType.ConfirmedBlock -> confirmedBlocks
      BlockType.StaleBlock -> staleBlocks
      BlockType.ForkingBlock -> forkedBlocks
    }?.addNodeToBlock(block, nodeId, occurrenceTime)

    when (blockType) {
      BlockType.IncludedBlock -> includedBlocksSinceLastThroughputCheck
      BlockType.ConfirmedBlock -> includedBlocksSinceLastThroughputCheck
      else -> null
    }?.addNodeToBlock(block, nodeId, occurrenceTime)
  }

  private fun removeBlock(blockType: BlockType, blockHash: String, nodeId: String) {
    when (blockType) {
      BlockType.IncludedBlock -> includedBlocks
      BlockType.ConfirmedBlock -> confirmedBlocks
      BlockType.StaleBlock -> staleBlocks
      BlockType.ForkingBlock -> forkedBlocks
    }?.removeNodeFromBlock(blockHash, nodeId)

    when (blockType) {
      BlockType.IncludedBlock -> includedBlocksSinceLastThroughputCheck
      BlockType.ConfirmedBlock -> includedBlocksSinceLastThroughputCheck
      else -> null
    }?.removeNodeFromBlock(blockHash, nodeId)
  }

  override fun onTraceEventOccurred(
    event: TraceEvent,
    logOrigin: TraceEventLogOrigin
  ) {
    when (event.eventType) {

      ThroughputMonitoringTraceEvent.EVENT_TYPE -> {
        val numTrxs = includedBlocksSinceLastThroughputCheck
          ?.getValidBlocks()
          ?.sumOf { it.first.transactions.size } ?: 0

        val throughput = AverageThroughputCalculator(
          numTrxs,
          throughputMonitoringInterval
        ).calculate().value

        if (throughput <= failureThroughputThreshold) {
          // Failure occurred
          failureLog.failureStarted(event.occurrenceTime)
        } else if (failureLog.isFailureOngoing()) {
          // Failure ended
          failureLog.failureEnded(event.occurrenceTime)
        }

        // Clear for next measurement
        includedBlocksSinceLastThroughputCheck?.clear()
      }

      BlockMinedTraceEvent.EVENT_TYPE -> {
        val e = event as BlockMinedTraceEvent
        val block = e.block

        if (BlockUtils.isBlockForked(block)) {
          forkedBlocks?.addNodeToBlock(block, logOrigin.id, e.occurrenceTime)
        }

        blocksProposedPerNode[logOrigin.id] = (blocksProposedPerNode[logOrigin.id] ?: 0) + 1
      }

      BlockAppendedTraceEvent.EVENT_TYPE -> {
        val e = event as BlockAppendedTraceEvent

        val nodeId = logOrigin.id

        addBlock(e.appendedBlockType, e.appendedBlock, nodeId, e.occurrenceTime)

        maxBlockchainLengthCondition.onBlockAppended(e.blockPosition)
      }

      BlockTypeChangedTraceEvent.EVENT_TYPE -> {
        val e = event as BlockTypeChangedTraceEvent

        val nodeId = logOrigin.id

        removeBlock(e.oldBlockType, e.block.hash, nodeId)
        addBlock(e.newBlockType, e.block, nodeId, e.occurrenceTime)
      }

      TransactionSentTraceEvent.EVENT_TYPE -> {
        numberOfSubmittedTransactions++
      }

//      MessageDroppedTraceEvent.EVENT_TYPE -> {
//        // TODO: Log dropped messages if needed
//      }
    }

//    nodeTerminationStates[logOrigin.id]?.onTraceEventOccurred(event)
  }

  override fun shouldTerminate(): Boolean {
    // TODO: Implement other termination conditions if needed
    return maxBlockchainLengthCondition.hasLengthExceeded()
  }

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

  private fun calculateMeanTimeBetweenFailures(observationTime: Long): Double {
    return observationTime.toDouble() / failureLog.getNumberOfFailures()
  }

  private fun calculateNumberOfGeographicalRegions(): Int {
    return geographicalRegions?.getNumberOfRegions()
      ?: throw IllegalStateException("geographicalRegions not initialized")
  }
}