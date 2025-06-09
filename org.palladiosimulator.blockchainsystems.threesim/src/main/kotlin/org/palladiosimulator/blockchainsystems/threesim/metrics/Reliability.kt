package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Reliability
 *
 * @author Davis Riedel
 */
data class Reliability(
  override val value: Double
) : OutputMetric<Double>() {
  override val name: String = "Reliability"
}
