package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Availability regarding Scalability
 *
 * @property observationTime the observed timespan for which the value was computed
 *
 * @author Davis Riedel
 */
class AvailabilityScalability(
  value: Double,
  val observationTime: Long
) : OutputMetric<Double>(value) {
  companion object {
    const val NAME = "AvailabilityScalability"
  }

  override val name: String = NAME
}
