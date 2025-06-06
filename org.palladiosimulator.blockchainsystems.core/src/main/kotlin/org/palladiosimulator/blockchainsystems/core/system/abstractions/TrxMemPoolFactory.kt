package org.palladiosimulator.blockchainsystems.core.system.abstractions

interface TrxMemPoolFactory {
  fun createEmptyTransactionMemPool(nodeId: String): TrxMemPool
}