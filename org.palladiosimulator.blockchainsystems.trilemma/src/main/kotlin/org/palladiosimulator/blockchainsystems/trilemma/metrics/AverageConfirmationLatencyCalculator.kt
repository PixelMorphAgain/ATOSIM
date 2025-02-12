package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetricCalculator
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
): OutputMetricCalculator<AverageConfirmationLatency> {
  override fun calculate(): AverageConfirmationLatency {
    val sum = timeSlices.reduce(Duration::plus)
    return AverageConfirmationLatency(sum)
  }
}