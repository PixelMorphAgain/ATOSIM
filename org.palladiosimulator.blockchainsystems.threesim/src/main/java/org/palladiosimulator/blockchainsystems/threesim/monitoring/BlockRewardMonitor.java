package org.palladiosimulator.blockchainsystems.threesim.monitoring;

import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block;

import java.util.HashMap;
import java.util.Map;

/**
 * Tracks block rewards per runtime node ID.
 *
 * Used to compute attacker revenue share.
 */
public class BlockRewardMonitor {

    private final Map<String, Integer> rewardsPerNode = new HashMap<>();

    /**
     * Record a confirmed block for a runtime node.
     */
    public void recordBlockReward(Block block) {
        if (block.getOriginId() == null) return;
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