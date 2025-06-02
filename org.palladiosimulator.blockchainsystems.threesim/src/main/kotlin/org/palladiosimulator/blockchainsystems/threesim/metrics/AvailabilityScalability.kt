package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import kotlin.time.Duration

/**
 * Availability regarding Scalability
 *
 * @property observationTime the observed timespan for which the value was computed
 *
 * @author Davis Riedel
 */
data class AvailabilityScalability(
  override val value: Double,
  val observationTime: Duration
) : OutputMetric<Double> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ availabilityScalability=")
      append(value)
      append(" }")
    }
  }
}
