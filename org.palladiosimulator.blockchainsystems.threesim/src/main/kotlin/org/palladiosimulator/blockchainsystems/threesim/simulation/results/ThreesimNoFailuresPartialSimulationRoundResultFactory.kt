package org.palladiosimulator.blockchainsystems.threesim.simulation.results

import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.*
import org.palladiosimulator.blockchainsystems.threesim.monitoring.ThreesimSimulationMonitor

/**
 * Factory for creating a [ThreesimNoFailuresPartialSimulationRoundResult] based on the final state of the simulation.
 *
 * @author Davis Riedel
 */
class ThreesimNoFailuresPartialSimulationRoundResultFactory(
  private val monitor: ThreesimSimulationMonitor,
  private val finalSystemTime: Long,
) {
  fun createSimulationRoundResult(): ThreesimNoFailuresPartialSimulationRoundResult {
    val state = monitor.getFinalState(finalSystemTime)

    return ThreesimNoFailuresPartialSimulationRoundResult(
      AverageConfirmationLatencyCalculator(
        state.transactionConfirmationDurations
      ).calculate(),
      ThroughputCalculator(
        numberOfConfirmedTransactions = state.numberOfConfirmedTransactions,
        observationTime = finalSystemTime
      ).calculate()
    )
  }
}