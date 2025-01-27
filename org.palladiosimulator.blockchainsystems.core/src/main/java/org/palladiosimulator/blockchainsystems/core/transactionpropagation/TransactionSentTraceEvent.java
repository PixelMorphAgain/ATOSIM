package org.palladiosimulator.blockchainsystems.core.transactionpropagation;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Transaction;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkEndpoint;

public record TransactionSentTraceEvent(
        long occurrenceTime,
        Transaction sentTransaction,
        P2PNetworkEndpoint receivingEndpoint
) implements TraceEvent {

    public static final String EVENT_TYPE = "TransactionSentTraceEvent";

    @Override
    public long getOccurrenceTime() {
        return occurrenceTime;
    }

    public Transaction getSentTransaction() {
        return sentTransaction;
    }

    public P2PNetworkEndpoint getReceivingNetworkEndpoint() {
        return receivingEndpoint;
    }

    @Override
    public String getEventType() {
        return EVENT_TYPE;
    }

    @Override
    public void formatDetails(StringBuilder stringBuilder) {
        stringBuilder.append("{ txId=");
        stringBuilder.append(sentTransaction.getTxId());
        stringBuilder.append("; sentToNetworkEndpoint=");
        stringBuilder.append(receivingEndpoint.getEndpointId());
        stringBuilder.append(" }");
    }
}
