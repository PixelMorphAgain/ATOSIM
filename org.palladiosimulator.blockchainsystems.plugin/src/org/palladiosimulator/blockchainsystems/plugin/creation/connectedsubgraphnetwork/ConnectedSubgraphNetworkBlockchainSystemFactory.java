package org.palladiosimulator.blockchainsystems.plugin.creation.connectedsubgraphnetwork;

import java.util.*;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

import org.palladiosimulator.blockchainsystems.bscm.nodesystem.NodeBehavior;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ConnectedSubgraphsNetworkTopology;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.SubgraphNodeTemplate;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.SubgraphSpecification;
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
import org.palladiosimulator.blockchainsystems.doublespending.behavior.MaliciousNodesIdProvider;
import org.palladiosimulator.blockchainsystems.plugin.creation.BlockValidatorFactoryPluginImpl;
import org.palladiosimulator.blockchainsystems.plugin.creation.BlockchainSystemNodeBehaviorFactoryPluginImpl;
import org.palladiosimulator.blockchainsystems.plugin.creation.BlockchainSystemNodeTagProviderImpl;
import org.palladiosimulator.blockchainsystems.plugin.creation.MaliciousNodesIdProviderImpl;
import org.palladiosimulator.blockchainsystems.plugin.creation.MiningProcessFactoryPluginImpl;

public class ConnectedSubgraphNetworkBlockchainSystemFactory implements BlockchainSystemFactory {

    private final ConnectedSubgraphP2PNetworkFactory _p2pNetworkFactory;
    private final org.palladiosimulator.blockchainsystems.bscm.blockchainsystem.BlockchainSystem _designBlockchainSystem;
    private final ConnectedSubgraphsNetworkTopology _connectedSubgraphsTopology;

    public ConnectedSubgraphNetworkBlockchainSystemFactory(
            org.palladiosimulator.blockchainsystems.bscm.blockchainsystem.BlockchainSystem designBlockchainSystem,
            ConnectedSubgraphsNetworkTopology connectedSubgraphsTopology) {
        _p2pNetworkFactory = new ConnectedSubgraphP2PNetworkFactory(
                RandomGenerator.of("Random"),
                connectedSubgraphsTopology);
        _designBlockchainSystem = designBlockchainSystem;
        _connectedSubgraphsTopology = connectedSubgraphsTopology;
    }

    @Override
    public BlockchainSystem createBlockchainSystem() {

        ConnectedSubgraphNetworkCreationResult networkCreationResult
                = (ConnectedSubgraphNetworkCreationResult) _p2pNetworkFactory.createP2PNetwork();

        // Create information provider based on the generated network
        MaliciousNodesIdProvider maliciousNodesIdProvider = createMaliciousNodesIdProvider(
                _connectedSubgraphsTopology,
                networkCreationResult.nodeIdToNodeTemplateIdMapping());

        ConnectedSubgraphNetworkNodeAllocationResolver nodeAllocationResolver =
                new ConnectedSubgraphNetworkNodeAllocationResolver(
                        _connectedSubgraphsTopology,
                        networkCreationResult.nodeIdToNodeTemplateIdMapping());
        ConnectedSubgraphNetworkGlobalResourcePowerCalculator globalResourcePowerCalculator =
                new ConnectedSubgraphNetworkGlobalResourcePowerCalculator(
                        _connectedSubgraphsTopology);

        // Create factories based on information providers and meta-model
        BlockFactory blockFactory = createBlockFactory(_designBlockchainSystem);

        BlockchainSystemNodeFactory nodeFactory = createBlockchainSystemNodeFactory(
                maliciousNodesIdProvider,
                nodeAllocationResolver,
                globalResourcePowerCalculator,
                blockFactory);

        // Create blockchain system based with factories
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
            MaliciousNodesIdProvider maliciousNodesIdProvider,
            ConnectedSubgraphNetworkNodeAllocationResolver nodeAllocationResolver,
            ConnectedSubgraphNetworkGlobalResourcePowerCalculator globalResourcePowerCalculator,
            BlockFactory blockFactory) {
        // Create factories independent of the metamodel information
        BlockchainFactoryImpl blockchainFactory = new BlockchainFactoryImpl();
        BlockPropagationStrategyFactoryImpl propagationStrategyFactory = new BlockPropagationStrategyFactoryImpl();
        OrphanBlockPoolFactoryImpl orphanBlockPoolFactory = new OrphanBlockPoolFactoryImpl();

        // Create factories dependent of the meta-model information
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


    private static BlockFactoryImpl createBlockFactory(
            org.palladiosimulator.blockchainsystems.bscm.blockchainsystem.BlockchainSystem designBlockchainSystem) {
        BlockSizeValueProvider blockSizeValueProvider =
                new BlockSizeValueProvider(designBlockchainSystem.getSpecification().getMeanBlockSize());
        return new BlockFactoryImpl(blockSizeValueProvider);
    }


    public static MaliciousNodesIdProvider createMaliciousNodesIdProvider(
            ConnectedSubgraphsNetworkTopology gcsTopology,
            HashMap<String, String> nodeIdToNodeTemplateIdMapping) {

        HashMap<String, SubgraphNodeTemplate> nodeTemplatesByIds = getNodeTemplatesByIds(gcsTopology);

        Set<String> maliciousNodeIds = nodeIdToNodeTemplateIdMapping
                .entrySet()
                .stream()
                .filter(x -> nodeTemplatesByIds.get(x.getValue()).getAllocation().getNodeSystem().getBehavior().getBehavior() ==
                        NodeBehavior.MALICIOUS)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        return new MaliciousNodesIdProviderImpl(maliciousNodeIds);
    }

    private static HashMap<String, SubgraphNodeTemplate> getNodeTemplatesByIds(ConnectedSubgraphsNetworkTopology gcsTopology) {
        HashMap<String, SubgraphNodeTemplate> nodeTemplatesByIds = new HashMap<String, SubgraphNodeTemplate>();

        for (SubgraphSpecification subgraphSpec : gcsTopology.getSubgraphs()) {
            for (SubgraphNodeTemplate nodeTemplate : subgraphSpec.getNodeTemplates()) {
                nodeTemplatesByIds.put(nodeTemplate.getId(), nodeTemplate);
            }
        }

        return nodeTemplatesByIds;
    }

}
