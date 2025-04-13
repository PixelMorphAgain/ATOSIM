package org.palladiosimulator.blockchainsystems.core.transaction

import org.palladiosimulator.blockchainsystems.core.system.abstractions.MemPool
import org.palladiosimulator.blockchainsystems.core.system.abstractions.MemPoolFactory

/**
 * @author Davis Riedel
 */
class MemPoolFactoryImpl : MemPoolFactory {
  override fun createTransactionPool(nodeId: String): MemPool {
    return MemPoolImpl()
  }
}