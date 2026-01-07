package org.palladiosimulator.blockchainsystems.threesim.monitoring;

import java.util.HashMap;
import java.util.Map;

import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block;

/**
 * Tracks block rewards per node.
 *
 * Used to compute attacker revenue share.
 */
public class BlockRewardMonitor {

    private final Map<String, Integer> rewardsPerNode = new HashMap<>();

    public void recordBlock(Block block) {
        rewardsPerNode.merge(block.getOriginId(), 1, Integer::sum);
    }

    public int getTotalRewards() {
        return rewardsPerNode.values()
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public int getRewardsForNode(String nodeId) {
        return rewardsPerNode.getOrDefault(nodeId, 0);
    }

    public Map<String, Integer> getAllRewards() {
        return rewardsPerNode;
    }
}
