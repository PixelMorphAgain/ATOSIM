package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResultSummary
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResultSummaryDeserializer
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

class ThreesimMonteCarloSimulationResultSummary(
  private val simulationType: String,
  private val outputMetricsPerRound: List<List<OutputMetric<Any>>>,
) : SimulationResultSummary, SimulationResultSummaryDeserializer by ThreesimMonteCarloSimulationResultSummary {
  override fun getValues(): Map<String, String> {
    // TODO: Sum up rounds
    TODO("Not yet implemented")
  }

  override fun getSimulationType(): String {
    return simulationType
  }

  override fun serializeToText(simulationResultSummary: SimulationResultSummary): String {
    TODO("Not yet implemented")
  }

  companion object : SimulationResultSummaryDeserializer {
    override fun deserializeFromText(text: String): SimulationResultSummary {
      TODO("Not yet implemented")
    }
  }
}