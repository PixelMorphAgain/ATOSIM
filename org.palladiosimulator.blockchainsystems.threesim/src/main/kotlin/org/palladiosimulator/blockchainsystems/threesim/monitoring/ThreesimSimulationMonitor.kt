package org.palladiosimulator.blockchainsystems.threesim.monitoring

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
  private val maxBlockchainLengthCondition: LongestChainExceededMaxLengthCondition
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
      nodeTerminationStates.put(it.id, ThreesimNodeTerminationState(it))
    }
  }

  // TODO: Reimplement
//  fun getFinalState(): ThreesimSimulationMonitorState {
//    return ThreesimSimulationMonitorState(
//      forkedBlocks = forkedBlocks,
//      nodes = nodes,
//      blocksProposedPerNode = nodeTerminationStates.mapValues { it.value.blocks. }
//      geographicalRegions = geographicalRegions ?: throw IllegalStateException("geographicalRegions not initialized"),
//      numberOfSubmittedTransactions = numberOfSubmittedTransactions,
//      numberOfConfirmedTransactions =
//    )
//  }

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
}