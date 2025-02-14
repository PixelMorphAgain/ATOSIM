//package org.palladiosimulator.blockchainsystems.core.transaction
//
//import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject
//import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
//import org.palladiosimulator.blockchainsystems.core.system.abstractions.Transaction
//import org.palladiosimulator.blockchainsystems.core.system.abstractions.TransactionPool
//
///**
// * @author Davis Riedel
// */
//class TransactionPoolImpl : BlockchainNodeObject(), TransactionPool {
//  private val transactions: HashMap<String, Transaction> = HashMap<String, Transaction>();
//
//  private fun logTransactionStoredEvent(transaction: Transaction) {
//    if (!traceEventLogger.isEventTypeEnabled(TransactionStoredInPoolTraceEvent.EVENT_TYPE)) {
//      return
//    }
//
//    val event = TransactionStoredInPoolTraceEvent(
//      simulationContext.getSystemClock().getCurrentTime(),
//      transaction
//    )
//
//    traceEventLogger.logEvent(event)
//  }
//
//  override fun dispatchEvent(event: Event?) {
//  }
//
//  override fun getTransactionById(txId: String?): Transaction? {
//    return transactions[txId]
//  }
//
//  override fun storeTransaction(transaction: Transaction) {
//    transactions.put(transaction.getTxId(), transaction)
//  }
//}