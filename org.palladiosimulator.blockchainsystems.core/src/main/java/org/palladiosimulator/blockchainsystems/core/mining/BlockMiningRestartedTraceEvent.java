package org.palladiosimulator.blockchainsystems.core.mining;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent;

public record BlockMiningRestartedTraceEvent(
		long occurenceTime,
		String previousBlockHash) implements TraceEvent {

	public static final String EVENT_TYPE = "BlockMiningRestartedTraceEvent";
	
	@Override
	public long getOccurenceTime() {
		return occurenceTime;
	}
	
	public String getPreviousBlockHash() {
		return previousBlockHash;
	}

	@Override
	public String getEventType() {
		return EVENT_TYPE;
	}

	@Override
	public void formatDetails(StringBuilder stringBuilder) {
		stringBuilder.append("{ targetPreviousBlockHash=");
		stringBuilder.append(this.previousBlockHash());
		stringBuilder.append(" }");
	}

}
