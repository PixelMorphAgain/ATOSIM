package org.palladiosimulator.blockchainsystems.core.transactionpropagation;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.PropagationStrategy;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.PropagationStrategyFactory;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Transaction;

public class TransactionPropagationStrategyFactoryImpl implements PropagationStrategyFactory<Transaction> {
    @Override
    public PropagationStrategy<Transaction> createPropagationStrategy() {
        return new TransactionPropagationStrategyImpl();
    }
}
