package org.palladiosimulator.blockchainsystems.threesim.creation.network.connectedsubgraphs

import org.palladiosimulator.blockchainsystems.bscm.nodeallocation.NodeAllocation
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ConnectedSubgraphsNetworkTopology
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.SubgraphNodeTemplate
import org.palladiosimulator.blockchainsystems.threesim.creation.abstractions.NodeAllocationResolver

/**
 * This class resolves the node allocations for a connected subgraph network topology.
 *
 * @author Yannik Sproll, Davis Riedel
 */
class ConnectedSubgraphNetworkNodeAllocationResolver(
  connectedSubgraphsTopology: ConnectedSubgraphsNetworkTopology,
  nodeIdToNodeTemplateIdMapping: HashMap<String, String>
) : NodeAllocationResolver {
  private val nodeIdToNodeTemplatesMappings: MutableMap<String, SubgraphNodeTemplate>

  init {
    val nodeTemplatesByIds = connectedSubgraphsTopology
      .subgraphs
      .flatMap { x -> x.nodeTemplates }
      .associateBy { it.id }

    nodeIdToNodeTemplatesMappings =
      nodeIdToNodeTemplateIdMapping
        .mapValues { nodeTemplatesByIds[it.value] }
        .filter { it.value != null }
        .toMutableMap() as MutableMap<String, SubgraphNodeTemplate> // NOTE: Safe because we filter out nulls
  }

  override fun getNodeAllocation(nodeId: String): NodeAllocation? {
    return nodeIdToNodeTemplatesMappings[nodeId]?.allocation
  }
}