package org.palladiosimulator.blockchainsystems.core.simulation.abstractions

/**
 * Result of a simulation.
 *
 * @author Davis Riedel
 */
interface SimulationResult {
  /**
   * Returns a summary of the simulation result.
   *
   * @return The summary of the simulation result.
   */
  fun getSummary(): SimulationResultSummary
}