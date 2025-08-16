package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.debug.core.ILaunchConfiguration
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.Simulation
import org.palladiosimulator.blockchainsystems.plugin.config.SimulationType
import org.palladiosimulator.blockchainsystems.plugin.simulation.abstractions.SimulationFactory
import org.palladiosimulator.blockchainsystems.plugin.simulation.MonteCarloSimulationProgressMonitorAdapter
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
    with(InitializationUtils) {
      val threesimSimulationParameters = ThreesimSimulationParameters(
        getThroughputMonitoringIntervalFromConfig(configuration),
        getFailureThroughputThresholdFromConfig(configuration),
        getShannonEntropyKFromConfig(configuration),
        getNakamotoCoefficientThresholdFromConfig(configuration),
        getReliabilityObservationTimespanFromConfig(configuration)
      )

      return when (simulationType) {
        SimulationType.Single -> {
          ThreesimSingleSimulation(
            createBlockchainSystemFactory(configuration),
            createLogOutputProviderFromConfig(configuration),
            getMaximumAllowedBlockchainLengthFromConfig(configuration),
            threesimSimulationParameters,
          )
        }

        SimulationType.MonteCarlo -> {
          ThreesimMonteCarloSimulation(
            getNumberOfMonteCarloSimulationRoundsFromConfig(configuration),
            MonteCarloSimulationProgressMonitorAdapter(progressMonitor),
            createBlockchainSystemFactory(configuration),
            createLogOutputProviderFromConfig(configuration),
            getMaximumAllowedBlockchainLengthFromConfig(configuration),
            threesimSimulationParameters,
          )
        }
      }
    }
  }
}
