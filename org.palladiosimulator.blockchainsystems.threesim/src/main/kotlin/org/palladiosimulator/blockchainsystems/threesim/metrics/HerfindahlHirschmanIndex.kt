package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import kotlinx.serialization.Serializable

/**
 * Herfindahl Hirschman Index (HHI)
 *
 * @author Davis Riedel
 */
@Serializable
class HerfindahlHirschmanIndex(
  value: Double,
) : OutputMetric<Double>(value) {
  companion object {
    const val NAME = "HerfindahlHirschmanIndex"
  }

  override val name: String = NAME
}
