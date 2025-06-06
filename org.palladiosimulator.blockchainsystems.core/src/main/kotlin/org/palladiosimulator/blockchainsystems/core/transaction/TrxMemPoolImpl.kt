package org.palladiosimulator.blockchainsystems.core.transaction

import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction
import org.palladiosimulator.blockchainsystems.core.system.abstractions.TrxMemPool

/**
 * @author Davis Riedel
 */
class TrxMemPoolImpl(
  private val nodeId: String
) : BlockchainNodeObject(), TrxMemPool {
  private val transactions = HashMap<String, Transaction>();

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

  override fun getTransactionById(txId: String): Transaction? {
    return transactions.get(txId)
  }

  override fun storeTransaction(transaction: Transaction) {
    transactions.put(transaction.getTxId(), transaction)
  }
}