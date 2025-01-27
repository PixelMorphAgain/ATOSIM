package org.palladiosimulator.blockchainsystems.core.system;

import java.util.Collections;
import java.util.Set;

import org.palladiosimulator.blockchainsystems.core.common.BlockchainSimulationObject;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Taggable;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockFactory;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.PropagationStrategy;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockValidator;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Blockchain;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeBehavior;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcess;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.NodeP2PNetworkInterface;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.OrphanBlockPool;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.ReadonlyBlockchain;

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

    private final PropagationStrategy<Block> _blockPropagationStrategy;
    private final NodeP2PNetworkInterface _networkInterface;
    private final MiningProcess _miningProcess;
    private final Blockchain _blockchain;
    private final BlockValidator _blockValidator;
    private final OrphanBlockPool _orphanBlockPool;
    private final BlockFactory _blockFactory;

    private final BlockchainSystemNodeBehavior _behavior;

    private final Set<String> _tags;

    private final BlockchainSystemNodeContextImpl _context;

    public BlockchainSystemNode(
            String id,
            String name,
            PropagationStrategy<Block> blockPropagationStrategy,
            NodeP2PNetworkInterface networkInterface,
            MiningProcess miningProcess,
            Blockchain blockchain,
            BlockValidator blockValidator,
            OrphanBlockPool orphanBlockPool,
            BlockFactory blockFactory,
            BlockchainSystemNodeBehavior behavior,
            Set<String> tags
    ) {
        super(id, name);

        _blockPropagationStrategy = blockPropagationStrategy;
        _networkInterface = networkInterface;
        _miningProcess = miningProcess;
        _blockchain = blockchain;
        _blockValidator = blockValidator;
        _blockFactory = blockFactory;
        _orphanBlockPool = orphanBlockPool;

        _behavior = behavior;

        _tags = tags;

        _context = new BlockchainSystemNodeContextImpl(
                id,
                _blockPropagationStrategy,
                _networkInterface,
                _miningProcess,
                _blockchain,
                _blockValidator,
                _orphanBlockPool,
                _blockFactory
        );
    }

    public BlockchainSystemNode(
            String id,
            String name,
            PropagationStrategy<Block> blockPropagationStrategy,
            NodeP2PNetworkInterface networkInterface,
            MiningProcess miningProcess,
            Blockchain blockchain,
            BlockValidator blockValidator,
            OrphanBlockPool orphanBlockPool,
            BlockFactory blockFactory,
            BlockchainSystemNodeBehavior behavior) {
        this(
                id,
                name,
                blockPropagationStrategy,
                networkInterface,
                miningProcess,
                blockchain,
                blockValidator,
                orphanBlockPool,
                blockFactory,
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

        _blockValidator.setOnBlockValidatedCallback(this::onBlockValidated);
        _blockValidator.initialize(getSimulationContext());
        _blockValidator.initializeLogger(this);

        _miningProcess.setOnBlockMinedCallback(this::onBlockMined);
        _miningProcess.setPreviousBlockSelectionCallback(this::onPreviousBlockSelected);
        _miningProcess.setOnCreatingBlockCallback(this::onCreatingBlock);
        _miningProcess.initialize(getSimulationContext());
        _miningProcess.initializeLogger(this);

        _orphanBlockPool.initialize(getSimulationContext());
        _orphanBlockPool.initializeLogger(this);

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

    @Override
    public void dispatchEvent(Event event) {
    }

    @Override
    public boolean hasTag(String tag) {
        return _tags.contains(tag);
    }
}
