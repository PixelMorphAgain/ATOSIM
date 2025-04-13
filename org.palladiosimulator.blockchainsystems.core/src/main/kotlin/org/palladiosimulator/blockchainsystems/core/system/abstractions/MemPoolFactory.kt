package org.palladiosimulator.blockchainsystems.core.system.abstractions

interface MemPoolFactory {
  fun createTransactionPool(nodeId: String): MemPool
}