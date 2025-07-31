package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import kotlinx.serialization.Serializable

/**
 * Average Throughput
 *
 * @author Davis Riedel
 */
@Serializable
class AverageThroughput(
  override val value: Double,
  val observationTime: Long
) : OutputMetric<Double>() {
  companion object {
    const val NAME = "AverageThroughput"
  }

  override val name: String = NAME
}
