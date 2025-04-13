package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetric

/**
 * Reliability
 *
 * @author Davis Riedel
 */
data class Reliability(
  override val value: Double
): OutputMetric<Double> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ reliability=")
      append(value)
      append(" }")
    }
  }
}
