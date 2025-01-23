package org.palladiosimulator.blockchainsystems.core.orphanblockpool;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;

public record BlockStoredInOrphanPoolTraceEvent(
		long occurenceTime,
		Block storedBlock) implements TraceEvent {

	public static final String EVENT_TYPE = "BlockStoredInOrphanPoolTraceEvent";
	
	@Override
	public long getOccurenceTime() {
		return occurenceTime;
	}
	
	public Block getStoredBlock() {
		return storedBlock;
	}

	@Override
	public String getEventType() {
		return EVENT_TYPE;
	}

	@Override
	public void formatDetails(StringBuilder stringBuilder) {
		stringBuilder.append("{ blockHash=");
		stringBuilder.append(storedBlock.getHash());
		stringBuilder.append(" }");
	}

}
