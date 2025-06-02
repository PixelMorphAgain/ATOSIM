package org.palladiosimulator.blockchainsystems.threesim.monitoring

import org.palladiosimulator.blockchainsystems.core.blockchain.BlockAppendedTraceEvent
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLogOrigin
import org.palladiosimulator.blockchainsystems.core.eventcoordiation.TerminationCondition
import org.palladiosimulator.blockchainsystems.core.mining.BlockMinedTraceEvent
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemNode
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block
import org.palladiosimulator.blockchainsystems.core.tracing.TraceEventSubscriber
import org.palladiosimulator.blockchainsystems.threesim.simulation.termination.LongestChainExceededMaxLengthCondition
import org.palladiosimulator.blockchainsystems.threesim.simulation.termination.NodeTerminationState
import java.util.function.Consumer


// TODO: Implement this function for 3SIM
class SimulationMonitor(
  private val maxBlockchainLengthCondition: LongestChainExceededMaxLengthCondition
) : TraceEventSubscriber, TerminationCondition {

  //  private val nodeTerminationStates = HashMap<String, NodeTerminationState>()
  private val forkedBlocks = HashSet<Block>()

//  fun initializeNodes(nodes: MutableSet<BlockchainSystemNode>) {
//    nodes.forEach(Consumer { node: BlockchainSystemNode ->
//      nodeTerminationStates.put(node.id, terminationState) // TODO: Set a termination state
//    })
//  }

  override fun onTraceEventOccurred(event: TraceEvent, logOrigin: TraceEventLogOrigin) {
    if (event.getEventType() === BlockMinedTraceEvent.EVENT_TYPE) {
//      val blockMinedTraceEvent = event as BlockMinedTraceEvent
//
//      if (AttackerUtils.isBlockABlockForkedBlock(blockMinedTraceEvent.block)) {
//        forkedBlocks.add(blockMinedTraceEvent.block)
//      }
    } else if (event.getEventType() === BlockAppendedTraceEvent.EVENT_TYPE) {
      val blockAppendedTraceEvent = event as BlockAppendedTraceEvent
      maxBlockchainLengthCondition.onBlockAppended(blockAppendedTraceEvent.blockPosition)
    }

//    nodeTerminationStates.get(logOrigin.getId())?.onTraceEventOccurred(event)
  }

  override fun shouldTerminate(): Boolean {
//    // Check if attackers have published all of their blocks
//    if (didAllMaliciousNodesReachFinalPhase()) {
//      // Require honest nodes to receive all forked blocks
//      if (didAllHonestNodesReceiveAllForkedBlocks()) {
//        // Check if all honest nodes have a single longest chain with distance x to the
//        // next longest chain
//        if (doAllHonestNodesHaveALongestChainWithDistance(2)) {
//          return true
//        }
//      }
//    }

    return maxBlockchainLengthCondition.hasLengthExceeded()
  }

//  val winnerVoters: MutableSet<SimulationWinnerVoter>
//    get() = nodeTerminationStates
//      .values
//      .stream()
//      .map<SimulationWinnerVoter?> { x: org.palladiosimulator.blockchainsystems.doublespending.simulation.termination.NodeTerminationState? -> x as SimulationWinnerVoter? }
//      .collect(Collectors.toUnmodifiableSet())
//
//  private fun didAllMaliciousNodesReachFinalPhase(): Boolean {
//    return maliciousNodeTerminationStates
//      .values
//      .stream()
//      .anyMatch { obj: MaliciousNodeTerminationState? -> obj.hasReachedFinalPhase() }
//  }
//
//  private fun didAllHonestNodesReceiveAllForkedBlocks(): Boolean {
//    return honestNodeTerminationStates
//      .values
//      .stream()
//      .allMatch { x: HonestNodeTerminationState? -> x.hasReceivedAllForkedBlocks(forkedBlocks) }
//  }
//
//  private fun doAllHonestNodesHaveALongestChainWithDistance(distance: Int): Boolean {
//    return honestNodeTerminationStates
//      .values
//      .stream()
//      .allMatch { x: HonestNodeTerminationState? -> x.hasLongestChainWithDistance(distance) }
//  }
}