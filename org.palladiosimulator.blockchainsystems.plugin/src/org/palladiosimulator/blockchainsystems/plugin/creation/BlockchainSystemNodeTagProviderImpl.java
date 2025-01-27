package org.palladiosimulator.blockchainsystems.plugin.creation;

import java.util.Collections;
import java.util.Set;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeTagProvider;
import org.palladiosimulator.blockchainsystems.doublespending.behavior.MaliciousNodesIdProvider;
import org.palladiosimulator.blockchainsystems.doublespending.util.TagUtils;

public class BlockchainSystemNodeTagProviderImpl implements BlockchainSystemNodeTagProvider {

    private final MaliciousNodesIdProvider _maliciousNodesIdProvider;

    public BlockchainSystemNodeTagProviderImpl(MaliciousNodesIdProvider maliciousNodesIdProvider) {
        _maliciousNodesIdProvider = maliciousNodesIdProvider;
    }

    @Override
    public Set<String> getTags(String nodeId) {
        if (_maliciousNodesIdProvider.getMaliciousNodeIds().contains(nodeId)) {
            return TagUtils.getMaliciousNodeTags();
        }

        return Collections.emptySet();
    }

}
