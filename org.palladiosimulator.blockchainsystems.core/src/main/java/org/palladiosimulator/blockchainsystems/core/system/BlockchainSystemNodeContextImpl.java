package org.palladiosimulator.blockchainsystems.core.system;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.*;

/**
 * The {@code BlockchainSystemNodeContextImpl} class is an implementation of the {@code BlockchainSystemNodeContext} interface.
 * It is a container that provides access to all components of a blockchain system node.
 *
 * @author Yannik Sproll
 */
public class BlockchainSystemNodeContextImpl implements BlockchainSystemNodeContext {

    private final String _id;
    private final PropagationStrategy<Transaction> _transactionPropagationStrategy;
    private final PropagationStrategy<Block> _blockPropagationStrategy;
    private final NodeP2PNetworkInterface _networkInterface;
    private final MiningProcess _miningProcess;
    private final Blockchain _blockchain;
    private final BlockValidator _blockValidator;
    private final OrphanBlockPool _orphanBlockPool;
    private final BlockFactory _blockFactory;
    private final TransactionFactory _transactionFactory;
    private final TransactionPool _transactionPool;

    public BlockchainSystemNodeContextImpl(
            String id,
            PropagationStrategy<Transaction> transactionPropagationStrategy,
            PropagationStrategy<Block> blockPropagationStrategy,
            NodeP2PNetworkInterface networkInterface,
            MiningProcess miningProcess,
            Blockchain blockchain,
            BlockValidator blockValidator,
            OrphanBlockPool orphanBlockPool,
            BlockFactory blockFactory,
            TransactionFactory transactionFactory,
            TransactionPool transactionPool
    ) {
        _id = id;
        _transactionPropagationStrategy = transactionPropagationStrategy;
        _blockPropagationStrategy = blockPropagationStrategy;
        _networkInterface = networkInterface;
        _miningProcess = miningProcess;
        _blockchain = blockchain;
        _blockValidator = blockValidator;
        _blockFactory = blockFactory;
        _orphanBlockPool = orphanBlockPool;
        _transactionFactory = transactionFactory;
        _transactionPool = transactionPool;
    }

    @Override
    public String getId() {
        return _id;
    }

    @Override
    public PropagationStrategy<Transaction> getTransactionPropagationStrategy() {
        return _transactionPropagationStrategy;
    }

    @Override
    public PropagationStrategy<Block> getBlockPropagationStrategy() {
        return _blockPropagationStrategy;
    }

    @Override
    public NodeP2PNetworkInterface getNetworkInterface() {
        return _networkInterface;
    }

    @Override
    public MiningProcess getMiningProcess() {
        return _miningProcess;
    }

    @Override
    public Blockchain getBlockchain() {
        return _blockchain;
    }

    @Override
    public OrphanBlockPool getOrphanBlockPool() {
        return _orphanBlockPool;
    }

    @Override
    public BlockFactory getBlockFactory() {
        return _blockFactory;
    }

    @Override
    public BlockValidator getBlockValidator() {
        return _blockValidator;
    }

    @Override
    public TransactionFactory getTransactionFactory() {
        return _transactionFactory;
    }

    @Override
    public TransactionPool getTransactionPool() {
        return _transactionPool;
    }
}
