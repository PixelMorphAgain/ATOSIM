package org.palladiosimulator.blockchainsystems.threesim.creation.connectedsubgraphnetwork

import org.palladiosimulator.blockchainsystems.bscm.blockchainsystemComponentRepository.MiningProcessComponent
import org.palladiosimulator.blockchainsystems.bscm.nodeallocation.NodeAllocation
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ConnectedSubgraphsNetworkTopology
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.SubgraphSpecification
import org.palladiosimulator.blockchainsystems.core.system.abstractions.ResourcePowerCalculator

/**
 * This class calculates the global resource power of a connected subgraph network topology.
 *
 * @author Yannik Sproll, Davis Riedel
 */
class ConnectedSubgraphNetworkGlobalResourcePowerCalculator(
  connectedSubgraphsTopology: ConnectedSubgraphsNetworkTopology
) : ResourcePowerCalculator {
  private val globalResourcePower: Double = connectedSubgraphsTopology.subgraphs
    .sumOf { calculateResourcePowerOfSubgraph(it) }

  private fun calculateResourcePowerOfSubgraph(subgraph: SubgraphSpecification): Double {
    return subgraph.nodeTemplates
      .sumOf { getResourcePowerOfAllocation(it.allocation) }
  }

  override fun calculateGlobalResourcePower(): Double {
    return globalResourcePower
  }

  override fun getResourcePowerOfNode(nodeId: String): Double? {
    TODO("Not yet implemented")
  }

  private fun getResourcePowerOfAllocation(nodeAllocation: NodeAllocation): Double {
    return nodeAllocation
      .allocationContexts
      .filter { it.assemblyContext.encapsulatedComponent is MiningProcessComponent }
      .sumOf { it.resourceContainer.resourcePower }
  }
}