package org.palladiosimulator.blockchainsystems.threesim.metrics

import kotlinx.serialization.Serializable
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Fault tolerance
 *
 * @property value Pair of throughput delta and confirmation latency delta
 *
 * @author Davis Riedel
 */
@Serializable
class FaultTolerance(
  value: Pair<Double, Double>
) : OutputMetric<Pair<Double, Double>>(value) {
  companion object {
    const val NAME = "FaultTolerance"
  }

  override val name: String = NAME
}
