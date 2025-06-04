package org.palladiosimulator.blockchainsystems.threesim_plugin

import org.eclipse.debug.core.ILaunchConfiguration
import org.palladiosimulator.blockchainsystems.plugin.BlockchainSimulationBasePluginLaunch
import org.palladiosimulator.blockchainsystems.plugin.utils.InitializationUtils
import org.palladiosimulator.blockchainsystems.plugin.simulation.SimulationJob
import org.palladiosimulator.blockchainsystems.plugin.common.SimulationType
import org.palladiosimulator.blockchainsystems.threesim.simulation.ThreesimSimulationFactory

/**
 * Launch configuration delegate for the 3SIM blockchain simulator plugin.
 *
 * Launches a simulation job based on the provided configuration and metamodel.
 *
 * @author Davis Riedel
 */
class PluginLaunch : BlockchainSimulationBasePluginLaunch() {

  override fun launchSimulationJob(
    configuration: ILaunchConfiguration
  ) {
    val simulationType = InitializationUtils.getSelectedSimulationTypeFromConfig(configuration)

    val jobName = when (simulationType) {
      SimulationType.Single -> "Single Simulation"
      SimulationType.MonteCarlo -> "Monte Carlo Simulation"
      else -> throw IllegalArgumentException("Unsupported simulation type: $simulationType")
    }

    val job = SimulationJob(
      configuration,
      ThreesimSimulationFactory(simulationType),
      "3SIM $jobName Job"
    );

    job.schedule()
  }

}