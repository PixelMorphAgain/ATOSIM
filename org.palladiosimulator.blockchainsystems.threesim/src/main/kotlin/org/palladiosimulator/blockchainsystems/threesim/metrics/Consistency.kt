package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Consistency
 *
 * @author Davis Riedel
 */
class Consistency(
  value: Double
) : OutputMetric<Double>(value) {
  companion object {
    const val NAME = "Consistency"
  }

  override val name: String = NAME
}
