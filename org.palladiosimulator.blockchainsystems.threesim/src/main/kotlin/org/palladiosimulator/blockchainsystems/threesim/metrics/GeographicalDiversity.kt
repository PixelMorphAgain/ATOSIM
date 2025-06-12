package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Geographical Diversity
 *
 * @author Davis Riedel
 */
class GeographicalDiversity(
  value: Double
) : OutputMetric<Double>(value) {
  companion object {
    const val NAME = "GeographicalDiversity"
  }

  override val name: String = NAME
}
