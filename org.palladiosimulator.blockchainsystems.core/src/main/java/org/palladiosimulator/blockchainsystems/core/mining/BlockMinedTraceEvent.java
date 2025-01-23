package org.palladiosimulator.blockchainsystems.core.mining;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;

public record BlockMinedTraceEvent(
		long occurenceTime,
		Block block) implements TraceEvent {

	public static final String EVENT_TYPE = "BlockMinedTraceEvent";
	
	@Override
	public long getOccurenceTime() {
		return this.occurenceTime();
	}

	@Override
	public String getEventType() {
		return EVENT_TYPE;
	}

	@Override
	public void formatDetails(StringBuilder stringBuilder) {
		stringBuilder.append("{ blockHash=");
		stringBuilder.append(block.getHash());
		stringBuilder.append("; previousBlockHash=");
		stringBuilder.append(block.getPreviousHash());
		stringBuilder.append(" }");
	}

}
