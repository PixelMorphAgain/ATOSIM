package org.palladiosimulator.blockchainsystems.core.system.abstractions;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.Taggable;

/**
 * The {@code Block} interface represents a block of a blockchain.
 * It contains a hash that uniquely identifies it, and hash that identifies the previous block.
 * It also contains an identifier of the node that mined the block and the timestamp when the block was mined.
 *
 * @author Yannik Sproll
 */
public interface Block extends Taggable, Propagatable {

    /**
     * Returns the hash that uniquely identifies the block.
     *
     * @return the block identifier hash
     */
    String getHash();


    /**
     * Returns the hash that uniquely identifies the previous block.
     *
     * @return the previous block identifier hash
     */
    String getPreviousHash();

    /**
     * Returns an identifier of the node that mined the block.
     *
     * @return the miner node identifier
     */
    String getOriginId();

    /**
     * Returns the size of the block in bytes.
     *
     * @return block size in bytes
     */
    int getSize();

    /**
     * Returns the timestamp when the block was mined.
     *
     * @return block mining timestamp
     */
    long getBlockMinedTimestamp();
}
