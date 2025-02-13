package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetric

/**
 * Memory consumption
 *
 * @author Davis Riedel
 */
data class MemoryConsumption(
  override val value: Double
): OutputMetric<Double> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ memoryConsumption=")
      append(value)
      append(" }")
    }
  }
}
