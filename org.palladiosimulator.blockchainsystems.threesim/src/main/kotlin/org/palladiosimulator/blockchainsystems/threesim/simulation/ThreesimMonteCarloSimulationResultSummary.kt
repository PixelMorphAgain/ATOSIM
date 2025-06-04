package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResultSummary
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

class ThreesimMonteCarloSimulationResultSummary(
  private val simulationType: String,
  private val outputMetricsPerRound: List<List<OutputMetric<Any>>>,
) : SimulationResultSummary {
  override fun getValues(): Map<String, String> {
    // TODO: Sum up rounds
    TODO("Not yet implemented")
  }

  override fun getSimulationType(): String {
    return simulationType
  }
}