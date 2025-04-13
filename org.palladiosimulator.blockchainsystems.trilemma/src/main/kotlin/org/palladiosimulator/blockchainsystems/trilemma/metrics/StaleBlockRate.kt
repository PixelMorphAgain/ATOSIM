package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetric

/**
 * Stale block rate
 *
 * @author Davis Riedel
 */
data class StaleBlockRate(
  override val value: Double
): OutputMetric<Double> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ staleBlockRate=")
      append(value)
      append(" }")
    }
  }
}
