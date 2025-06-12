package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.MonteCarloSimulationResult
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResultSummary

/**
 * Result of a Monte Carlo simulation of 3SIM.
 *
 * @author Davis Riedel
 */
class ThreesimMonteCarloSimulationResult(
  val simulationRoundResults: List<ThreesimSimulationRoundResult>
) : MonteCarloSimulationResult {
  val averageSimulationRoundResult =
    ThreesimAverageSimulationRoundResult.fromSimulationRoundResults(simulationRoundResults)

  override fun getSummary(): SimulationResultSummary {
    return ThreesimMonteCarloSimulationResultSummary(
      "3SIM Monte-Carlo Simulation",
      simulationRoundResults.map { it.outputMetrics },
      averageSimulationRoundResult
    )
  }

}
