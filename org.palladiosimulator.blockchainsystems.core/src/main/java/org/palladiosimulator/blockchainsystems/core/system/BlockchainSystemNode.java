package org.palladiosimulator.blockchainsystems.core.system;

import java.util.Collections;
import java.util.Set;

import org.palladiosimulator.blockchainsystems.core.common.BlockchainSimulationObject;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Taggable;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.*;

/**
 * The {@code BlockchainSystemNode} class represents a blockchain system node.
 * It uses abstractions for the relevant components of blockchain system nodes,
 * such as a blockchain data structure.
 * The {@code BlockchainSystemNode} class sets up the correct initialization and linking
 * for these abstractions.
 *
 * @author Yannik Sproll
 */
public class BlockchainSystemNode extends BlockchainSimulationObject implements Taggable {

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

    private final BlockchainSystemNodeBehavior _behavior;

    private final Set<String> _tags;

    private final BlockchainSystemNodeContextImpl _context;

    public BlockchainSystemNode(
            String id,
            String name,
            PropagationStrategy<Transaction> transactionPropagationStrategy,
            PropagationStrategy<Block> blockPropagationStrategy,
            NodeP2PNetworkInterface networkInterface,
            MiningProcess miningProcess,
            Blockchain blockchain,
            BlockValidator blockValidator,
            OrphanBlockPool orphanBlockPool,
            BlockFactory blockFactory,
            TransactionFactory transactionFactory,
            TransactionPool transactionPool,
            BlockchainSystemNodeBehavior behavior,
            Set<String> tags
    ) {
        super(id, name);

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

        _behavior = behavior;

        _tags = tags;

        _context = new BlockchainSystemNodeContextImpl(
                id,
                _transactionPropagationStrategy,
                _blockPropagationStrategy,
                _networkInterface,
                _miningProcess,
                _blockchain,
                _blockValidator,
                _orphanBlockPool,
                _blockFactory,
                _transactionFactory,
                _transactionPool
        );
    }

    public BlockchainSystemNode(
            String id,
            String name,
            PropagationStrategy<Transaction> transactionPropagationStrategy,
            PropagationStrategy<Block> blockPropagationStrategy,
            NodeP2PNetworkInterface networkInterface,
            MiningProcess miningProcess,
            Blockchain blockchain,
            BlockValidator blockValidator,
            OrphanBlockPool orphanBlockPool,
            BlockFactory blockFactory,
            TransactionFactory transactionFactory,
            TransactionPool transactionPool,
            BlockchainSystemNodeBehavior behavior) {
        this(
                id,
                name,
                transactionPropagationStrategy,
                blockPropagationStrategy,
                networkInterface,
                miningProcess,
                blockchain,
                blockValidator,
                orphanBlockPool,
                blockFactory,
                transactionFactory,
                transactionPool,
                behavior,
                Collections.emptySet()
        );
    }

    @Override
    public void onInitialize() {
        _blockchain.initialize(getSimulationContext());
        _blockchain.initializeLogger(this);

        _blockPropagationStrategy.setNetworkInterface(_networkInterface);
        _blockPropagationStrategy.setBlockchain(_blockchain);
        _blockPropagationStrategy.setOnPropagatedObjectReceivedCallback(this::onBlockReceived);
        _blockPropagationStrategy.initialize(getSimulationContext());
        _blockPropagationStrategy.initializeLogger(this);

        _transactionPropagationStrategy.setNetworkInterface(_networkInterface);
        _transactionPropagationStrategy.setBlockchain(_blockchain);
        _transactionPropagationStrategy.setOnPropagatedObjectReceivedCallback(this::onTransactionReceived);
        _transactionPropagationStrategy.initialize(getSimulationContext());
        _transactionPropagationStrategy.initializeLogger(this);

        _blockValidator.setOnBlockValidatedCallback(this::onBlockValidated);
        _blockValidator.initialize(getSimulationContext());
        _blockValidator.initializeLogger(this);

        _miningProcess.setOnBlockMinedCallback(this::onBlockMined);
        _miningProcess.setPreviousBlockSelectionCallback(this::onPreviousBlockSelected);
        _miningProcess.setOnCreatingBlockCallback(this::onCreatingBlock);
        _miningProcess.initialize(getSimulationContext());
        _miningProcess.initializeLogger(this);

        // TODO: Add smart contract process

        _orphanBlockPool.initialize(getSimulationContext());
        _orphanBlockPool.initializeLogger(this);

        _transactionPool.initialize(getSimulationContext());
        _transactionPool.initializeLogger(this);

        _behavior.initialize(getSimulationContext());
        _behavior.initializeLogger(this);
        _behavior.onNodeInitialized(_context);
    }

    public void onCleanup() {
        _orphanBlockPool.cleanup();
        _miningProcess.cleanup();
        _blockValidator.cleanup();
        _blockPropagationStrategy.cleanup();
        _blockchain.cleanup();
    }

    public ReadonlyBlockchain getBlockchain() {
        return _blockchain;
    }


    private void onBlockReceived(Block block) {
        _behavior.onBlockReceived(block, _context);
    }

    private void onBlockValidated(Block block, Boolean isValid) {
        _behavior.onBlockValidated(block, isValid, _context);
    }

    private Block onCreatingBlock(Long blockMinedAt, String previousBlockHash) {
        return _behavior.onCreatingBlock(blockMinedAt, previousBlockHash, _context);
    }

    private String onPreviousBlockSelected() {
        return _behavior.onPreviousBlockSelection(_context);
    }

    private void onBlockMined(Block block) {
        _behavior.onBlockMined(block, _context);
    }

    private void onTransactionReceived(Transaction transaction) {
        _behavior.onTransactionReceived(transaction, _context);
    }

    @Override
    public void dispatchEvent(Event event) {
    }

    @Override
    public boolean hasTag(String tag) {
        return _tags.contains(tag);
    }
}
