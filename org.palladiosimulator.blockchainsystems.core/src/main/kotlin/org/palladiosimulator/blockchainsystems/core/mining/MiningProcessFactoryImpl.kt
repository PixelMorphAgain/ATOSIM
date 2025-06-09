package org.palladiosimulator.blockchainsystems.core.mining

import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcess
import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcessFactory
import java.util.random.RandomGenerator

class MiningProcessFactoryImpl(
  private val meanBlockTime: Double,
  private val randomGenerator: RandomGenerator
) : MiningProcessFactory {
  override fun createMiningProcess(nodeId: String): MiningProcess {
    return MiningProcessImpl(meanBlockTime, randomGenerator)
  }
}