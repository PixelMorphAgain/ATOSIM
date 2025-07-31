package org.palladiosimulator.blockchainsystems.threesim.simulation.results

import kotlinx.serialization.Serializable
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationRoundResult
import org.palladiosimulator.blockchainsystems.threesim.metrics.AverageConfirmationLatency
import org.palladiosimulator.blockchainsystems.threesim.metrics.AverageThroughput

/**
 * Result of a [ThreesimNoFailuresPartialSimulationRound]
 *
 * @author Davis Riedel
 */
@Serializable
data class ThreesimNoFailuresPartialSimulationRoundResult(
  val confirmationLatency: AverageConfirmationLatency,
  val throughput: AverageThroughput
) : SimulationRoundResult
