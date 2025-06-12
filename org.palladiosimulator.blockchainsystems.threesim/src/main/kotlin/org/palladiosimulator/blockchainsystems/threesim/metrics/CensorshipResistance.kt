package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Censorship Resistance
 *
 * @author Davis Riedel
 */
class CensorshipResistance(
  value: Double
) : OutputMetric<Double>(value) {
  companion object {
    const val NAME = "CensorshipResistance"
  }

  override val name: String = NAME
}
