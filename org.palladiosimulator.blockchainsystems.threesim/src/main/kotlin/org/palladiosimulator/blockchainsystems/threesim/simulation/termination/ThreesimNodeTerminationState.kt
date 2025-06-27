package org.palladiosimulator.blockchainsystems.threesim.simulation.termination//package org.palladiosimulator.blockchainsystems.threesim.monitoring
//
//import org.palladiosimulator.blockchainsystems.core.blockchain.BlockAppendedTraceEvent
//import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent
//import org.palladiosimulator.blockchainsystems.core.simulation.termination.abstractions.NodeTerminationState
//import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemNode
//
//class ThreesimNodeTerminationState(
//  private val node: BlockchainSystemNode
//) : NodeTerminationState {
//  val blocks = ArrayList<BlockMonitoringData>()
//
//  override fun onTraceEventOccurred(traceEvent: TraceEvent) {
//    // TODO: Implement all trace event handling logic, e.g. check fails etc.
//
//    when (traceEvent.eventType) {
//
//      BlockAppendedTraceEvent.EVENT_TYPE -> {
//        val e = traceEvent as BlockAppendedTraceEvent
//        val block = e.appendedBlock
//        blocks.add(BlockMonitoringData(block, e.occurrenceTime))
//      }
//    }
//  }
//}


import org.palladiosimulator.blockchainsystems.core.blockchain.BlockAppendedTraceEvent
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent
import org.palladiosimulator.blockchainsystems.core.simulation.termination.abstractions.NodeTerminationState
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemNode
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction
import kotlin.collections.HashMap

class ThreesimNodeTerminationState(
  private val node: BlockchainSystemNode,
  private val numberOfRequiredSecurityConfirmations: Int
) : NodeTerminationState {
  var blocksProposedByNode: Int = 0
    private set

  override fun onTraceEventOccurred(traceEvent: TraceEvent) {
    when (traceEvent.eventType) {
      BlockAppendedTraceEvent.EVENT_TYPE -> {
        val e = traceEvent as BlockAppendedTraceEvent
        val block = e.appendedBlock
        if (block.originId != node.id) return
        blocksProposedByNode++
      }
    }
  }

//  private val blockStates = HashMap<String, BlockState>()
//  private val transactionStates = HashMap<String, TransactionState>()
//
//  override fun onTraceEventOccurred(traceEvent: TraceEvent) {
//    when (traceEvent.eventType) {
//      BlockAppendedTraceEvent.EVENT_TYPE -> {
//        val e = traceEvent as BlockAppendedTraceEvent
//        val block = e.appendedBlock
//
//        blockStates[block.hash] = BlockState(
//          block,
//          e.blockPosition,
//          e.appendedBlockType,
//          e.occurrenceTime
//        )
//      }
//
//      BlockTypeChangedTraceEvent.EVENT_TYPE -> {
//        val e = traceEvent as BlockTypeChangedTraceEvent
//        blockStates[e.block.hash]?.blockType = e.newBlockType
//      }
//
//      TransactionStoredInMemPoolTraceEvent.EVENT_TYPE -> {
//        val e = traceEvent as TransactionStoredInMemPoolTraceEvent
//        transactionStates[e.storedTransaction.txId] = TransactionState(
//          e.storedTransaction,
//          e.occurrenceTime
//        )
//      }
//    }
//  }
//
//  fun hasReceivedAllForkedBlocks(forkedBlocks: MutableSet<Block>): Boolean {
//    return forkedBlocks.all { node.blockchain.hasBlockWithHash(it.hash) }
//  }

  fun calculateNumberOfConfirmedTransactions(): Int {
    var numberOfConfirmedTransactions = 0

    // TODO: We are only looking at one longest chain here, maybe instead consider the chain all agree upon???
    node.blockchain.getLongestChains().firstOrNull()?.let { chain ->
      val lastConfirmedBlockPos = chain.size - numberOfRequiredSecurityConfirmations
      for (i in 0 until lastConfirmedBlockPos) {
        val block = chain[i]
        numberOfConfirmedTransactions += block.transactions.size
      }
    }

    return numberOfConfirmedTransactions
  }

  fun calculateTransactionConfirmationDurations(): Map<Transaction, Long> {
    val transactionConfirmationDurations = HashMap<Transaction, Long>()

    node.blockchain.getLongestChains().forEach { chain ->
      val lastConfirmedBlockPos = chain.size - numberOfRequiredSecurityConfirmations
      for (i in 0 until lastConfirmedBlockPos) {
        val block = chain[i]
        val confirmationTime = chain[i + numberOfRequiredSecurityConfirmations].appendedTimestamp

        block.transactions.forEach {
          transactionConfirmationDurations[it] = confirmationTime - it.creationTime
        }
      }
    }

    return transactionConfirmationDurations
  }
}