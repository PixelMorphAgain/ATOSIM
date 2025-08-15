package org.palladiosimulator.blockchainsystems.threesim.monitoring

import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block
import org.palladiosimulator.blockchainsystems.core.block.abstractions.BlockType
import org.palladiosimulator.blockchainsystems.core.blockchain.BlockAppendedTraceEvent
import org.palladiosimulator.blockchainsystems.core.blockchain.BlockTypeChangedTraceEvent
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLogOrigin
import org.palladiosimulator.blockchainsystems.core.geography.GeographicalRegions
import org.palladiosimulator.blockchainsystems.core.mining.BlockMinedTraceEvent
import org.palladiosimulator.blockchainsystems.core.monitoring.abstractions.SimulationMonitor
import org.palladiosimulator.blockchainsystems.core.simulation.termination.LongestChainExceededMaxLengthCondition
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystem
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemNode
import org.palladiosimulator.blockchainsystems.threesim.behavior.BlockUtils
import org.palladiosimulator.blockchainsystems.core.transaction.TransactionSubmittedTraceEvent
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.ThroughputCalculator
import org.palladiosimulator.blockchainsystems.threesim.utils.BlockchainSystemFailureLog
import org.palladiosimulator.blockchainsystems.threesim.utils.BlocksMap

/**
 * Monitor for the 3SIM simulation.
 *
 * @property maxBlockchainLengthCondition Condition to check if the maximum blockchain length has been exceeded.
 * @property throughputMonitoringInterval Interval for monitoring throughput in milliseconds.
 * @property failureThroughputThreshold Throughput threshold below which a failure is considered to have occurred, in transactions per second.
 *
 * @author Davis Riedel
 */
class ThreesimSimulationMonitor(
  private val maxBlockchainLengthCondition: LongestChainExceededMaxLengthCondition,
  private val throughputMonitoringInterval: Long,
  private val failureThroughputThreshold: Double
) : SimulationMonitor {

  private var blockReward: Double? = null

  private val blocksProposedPerNode: MutableMap<String, Int> = mutableMapOf()

  private lateinit var includedBlocks: BlocksMap
  private lateinit var confirmedBlocks: BlocksMap
  private lateinit var staleBlocks: BlocksMap
  private lateinit var forkedBlocks: BlocksMap

  private lateinit var includedBlocksSinceLastThroughputCheck: BlocksMap

  private lateinit var nodes: MutableSet<BlockchainSystemNode>

  private lateinit var geographicalRegions: GeographicalRegions

  private var numberOfSubmittedTransactions: Int = 0

  private val failureLog = BlockchainSystemFailureLog()

  override fun initialize(blockchainSystem: BlockchainSystem) {
    nodes = blockchainSystem.nodes
    geographicalRegions = blockchainSystem.geographicalRegions
    blockReward = blockchainSystem.blockReward

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
      tokensHeldPerNode = calculateTokensHeldPerNode()
    )
  }

  private fun addBlock(blockType: BlockType, block: Block, nodeId: String, occurrenceTime: Long) {
    when (blockType) {
      BlockType.IncludedBlock -> includedBlocks
      BlockType.ConfirmedBlock -> confirmedBlocks
      BlockType.StaleBlock -> staleBlocks
      BlockType.ForkingBlock -> forkedBlocks
    }.addNodeToBlock(block, nodeId, occurrenceTime)

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
    }.removeNodeFromBlock(blockHash, nodeId)

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
          .getValidBlocks()
          .sumOf { it.first.transactions.size }

        val trxPerSec = ThroughputCalculator(
          numTrxs,
          throughputMonitoringInterval
        ).calculate().value

        if (trxPerSec <= failureThroughputThreshold) {
          // Failure occurred
          failureLog.failureStarted(event.occurrenceTime)
        } else if (failureLog.isFailureOngoing()) {
          // Failure ended
          failureLog.failureEnded(event.occurrenceTime)
        }

        // Clear for next measurement
        includedBlocksSinceLastThroughputCheck.clear()
      }

      BlockMinedTraceEvent.EVENT_TYPE -> {
        val e = event as BlockMinedTraceEvent
        val block = e.block

        if (BlockUtils.isBlockForked(block)) {
          forkedBlocks.addNodeToBlock(block, logOrigin.id, e.occurrenceTime)
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

      TransactionSubmittedTraceEvent.EVENT_TYPE -> {
        numberOfSubmittedTransactions++
      }
    }
  }

  override fun shouldTerminate(): Boolean {
    // TODO: Implement other termination conditions if needed
    return maxBlockchainLengthCondition.hasLengthExceeded()
  }

  private fun calculateMajorityThreshold(): Int {
    return (nodes.size / 2) + 1
  }

  private fun calculateNumberOfConfirmedBlocks(): Int {
    return confirmedBlocks.getNumberOfValidBlocks()
  }

  private fun getConfirmedTransactions(): Collection<Pair<Set<Transaction>, Long?>> {
    return confirmedBlocks.getValidBlocks().map { Pair(it.first.transactions, it.second) }
  }

  private fun calculateNumberOfConfirmedTransactions(): Int {
    return getConfirmedTransactions().size
  }

  private fun calculateNumberOfStaleBlocks(): Int {
    return staleBlocks.getNumberOfValidBlocks()
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
    return confirmedBlocks.getValidBlocks()
      .flatMap { (block, confirmationTime) ->
        block.transactions.map { confirmationTime - it.creationTime }
      }
  }

  private fun calculateBlockProposalTimeAndConfirmationTimePerConfirmedBlock(): Collection<Pair<Long, Long>> {
    return confirmedBlocks.getValidBlocks()
      .map { Pair(it.first.blockMinedTimestamp, it.second) }
  }

  private fun calculateTokensHeldPerNode(): Collection<Double> {
    // lateinit not possible for primitive types, so use a nullable type and manually check that it was initialized
    val blockReward = this.blockReward ?: throw IllegalStateException("Block reward is not set")

    return confirmedBlocks.getValidBlocks()
      .filter { it.first.originId != null } // Filter out the genesis block
      .groupingBy { it.first.originId!! } // Group blocks by the node that created them
      .fold(0.0) { acc, block ->
        // Calculate the total tokens held by each node, based on the blocks they created
        // Each block contributes its reward and the sum of transaction fees
        acc + blockReward + block.first.transactions.sumOf { it.fee }
      }.values

    // NOTE: The fee does not need to be deducted anywhere, because miners do not send transactions between each other,
    // rather, 3SIM creates random transactions sent from anonymous users to the miners.
  }

  private fun calculateMeanTimeBetweenFailures(observationTime: Long): Double {
    return observationTime.toDouble() / failureLog.getNumberOfFailures()
  }

  private fun calculateNumberOfGeographicalRegions(): Int {
    return geographicalRegions.getNumberOfRegions()
  }
}