package org.palladiosimulator.blockchainsystems.core.network;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.palladiosimulator.blockchainsystems.core.common.BlockchainSimulationObject;
import org.palladiosimulator.blockchainsystems.core.common.P2PNetworkObject;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Message;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.NodeP2PNetworkInterface;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetwork;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkEndpoint;

public class P2PNetworkImpl extends BlockchainSimulationObject implements P2PNetwork {

    private final Graph<P2PNode, P2PLink> _networkGraph;

    P2PNetworkImpl(String id, Graph<P2PNode, P2PLink> networkGraph, String name) {
        super(id, name);
        _networkGraph = networkGraph;
    }

    public static P2PNetworkImpl create(Graph<P2PNode, P2PLink> networkGraph) {
        String p2pNetworkId = UUID.randomUUID().toString();

        return new P2PNetworkImpl(p2pNetworkId, networkGraph, "P2PNetwork_" + networkGraph.hashCode());
    }

    @Override
    public void dispatchEvent(Event event) {
    }

    @Override
    public void multicast(NodeP2PNetworkInterface sendingNode, Message content) {
        Set<P2PLink> linksToNeighbors = _networkGraph.edgesOf((P2PNode) sendingNode);
        for (P2PLink link : linksToNeighbors) {
            link.send(content);
        }
    }

    @Override
    public void onInitialize() {
        _networkGraph.vertexSet().forEach(x -> x.initialize(getSimulationContext()));
        _networkGraph.edgeSet().forEach(x -> x.initialize(getSimulationContext()));
    }

    @Override
    public void onCleanup() {
        _networkGraph.edgeSet().forEach(P2PNetworkObject::cleanup);
        _networkGraph.vertexSet().forEach(P2PNetworkObject::cleanup);
    }

    @Override
    public Set<NodeP2PNetworkInterface> getNodes() {
        return Collections.unmodifiableSet(_networkGraph.vertexSet());
    }

    @Override
    public void send(NodeP2PNetworkInterface sendingNode, NodeP2PNetworkInterface recipientNode, Message content) {
        P2PLink link = _networkGraph.getEdge((P2PNode) sendingNode, (P2PNode) recipientNode);
        link.send(content);
    }

    @Override
    public Set<P2PNetworkEndpoint> getNeighbors(NodeP2PNetworkInterface networkInterface) {
        List<P2PNode> neighborNodes = Graphs.neighborListOf(_networkGraph, (P2PNode) networkInterface);
        return new HashSet<P2PNetworkEndpoint>(neighborNodes);
    }
}
