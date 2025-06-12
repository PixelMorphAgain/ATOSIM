package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Resource consumption
 *
 * @property value Pair of memory consumption and maximum storage size
 *
 * @author Davis Riedel
 */
class ResourceConsumption(
  value: Pair<MemoryConsumption, MaxStorageSize>
) : OutputMetric<Pair<MemoryConsumption, MaxStorageSize>>(value) {
  companion object {
    const val NAME = "ResourceConsumption"
  }

  override val name: String = NAME

  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ ")
      append(name)
      append("={ memoryConsumption=")
      value.first.formatDetails(this)
      append("; maxStorageSize=")
      value.second.formatDetails(this)
      append(" }")
    }
  }
}

// TODO: It is not specified in the paper, how to calculate these. The calculator class is thus not implemented.