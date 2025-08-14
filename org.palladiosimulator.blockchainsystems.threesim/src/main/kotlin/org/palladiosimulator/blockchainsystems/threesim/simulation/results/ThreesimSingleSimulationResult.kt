package org.palladiosimulator.blockchainsystems.threesim.simulation.results

import kotlinx.serialization.Serializable
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SingleSimulationResult

/**
 * Result of a single simulation of 3SIM.
 *
 * NOTE: Cannot be a data class, because then only the properties defined in the primary constructor are serialized
 *
 * @author Davis Riedel
 */
@Serializable
class ThreesimSingleSimulationResult(
  private val simulationRoundResult: ThreesimSimulationRoundResult
) : SingleSimulationResult {
  override val simulationType: String = "3SIM Single Simulation"
}
