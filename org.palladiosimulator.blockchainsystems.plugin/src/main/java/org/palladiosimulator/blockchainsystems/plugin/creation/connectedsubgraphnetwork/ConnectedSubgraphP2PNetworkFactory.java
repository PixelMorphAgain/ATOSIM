package org.palladiosimulator.blockchainsystems.plugin.creation.connectedsubgraphnetwork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.random.RandomGenerator;

import org.jgrapht.graph.SimpleGraph;

import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ConnectedSubgraphsNetworkTopology;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.SubgraphNodeTemplate;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.SubgraphSpecification;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.LinkSpecification;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.SubgraphLink;
import org.palladiosimulator.blockchainsystems.core.network.P2PNode;
import org.palladiosimulator.blockchainsystems.core.network.P2PLink;
import org.palladiosimulator.blockchainsystems.core.network.P2PNetworkImpl;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkCreationResult;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkFactory;
import org.palladiosimulator.blockchainsystems.plugin.creation.LatencyValueProvider;
import org.palladiosimulator.blockchainsystems.plugin.creation.ThroughputValueProvider;

public class ConnectedSubgraphP2PNetworkFactory implements P2PNetworkFactory {

    private final RandomGenerator _randomGenerator;
    private final ConnectedSubgraphsNetworkTopology _topology;

    public ConnectedSubgraphP2PNetworkFactory(RandomGenerator randomGenerator, ConnectedSubgraphsNetworkTopology topology) {
        _randomGenerator = randomGenerator;
        _topology = topology;
    }

    @Override
    public P2PNetworkCreationResult createP2PNetwork() {
        HashMap<String, String> nodeIdToNodeTemplateIdMapping = new HashMap<String, String>();

        HashMap<String, HashSet<P2PNode>> subgraphIdToSubgraphNodesMapping = new HashMap<String, HashSet<P2PNode>>();
        HashMap<String, HashSet<P2PNode>> subGraphIdToProxyNodesMapping = new HashMap<String, HashSet<P2PNode>>();
        HashMap<String, SubgraphSpecification> subGraphIdToLinkSpecificationMapping =
                new HashMap<String, SubgraphSpecification>();

        // Fill mappings and create P2PNode instances
        for (SubgraphSpecification subgraphSpec : _topology.getSubgraphs()) {

            subgraphIdToSubgraphNodesMapping.put(subgraphSpec.getId(), new HashSet<P2PNode>());
            subGraphIdToProxyNodesMapping.put(subgraphSpec.getId(), new HashSet<P2PNode>());
            subGraphIdToLinkSpecificationMapping.put(subgraphSpec.getId(), subgraphSpec);

            for (SubgraphNodeTemplate nodeTemplate : subgraphSpec.getNodeTemplates()) {

                for (int i = 0; i < nodeTemplate.getNumberOfNodeOccurences(); i++) {
                    String p2pNodeId = UUID.randomUUID().toString();
                    P2PNode node = new P2PNode(p2pNodeId);

                    subgraphIdToSubgraphNodesMapping.get(subgraphSpec.getId()).add(node);

                    if (nodeTemplate.isIsSubgraphProxy()) {
                        subGraphIdToProxyNodesMapping.get(subgraphSpec.getId()).add(node);
                    }

                    nodeIdToNodeTemplateIdMapping.put(p2pNodeId, nodeTemplate.getId());
                }
            }
        }

        SimpleGraph<P2PNode, P2PLink> networkGraph = new SimpleGraph<P2PNode, P2PLink>(P2PLink.class);

        // Create each subgraph and add it to the networkGraph
        for (Entry<String, HashSet<P2PNode>> entry : subgraphIdToSubgraphNodesMapping.entrySet()) {

            P2PNodeDegreeMap initialDegrees = new P2PNodeDegreeMap();
            SubgraphSpecification subgraphSpec = subGraphIdToLinkSpecificationMapping.get(entry.getKey());

            // Add vertices of subgraph
            for (P2PNode node : entry.getValue()) {
                networkGraph.addVertex(node);
                initialDegrees.put(node, subgraphSpec.getConnectivity());
            }

            P2PNode[] subgraphNodes = initialDegrees.keySet().toArray(P2PNode[]::new);

            // Get link specification for subgraph internal links
            LinkSpecification subgraphLinkSpecification = subgraphSpec.getLinkSpecification();
            LatencyValueProvider latencyValueProvider = new LatencyValueProvider(subgraphLinkSpecification.getLatency());
            ThroughputValueProvider throughputValueProvider =
                    new ThroughputValueProvider(subgraphLinkSpecification.getThroughput());

            //Create spanning tree in subgraph
            for (int i = 0; i < subgraphNodes.length - 1; i++) {
                P2PNode firstNode = subgraphNodes[i];
                P2PNode secondNode = subgraphNodes[i + 1];

                networkGraph.addEdge(firstNode, secondNode, P2PLink.create(
                        latencyValueProvider,
                        throughputValueProvider,
                        firstNode,
                        secondNode));
                initialDegrees.decrease(firstNode);
                initialDegrees.decrease(secondNode);
            }

            // Enhance with random edges
            P2PNode[] nodesToEnhance = initialDegrees.keySet().toArray(P2PNode[]::new);

            for (P2PNode currentNode : nodesToEnhance) {
                int remainingDegree = initialDegrees.get(currentNode);

                while (remainingDegree > 0) {

                    P2PNode[] potentialNodes = initialDegrees
                            .keySet()
                            .stream()
                            .filter(x -> x != currentNode)
                            .filter(x -> !networkGraph.containsEdge(x, currentNode))
                            .toArray(P2PNode[]::new);

                    if (potentialNodes.length == 0) {
                        // Sometimes each node except for the last one has reached the maximum degree
                        // The strategy here is to neglect the range parameters for the last node
                        initialDegrees.decrease(currentNode);
                        remainingDegree--;
                        continue;
                    }

                    int randomPotentialNodeIndex = _randomGenerator.nextInt(0, potentialNodes.length);
                    P2PNode selectedNode = potentialNodes[randomPotentialNodeIndex];

                    networkGraph.addEdge(currentNode, selectedNode, P2PLink.create(
                            latencyValueProvider,
                            throughputValueProvider,
                            currentNode,
                            selectedNode));
                    initialDegrees.decrease(currentNode);
                    initialDegrees.decrease(selectedNode);

                    remainingDegree--;
                }
            }
        }

        // Add connections between the proxies of the subgraph;
        for (SubgraphLink subgraphLink : _topology.getSubgraphLinks()) {
            SubgraphSpecification firstSubgraphSpec = subgraphLink.getConnectedSubgraphs().get(0);
            SubgraphSpecification secondSubgraphSpec = subgraphLink.getConnectedSubgraphs().get(1);

            P2PNode[] firstSubgraphProxies = subGraphIdToProxyNodesMapping.get(firstSubgraphSpec.getId()).toArray(P2PNode[]::new);
            P2PNode[] secondSubgraphJProxies =
                    subGraphIdToProxyNodesMapping.get(secondSubgraphSpec.getId()).toArray(P2PNode[]::new);

            LinkSpecification subgraphLinkSpecification = subgraphLink.getSpecification();
            LatencyValueProvider latencyValueProvider = new LatencyValueProvider(subgraphLinkSpecification.getLatency());
            ThroughputValueProvider throughputValueProvider =
                    new ThroughputValueProvider(subgraphLinkSpecification.getThroughput());


            for (P2PNode firstSubgraphProxy : firstSubgraphProxies) {
                for (P2PNode secondSubgraphProxy : secondSubgraphJProxies) {
                    P2PLink link = new P2PLink(
                            latencyValueProvider,
                            throughputValueProvider,
                            firstSubgraphProxy,
                            secondSubgraphProxy);
                    networkGraph.addEdge(firstSubgraphProxy, secondSubgraphProxy, link);
                }
            }
        }

        P2PNetworkImpl networkImpl = P2PNetworkImpl.create(networkGraph);

        for (P2PNode p2pNode : networkGraph.vertexSet()) {
            p2pNode.initNetwork(networkImpl);
        }

        for (P2PLink e : networkGraph.edgeSet()) {
            System.out.println(
                    Math.abs(networkGraph.getEdgeSource(e).getEndpointId().hashCode())
                            + "-"
                            + Math.abs(networkGraph.getEdgeTarget(e).getEndpointId().hashCode()));
        }

        return new ConnectedSubgraphNetworkCreationResult(
                networkImpl,
                nodeIdToNodeTemplateIdMapping);
    }

    private class P2PNodeDegreeMap {
        private final HashMap<P2PNode, Integer> _map;

        public P2PNodeDegreeMap() {
            _map = new HashMap<P2PNode, Integer>();
        }

        public void put(P2PNode node, int value) {
            if (value <= 0) {
                _map.remove(node);
                return;
            }

            _map.put(node, value);
        }

        public int get(P2PNode node) {
            Integer value = _map.get(node);
            return value == null ? 0 : value;
        }

        public void decrease(P2PNode node) {
            Integer value = _map.get(node);
            if (value != null) {
                put(node, value - 1);
            }
        }

        public Set<P2PNode> keySet() {
            return _map.keySet();
        }
    }
}
