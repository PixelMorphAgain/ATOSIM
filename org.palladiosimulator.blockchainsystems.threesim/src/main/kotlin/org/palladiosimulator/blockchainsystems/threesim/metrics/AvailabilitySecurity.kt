package org.palladiosimulator.blockchainsystems.threesim.metrics

import kotlinx.serialization.Serializable
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Availability regarding security
 *
 * @author Davis Riedel
 */
@Serializable
class AvailabilitySecurity(
  value: Double
) : OutputMetric<Double>(value) {
  companion object {
    const val NAME = "AvailabilitySecurity"
  }

  override val name: String = NAME
}
