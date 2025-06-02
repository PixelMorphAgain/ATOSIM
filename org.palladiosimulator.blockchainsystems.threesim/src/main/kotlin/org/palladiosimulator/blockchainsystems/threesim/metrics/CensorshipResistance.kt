package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Censorship Resistance
 *
 * @author Davis Riedel
 */
data class CensorshipResistance(
  override val value: Double
) : OutputMetric<Double> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ censorshipResistance=")
      append(value)
      append(" }")
    }
  }
}
