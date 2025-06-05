package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.MonteCarloSimulation
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.MonteCarloSimulationProgressMonitor
import org.palladiosimulator.blockchainsystems.core.simulation.logoutputs.abstractions.LogOutputProvider
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemFactory

/**
 * Monte Carlo simulation of 3SIM.
 *
 * @author Davis Riedel
 */
class ThreesimMonteCarloSimulation(
  numberOfRounds: Long,
  progressMonitor: MonteCarloSimulationProgressMonitor,
  private val blockchainSystemFactory: BlockchainSystemFactory,
  private val logOutputProvider: LogOutputProvider,
  private val maxAllowedBlockchainLength: Long,
) : MonteCarloSimulation<ThreesimSimulationRoundResult>(numberOfRounds, progressMonitor) {
  override fun performSimulationRound(): ThreesimSimulationRoundResult {
    return ThreesimSimulationRound(
      blockchainSystemFactory.createBlockchainSystem(),
      logOutputProvider.logOutputs,
      maxAllowedBlockchainLength
    ).run();
  }

  override fun createSimulationResultFromRoundResults(results: List<ThreesimSimulationRoundResult>): ThreesimMonteCarloSimulationResult {
    return ThreesimMonteCarloSimulationResult(results)
  }
}
