package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Gini coefficient
 *
 * @author Davis Riedel
 */
data class GiniCoefficient(
  override val value: Double,
) : OutputMetric<Double>() {
  override val name: String = "GiniCoefficient"
}
