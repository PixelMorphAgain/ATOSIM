package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Consistency
 *
 * @author Davis Riedel
 */
data class Consistency(
  override val value: Double
) : OutputMetric<Double>() {
  override val name: String = "Consistency"
}
