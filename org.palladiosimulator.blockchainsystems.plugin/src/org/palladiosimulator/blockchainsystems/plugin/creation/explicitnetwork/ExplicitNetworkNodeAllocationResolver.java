package org.palladiosimulator.blockchainsystems.plugin.creation.explicitnetwork;

import java.util.HashMap;

import org.palladiosimulator.blockchainsystems.bscm.nodeallocation.NodeAllocation;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ExplicitNetworkTopology;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.Node;
import org.palladiosimulator.blockchainsystems.plugin.creation.NodeAllocationResolver;

public class ExplicitNetworkNodeAllocationResolver implements NodeAllocationResolver {

	private final HashMap<String, Node> _nodeIdToNodeMappings;
	
	public ExplicitNetworkNodeAllocationResolver(ExplicitNetworkTopology networkTopology) {
		_nodeIdToNodeMappings = new HashMap<String, Node>();
		
		for (Node node : networkTopology.getNodes()) {
			_nodeIdToNodeMappings.put(node.getId(), node);
		}
	}
	
	@Override
	public NodeAllocation getNodeAllocation(String nodeId) {
		return _nodeIdToNodeMappings.get(nodeId).getAllocation();
	}
}
