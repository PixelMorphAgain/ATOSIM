package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetric

/**
 * Resource consumption
 *
 * @property value Pair of memory consumption and maximum storage size
 *
 * @author Davis Riedel
 */
data class ResourceConsumption(
  override val value: Pair<MemoryConsumption, MaxStorageSize>
): OutputMetric<Pair<MemoryConsumption, MaxStorageSize>> {
  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ ")
      value.first.formatDetails(this)
      append("; ")
      value.second.formatDetails(this)
      append(" }")
    }
  }
}

// TODO: It is not specified in the paper, how to calculate these. The calculator class is thus not implemented.