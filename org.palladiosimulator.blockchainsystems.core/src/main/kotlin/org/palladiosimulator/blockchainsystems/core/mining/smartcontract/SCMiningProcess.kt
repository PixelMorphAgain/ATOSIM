package org.palladiosimulator.blockchainsystems.core.mining.smartcontract

import org.palladiosimulator.blockchainsystems.core.mining.SimpleMiningProcess
import org.palladiosimulator.blockchainsystems.core.system.abstractions.SCExecutionProcess
import java.util.random.RandomGenerator

/**
 * Creates a {@code MiningProcess} that executes smart contracts.
 *
 * @author Davis Riedel
 */
class SCMiningProcess(
  val scExecutionProcess: SCExecutionProcess,
  meanBlockTime: Double,
  randomGenerator: RandomGenerator
): SimpleMiningProcess(meanBlockTime, randomGenerator) {
  // TODO: Handle mining with SC execution
}