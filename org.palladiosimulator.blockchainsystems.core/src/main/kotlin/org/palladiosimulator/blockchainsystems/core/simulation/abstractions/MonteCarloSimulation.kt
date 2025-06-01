package org.palladiosimulator.blockchainsystems.core.simulation.abstractions

/**
 * Represents a Monte-Carlo simulation with several rounds.
 * This class serves as a base for more specific simulations.
 *
 * @author Davis Riedel
 */
interface MonteCarloSimulation : Simulation {
  /**
   * Runs the Monte-Carlo simulation and returns the result.
   *
   * @return The result of the simulation.
   */
  override fun run(): MonteCarloSimulationResult

  /**
   * Returns the number of rounds in this Monte-Carlo simulation.
   *
   * @return The number of rounds.
   */
  fun getNumberOfRounds(): Int
}
