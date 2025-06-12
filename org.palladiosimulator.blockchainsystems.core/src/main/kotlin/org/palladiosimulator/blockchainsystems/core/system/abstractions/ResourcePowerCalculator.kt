package org.palladiosimulator.blockchainsystems.core.system.abstractions

interface ResourcePowerCalculator {
  fun calculateGlobalResourcePower(): Double
  fun getResourcePowerOfNode(nodeId: String): Double?
}