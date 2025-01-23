package org.palladiosimulator.blockchainsystems.core.blockchain;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockType;

public record BlockAppendedTraceEvent(
		long occurenceTime,
		Block appendedBlock,
		long blockPosition,
		Block previousBlock,
		BlockType appendedBlockType) implements TraceEvent {


	public static final String EVENT_TYPE = "BlockAppendedTraceEvent";
	
	@Override
	public long getOccurenceTime() {
		return occurenceTime;
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
