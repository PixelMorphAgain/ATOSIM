package org.palladiosimulator.blockchainsystems.core.blockpropagation;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkEndpoint;

public record BlockReceivedTraceEvent(
        long occurrenceTime,
        Block receivedBlock,
        P2PNetworkEndpoint sendingEndpoint
) implements TraceEvent {

    public static final String EVENT_TYPE = "BlockReceivedTraceEvent";

    @Override
    public long getOccurrenceTime() {
        return occurrenceTime;
    }

    public Block getSentBlock() {
        return receivedBlock;
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
        stringBuilder.append("{ blockHash=");
        stringBuilder.append(receivedBlock.getHash());
        stringBuilder.append("; receivedFromNetworkEndpoint=");
        stringBuilder.append(sendingEndpoint.getEndpointId());
        stringBuilder.append(" }");
    }
}
