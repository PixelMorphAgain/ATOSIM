package org.palladiosimulator.blockchainsystems.core.blockchain;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockType;

public record BlockTypeChangedTraceEvent(
        long occurenceTime,
        Block block,
        BlockType oldBlockType,
        BlockType newBlockType) implements TraceEvent {

    public final static String EVENT_TYPE = "BlockTypeChangedTraceEvent";

    @Override
    public long getOccurrenceTime() {
        return occurenceTime;
    }

    @Override
    public String getEventType() {
        return "BlockTypeChangedTraceEvent";
    }

    public Block getBlock() {
        return block;
    }

    public BlockType getOldBlockType() {
        return oldBlockType;
    }

    public BlockType getNewBlockType() {
        return newBlockType;
    }

    @Override
    public void formatDetails(StringBuilder stringBuilder) {
        stringBuilder.append("{ blockHash=");
        stringBuilder.append(block.getHash());
        stringBuilder.append("; oldBlockType=");
        stringBuilder.append(oldBlockType);
        stringBuilder.append("; newBlockType=");
        stringBuilder.append(newBlockType);
        stringBuilder.append(" }");
    }

}
