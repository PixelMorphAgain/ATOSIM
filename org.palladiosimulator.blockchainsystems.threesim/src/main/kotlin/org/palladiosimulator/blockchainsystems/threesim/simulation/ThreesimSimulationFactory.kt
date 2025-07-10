package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.debug.core.ILaunchConfiguration
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.Simulation
import org.palladiosimulator.blockchainsystems.plugin.common.SimulationType
import org.palladiosimulator.blockchainsystems.plugin.simulation.abstractions.SimulationFactory
import org.palladiosimulator.blockchainsystems.plugin.utils.MonteCarloSimulationProgressMonitorAdapter
import org.palladiosimulator.blockchainsystems.threesim.creation.InitializationUtils

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
          InitializationUtils.getMaximumAllowedBlockchainLengthFromConfig(configuration),
          InitializationUtils.getNumberOfRequiredSecurityConfirmationsFromConfig(configuration)
        )
      }

      SimulationType.MonteCarlo -> {
        ThreesimMonteCarloSimulation(
          numberOfRounds = InitializationUtils.getNumberOfMonteCarloSimulationRoundsFromConfig(configuration),
          progressMonitor = MonteCarloSimulationProgressMonitorAdapter(progressMonitor),
          blockchainSystemFactory = InitializationUtils.createBlockchainSystemFactory(configuration),
          logOutputProvider = InitializationUtils.createLogOutputProviderFromConfig(configuration),
          maxAllowedBlockchainLength = InitializationUtils.getMaximumAllowedBlockchainLengthFromConfig(configuration),
          numberOfRequiredSecurityConfirmations = InitializationUtils.getNumberOfRequiredSecurityConfirmationsFromConfig(
            configuration
          )
        )
      }
    }
  }
}
