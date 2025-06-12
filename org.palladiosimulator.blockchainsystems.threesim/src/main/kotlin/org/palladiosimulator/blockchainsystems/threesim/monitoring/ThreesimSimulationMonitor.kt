package org.palladiosimulator.blockchainsystems.threesim.monitoring

import org.palladiosimulator.blockchainsystems.core.blockchain.BlockAppendedTraceEvent
import org.palladiosimulator.blockchainsystems.core.network.MessageDroppedTraceEvent
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLogOrigin
import org.palladiosimulator.blockchainsystems.core.mining.BlockMinedTraceEvent
import org.palladiosimulator.blockchainsystems.core.monitoring.abstractions.SimulationMonitor
import org.palladiosimulator.blockchainsystems.core.simulation.termination.LongestChainExceededMaxLengthCondition
import org.palladiosimulator.blockchainsystems.core.simulation.termination.abstractions.NodeTerminationState
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemNode
import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystem
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
  private val forkedBlocks: MutableSet<Block> = HashSet()
  val nodes: MutableSet<BlockchainSystemNode> = HashSet()
  var blockchainSystem: BlockchainSystem? = null

  override fun initialize(blockchainSystem: BlockchainSystem) {
    this.blockchainSystem = blockchainSystem
    nodes.forEach {
      this.nodes.add(it)
      // TODO: Implement a proper NodeTerminationState for 3SIM
//      nodeTerminationStates.put(it.id, NodeTerminationState(it))
    }
  }

  override fun onTraceEventOccurred(
    event: TraceEvent,
    logOrigin: TraceEventLogOrigin
  ) {
    // TODO: Implement all trace event handling logic, e.g. check fails etc.

    when (event.eventType) {
      BlockMinedTraceEvent.EVENT_TYPE -> {
        val blockMinedTraceEvent = event as BlockMinedTraceEvent

        if (BlockUtils.isBlockForked(blockMinedTraceEvent.block)) {
          forkedBlocks.add(blockMinedTraceEvent.block)
        }
      }

      BlockAppendedTraceEvent.EVENT_TYPE -> {
        val blockAppendedTraceEvent = event as BlockAppendedTraceEvent
        maxBlockchainLengthCondition.onBlockAppended(blockAppendedTraceEvent.blockPosition)
      }

      MessageDroppedTraceEvent.EVENT_TYPE -> {
        // TODO: Calculate the time the system was inoperative
      }
    }

    nodeTerminationStates[logOrigin.id]?.onTraceEventOccurred(event)
  }

  override fun shouldTerminate(): Boolean {
    // TODO: Implement other termination conditions if needed
    return maxBlockchainLengthCondition.hasLengthExceeded();
  }
}