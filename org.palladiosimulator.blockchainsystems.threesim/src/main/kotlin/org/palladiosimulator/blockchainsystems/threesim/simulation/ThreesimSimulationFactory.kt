package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.debug.core.ILaunchConfiguration
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.Simulation
import org.palladiosimulator.blockchainsystems.plugin.common.SimulationType
import org.palladiosimulator.blockchainsystems.plugin.simulation.abstractions.SimulationFactory
import org.palladiosimulator.blockchainsystems.plugin.utils.InitializationUtils
import org.palladiosimulator.blockchainsystems.plugin.utils.MonteCarloSimulationProgressMonitorAdapter

/**
 * Factory for creating instances of [Simulation] for the 3SIM blockchain simulator.
 *
 * @author Davis Riedel
 */
class ThreesimSimulationFactory(
  private val simulationType: SimulationType,
) : SimulationFactory {
  override fun create(
    configuration: ILaunchConfiguration,
    progressMonitor: IProgressMonitor
  ): Simulation {
    return when (simulationType) {
      SimulationType.Single -> {
        ThreesimSingleSimulation(
          InitializationUtils.createBlockchainSystemFactory(configuration),
          InitializationUtils.createLogOutputProviderFromConfig(configuration),
          InitializationUtils.getMaximumAllowedBlockchainLengthFromConfig(configuration)
        )
      }

      SimulationType.MonteCarlo -> {
        ThreesimMonteCarloSimulation(
          InitializationUtils.createBlockchainSystemFactory(configuration),
          InitializationUtils.createLogOutputProviderFromConfig(configuration),
          MonteCarloSimulationProgressMonitorAdapter(progressMonitor),
          InitializationUtils.getMaximumAllowedBlockchainLengthFromConfig(configuration),
          InitializationUtils.getNumberOfMonteCarloSimulationRoundsFromConfig(configuration)
        )
      }
    }
  }
}
