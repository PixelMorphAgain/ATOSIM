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
  override val value: Double
) : OutputMetric<Double>() {
  companion object {
    const val NAME = "CensorshipResistance"
  }

  override val name: String = NAME
}
