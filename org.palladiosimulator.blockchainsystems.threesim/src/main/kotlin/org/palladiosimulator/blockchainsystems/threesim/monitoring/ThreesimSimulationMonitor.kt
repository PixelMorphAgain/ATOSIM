package org.palladiosimulator.blockchainsystems.threesim.monitoring

import org.palladiosimulator.blockchainsystems.core.blockchain.BlockAppendedTraceEvent
import org.palladiosimulator.blockchainsystems.core.network.MessageDroppedTraceEvent
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLogOrigin
import org.palladiosimulator.blockchainsystems.core.mining.BlockMinedTraceEvent
import org.palladiosimulator.blockchainsystems.core.monitoring.abstractions.SimulationMonitor
import org.palladiosimulator.blockchainsystems.core.simulation.termination.LongestChainExceededMaxLengthCondition
import org.palladiosimulator.blockchainsystems.core.simulation.termination.abstractions.NodeTerminationState
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystem
import org.palladiosimulator.blockchainsystems.core.utils.CounterMap
import org.palladiosimulator.blockchainsystems.threesim.behavior.BlockUtils

/**
 * Monitor for the 3SIM simulation.
 *
 * @author Davis Riedel
 */
class ThreesimSimulationMonitor(
  private val maxBlockchainLengthCondition: LongestChainExceededMaxLengthCondition
) : SimulationMonitor {

  private val nodeTerminationStates: MutableMap<String, NodeTerminationState> = HashMap()

  var state: ThreesimSimulationMonitorState? = null

  override fun initialize(blockchainSystem: BlockchainSystem) {
    state = ThreesimSimulationMonitorState(
      forkedBlocks = mutableSetOf(),
      nodes = blockchainSystem.nodes,
      blocksProposedPerNode = CounterMap(),
      geographicalRegions = blockchainSystem.geographicalRegions
    )
    // TODO: Implement a proper NodeTerminationState for 3SIM
//    nodes.forEach {
//      nodeTerminationStates.put(it.id, NodeTerminationState(it))
//    }
  }

  override fun onTraceEventOccurred(
    event: TraceEvent,
    logOrigin: TraceEventLogOrigin
  ) {
    this.state?.let { state ->
      when (event.eventType) {
        // TODO: Implement all trace event handling logic, e.g. check fails etc.

        BlockMinedTraceEvent.EVENT_TYPE -> {
          val blockMinedTraceEvent = event as BlockMinedTraceEvent

          if (BlockUtils.isBlockForked(blockMinedTraceEvent.block)) {
            state.forkedBlocks.add(blockMinedTraceEvent.block)
          }
        }

        BlockAppendedTraceEvent.EVENT_TYPE -> {
          val blockAppendedTraceEvent = event as BlockAppendedTraceEvent

          // Needed for Shannon Entropy calculation
          val proposingNodeId = blockAppendedTraceEvent.appendedBlock.originId
          state.blocksProposedPerNode.increment(proposingNodeId)

          maxBlockchainLengthCondition.onBlockAppended(blockAppendedTraceEvent.blockPosition)
        }

        MessageDroppedTraceEvent.EVENT_TYPE -> {
          // TODO: Calculate the time the system was inoperative
        }
      }
    }

    nodeTerminationStates[logOrigin.id]?.onTraceEventOccurred(event)
  }

  override fun shouldTerminate(): Boolean {
    // TODO: Implement other termination conditions if needed
    return maxBlockchainLengthCondition.hasLengthExceeded();
  }
}