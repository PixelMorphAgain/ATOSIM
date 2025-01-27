package org.palladiosimulator.blockchainsystems.core.mining.smartcontract;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.Transaction;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent;

public record SCExecutedTraceEvent(
        long occurrenceTime,
        Transaction transaction
) implements TraceEvent {

    public static final String EVENT_TYPE = "SCExecutedTraceEvent";

    @Override
    public long getOccurrenceTime() {
        return this.occurrenceTime();
    }

    @Override
    public String getEventType() {
        return EVENT_TYPE;
    }

    @Override
    public void formatDetails(StringBuilder stringBuilder) {
        stringBuilder.append("{ txId=");
        stringBuilder.append(transaction.getTxId());
        stringBuilder.append(" }");
    }
}
