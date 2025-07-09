package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Average Throughput
 *
 * @author Davis Riedel
 */
class AverageThroughput(
  value: Double
) : OutputMetric<Double>(value) {
  companion object {
    const val NAME = "AverageThroughput"
  }

  override val name: String = NAME
}
