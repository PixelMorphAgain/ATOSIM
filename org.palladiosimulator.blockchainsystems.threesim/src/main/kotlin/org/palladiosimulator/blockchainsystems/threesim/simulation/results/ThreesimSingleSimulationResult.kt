package org.palladiosimulator.blockchainsystems.threesim.simulation.results

import kotlinx.serialization.Serializable
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SingleSimulationResult
import org.palladiosimulator.blockchainsystems.threesim.serialization.ThreesimSingleSimulationResultSerializer

/**
 * Result of a single simulation of 3SIM.
 *
 * @author Davis Riedel
 */
@Serializable(with = ThreesimSingleSimulationResultSerializer::class)
data class ThreesimSingleSimulationResult(
  val simulationRoundResult: ThreesimSimulationRoundResult
) : SingleSimulationResult {
  override val simulationType: String = "3SIM Single Simulation"
}
