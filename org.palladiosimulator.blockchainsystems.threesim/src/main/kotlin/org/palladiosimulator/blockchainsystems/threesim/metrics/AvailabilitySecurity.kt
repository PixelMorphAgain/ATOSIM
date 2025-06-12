package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import kotlin.time.Duration

/**
 * Availability regarding security
 *
 * @author Davis Riedel
 */
class AvailabilitySecurity(
  value: Double
) : OutputMetric<Double>(value) {
  companion object {
    const val NAME = "AvailabilitySecurity"
  }

  override val name: String = NAME
}
