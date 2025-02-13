package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetric
import kotlin.time.Duration

/**
 * Availability regarding security
 *
 * @author Davis Riedel
 */
data class AvailabilitySecurity(
  override val value: Double
): OutputMetric<Double> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ availabilitySecurity=")
      append(value)
      append(" }")
    }
  }
}
