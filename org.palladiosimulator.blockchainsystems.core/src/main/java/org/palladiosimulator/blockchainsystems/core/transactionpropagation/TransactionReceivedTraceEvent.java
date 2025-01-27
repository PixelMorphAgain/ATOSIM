package org.palladiosimulator.blockchainsystems.core.transactionpropagation;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Transaction;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkEndpoint;

public record TransactionReceivedTraceEvent(
        long occurrenceTime,
        Transaction receivedTransaction,
        P2PNetworkEndpoint sendingEndpoint
) implements TraceEvent {

    public static final String EVENT_TYPE = "TransactionReceivedTraceEvent";

    @Override
    public long getOccurrenceTime() {
        return occurrenceTime;
    }

    public Transaction getSentTransaction() {
        return receivedTransaction;
    }

    public P2PNetworkEndpoint getReceivingNetworkEndpoint() {
        return sendingEndpoint;
    }

    @Override
    public String getEventType() {
        return EVENT_TYPE;
    }

    @Override
    public void formatDetails(StringBuilder stringBuilder) {
        stringBuilder.append("{ txId=");
        stringBuilder.append(receivedTransaction.getTxId());
        stringBuilder.append("; receivedFromNetworkEndpoint=");
        stringBuilder.append(sendingEndpoint.getEndpointId());
        stringBuilder.append(" }");
    }
}
