package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResultSummary
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResultSummaryDeserializer
import org.palladiosimulator.blockchainsystems.threesim.metrics.utils.OutputMetricsSet

class ThreesimMonteCarloSimulationResultSummary(
  private val simulationType: String,
  private val outputMetricsPerRound: List<OutputMetricsSet>,
  private val averageSimulationRoundResult: ThreesimAverageSimulationRoundResult
) : SimulationResultSummary, SimulationResultSummaryDeserializer by ThreesimMonteCarloSimulationResultSummary {
  override fun getValues(): Map<String, String> {
    TODO("Not yet implemented")
  }

  override fun getSimulationType(): String {
    return simulationType
  }

  override fun serializeToText(): String {
    TODO("Not yet implemented")
  }

  companion object : SimulationResultSummaryDeserializer {
    override fun deserializeFromText(text: String): SimulationResultSummary {
      TODO("Not yet implemented")
    }
  }
}