package org.palladiosimulator.blockchainsystems.threesim_plugin.creation.abstractions

import org.palladiosimulator.blockchainsystems.bscm.nodeallocation.NodeAllocation

interface NodeAllocationResolver {
  fun getNodeAllocation(nodeId: String): NodeAllocation
}
