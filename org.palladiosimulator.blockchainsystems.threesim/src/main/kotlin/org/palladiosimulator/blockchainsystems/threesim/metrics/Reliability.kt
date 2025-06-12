package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Reliability
 *
 * @author Davis Riedel
 */
class Reliability(
  value: Double
) : OutputMetric<Double>(value) {
  companion object {
    const val NAME = "Reliability"
  }

  override val name: String = NAME
}
