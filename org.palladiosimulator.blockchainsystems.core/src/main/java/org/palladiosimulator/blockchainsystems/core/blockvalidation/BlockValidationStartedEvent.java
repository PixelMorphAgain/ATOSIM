package org.palladiosimulator.blockchainsystems.core.blockvalidation;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.EventDispatchable;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;

public record BlockValidationStartedEvent(
        long occurrenceTime,
        EventDispatchable origin,
        Block block
) implements Event {

    public static final String EVENT_NAME = "BlockValidationStartedEvent";

    @Override
    public long getOccurrenceTime() {
        return this.occurrenceTime();
    }

    @Override
    public String getEventType() {
        return EVENT_NAME;
    }

    @Override
    public EventDispatchable getOrigin() {
        return this.origin();
    }

    @Override
    public String getValueFormatted() {
        return this.toString();
    }

}
