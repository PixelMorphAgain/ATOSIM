package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetric
import kotlin.time.Duration

/**
 * Availability regarding Scalability
 *
 * @author Davis Riedel
 */
data class Availability(
  override val value: Double,
  val observationTime: Duration
): OutputMetric<Double> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ availability=")
      append(value)
      append(" }")
    }
  }
}
