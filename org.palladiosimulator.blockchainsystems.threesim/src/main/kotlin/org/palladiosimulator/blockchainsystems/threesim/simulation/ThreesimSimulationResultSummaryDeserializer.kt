package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResultSummary
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResultSummaryDeserializer

/**
 * Deserializer for 3SIM simulation result summaries.
 *
 * This singleton is responsible for deserializing simulation result summaries from text,
 * determining the type of simulation, and returning the appropriate summary object.
 *
 * @author Davis Riedel
 */
object ThreesimSimulationResultSummaryDeserializer : SimulationResultSummaryDeserializer {
  override fun deserializeFromText(text: String): SimulationResultSummary {
    val type: String = TODO("Not yet implemented: Extract simulation type from text")
    return when (type) {
      "3SIM Single Simulation" -> {
        ThreesimSingleSimulationResultSummary.deserializeFromText(text)
      }

      "3SIM Monte Carlo Simulation" -> {
        ThreesimMonteCarloSimulationResultSummary.deserializeFromText(text)
      }

      else -> {
        throw IllegalArgumentException("Unknown simulation type: $type")
      }
    }
  }
}