package org.palladiosimulator.blockchainsysttems.threesim.creation.explicitnetwork;

import java.util.HashMap;

import org.jetbrains.annotations.NotNull;
import org.palladiosimulator.blockchainsystems.bscm.nodeallocation.NodeAllocation;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ExplicitNetworkTopology;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.Node;
import org.palladiosimulator.blockchainsystems.threesim.creation.abstractions.NodeAllocationResolver;

/**
 * This class resolves the node allocations for a blockchain system with an explicit network topology.
 *
 * @author Yannik Sproll
 */
public class ExplicitNetworkNodeAllocationResolver implements NodeAllocationResolver {

    private final HashMap<String, Node> _nodeIdToNodeMappings;

    public ExplicitNetworkNodeAllocationResolver(ExplicitNetworkTopology networkTopology) {
        _nodeIdToNodeMappings = new HashMap<String, Node>();

        for (Node node : networkTopology.getNodes()) {
            _nodeIdToNodeMappings.put(node.getId(), node);
        }
    }

    @NotNull
    @Override
    public NodeAllocation getNodeAllocation(@NotNull String nodeId) {
        return _nodeIdToNodeMappings.get(nodeId).getAllocation();
    }
}
