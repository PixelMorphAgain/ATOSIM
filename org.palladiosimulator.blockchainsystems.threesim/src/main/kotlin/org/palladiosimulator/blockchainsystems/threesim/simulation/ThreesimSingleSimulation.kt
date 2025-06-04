package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SingleSimulation
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SingleSimulationResult
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemFactory
import org.palladiosimulator.blockchainsystems.threesim.simulation.logoutputs.LogOutputProvider

/**
 * Single simulation of 3SIM.
 *
 * @author Davis Riedel
 */
class ThreesimSingleSimulation(
  val blockchainSystemFactory: BlockchainSystemFactory,
  val logOutputProvider: LogOutputProvider,
  val maxAllowedBlockchainLength: Long,
) : SingleSimulation {
  override fun run(): SingleSimulationResult {
    val result = ThreesimSimulationRound(
      blockchainSystemFactory.createBlockchainSystem(),
      logOutputProvider.logOutputs,
      maxAllowedBlockchainLength
    ).run();

    return ThreesimSingleSimulationResult(result);
  }
}