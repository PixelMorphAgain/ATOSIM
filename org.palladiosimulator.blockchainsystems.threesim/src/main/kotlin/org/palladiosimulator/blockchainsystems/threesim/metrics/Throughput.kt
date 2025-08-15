package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import kotlinx.serialization.Serializable

/**
 * Throughput
 *
 * @property value the throughput value in transactions per second
 *
 * @author Davis Riedel
 */
@Serializable
class Throughput(
  override val value: Double,
) : OutputMetric<Double> {
  companion object {
    const val NAME = "Throughput"
  }

  override val name: String = NAME
}
