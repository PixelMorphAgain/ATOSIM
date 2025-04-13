package org.palladiosimulator.blockchainsystems.core.system.abstractions

interface MemPool {
  fun getTransactionById(txId: String): Transaction?
  fun storeTransaction(transaction: Transaction)
}