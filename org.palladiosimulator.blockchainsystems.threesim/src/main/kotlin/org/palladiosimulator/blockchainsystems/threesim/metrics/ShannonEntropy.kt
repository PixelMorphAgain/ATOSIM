package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Shannon Entropy
 *
 * @author Davis Riedel
 */
data class ShannonEntropy(
  override val value: Double
) : OutputMetric<Double> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ shannonEntropy=")
      append(value)
      append(" }")
    }
  }
}
