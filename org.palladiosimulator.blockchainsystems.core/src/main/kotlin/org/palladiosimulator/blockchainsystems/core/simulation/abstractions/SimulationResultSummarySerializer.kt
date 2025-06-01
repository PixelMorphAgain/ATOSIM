package org.palladiosimulator.blockchainsystems.core.simulation.abstractions

interface SimulationResultSummarySerializer {
  fun serializeToText(simulationResultSummary: SimulationResultSummary): String
  fun deserializeFromText(text: String): SimulationResultSummary
}