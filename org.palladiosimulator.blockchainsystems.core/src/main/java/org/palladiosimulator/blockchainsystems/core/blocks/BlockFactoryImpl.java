package org.palladiosimulator.blockchainsystems.core.blocks;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockFactory;

/**
 * The @code{BlockFactoryImpl} class implements the @code{BlockFactory} interface
 * to create instances of the @code{Block} class.
 * It provides methods to create blocks with or without tags, and a genesis block.
 *
 * @author Yannik Sproll, Davis Riedel
 */
public class BlockFactoryImpl implements BlockFactory {
    public BlockFactoryImpl() {
    }

    @Override
    public Block createBlock(
            String hash,
            String previousHash,
            String originId,
            long blockMinedTimestamp,
            int blockSize
    ) {
        return new BlockImpl(
                hash,
                previousHash,
                originId,
                blockMinedTimestamp,
                blockSize,
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
            int blockSize,
            Set<String> tags
    ) {
        return new BlockImpl(
                hash,
                previousHash,
                originId,
                blockMinedTimestamp,
                blockSize,
                new HashSet<String>(tags)
        );
    }

}
