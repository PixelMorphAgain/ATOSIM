package org.palladiosimulator.blockchainsystems.plugin.creation;

import org.palladiosimulator.blockchainsystems.bscm.nodeallocation.NodeAllocation;

public interface NodeAllocationResolver {

    NodeAllocation getNodeAllocation(String nodeId);
}
