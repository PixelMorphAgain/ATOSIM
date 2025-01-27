package org.palladiosimulator.blockchainsystems.core.transaction;

import java.util.HashMap;

import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Transaction;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.TransactionPool;

public class TransactionPoolImpl extends BlockchainNodeObject implements TransactionPool {

    private final HashMap<String, Transaction> _transactions;

    public TransactionPoolImpl() {
        _transactions = new HashMap<String, Transaction>();
    }

    private void logTransactionStoredEvent(Transaction transaction) {
        if (!getTraceEventLogger().isEventTypeEnabled(TransactionStoredInPoolTraceEvent.EVENT_TYPE)) {
            return;
        }

        TransactionStoredInPoolTraceEvent event = new TransactionStoredInPoolTraceEvent(
                getSimulationContext().getSystemClock().getCurrentTime(),
                transaction
        );

        getTraceEventLogger().logEvent(event);
    }

    @Override
    public void dispatchEvent(Event event) {
    }

    @Override
    public Transaction getTransactionById(String txId) {
        return _transactions.get(txId);
    }

    @Override
    public void storeTransaction(Transaction transaction) {
        _transactions.put(transaction.getTxId(), transaction);
    }
}
