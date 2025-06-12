package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Gini coefficient
 *
 * @author Davis Riedel
 */
class GiniCoefficient(
  value: Double,
) : OutputMetric<Double>(value) {
  companion object {
    const val NAME = "GiniCoefficient"
  }

  override val name: String = NAME
}
