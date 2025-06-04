package org.palladiosimulator.blockchainsystems.core.simulation.abstractions

interface SimulationResultSummary : SimulationResultSummaryDeserializer {
  fun getValues(): Map<String, String>
  fun getSimulationType(): String
  fun serializeToText(simulationResultSummary: SimulationResultSummary): String
}