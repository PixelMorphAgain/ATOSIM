package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import kotlin.time.Duration

/**
 * Fault tolerance
 *
 * @property value Pair of throughput delta and confirmation latency delta
 *
 * @author Davis Riedel
 */
data class FaultTolerance(
  override val value: Pair<Double, Duration>
) : OutputMetric<Pair<Double, Duration>> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ faultTolerance={ throughputDelta=")
      append(value.first)
      append("; confirmationLatencyDelta=")
      append(value.second)
      append(" }")
    }
  }
}
