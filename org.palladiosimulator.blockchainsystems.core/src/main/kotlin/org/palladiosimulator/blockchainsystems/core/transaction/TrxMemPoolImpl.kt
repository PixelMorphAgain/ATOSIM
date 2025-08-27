package org.palladiosimulator.blockchainsystems.core.transaction

import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.TrxMemPool
import java.util.TreeSet

/**
 * Implementation of a transaction memory pool (mempool) running on a blockchain node.
 *
 * @author Davis Riedel
 */
class TrxMemPoolImpl(
  val nodeId: String
) : BlockchainNodeObject(), TrxMemPool {

  /*
   * Mempool that stores transactions sorted by their fee rate in descending order.
   */
  private val mempool = TreeSet<Transaction> { t1, t2 ->
    val firstRate = t1.fee / t1.size
    val secondRate = t2.fee / t2.size
    secondRate.compareTo(firstRate) // Argument order is reversed to sort in descending order
  };

  private fun logTransactionStoredEvent(transaction: Transaction) {
    val event = TransactionStoredInMemPoolTraceEvent(
      simulationContext.systemClock.currentTime,
      transaction
    )

    traceEventLogger.logEvent(event)
  }

  private fun logTransactionRemovedEvent(transaction: Transaction) {
    val event = TransactionRemovedFromMemPoolTraceEvent(
      simulationContext.systemClock.currentTime,
      transaction
    )

    traceEventLogger.logEvent(event)
  }

  override fun dispatchEvent(event: Event) {
  }

  override fun storeTransaction(transaction: Transaction) {
    mempool.add(transaction)
    logTransactionStoredEvent(transaction)
  }

  override fun storeTransactions(transactions: Collection<Transaction>) {
    transactions.forEach { storeTransaction(it) }
  }

  override fun removeTransaction(transaction: Transaction) {
    mempool.remove(transaction)
    logTransactionRemovedEvent(transaction)
  }

  override fun removeTransactions(transactions: Collection<Transaction>) {
    transactions.forEach { removeTransaction(it) }
  }

  override fun getTransactionById(txId: String): Transaction? {
    return mempool.find { it.txId == txId }
  }

  override fun getTransactionsSortedByFeeRate(): TreeSet<Transaction> {
    return mempool
  }
}