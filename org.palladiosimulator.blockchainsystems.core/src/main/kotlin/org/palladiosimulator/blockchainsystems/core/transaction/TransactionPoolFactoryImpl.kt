package org.palladiosimulator.blockchainsystems.core.transaction

import org.palladiosimulator.blockchainsystems.core.system.abstractions.TransactionPool
import org.palladiosimulator.blockchainsystems.core.system.abstractions.TransactionPoolFactory

/**
 * @author Davis Riedel
 */
class TransactionPoolFactoryImpl : TransactionPoolFactory {
  override fun createTransactionPool(nodeId: String): TransactionPool {
    return TransactionPoolImpl()
  }
}