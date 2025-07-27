package org.palladiosimulator.blockchainsystems.threesim.behavior

import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeTagProvider

class ThreesimBlockchainSystemNodeTagProvider : BlockchainSystemNodeTagProvider {
  override fun getTags(nodeId: String): Set<String> {
    // TODO: Return tags of node with given nodeId
    return emptySet()
  }
}