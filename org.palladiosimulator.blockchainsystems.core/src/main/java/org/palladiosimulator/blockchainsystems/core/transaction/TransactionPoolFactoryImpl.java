package org.palladiosimulator.blockchainsystems.core.transaction;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.TransactionPool;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.TransactionPoolFactory;

public class TransactionPoolFactoryImpl implements TransactionPoolFactory {

    @Override
    public TransactionPool createTransactionPool(String nodeId) {
        return new TransactionPoolImpl();
    }
}