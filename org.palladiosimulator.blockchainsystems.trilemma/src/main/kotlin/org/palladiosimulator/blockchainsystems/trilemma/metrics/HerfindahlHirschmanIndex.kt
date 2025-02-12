package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetric

/**
 * Herfindahl Hirschman Index (HHI)
 *
 * @author Davis Riedel
 */
data class HerfindahlHirschmanIndex(
  override val value: Double,
): OutputMetric<Double> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ herfindahlHirschmanIndex=")
      append(value)
      append(" }")
    }
  }
}
