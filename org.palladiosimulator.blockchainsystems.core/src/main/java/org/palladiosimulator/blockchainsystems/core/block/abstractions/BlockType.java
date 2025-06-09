package org.palladiosimulator.blockchainsystems.core.block.abstractions;

/**
 * The @code{BlockType} enum specifies possible block types as which blocks can
 * be added to a blockchain data structure.
 *
 * @author Yannik Sproll
 */
public enum BlockType {
    /**
     * The block is included in the main chain.
     */
    IncludedBlock,
    /**
     * The block is appended but it is a stale block.
     */
    StaleBlock,
    /**
     * The block is appended but it is part of a forked branch of the chain.
     */
    ForkingBlock
}
