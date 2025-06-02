package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import kotlin.time.Duration

/**
 * Success rate
 *
 * @author Davis Riedel
 */
data class SuccessRate(
  override val value: Double,
  val observationTime: Duration
) : OutputMetric<Double> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ successRate=")
      append(value)
      append(" }")
    }
  }
}
