package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.AverageConfirmationLatency
import org.palladiosimulator.blockchainsystems.threesim.metrics.ConfirmationLatency
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator

/**
 * Calculates average confirmation latency that occurred during a single simulation round.
 *
 * @property confirmationLatencies each item is a duration between inclusion and confirmation of a transaction
 *
 * @author Davis Riedel
 */
class AverageConfirmationLatencyCalculator(
  private val confirmationLatencies: List<ConfirmationLatency>
) : OutputMetricCalculator<AverageConfirmationLatency> {
  override fun calculate(): AverageConfirmationLatency {
    return AverageConfirmationLatency(
      confirmationLatencies.sumOf { it.value } / confirmationLatencies.size
    )
  }

  companion object : OutputMetricAverageCalculator<AverageConfirmationLatency> {
    override fun calculateAverage(measurements: List<AverageConfirmationLatency>): AverageConfirmationLatency {
      val avgValue = measurements.sumOf { it.value } / measurements.size
      return AverageConfirmationLatency(avgValue)
    }
  }
}