package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetric

/**
 * Nakamoto Coefficient
 *
 * @property value the nakamoto coefficient for the threshold
 * @property threshold the threshold for which the nakamoto coefficient (value) was computed
 *
 * @author Davis Riedel
 */
data class NakamotoCoefficient(
  override val value: Int,
  val threshold: Double,
): OutputMetric<Int> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ nakamotoCoefficient=")
      append(value)
      append("; threshold=")
      append(threshold)
      append(" }")
    }
  }
}
