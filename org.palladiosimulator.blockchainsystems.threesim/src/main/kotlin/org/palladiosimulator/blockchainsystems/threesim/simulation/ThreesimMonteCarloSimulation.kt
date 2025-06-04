package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.MonteCarloSimulation
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.MonteCarloSimulationProgressMonitor
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemFactory
import org.palladiosimulator.blockchainsystems.threesim.simulation.logoutputs.LogOutputProvider

/**
 * Monte Carlo simulation of 3SIM.
 *
 * @author Davis Riedel
 */
class ThreesimMonteCarloSimulation(
  val blockchainSystemFactory: BlockchainSystemFactory,
  val logOutputProvider: LogOutputProvider,
  val maxAllowedBlockchainLength: Long,
  val progressMonitor: MonteCarloSimulationProgressMonitor,
  val numberOfRounds: Int
) : MonteCarloSimulation {
  override fun run(): ThreesimMonteCarloSimulationResult {
    progressMonitor.onSimulationStarted(numberOfRounds)

    // Run the simulation rounds and collect results
    val results = (1..numberOfRounds).map { i ->
      // TODO: Pass parameters along
      val result = ThreesimSimulationRound().run()
      progressMonitor.onSimulationRoundFinished()
      result
    }

    progressMonitor.onSimulationFinished()

    return ThreesimMonteCarloSimulationResult(results)
  }

  override fun getNumberOfRounds(): Int {
    return numberOfRounds
  }
}
