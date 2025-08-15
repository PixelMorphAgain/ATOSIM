package org.palladiosimulator.blockchainsystems.threesim.simulation.results

import kotlinx.serialization.Serializable
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.MonteCarloSimulationResult

/**
 * Result of a Monte Carlo simulation of 3SIM.
 *
 * NOTE: Cannot be a data class, because then only the properties defined in the primary constructor are serialized
 *
 * @author Davis Riedel
 */
@Serializable
class ThreesimMonteCarloSimulationResult(
  val simulationRoundResults: List<ThreesimSimulationRoundResult>
) : MonteCarloSimulationResult {
  val averageSimulationRoundResult =
    ThreesimAverageSimulationRoundResult.fromSimulationRoundResults(simulationRoundResults)

  override val simulationType: String = "3SIM Monte-Carlo Simulation"
}
