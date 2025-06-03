package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.MonteCarloSimulation
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.MonteCarloSimulationProgressMonitor
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.MonteCarloSimulationResult
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
  val progressMonitor: MonteCarloSimulationProgressMonitor,
  val maxAllowedBlockchainLength: Long,
  val numberOfRounds: Int
) : MonteCarloSimulation {
  override fun run(): MonteCarloSimulationResult {
    TODO("Not yet implemented")
  }

  override fun getNumberOfRounds(): Int {
    return numberOfRounds
  }
}
