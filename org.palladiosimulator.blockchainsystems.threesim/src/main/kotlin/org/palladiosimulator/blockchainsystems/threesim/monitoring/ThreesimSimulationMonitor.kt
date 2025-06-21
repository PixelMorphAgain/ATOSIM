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
import org.palladiosimulator.blockchainsystems.core.simulation.termination.abstractions.NodeTerminationState
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystem
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemNode
import org.palladiosimulator.blockchainsystems.core.transaction.propagation.TransactionSentTraceEvent
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

  private val forkedBlocks: MutableSet<Block> = mutableSetOf()
  private var nodes: MutableSet<BlockchainSystemNode> = mutableSetOf()
  private val blocksProposedPerNode: CounterMap<String> = CounterMap()
  private var geographicalRegions: GeographicalRegions? = null
  private var numberOfSubmittedTransactions: Int = 0
  private var confirmedTransactionsCounter: ConfirmedTransactionsCounter? = null

  override fun initialize(blockchainSystem: BlockchainSystem) {
    nodes = blockchainSystem.nodes
    geographicalRegions = blockchainSystem.geographicalRegions
    confirmedTransactionsCounter = ConfirmedTransactionsCounter(
      blockchainSystem.numberOfRequiredSecurityConfirmations
    )

    // TODO: Implement a proper NodeTerminationState for 3SIM
//    nodes.forEach {
//      nodeTerminationStates.put(it.id, NodeTerminationState(it))
//    }
  }

  fun getFinalState(): ThreesimSimulationMonitorState {
    return ThreesimSimulationMonitorState(
      forkedBlocks = forkedBlocks,
      nodes = nodes,
      blocksProposedPerNode = blocksProposedPerNode,
      geographicalRegions = geographicalRegions ?: throw IllegalStateException("geographicalRegions not initialized"),
      numberOfSubmittedTransactions = numberOfSubmittedTransactions,
      numberOfConfirmedTransactions = confirmedTransactionsCounter?.numberOfConfirmedTransactions
        ?: throw IllegalStateException("confirmedTransactionsCounter not initialized"),
    )
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
        val block = e.appendedBlock

        block.originId?.let { proposingNodeId ->
          blocksProposedPerNode.increment(proposingNodeId)
        }

        confirmedTransactionsCounter?.add(block.transactions.size)

        maxBlockchainLengthCondition.onBlockAppended(e.blockPosition)
      }

      TransactionSentTraceEvent.EVENT_TYPE -> {
        numberOfSubmittedTransactions += 1
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