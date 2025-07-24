package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import kotlinx.serialization.Serializable

/**
 * Geographical Diversity
 *
 * @author Davis Riedel
 */
@Serializable
class GeographicalDiversity(
  value: Double
) : OutputMetric<Double>(value) {
  companion object {
    const val NAME = "GeographicalDiversity"
  }

  override val name: String = NAME
}
