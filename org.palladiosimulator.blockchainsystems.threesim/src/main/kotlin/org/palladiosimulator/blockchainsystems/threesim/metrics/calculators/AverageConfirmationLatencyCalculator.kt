package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.AverageConfirmationLatency
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.utils.averageOf

/**
 * Calculates average confirmation latency that occurred during a single simulation round.
 *
 * @property confirmationLatencies each item is a duration between inclusion and confirmation of a transaction, in ms
 *
 * @author Davis Riedel
 */
class AverageConfirmationLatencyCalculator(
  private val confirmationLatencies: Collection<Long>
) : OutputMetricCalculator<AverageConfirmationLatency> {
  override fun calculate(): AverageConfirmationLatency {
    require(confirmationLatencies.isNotEmpty()) {
      "Cannot calculate average confirmation latency from an empty list of confirmation latencies."
    }
    return AverageConfirmationLatency(
      confirmationLatencies.sum().toDouble() / confirmationLatencies.size
    )
  }

  companion object : OutputMetricAverageCalculator<AverageConfirmationLatency> {
    override fun calculateAverage(measurements: List<AverageConfirmationLatency>): AverageConfirmationLatency {
      val avgValue = measurements.averageOf { it.value }
      return AverageConfirmationLatency(avgValue)
    }
  }
}