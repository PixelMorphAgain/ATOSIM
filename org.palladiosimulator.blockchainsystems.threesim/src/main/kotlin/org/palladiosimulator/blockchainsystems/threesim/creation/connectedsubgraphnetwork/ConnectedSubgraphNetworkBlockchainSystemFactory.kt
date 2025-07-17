package org.palladiosimulator.blockchainsystems.threesim.creation.connectedsubgraphnetwork

import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ConnectedSubgraphsNetworkTopology
import org.palladiosimulator.blockchainsystems.core.system.abstractions.*
import org.palladiosimulator.blockchainsystems.threesim.creation.ThreesimBlockchainSystemFactory
import org.palladiosimulator.blockchainsystems.threesim.creation.abstractions.NodeAllocationResolver
import java.util.random.RandomGenerator
import org.palladiosimulator.blockchainsystems.bscm.blockchainsystem.BlockchainSystem as DesignBlockchainSystem

class ConnectedSubgraphNetworkBlockchainSystemFactory(
  designBlockchainSystem: DesignBlockchainSystem,
  connectedSubgraphsTopology: ConnectedSubgraphsNetworkTopology
) : ThreesimBlockchainSystemFactory(designBlockchainSystem, connectedSubgraphsTopology) {

  override val networkFactory = ConnectedSubgraphP2PNetworkFactory(
    RandomGenerator.of("Random"),
    networkTopology
  )

  override val resourcePowerCalculator = ConnectedSubgraphNetworkGlobalResourcePowerCalculator((networkTopology))

  override fun getNodeAllocationResolver(networkCreationResult: P2PNetworkCreationResult): NodeAllocationResolver {
    networkCreationResult as ConnectedSubgraphNetworkCreationResult
    return ConnectedSubgraphNetworkNodeAllocationResolver(
      networkTopology,
      networkCreationResult.nodeIdToNodeTemplateIdMapping
    )
  }

//  companion object {
//    fun createMaliciousNodesIdProvider(
//      gcsTopology: ConnectedSubgraphsNetworkTopology,
//      nodeIdToNodeTemplateIdMapping: HashMap<String?, String?>
//    ): MaliciousNodesIdProvider {
//      val nodeTemplatesByIds = getNodeTemplatesByIds(gcsTopology)
//
//      val maliciousNodeIds = nodeIdToNodeTemplateIdMapping
//        .entries
//        .stream()
//        .filter { x: MutableMap.MutableEntry<String?, String?>? ->
//          nodeTemplatesByIds.get(x!!.value)!!.getAllocation().getNodeSystem().getBehavior().getBehavior() ==
//            NodeBehavior.MALICIOUS
//        }
//        .map<String?> { Map.Entry.key }
//        .collect(Collectors.toSet())
//
//      return MaliciousNodesIdProviderImpl(maliciousNodeIds)
//    }
//
//    private fun getNodeTemplatesByIds(gcsTopology: ConnectedSubgraphsNetworkTopology): HashMap<String?, SubgraphNodeTemplate?> {
//      val nodeTemplatesByIds = HashMap<String?, SubgraphNodeTemplate?>()
//
//      for (subgraphSpec in gcsTopology.getSubgraphs()) {
//        for (nodeTemplate in subgraphSpec.getNodeTemplates()) {
//          nodeTemplatesByIds.put(nodeTemplate.getId(), nodeTemplate)
//        }
//      }
//
//      return nodeTemplatesByIds
//    }
//  }
}