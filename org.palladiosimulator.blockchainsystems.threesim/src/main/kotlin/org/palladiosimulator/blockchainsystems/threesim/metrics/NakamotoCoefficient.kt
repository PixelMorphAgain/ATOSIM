package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

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
) : OutputMetric<Int>() {
  override val name: String = "NakamotoCoefficient"

  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ ")
      append(name)
      append("=")
      append(value)
      append("; threshold=")
      append(threshold)
      append(" }")
    }
  }
}
