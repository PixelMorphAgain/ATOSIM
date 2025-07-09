package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Fault tolerance
 *
 * @property value Pair of throughput delta and confirmation latency delta
 *
 * @author Davis Riedel
 */
class FaultTolerance(
  value: Pair<Double, Double>
) : OutputMetric<Pair<Double, Double>>(value) {
  companion object {
    const val NAME = "FaultTolerance"
  }

  override val name: String = NAME

  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ ")
      append(name)
      append("={ throughputDelta=")
      append(value.first)
      append("; confirmationLatencyDelta=")
      append(value.second)
      append(" }")
    }
  }
}
