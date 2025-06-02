package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Consistency
 *
 * @author Davis Riedel
 */
data class Consistency(
  override val value: Double
) : OutputMetric<Double> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ consistency=")
      append(value)
      append(" }")
    }
  }
}
