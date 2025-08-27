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
import org.palladiosimulator.blockchainsystems.core.utils.CounterMap
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.AverageConfirmationLatencyCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.TransactionThroughputCalculator
import org.palladiosimulator.blockchainsystems.threesim.utils.BlockchainSystemFailureLog
import org.palladiosimulator.blockchainsystems.threesim.utils.BlocksMap

/**
 * Monitor for the 3SIM simulation.
 *
 * @property maxBlockchainLengthCondition Condition to check if the maximum blockchain length has been exceeded.
 * @property throughputMonitoringInterval Interval for monitoring throughput in milliseconds.
 * @property failureThroughputThreshold Throughput threshold below which a failure is considered to have occurred, in transactions per minute.
 *
 * @author Davis Riedel
 */
class ThreesimSimulationMonitor(
  private val maxBlockchainLengthCondition: LongestChainExceededMaxLengthCondition,
  private val throughputMonitoringInterval: Long,
  private val failureThroughputThreshold: Double
) : SimulationMonitor {

  private lateinit var nodes: MutableSet<BlockchainSystemNode>

  private lateinit var geographicalRegions: GeographicalRegions

  private var numberOfSubmittedTransactions: Int = 0

  private var blockReward: Double? = null

  private lateinit var blocksProposedPerNode: CounterMap<String>

  private lateinit var includedBlocks: BlocksMap
  private lateinit var confirmedBlocks: BlocksMap
  private lateinit var staleBlocks: BlocksMap
  private lateinit var forkedBlocks: BlocksMap

  private lateinit var confirmedBlocksSinceLastThroughputCheck: BlocksMap

  private val failureLog = BlockchainSystemFailureLog()

  private val throughputsDuringFailure: MutableList<Double> = mutableListOf()
  private val confirmationLatenciesDuringFailure: MutableList<Double> = mutableListOf()

  private val throughputsWithoutFailure: MutableList<Double> = mutableListOf()
  private val confirmationLatenciesWithoutFailure: MutableList<Double> = mutableListOf()


  override fun initialize(blockchainSystem: BlockchainSystem) {
    nodes = blockchainSystem.nodes
    geographicalRegions = blockchainSystem.geographicalRegions
    blockReward = blockchainSystem.blockReward

    blocksProposedPerNode = CounterMap.create(nodes.map { it.id })

    val majorityThreshold = calculateMajorityThreshold()

    includedBlocks = BlocksMap(majorityThreshold)
    confirmedBlocks = BlocksMap(majorityThreshold)
    staleBlocks = BlocksMap(majorityThreshold)
    forkedBlocks = BlocksMap(majorityThreshold)

    confirmedBlocksSinceLastThroughputCheck = BlocksMap(majorityThreshold)
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
      meanTimeBetweenFailures = calculateMeanTimeBetweenFailures(finalSystemTime),
      meanTimeToRepair = calculateMeanTimeToRepair(),
      numberOfStaleBlocks = calculateNumberOfStaleBlocks(),
      numberOfConfirmedBlocks = calculateNumberOfConfirmedBlocks(),
      tokensHeldPerNode = calculateTokensHeldPerNode(),
      averageThroughputDuringFailure = calculateAverageThroughputDuringFailure(),
      averageThroughputDuringNormalOperation = calculateAverageThroughputWithoutFailure(),
      averageConfirmationLatencyDuringFailure = calculateAverageConfirmationLatencyDuringFailure(),
      averageConfirmationLatencyDuringNormalOperation = calculateAverageConfirmationLatencyWithoutFailure()
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
      BlockType.ConfirmedBlock -> confirmedBlocksSinceLastThroughputCheck
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
      BlockType.ConfirmedBlock -> confirmedBlocksSinceLastThroughputCheck
      else -> null
    }?.removeNodeFromBlock(blockHash, nodeId)
  }

  override fun onTraceEventOccurred(
    event: TraceEvent,
    logOrigin: TraceEventLogOrigin
  ) {
    when (event.eventType) {

      ThroughputMonitoringTraceEvent.EVENT_TYPE -> {
        val throughput = TransactionThroughputCalculator(
          calculateNumberOfConfirmedTransactions(
            sinceLastThroughputCheck = true
          ),
          throughputMonitoringInterval
        ).calculate().value // in transactions per minute

        val trxConfDurations = calculateTransactionConfirmationDurations(
          sinceLastThroughputCheck = true
        )
        val confirmationLatency = if (trxConfDurations.isNotEmpty()) {
          AverageConfirmationLatencyCalculator(trxConfDurations).calculate().value
        } else {
          null
        }

        if (failureLog.isFailureOngoing()) {
          if (throughput > failureThroughputThreshold) {
            // Failure ended
            failureLog.failureEnded(event.occurrenceTime)
          }
        } else {
          // Failure not ongoing, check if it started
          if (throughput <= failureThroughputThreshold) {
            // Failure started
            failureLog.failureStarted(event.occurrenceTime)
          }
        }

        // Track the throughput and confirmation latency during the failure or without failure
        if (failureLog.isFailureOngoing()) {
          throughputsDuringFailure.add(throughput)
          confirmationLatency?.let { confirmationLatenciesDuringFailure.add(it) }
        } else {
          throughputsWithoutFailure.add(throughput)
          confirmationLatency?.let { confirmationLatenciesWithoutFailure.add(it) }
        }

        // Clear for next measurement
        confirmedBlocksSinceLastThroughputCheck.clear()
      }

      BlockMinedTraceEvent.EVENT_TYPE -> {
        val e = event as BlockMinedTraceEvent
        val block = e.block

        if (BlockUtils.isBlockForked(block)) {
          forkedBlocks.addNodeToBlock(block, logOrigin.id, e.occurrenceTime)
        }

        blocksProposedPerNode.increment(logOrigin.id)
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
        val e = event as TransactionSubmittedTraceEvent
        println(e.transaction)
        numberOfSubmittedTransactions++
      }
    }
  }

  override fun shouldTerminate(): Boolean {
    return maxBlockchainLengthCondition.hasLengthExceeded()
  }

  private fun getConfirmedValidBlocks(
    sinceLastThroughputCheck: Boolean = false
  ): Collection<Pair<Block, Long>> {
    return if (sinceLastThroughputCheck) {
      confirmedBlocksSinceLastThroughputCheck.getValidBlocks()
    } else {
      confirmedBlocks.getValidBlocks()
    }
  }

  private fun calculateMajorityThreshold(): Int {
    return (nodes.size / 2) + 1
  }

  private fun calculateNumberOfConfirmedBlocks(): Int {
    return confirmedBlocks.getNumberOfValidBlocks()
  }

  private fun calculateNumberOfConfirmedTransactions(
    sinceLastThroughputCheck: Boolean = false
  ): Int {
    return getConfirmedValidBlocks(sinceLastThroughputCheck)
      .sumOf { it.first.transactions.size }
  }

  private fun calculateNumberOfStaleBlocks(): Int {
    return staleBlocks.getNumberOfBlocks()
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

  private fun calculateTransactionConfirmationDurations(
    sinceLastThroughputCheck: Boolean = false
  ): Collection<Long> {
    return getConfirmedValidBlocks(sinceLastThroughputCheck)
      .flatMap { (block, confirmationTime) ->
        block.transactions.map { confirmationTime - it.creationTime }
      }
  }

  private fun calculateBlockProposalTimeAndConfirmationTimePerConfirmedBlock(): Collection<Pair<Long, Long>> {
    return confirmedBlocks.getValidBlocks()
      .map { Pair(it.first.blockMinedTimestamp, it.second) }
  }

  private fun calculateTokensHeldPerNode(): List<Double> {
    // lateinit not possible for primitive types, so use a nullable type and manually check that it was initialized
    val blockReward = this.blockReward ?: throw IllegalStateException("Block reward is not set")

    val blocks = confirmedBlocks.getValidBlocks()
      .filter { it.first.originId != null } // Filter out genesis block
      .groupBy { it.first.originId }

    // NOTE: cannot do a grouping on blocks, because then nodes that did not propose any blocks would be excluded
    return nodes.map { node ->
      blocks[node.id]?.fold(0.0) { acc, block ->
        // Calculate the total tokens held by each node, based on the blocks they created
        // Each block contributes its reward and the sum of transaction fees
        acc + blockReward + block.first.transactions.sumOf { it.fee }
      } ?: 0.0 // If no blocks were proposed, the node holds 0 tokens
    }

    // NOTE: The fee does not need to be deducted anywhere, because miners do not send transactions between each other,
    // rather, 3SIM creates random transactions sent from anonymous users to the miners.
  }

  private fun calculateMeanTimeBetweenFailures(observationTime: Long): Double {
    val numFailures = failureLog.getNumberOfFailures()
    if (numFailures <= 0) {
      // NOTE: For simplicity, if no failures occurred, we return the observation time as the mean time between failures.
      return observationTime.toDouble()
    }
    return observationTime.toDouble() / numFailures
  }

  private fun calculateMeanTimeToRepair(): Double {
    return failureLog.calculateMeanFailureDuration()
  }

  private fun calculateNumberOfGeographicalRegions(): Int {
    return geographicalRegions.getNumberOfRegions()
  }

  private fun calculateAverageThroughputDuringFailure(): Double {
    return if (throughputsDuringFailure.isEmpty()) {
      0.0
    } else {
      throughputsDuringFailure.average()
    }
  }

  private fun calculateAverageConfirmationLatencyDuringFailure(): Double {
    return if (confirmationLatenciesDuringFailure.isEmpty()) {
      0.0
    } else {
      confirmationLatenciesDuringFailure.average()
    }
  }

  private fun calculateAverageThroughputWithoutFailure(): Double {
    return if (throughputsWithoutFailure.isEmpty()) {
      0.0
    } else {
      throughputsWithoutFailure.average()
    }
  }

  private fun calculateAverageConfirmationLatencyWithoutFailure(): Double {
    return if (confirmationLatenciesWithoutFailure.isEmpty()) {
      0.0
    } else {
      confirmationLatenciesWithoutFailure.average()
    }
  }
}