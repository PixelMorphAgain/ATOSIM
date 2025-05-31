package org.palladiosimulator.blockchainsystems.plugin.creation;

import org.palladiosimulator.blockchainsystems.core.behaviors.HonestBlockchainSystemNodeBehavior;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeBehavior;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeBehaviorFactory;
import org.palladiosimulator.blockchainsystems.doublespending.behavior.MaliciousBlockchainSystemNodeBehavior;
import org.palladiosimulator.blockchainsystems.doublespending.behavior.MaliciousNodesIdProvider;

public class BlockchainSystemNodeBehaviorFactoryPluginImpl implements BlockchainSystemNodeBehaviorFactory {

    private final MaliciousNodesIdProvider _maliciousNodesIdProvider;

    public BlockchainSystemNodeBehaviorFactoryPluginImpl(MaliciousNodesIdProvider maliciousNodesIdProvider) {
        _maliciousNodesIdProvider = maliciousNodesIdProvider;
    }

    @Override
    public BlockchainSystemNodeBehavior create(String nodeId) {
        if (_maliciousNodesIdProvider.getMaliciousNodeIds().contains(nodeId)) {
            return new MaliciousBlockchainSystemNodeBehavior(_maliciousNodesIdProvider);
        }

        return new HonestBlockchainSystemNodeBehavior();
    }

}
