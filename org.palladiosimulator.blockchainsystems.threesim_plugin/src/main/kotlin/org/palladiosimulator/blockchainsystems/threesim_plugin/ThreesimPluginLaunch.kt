package org.palladiosimulator.blockchainsystems.threesim_plugin

import org.eclipse.debug.core.ILaunchConfiguration
import org.palladiosimulator.blockchainsystems.plugin.PluginLaunch
import org.palladiosimulator.blockchainsystems.threesim.creation.InitializationUtils
import org.palladiosimulator.blockchainsystems.plugin.simulation.SimulationJob
import org.palladiosimulator.blockchainsystems.plugin.config.SimulationType
import org.palladiosimulator.blockchainsystems.threesim.serialization.ThreesimSerializers
import org.palladiosimulator.blockchainsystems.threesim.simulation.ThreesimSimulationFactory
import org.palladiosimulator.blockchainsystems.threesim.simulation.results.ThreesimSimulationResultSerializer

/**
 * Launch configuration delegate for the 3SIM blockchain simulator plugin.
 *
 * Launches a simulation job based on the provided configuration and metamodel.
 *
 * @author Davis Riedel
 */
class ThreesimPluginLaunch : PluginLaunch() {

  override fun launchSimulationJob(
    configuration: ILaunchConfiguration
  ) {
    val simulationType = InitializationUtils.getSelectedSimulationTypeFromConfig(configuration)

    val jobName = when (simulationType) {
      SimulationType.Single -> "Single Simulation"
      SimulationType.MonteCarlo -> "Monte Carlo Simulation"
    }

    val job = SimulationJob(
      configuration,
      ThreesimSimulationFactory(simulationType),
      "3SIM $jobName Job",
      ThreesimSimulationResultSerializer(
        ThreesimSerializers.json
      )
    );

    job.schedule()
  }

}