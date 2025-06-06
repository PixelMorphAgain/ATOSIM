package org.palladiosimulator.blockchainsystems.core.system.abstractions

import org.palladiosimulator.blockchainsystems.core.common.abstractions.Traceable
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction

interface TrxMemPool : Traceable {
  fun getTransactionById(txId: String): Transaction?
  fun storeTransaction(transaction: Transaction)
}