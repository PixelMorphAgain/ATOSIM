package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResultSummary
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResultSummaryDeserializer
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

class ThreesimSingleSimulationResultSummary(
  private val simulationType: String,
  private val outputMetrics: List<OutputMetric<*>>,
) : SimulationResultSummary, SimulationResultSummaryDeserializer by ThreesimSingleSimulationResultSummary {
  override fun getValues(): Map<String, String> {
    return outputMetrics.associate { metric ->
      metric.name to metric.value.toString()
    }
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