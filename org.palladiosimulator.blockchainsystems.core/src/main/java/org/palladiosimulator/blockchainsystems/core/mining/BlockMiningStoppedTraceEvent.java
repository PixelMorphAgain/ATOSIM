package org.palladiosimulator.blockchainsystems.core.mining;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent;

public record BlockMiningStoppedTraceEvent(
        long occurrenceTime
) implements TraceEvent {

    public static final String EVENT_TYPE = "BlockMiningStoppedTraceEvent";

    @Override
    public long getOccurrenceTime() {
        return occurrenceTime;
    }

    @Override
    public String getEventType() {
        return EVENT_TYPE;
    }

    @Override
    public void formatDetails(StringBuilder stringBuilder) {
    }
}
