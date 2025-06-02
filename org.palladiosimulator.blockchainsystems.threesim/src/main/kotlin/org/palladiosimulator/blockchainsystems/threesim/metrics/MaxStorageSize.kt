package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Maximum storage size
 *
 * @author Davis Riedel
 */
data class MaxStorageSize(
  override val value: Double
) : OutputMetric<Double> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ maxStorageSize=")
      append(value)
      append(" }")
    }
  }
}
