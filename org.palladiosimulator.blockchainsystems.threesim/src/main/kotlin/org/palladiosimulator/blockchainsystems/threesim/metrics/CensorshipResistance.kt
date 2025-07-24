package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import kotlinx.serialization.Serializable

/**
 * Censorship Resistance
 *
 * @author Davis Riedel
 */
@Serializable
class CensorshipResistance(
  value: Double
) : OutputMetric<Double>(value) {
  companion object {
    const val NAME = "CensorshipResistance"
  }

  override val name: String = NAME
}
