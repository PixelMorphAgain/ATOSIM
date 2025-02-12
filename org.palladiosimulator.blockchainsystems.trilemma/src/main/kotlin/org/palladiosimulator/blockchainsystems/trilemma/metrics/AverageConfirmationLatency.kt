package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetric
import kotlin.time.Duration

/**
 * Average confirmation latency
 *
 * @author Davis Riedel
 */
data class AverageConfirmationLatency(
  override val value: Duration
): OutputMetric<Duration> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ averageConfirmationLatency=")
      append(value)
      append(" }")
    }
  }
}
