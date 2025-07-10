package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SingleSimulation
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SingleSimulationResult
import org.palladiosimulator.blockchainsystems.core.simulation.logoutputs.abstractions.LogOutputProvider
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemFactory

/**
 * Single simulation of 3SIM.
 *
 * @author Davis Riedel
 */
class ThreesimSingleSimulation(
  private val blockchainSystemFactory: BlockchainSystemFactory,
  private val logOutputProvider: LogOutputProvider,
  private val maxAllowedBlockchainLength: Long,
  private val numberOfRequiredSecurityConfirmations: Int
) : SingleSimulation {
  override fun run(): SingleSimulationResult {
    val result = ThreesimSimulationRound(
      blockchainSystemFactory.createBlockchainSystem(),
      logOutputProvider.logOutputs,
      maxAllowedBlockchainLength,
      numberOfRequiredSecurityConfirmations
    ).run();

    return ThreesimSingleSimulationResult(result);
  }
}