package org.palladiosimulator.blockchainsystems.core.transaction;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Transaction;

public record TransactionStoredInPoolTraceEvent(
        long occurrenceTime,
        Transaction storedTransaction
) implements TraceEvent {

    public static final String EVENT_TYPE = "TransactionStoredInPoolTraceEvent";

    @Override
    public long getOccurrenceTime() {
        return occurrenceTime;
    }

    public Transaction getStoredTransaction() {
        return storedTransaction;
    }

    @Override
    public String getEventType() {
        return EVENT_TYPE;
    }

    @Override
    public void formatDetails(StringBuilder stringBuilder) {
        stringBuilder.append("{ txId=");
        stringBuilder.append(storedTransaction.getTxId());
        stringBuilder.append(" }");
    }
}
