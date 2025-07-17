package org.palladiosimulator.blockchainsystems.threesim.creation.connectedsubgraphnetwork

import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetwork
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkCreationResult

data class ConnectedSubgraphNetworkCreationResult(
  val createdNetwork: P2PNetwork,
  val nodeIdToNodeTemplateIdMapping: HashMap<String, String>
) : P2PNetworkCreationResult {
  override fun getCreatedNetwork(): P2PNetwork {
    return createdNetwork
  }
}