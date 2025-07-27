package org.palladiosimulator.blockchainsystems.plugin.simulation

import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.debug.core.ILaunchConfiguration
import org.palladiosimulator.blockchainsystems.plugin.simulation.abstractions.SimulationFactory
import org.palladiosimulator.blockchainsystems.plugin.utils.SimulationResultUtils

/**
 * Job that executes a simulation based on the provided launch configuration.
 *
 * @property configuration The launch configuration containing the parameters for the simulation.
 * @property simulationFactory The factory used to create the simulation instance.
 *
 * @author Davis Riedel
 */
class SimulationJob(
  private val configuration: ILaunchConfiguration,
  private val simulationFactory: SimulationFactory,
  val jobName: String
) : Job(jobName) {
  override fun run(progressMonitor: IProgressMonitor): IStatus {
    val simulation = simulationFactory.create(configuration, progressMonitor)

    val result = simulation.run()

    try {
      SimulationResultUtils.saveResultFile(result, configuration)
    } catch (e: CoreException) {
      e.printStackTrace()
      return Status.OK_STATUS
    }

    return Status.OK_STATUS
  }
}