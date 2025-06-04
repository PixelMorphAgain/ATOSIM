package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.monitoring.abstractions.SimulationMonitor
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationRoundResult
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationRoundResultFromSimulationMonitor
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Result of a single simulation round of 3SIM.
 *
 * @author Davis Riedel
 */
class ThreesimSimulationRoundResult(
  val outputMetrics: List<OutputMetric<Any>>,
) : SimulationRoundResult, SimulationRoundResultFromSimulationMonitor by ThreesimSimulationRoundResult {
  companion object : SimulationRoundResultFromSimulationMonitor {
    override fun fromSimulationMonitor(monitor: SimulationMonitor): ThreesimSimulationRoundResult {
      // TODO: Implement this
      TODO("Not yet implemented")
    }
  }
}
