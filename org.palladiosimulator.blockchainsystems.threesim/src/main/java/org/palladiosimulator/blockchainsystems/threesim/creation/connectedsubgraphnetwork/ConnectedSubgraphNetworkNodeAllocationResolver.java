package org.palladiosimulator.blockchainsystems.threesim.creation.connectedsubgraphnetwork;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.palladiosimulator.blockchainsystems.bscm.nodeallocation.NodeAllocation;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ConnectedSubgraphsNetworkTopology;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.SubgraphNodeTemplate;
import org.palladiosimulator.blockchainsystems.threesim.creation.abstractions.NodeAllocationResolver;

/**
 * This class resolves the node allocations for a connected subgraph network topology.
 *
 * @author Yannik Sproll
 */
public class ConnectedSubgraphNetworkNodeAllocationResolver implements NodeAllocationResolver {

    private final Map<String, SubgraphNodeTemplate> _nodeIdToNodeTemplatesMappings;

    public ConnectedSubgraphNetworkNodeAllocationResolver(
            ConnectedSubgraphsNetworkTopology connectedSubgraphsTopology,
            HashMap<String, String> nodeIdToNodeTemplateIdMapping) {

        Map<String, SubgraphNodeTemplate> nodeTemplatesByIds = connectedSubgraphsTopology
                .getSubgraphs()
                .stream()
                .flatMap(x -> x.getNodeTemplates().stream())
                .collect(Collectors.toMap(x -> x.getId(), x -> x));


        _nodeIdToNodeTemplatesMappings = nodeIdToNodeTemplateIdMapping
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, x -> nodeTemplatesByIds.get(x.getValue())));
    }

    @Override
    public NodeAllocation getNodeAllocation(String nodeId) {
        return _nodeIdToNodeTemplatesMappings.get(nodeId).getAllocation();
    }

}
