package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetric

/**
 * Fault tolerance
 *
 * @author Davis Riedel
 */
data class FaultTolerance(
  override val value: Double
): OutputMetric<Double> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ faultTolerance=")
      append(value)
      append(" }")
    }
  }
}
