package org.palladiosimulator.blockchainsystems.core.transaction.propagation

import org.palladiosimulator.blockchainsystems.core.system.abstractions.PropagationStrategy
import org.palladiosimulator.blockchainsystems.core.system.abstractions.PropagationStrategyFactory
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction

class TransactionPropagationStrategyFactoryImpl : PropagationStrategyFactory<Transaction> {
  override fun createPropagationStrategy(): PropagationStrategy<Transaction> {
    return TransactionPropagationStrategyImpl()
  }
}