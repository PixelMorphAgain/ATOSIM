package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.AverageConfirmationLatency
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import kotlin.time.Duration

/**
 * Calculates average confirmation latency
 *
 * @property timeSlices each item is a duration between inclusion and completion of a transaction
 *
 * @author Davis Riedel
 */
class AverageConfirmationLatencyCalculator(
  private val timeSlices: List<Duration>
) : OutputMetricCalculator<AverageConfirmationLatency> {
  override fun calculate(): AverageConfirmationLatency {
    val sum = timeSlices.reduce(Duration::plus)
    return AverageConfirmationLatency(sum)
  }

  companion object : OutputMetricAverageCalculator<AverageConfirmationLatency> {
    override fun calculateAverage(measurements: List<AverageConfirmationLatency>): AverageConfirmationLatency {
      val avgValue = measurements.map { it.value }.reduce(Duration::plus) / measurements.size
      return AverageConfirmationLatency(avgValue)
    }
  }
}