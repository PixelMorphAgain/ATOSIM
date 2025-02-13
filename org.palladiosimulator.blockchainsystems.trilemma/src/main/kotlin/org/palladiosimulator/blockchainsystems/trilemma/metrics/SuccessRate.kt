package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetric
import kotlin.time.Duration

/**
 * Success rate
 *
 * @author Davis Riedel
 */
data class SuccessRate(
  override val value: Double,
  val observationTime: Duration
): OutputMetric<Double> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ successRate=")
      append(value)
      append(" }")
    }
  }
}
