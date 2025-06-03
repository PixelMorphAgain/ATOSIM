package org.palladiosimulator.blockchainsystems.core.system.abstractions;

import java.util.Set;

/**
 * Interface for a factory that produces instances of {@code Block}.
 *
 * @author Yannik Sproll
 */
public interface BlockFactory {

    /**
     * Creates an instance of @code{Block} the represents a genesis block.
     *
     * @return @code{Block} instance representing a genesis block
     */
    Block createGenesisBlock();

    /**
     * Creates a new block with the specified data.
     *
     * @param hash                the hash of the block
     * @param previousHash        the hash of the previous block
     * @param originId            the id of the origin blockchain system node
     * @param blockMinedTimestamp the timestamp at which the block was mined
     * @param blockSize           the size of the block
     * @return a @code{Block} instance
     */
    Block createBlock(
            String hash,
            String previousHash,
            String originId,
            long blockMinedTimestamp,
            int blockSize
    );

    /**
     * Creates a new block with the specified data.
     *
     * @param hash                the hash of the block
     * @param previousHash        the hash of the previous block
     * @param originId            the id of the origin blockchain system node
     * @param blockMinedTimestamp the timestamp at which the block was mined
     * @param blockSize           the size of the block
     * @param tags                tags describing the block
     * @return a @code{Block} instance
     */
    Block createBlock(
            String hash,
            String previousHash,
            String originId,
            long blockMinedTimestamp,
            int blockSize,
            Set<String> tags
    );
}
