package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import kotlin.time.Duration

/**
 * Confirmation latency
 *
 * @author Davis Riedel
 */
data class ConfirmationLatency(
  override val value: Duration
) : OutputMetric<Duration> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ confirmationLatency=")
      append(value)
      append(" }")
    }
  }
}
