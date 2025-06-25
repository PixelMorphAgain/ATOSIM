package org.palladiosimulator.blockchainsystems.core.transaction

import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.TrxMemPool
import java.util.TreeSet

/**
 * @author Davis Riedel
 */
class TrxMemPoolImpl(
  val nodeId: String
) : BlockchainNodeObject(), TrxMemPool {
  /*
   * Stores transactions sorted by their fee rate in descending order.
   */
  private val transactions = TreeSet<Transaction> { t1, t2 ->
    val firstRate = t1.fee / t1.size
    val secondRate = t2.fee / t2.size
    secondRate.compareTo(firstRate) // Argument order is reversed to sort in descending order
  };

  private fun logTransactionStoredEvent(transaction: Transaction) {
    if (!traceEventLogger.isEventTypeEnabled(TransactionStoredInMemPoolTraceEvent.EVENT_TYPE)) {
      return
    }

    val event = TransactionStoredInMemPoolTraceEvent(
      simulationContext.getSystemClock().getCurrentTime(),
      transaction
    )

    traceEventLogger.logEvent(event)
  }

  override fun dispatchEvent(event: Event) {
  }

  override fun storeTransaction(transaction: Transaction) {
    transactions.add(transaction)
  }

  override fun getTransactionsSortedByFeeRate(): TreeSet<Transaction> {
    return transactions
  }
}