package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Throughput
 *
 * @author Davis Riedel
 */
data class Throughput(
  override val value: Double
) : OutputMetric<Double>() {
  override val name: String = "Throughput"
}
