package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Throughput
 *
 * @author Davis Riedel
 */
class Throughput(
  value: Double
) : OutputMetric<Double>(value) {
  companion object {
    const val NAME = "Throughput"
  }

  override val name: String = NAME
}
