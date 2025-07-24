package org.palladiosimulator.blockchainsystems.threesim.simulation.results

import kotlinx.serialization.Serializable
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResultSummary
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SingleSimulationResult

/**
 * Result of a single simulation of 3SIM.
 *
 * @author Davis Riedel
 */
@Serializable
data class ThreesimSingleSimulationResult(
  private val simulationRoundResult: ThreesimSimulationRoundResult
) : SingleSimulationResult {
  override val simulationType: String = "3SIM Single Simulation"
}
