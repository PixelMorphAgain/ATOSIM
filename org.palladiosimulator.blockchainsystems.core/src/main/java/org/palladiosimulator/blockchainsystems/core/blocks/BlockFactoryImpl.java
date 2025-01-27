package org.palladiosimulator.blockchainsystems.core.blocks;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockFactory;

public class BlockFactoryImpl implements BlockFactory {
    private final BlockSizeValueProvider _blockSizeValueProvider;

    public BlockFactoryImpl(BlockSizeValueProvider blockSizeValueProvider) {
        _blockSizeValueProvider = blockSizeValueProvider;
    }

    @Override
    public Block createBlock(
            String hash,
            String previousHash,
            String originId,
            long blockMinedTimestamp
    ) {
        return new BlockImpl(
                hash,
                previousHash,
                originId,
                blockMinedTimestamp,
                _blockSizeValueProvider.getValue(),
                new HashSet<String>()
        );
    }

    @Override
    public Block createGenesisBlock() {
        return new BlockImpl(
                UUID.randomUUID().toString(),
                null,
                null,
                0,
                0,
                new HashSet<String>()
        );
    }

    @Override
    public Block createBlock(
            String hash,
            String previousHash,
            String originId,
            long blockMinedTimestamp,
            Set<String> tags
    ) {
        return new BlockImpl(
                hash,
                previousHash,
                originId,
                blockMinedTimestamp,
                _blockSizeValueProvider.getValue(),
                new HashSet<String>(tags)
        );
    }

}
