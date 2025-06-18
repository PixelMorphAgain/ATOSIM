package org.palladiosimulator.blockchainsystems.core.mining;

import org.jetbrains.annotations.NotNull;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent;
import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block;

public record BlockMinedTraceEvent(
        long occurrenceTime,
        Block block
) implements TraceEvent {

    public static final String EVENT_TYPE = "BlockMinedTraceEvent";

    @Override
    public long getOccurrenceTime() {
        return this.occurrenceTime();
    }

    @NotNull
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
