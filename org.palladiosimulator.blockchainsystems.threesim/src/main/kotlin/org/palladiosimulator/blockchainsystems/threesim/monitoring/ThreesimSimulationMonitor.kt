package org.palladiosimulator.blockchainsystems.threesim.monitoring

import org.palladiosimulator.blockchainsystems.core.blockchain.BlockAppendedTraceEvent
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLogOrigin
import org.palladiosimulator.blockchainsystems.core.mining.BlockMinedTraceEvent
import org.palladiosimulator.blockchainsystems.core.monitoring.abstractions.SimulationMonitor
import org.palladiosimulator.blockchainsystems.core.simulation.termination.LongestChainExceededMaxLengthCondition
import org.palladiosimulator.blockchainsystems.core.simulation.termination.abstractions.NodeTerminationState
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemNode
import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block


class ThreesimSimulationMonitor(
  private val maxBlockchainLengthCondition: LongestChainExceededMaxLengthCondition
) : SimulationMonitor {

  private val nodeTerminationStates = HashMap<String, NodeTerminationState>()
  private val forkedBlocks = HashSet<Block>()

  override fun initializeNodes(nodes: Set<BlockchainSystemNode>) {
    nodes.forEach {
      // TODO: Implement a proper NodeTerminationState for 3SIM
      nodeTerminationStates.put(it.id, NodeTerminationState(it))
    }
  }

  override fun onTraceEventOccurred(
    event: TraceEvent,
    logOrigin: TraceEventLogOrigin
  ) {
    if (event.eventType === BlockMinedTraceEvent.EVENT_TYPE) {
      val blockMinedTraceEvent = event as BlockMinedTraceEvent

      // TODO: Handle forked blocks properly
//      if (AttackerUtils.isBlockABlockForkedBlock(blockMinedTraceEvent.block)) {
//        _forkedBlocks.add(blockMinedTraceEvent.block)
//      }
    } else if (event.eventType === BlockAppendedTraceEvent.EVENT_TYPE) {
      val blockAppendedTraceEvent = event as BlockAppendedTraceEvent
      maxBlockchainLengthCondition.onBlockAppended(blockAppendedTraceEvent.blockPosition)
    }

    nodeTerminationStates.get(logOrigin.id)?.onTraceEventOccurred(event)
  }

  override fun shouldTerminate(): Boolean {
    // TODO: Implement other termination conditions if needed
    return maxBlockchainLengthCondition.hasLengthExceeded();
  }
}