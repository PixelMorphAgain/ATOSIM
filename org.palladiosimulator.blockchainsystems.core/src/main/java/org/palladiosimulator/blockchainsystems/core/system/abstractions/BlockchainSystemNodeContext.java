package org.palladiosimulator.blockchainsystems.core.system.abstractions;

/**
 * The @code{BlockchainSystemNodeContext} interface represents the
 * context of a blockchain system node.
 * It provides access to the components of a blockchain system node.
 *
 * @author Yannik Sproll
 */
public interface BlockchainSystemNodeContext {

    /**
     * Returns an identifier of the blockchain system node.
     *
     * @return blockchain system node identifier
     */
    String getId();

    /**
     * Returns an abstraction of the strategy used by the blockchain system node
     * to propagate the blocks through the network.
     *
     * @return the strategy used to propagate blocks
     */
    PropagationStrategy<Block> getBlockPropagationStrategy();

    /**
     * Returns an abstraction of the underlying P2P network.
     *
     * @return P2P network abstraction
     */
    NodeP2PNetworkInterface getNetworkInterface();

    /**
     * Returns an abstraction of the mining process used by the blockchain system node
     * to mine blocks.
     *
     * @return mining process abstraction
     */
    MiningProcess getMiningProcess();

    /**
     * Returns an abstraction of the blockchain data structure of the blockchain system node.
     *
     * @return the blockchain abstraction
     */
    Blockchain getBlockchain();

    /**
     * Returns an abstraction of the orphan block pool used by the blockchain system node
     * to store orphan blocks.
     *
     * @return orphan block pool abstraction
     */
    OrphanBlockPool getOrphanBlockPool();

    /**
     * Returns an abstraction of the block factory used by the blockchain system node
     * to create blocks.
     *
     * @return block factory abstraction
     */
    BlockFactory getBlockFactory();

    /**
     * Returns an abstraction of the block validator used by the blockchain system node
     * to validate blocks.
     *
     * @return block validator abstraction
     */
    BlockValidator getBlockValidator();
}
