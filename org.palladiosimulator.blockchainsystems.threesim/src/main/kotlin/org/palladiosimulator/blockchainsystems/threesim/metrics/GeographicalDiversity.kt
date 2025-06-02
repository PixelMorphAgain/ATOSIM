package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Geographical Diversity
 *
 * @author Davis Riedel
 */
data class GeographicalDiversity(
  override val value: Double
) : OutputMetric<Double> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ geographicalDiversity=")
      append(value)
      append(" }")
    }
  }
}
