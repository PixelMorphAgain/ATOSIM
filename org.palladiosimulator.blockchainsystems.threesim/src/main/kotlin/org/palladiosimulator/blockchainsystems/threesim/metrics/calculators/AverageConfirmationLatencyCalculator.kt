package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.AverageConfirmationLatency
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
}