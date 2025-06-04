package org.palladiosimulator.blockchainsystems.core.simulation.abstractions

interface SimulationResultSummaryDeserializer {
  fun deserializeFromText(text: String): SimulationResultSummary
}