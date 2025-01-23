package org.palladiosimulator.blockchainsystems.core.blocks;

import java.util.HashSet;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;

public record BlockImpl(
		String hash,
		String previousHash,
		String originId,
		long blockMinedTimesteamp,
		int size,
		HashSet<String> tags) implements Block {

	@Override
	public String getHash() {
		return this.hash();
	}

	@Override
	public String getPreviousHash() {
		return this.previousHash();
	}

	@Override
	public String getOriginId() {
		return this.originId();
	}

	@Override
	public long getBlockMinedTimestamp() {
		return this.blockMinedTimesteamp();
	}
	
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean hasTag(String tag) {
		return tags.contains(tag);
	}

	
}
