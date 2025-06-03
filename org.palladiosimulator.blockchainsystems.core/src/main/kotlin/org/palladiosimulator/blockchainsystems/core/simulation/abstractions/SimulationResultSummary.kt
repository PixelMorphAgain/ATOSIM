package org.palladiosimulator.blockchainsystems.core.simulation.abstractions

interface SimulationResultSummary {
  fun getValues(): Map<String, String>
  fun getSimulationType(): String
}