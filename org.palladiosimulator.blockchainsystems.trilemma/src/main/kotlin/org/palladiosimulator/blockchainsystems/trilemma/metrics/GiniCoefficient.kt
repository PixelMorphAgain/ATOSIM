package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetric

/**
 * Gini coefficient
 *
 * @author Davis Riedel
 */
data class GiniCoefficient(
  override val value: Double,
): OutputMetric<Double> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ giniCoefficient=")
      append(value)
      append(" }")
    }
  }
}
