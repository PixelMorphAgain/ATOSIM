package org.palladiosimulator.blockchainsystems.plugin.creation.connectedsubgraphnetwork;

import java.util.HashMap;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetwork;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkCreationResult;

public record ConnectedSubgraphNetworkCreationResult(
		P2PNetwork createdNetwork,
		HashMap<String, String> nodeIdToNodeTemplateIdMapping) implements P2PNetworkCreationResult {

	@Override
	public P2PNetwork getCreatedNetwork() {
		return createdNetwork;
	}

}
