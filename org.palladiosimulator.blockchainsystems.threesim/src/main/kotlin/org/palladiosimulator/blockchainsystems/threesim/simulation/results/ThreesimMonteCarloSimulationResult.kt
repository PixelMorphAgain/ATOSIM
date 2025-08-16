package org.palladiosimulator.blockchainsystems.threesim.simulation.results

import kotlinx.serialization.Serializable
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.MonteCarloSimulationResult
import org.palladiosimulator.blockchainsystems.threesim.serialization.ThreesimMonteCarloSimulationResultSerializer

/**
 * Result of a Monte Carlo simulation of 3SIM.
 *
 * @author Davis Riedel
 */
@Serializable(with = ThreesimMonteCarloSimulationResultSerializer::class)
data class ThreesimMonteCarloSimulationResult(
  val simulationRoundResults: List<ThreesimSimulationRoundResult>
) : MonteCarloSimulationResult {
  val averageSimulationRoundResult =
    ThreesimAverageSimulationRoundResult.fromSimulationRoundResults(simulationRoundResults)

  override val simulationType: String = "3SIM Monte-Carlo Simulation"
}
