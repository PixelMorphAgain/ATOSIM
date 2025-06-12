package org.palladiosimulator.blockchainsystems.core.blockchain;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent;
import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.block.abstractions.BlockType;

/**
 * Represents a trace event that is triggered when a block is appended to the blockchain.
 * This event contains details about the appended block, its position, the previous block,
 * and the type of the appended block.
 */
public record BlockAppendedTraceEvent(
        long occurrenceTime,
        Block appendedBlock,
        long blockPosition,
        Block previousBlock,
        BlockType appendedBlockType
) implements TraceEvent {

    public static final String EVENT_TYPE = "BlockAppendedTraceEvent";

    @Override
    public long getOccurrenceTime() {
        return occurrenceTime;
    }

    public Block getAppendedBlock() {
        return appendedBlock;
    }

    public long getBlockPosition() {
        return blockPosition;
    }

    public Block getPreviousBlock() {
        return previousBlock;
    }

    public BlockType getAppendedBlockType() {
        return appendedBlockType;
    }

    @Override
    public String getEventType() {
        return EVENT_TYPE;
    }

    @Override
    public void formatDetails(StringBuilder stringBuilder) {
        stringBuilder.append("{ blockHash=");
        stringBuilder.append(appendedBlock.getHash());
        stringBuilder.append("; previousBlockHash=");
        stringBuilder.append(previousBlock.getHash());
        stringBuilder.append("; blockType=");
        stringBuilder.append(appendedBlockType);
        stringBuilder.append("; blockPosition=");
        stringBuilder.append(blockPosition);
        stringBuilder.append(" }");
    }

}
