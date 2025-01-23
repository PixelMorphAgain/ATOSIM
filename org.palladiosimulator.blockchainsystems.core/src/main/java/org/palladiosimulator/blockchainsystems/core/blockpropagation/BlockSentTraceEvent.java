package org.palladiosimulator.blockchainsystems.core.blockpropagation;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkEndpoint;

public record BlockSentTraceEvent(
		long occurenceTime,
		Block sentBlock,
		P2PNetworkEndpoint receivingEndpoint) implements TraceEvent {

	public static final String EVENT_TYPE = "BlockSentTraceEvent";
	
	@Override
	public long getOccurenceTime() {
		return occurenceTime;
	}
	
	public Block getSentBlock() {
		return sentBlock;
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
		stringBuilder.append("{ blockHash=");
		stringBuilder.append(sentBlock.getHash());
		stringBuilder.append("; sentToNetworkEndpoint=");
		stringBuilder.append(receivingEndpoint.getEndpointId());
		stringBuilder.append(" }");
		
	}
}
