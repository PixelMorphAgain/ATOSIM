package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResultSummary
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SingleSimulationResult

/**
 * Result of a single simulation of 3SIM.
 *
 * @author Davis Riedel
 */
class ThreesimSingleSimulationResult(
  private val simulationRoundResult: ThreesimSimulationRoundResult
) : SingleSimulationResult {

  override fun getSummary(): SimulationResultSummary {
    return ThreesimSingleSimulationResultSummary(
      "3SIM Single Simulation",
      simulationRoundResult.outputMetrics
    )
  }
}
