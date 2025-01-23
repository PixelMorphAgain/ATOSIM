package org.palladiosimulator.blockchainsystems.plugin.creation.explicitnetwork;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

import org.palladiosimulator.blockchainsystems.bscm.nodesystem.NodeBehavior;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ExplicitNetworkTopology;
import org.palladiosimulator.blockchainsystems.core.blockchain.BlockchainFactoryImpl;
import org.palladiosimulator.blockchainsystems.core.blockpropagation.BlockPropagationStrategyFactoryImpl;
import org.palladiosimulator.blockchainsystems.core.blocks.BlockFactoryImpl;
import org.palladiosimulator.blockchainsystems.core.blocks.BlockSizeValueProvider;
import org.palladiosimulator.blockchainsystems.core.orphanblockpool.OrphanBlockPoolFactoryImpl;
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystem;
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemFactory;
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemNode;
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemNodeFactory;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockFactory;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockValidatorFactory;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeBehaviorFactory;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeTagProvider;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcessFactory;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.NodeP2PNetworkInterface;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetwork;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkCreationResult;
import org.palladiosimulator.blockchainsystems.doublespending.behavior.MaliciousNodesIdProvider;
import org.palladiosimulator.blockchainsystems.plugin.creation.BlockValidatorFactoryPluginImpl;
import org.palladiosimulator.blockchainsystems.plugin.creation.BlockchainSystemNodeBehaviorFactoryPluginImpl;
import org.palladiosimulator.blockchainsystems.plugin.creation.BlockchainSystemNodeTagProviderImpl;
import org.palladiosimulator.blockchainsystems.plugin.creation.MaliciousNodesIdProviderImpl;
import org.palladiosimulator.blockchainsystems.plugin.creation.MiningProcessFactoryPluginImpl;

public class ExplicitNetworkBlockchainSystemFactory implements BlockchainSystemFactory {

    private final ExplicitTopologyP2PNetworkFactory _networkFactory;
    private final org.palladiosimulator.blockchainsystems.bscm.blockchainsystem.BlockchainSystem _designBlockchainSystem;
    private final ExplicitNetworkTopology _explicitTopology;

    public ExplicitNetworkBlockchainSystemFactory(
            org.palladiosimulator.blockchainsystems.bscm.blockchainsystem.BlockchainSystem designBlockchainSystem,
            ExplicitNetworkTopology explicitTopology) {
        _networkFactory = new ExplicitTopologyP2PNetworkFactory(explicitTopology);
        _designBlockchainSystem = designBlockchainSystem;
        _explicitTopology = explicitTopology;
    }

    @Override
    public BlockchainSystem createBlockchainSystem() {
        P2PNetworkCreationResult networkCreationResult = _networkFactory.createP2PNetwork();

        ExplicitNetworkNodeAllocationResolver nodeAllocationResolver = new ExplicitNetworkNodeAllocationResolver(
                _explicitTopology);
        ExplicitNetworkGlobalResourcePowerCalculator globalResourcePowerCalculator = new ExplicitNetworkGlobalResourcePowerCalculator(
                _explicitTopology);
        MaliciousNodesIdProvider maliciousNodesIdProvider = createMaliciousNodesIdProvider(
                _explicitTopology);

        BlockFactoryImpl blockFactory = createBlockFactory();

        BlockchainSystemNodeFactory nodeFactory = createBlockchainSystemNodeFactory(
                nodeAllocationResolver,
                globalResourcePowerCalculator,
                maliciousNodesIdProvider,
                blockFactory);

        return createBlockchainSystemInstance(
                networkCreationResult.getCreatedNetwork(),
                blockFactory,
                nodeFactory);

    }

    private BlockchainSystem createBlockchainSystemInstance(
            P2PNetwork network,
            BlockFactory blockFactory,
            BlockchainSystemNodeFactory nodeFactory) {
        String blockchainSystemId = UUID.randomUUID().toString();
        String blockchainSystemName = "BlockchainSystem_" + blockchainSystemId.substring(0, 8);


        Block genesisBlock = blockFactory.createGenesisBlock();

        HashSet<BlockchainSystemNode> blockchainSystemNodes = new HashSet<BlockchainSystemNode>();
        for (NodeP2PNetworkInterface node : network.getNodes()) {
            BlockchainSystemNode blockchainSystemNode
                    = nodeFactory.createBlockchainSystemNode(node, genesisBlock);

            blockchainSystemNodes.add(blockchainSystemNode);
        }

        return new BlockchainSystem(
                blockchainSystemId,
                blockchainSystemName,
                network,
                blockchainSystemNodes);
    }

    private BlockchainSystemNodeFactory createBlockchainSystemNodeFactory(
            ExplicitNetworkNodeAllocationResolver nodeAllocationResolver,
            ExplicitNetworkGlobalResourcePowerCalculator globalResourcePowerCalculator,
            MaliciousNodesIdProvider maliciousNodesIdProvider,
            BlockFactory blockFactory) {
        // Create factories independent of the metamodel information
        BlockchainFactoryImpl blockchainFactory = new BlockchainFactoryImpl();
        BlockPropagationStrategyFactoryImpl propagationStrategyFactory = new BlockPropagationStrategyFactoryImpl();
        OrphanBlockPoolFactoryImpl orphanBlockPoolFactory = new OrphanBlockPoolFactoryImpl();

        // Create factories dependent of the metamodel information

        MiningProcessFactory miningProcessFactory = new MiningProcessFactoryPluginImpl(nodeAllocationResolver,
                globalResourcePowerCalculator, _designBlockchainSystem.getSpecification());
        BlockValidatorFactory blockValidatorFactory = new BlockValidatorFactoryPluginImpl(nodeAllocationResolver);
        BlockchainSystemNodeBehaviorFactory behaviorFactory = new BlockchainSystemNodeBehaviorFactoryPluginImpl(
                maliciousNodesIdProvider);
        BlockchainSystemNodeTagProvider tagProvider = new BlockchainSystemNodeTagProviderImpl(maliciousNodesIdProvider);

        return new BlockchainSystemNodeFactory(blockFactory, blockchainFactory,
                miningProcessFactory, blockValidatorFactory, propagationStrategyFactory, orphanBlockPoolFactory,
                behaviorFactory, tagProvider);
    }

    private static MaliciousNodesIdProvider createMaliciousNodesIdProvider(ExplicitNetworkTopology explicitTopology) {
        Set<String> maliciousNodeIds = explicitTopology
                .getNodes()
                .stream()
                .filter(x -> x.getAllocation().getNodeSystem().getBehavior().getBehavior() == NodeBehavior.MALICIOUS)
                .map(x -> x.getId())
                .collect(Collectors.toSet());
        return new MaliciousNodesIdProviderImpl(maliciousNodeIds);
    }

    public BlockFactoryImpl createBlockFactory() {
        BlockSizeValueProvider blockSizeValueProvider = new BlockSizeValueProvider(_designBlockchainSystem.getSpecification().getMeanBlockSize());
        return new BlockFactoryImpl(blockSizeValueProvider);
    }

}
