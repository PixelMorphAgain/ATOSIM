package org.palladiosimulator.blockchainsystems.threesim.creation

import org.palladiosimulator.blockchainsystems.core.system.abstractions.ResourcePowerCalculator

class AttackAwareResourcePowerCalculator(
    private val delegate: ResourcePowerCalculator,
    private val attackerNodeIds: Set<String>,
    private val attackerHashPower: Double
) : ResourcePowerCalculator {

    init {
        require(attackerHashPower in 0.0..1.0) {
        "attackerHashPower must be in [0,1]"
        }
    }

    override fun getResourcePowerOfNode(nodeId: String): Double? {
        val basePower = delegate.getResourcePowerOfNode(nodeId) ?: 0.0

        // Fast paths
        if (attackerHashPower == 0.0) {
            return if (attackerNodeIds.contains(nodeId)) 0.0 else basePower
        }

        if (attackerHashPower == 1.0) {
            return if (attackerNodeIds.contains(nodeId)) basePower else 0.0
        }

        // ---- Explicit accumulation (NO sumOf) ----
        var attackerBasePower = 0.0
        for (id in attackerNodeIds) {
            attackerBasePower += delegate.getResourcePowerOfNode(id) ?: 0.0
        }

        val totalPower = delegate.calculateGlobalResourcePower()
        val honestBasePower = totalPower - attackerBasePower

        // Avoid division by zero (NO <= operator)
        if (attackerBasePower == 0.0 || honestBasePower == 0.0) {
            return basePower
        }

        return if (attackerNodeIds.contains(nodeId)) {
            val scale =
                (attackerHashPower * honestBasePower) /
                        ((1.0 - attackerHashPower) * attackerBasePower)
            basePower * scale
        } else {
            basePower
        }
    }

    override fun calculateGlobalResourcePower(): Double {
        // Global power remains the same reference total
        return delegate.calculateGlobalResourcePower()
    }
}