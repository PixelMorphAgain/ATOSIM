package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetric

/**
 * Maximum storage size
 *
 * @author Davis Riedel
 */
data class MaxStorageSize(
  override val value: Double
): OutputMetric<Double> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ maxStorageSize=")
      append(value)
      append(" }")
    }
  }
}
