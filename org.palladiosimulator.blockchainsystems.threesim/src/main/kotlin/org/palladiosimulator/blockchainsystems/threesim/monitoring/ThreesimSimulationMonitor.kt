package org.palladiosimulator.blockchainsystems.threesim.monitoring

import org.palladiosimulator.blockchainsystems.core.block.abstractions.AppendedBlock
import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block
import org.palladiosimulator.blockchainsystems.core.blockchain.BlockAppendedTraceEvent
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
import org.palladiosimulator.blockchainsystems.threesim.simulation.termination.ThreesimNodeTerminationState

/**
 * Monitor for the 3SIM simulation.
 *
 * @author Davis Riedel
 */
class ThreesimSimulationMonitor(
  private val maxBlockchainLengthCondition: LongestChainExceededMaxLengthCondition,
  private val numberOfRequiredSecurityConfirmations: Int
) : SimulationMonitor {

  val nodeTerminationStates: MutableMap<String, ThreesimNodeTerminationState> = HashMap()

  private val forkedBlocks: MutableSet<Block> = mutableSetOf()

  var nodes: MutableSet<BlockchainSystemNode> = mutableSetOf()
    private set

  var geographicalRegions: GeographicalRegions? = null
    private set

  var numberOfSubmittedTransactions: Int = 0
    private set

  override fun initialize(blockchainSystem: BlockchainSystem) {
    nodes = blockchainSystem.nodes
    geographicalRegions = blockchainSystem.geographicalRegions

    nodes.forEach {
      nodeTerminationStates.put(it.id, ThreesimNodeTerminationState(it, numberOfRequiredSecurityConfirmations))
    }
  }

  // TODO: Reimplement
  fun getFinalState(): ThreesimSimulationMonitorState {
    val canonicalChain = getCanonicalChain() ?: throw IllegalStateException("No canonical chain found")
    val numberOfConfirmedTransactions = calculateNumberOfConfirmedTransactions(canonicalChain)

//    return ThreesimSimulationMonitorState(
//      forkedBlocks = forkedBlocks,
//      nodes = nodes,
//      blocksProposedPerNode = nodeTerminationStates.mapValues { it.value.blocks. }
//      geographicalRegions = geographicalRegions ?: throw IllegalStateException("geographicalRegions not initialized"),
//      numberOfSubmittedTransactions = numberOfSubmittedTransactions,
//      numberOfConfirmedTransactions =
//    )
  }

  override fun onTraceEventOccurred(
    event: TraceEvent,
    logOrigin: TraceEventLogOrigin
  ) {
    when (event.eventType) {
      // TODO: Implement all trace event handling logic, e.g. check fails etc.

      BlockMinedTraceEvent.EVENT_TYPE -> {
        val blockMinedTraceEvent = event as BlockMinedTraceEvent

        if (BlockUtils.isBlockForked(blockMinedTraceEvent.block)) {
          forkedBlocks.add(blockMinedTraceEvent.block)
        }
      }

      BlockAppendedTraceEvent.EVENT_TYPE -> {
        val e = event as BlockAppendedTraceEvent
        maxBlockchainLengthCondition.onBlockAppended(e.blockPosition)
      }

      TransactionSentTraceEvent.EVENT_TYPE -> {
        numberOfSubmittedTransactions++
      }

      MessageDroppedTraceEvent.EVENT_TYPE -> {
        // TODO: Calculate the time the system was inoperative
      }
    }

    nodeTerminationStates[logOrigin.id]?.onTraceEventOccurred(event)
  }

  override fun shouldTerminate(): Boolean {
    // TODO: Implement other termination conditions if needed
    return maxBlockchainLengthCondition.hasLengthExceeded()
  }

  fun getCanonicalChain(): List<AppendedBlock>? {
    return nodes
      .map { node ->
        // longest chain of each node, associated by the last block in the chain
        node.blockchain.getLongestChains().associateBy { it.last() }
      }
      // count how many nodes have a longest chain ending with the same block
      // returns a map where the last block of a longest chain is the key and the value is a pair of the corresponding longest chain (first found is used)
      // and the number of nodes that have this chain
      .fold(emptyMap<AppendedBlock, Pair<List<AppendedBlock>, Int>>()) { acc, map ->
        map.forEach {
          if (acc.containsKey(it.key)) {
            acc[it.key] = Pair(acc[it.key]!!.first, acc[it.key]!!.second + 1)
          } else {
            acc[it.key] = Pair(it.value, 1)
          }
        }
        acc
      }
      // find the longest chain that is present in the most nodes
      .maxByOrNull { it.value.second }
      ?.value?.first
  }

  fun calculateNumberOfConfirmedTransactions(blockchain: List<AppendedBlock>): Int {
    return blockchain
      .take(blockchain.size - numberOfRequiredSecurityConfirmations)
      .sumOf { it.transactions.size }
  }

}