package org.palladiosimulator.blockchainsystems.core.system;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockFactory;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.PropagationStrategyFactory;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockValidatorFactory;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainFactory;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeBehaviorFactory;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeTagProvider;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcessFactory;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.NodeP2PNetworkInterface;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.OrphanBlockPoolFactory;

public class BlockchainSystemNodeFactory {

    private final BlockFactory _blockFactory;
    private final BlockchainFactory _blockchainFactory;
    private final MiningProcessFactory _miningProcessFactory;
    private final BlockValidatorFactory _blockValidatorFactory;
    private final PropagationStrategyFactory<Block> _blockPropagationStrategyFactory;
    private final OrphanBlockPoolFactory _orphanBlockPoolFactory;
    private final BlockchainSystemNodeBehaviorFactory _behaviorFactory;
    private final BlockchainSystemNodeTagProvider _tagProvider;

    public BlockchainSystemNodeFactory(
            BlockFactory blockFactory,
            BlockchainFactory blockchainFactory,
            MiningProcessFactory miningProcessFactory,
            BlockValidatorFactory blockValidatorFactory,
            PropagationStrategyFactory<Block> blockPropagationStrategyFactory,
            OrphanBlockPoolFactory orphanBlockPoolFactory,
            BlockchainSystemNodeBehaviorFactory behaviorFactory,
            BlockchainSystemNodeTagProvider tagProvider) {
        _blockFactory = blockFactory;
        _blockchainFactory = blockchainFactory;
        _miningProcessFactory = miningProcessFactory;
        _blockValidatorFactory = blockValidatorFactory;
        _blockPropagationStrategyFactory = blockPropagationStrategyFactory;
        _orphanBlockPoolFactory = orphanBlockPoolFactory;
        _behaviorFactory = behaviorFactory;
        _tagProvider = tagProvider;
    }

    public BlockchainSystemNode createBlockchainSystemNode(
            NodeP2PNetworkInterface networkInterface,
            Block genesisBlock
    ) {
        String nodeId = networkInterface.getEndpointId();
        String name = "BlockchainSystemNode_" + nodeId;

        return new BlockchainSystemNode(
                nodeId,
                name,
                _blockPropagationStrategyFactory.createPropagationStrategy(),
                networkInterface,
                _miningProcessFactory.createMiningProcess(nodeId),
                _blockchainFactory.createBlockchain(genesisBlock, nodeId),
                _blockValidatorFactory.createBlockValidator(nodeId),
                _orphanBlockPoolFactory.createOrphanBlockPool(nodeId),
                _blockFactory,
                _behaviorFactory.create(nodeId),
                _tagProvider.getTags(nodeId)
        );
    }
}
