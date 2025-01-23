package org.palladiosimulator.blockchainsystems.plugin.creation.explicitnetwork;

import java.util.HashMap;

import org.jgrapht.Graph;
import org.jgrapht.graph.SimpleGraph;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ExplicitNetworkTopology;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.Link;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.Node;
import org.palladiosimulator.blockchainsystems.core.network.P2PLink;
import org.palladiosimulator.blockchainsystems.core.network.P2PNetworkImpl;
import org.palladiosimulator.blockchainsystems.core.network.P2PNode;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkCreationResult;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkFactory;
import org.palladiosimulator.blockchainsystems.plugin.creation.LatencyValueProvider;
import org.palladiosimulator.blockchainsystems.plugin.creation.ThroughputValueProvider;

public class ExplicitTopologyP2PNetworkFactory implements P2PNetworkFactory {

	private final ExplicitNetworkTopology _topology;
	
	public ExplicitTopologyP2PNetworkFactory(ExplicitNetworkTopology topology) {
		_topology = topology;
	}
	
	@Override
	public P2PNetworkCreationResult createP2PNetwork() {
		Graph<P2PNode, P2PLink> networkGraph = new SimpleGraph<P2PNode, P2PLink>(P2PLink.class);
		
		
		HashMap<String, P2PNode> p2pNodeMappings = new HashMap<String, P2PNode>();
		
		// Add nodes to the graph
		for (Node designNode : _topology.getNodes()) {
			P2PNode nodeImpl = new P2PNode(designNode.getId());
			
			p2pNodeMappings.put(designNode.getId(), nodeImpl);
			networkGraph.addVertex(nodeImpl);
		}
		
		// Add links to the graph
		for (Link designLink : _topology.getLinks()) {
			Node firstConnectedDesignNode = designLink.getConnectedNodes().get(0);
			Node secondConnectedDesignNode = designLink.getConnectedNodes().get(1);
			
			P2PNode firstP2PNode = p2pNodeMappings.get(firstConnectedDesignNode.getId());
			P2PNode secondP2PNode = p2pNodeMappings.get(secondConnectedDesignNode.getId());
			
			P2PLink link = new P2PLink(
					new LatencyValueProvider(designLink.getSpecification().getLatency()),
					new ThroughputValueProvider(designLink.getSpecification().getThroughput()),
					firstP2PNode,
					secondP2PNode);
			
			networkGraph.addEdge(
					firstP2PNode,
					secondP2PNode,
					link);
		}
		
		P2PNetworkImpl networkImpl = P2PNetworkImpl.create(networkGraph);
		
		// Initialize the nodes with a reference to the network
		for (P2PNode p2pNode : p2pNodeMappings.values()) {
			p2pNode.initNetwork(networkImpl);
		}
		
		return new ExplicitP2PNetworkCreationResult(networkImpl);
	}
}
