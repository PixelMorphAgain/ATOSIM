package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Memory consumption
 *
 * @author Davis Riedel
 */
class MemoryConsumption(
  value: Double
) : OutputMetric<Double>(value) {
  companion object {
    const val NAME = "MemoryConsumption"
  }

  override val name: String = NAME
}
