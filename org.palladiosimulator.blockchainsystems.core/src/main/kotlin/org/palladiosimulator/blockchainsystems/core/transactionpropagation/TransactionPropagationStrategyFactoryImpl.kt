package org.palladiosimulator.blockchainsystems.core.transactionpropagation

import org.palladiosimulator.blockchainsystems.core.system.abstractions.PropagationStrategy
import org.palladiosimulator.blockchainsystems.core.system.abstractions.PropagationStrategyFactory
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Transaction

class TransactionPropagationStrategyFactoryImpl : PropagationStrategyFactory<Transaction> {
  override fun createPropagationStrategy(): PropagationStrategy<Transaction> {
    return TransactionPropagationStrategyImpl()
  }
}