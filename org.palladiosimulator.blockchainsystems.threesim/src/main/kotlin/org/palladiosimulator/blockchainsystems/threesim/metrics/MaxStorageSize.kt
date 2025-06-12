package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Maximum storage size
 *
 * @author Davis Riedel
 */
class MaxStorageSize(
  value: Double
) : OutputMetric<Double>(value) {
  companion object {
    const val NAME = "MaxStorageSize"
  }

  override val name: String = NAME
}
