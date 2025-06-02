package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.debug.core.ILaunchConfiguration
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.Simulation
import org.palladiosimulator.blockchainsystems.plugin.common.SimulationType
import org.palladiosimulator.blockchainsystems.plugin.creation.SimulationFactory

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
          configuration,
          progressMonitor
        )
      }

      SimulationType.MonteCarlo -> {
        ThreesimMonteCarloSimulation(
          configuration,
          progressMonitor
        )
      }
    }
  }
}
