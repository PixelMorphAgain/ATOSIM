package org.palladiosimulator.blockchainsystems.threesim.creation.explicitnetwork;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetwork;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkCreationResult;

public record ExplicitP2PNetworkCreationResult(
        P2PNetwork createdNetwork
) implements P2PNetworkCreationResult {

    @Override
    public P2PNetwork getCreatedNetwork() {
        return createdNetwork;
    }

}
