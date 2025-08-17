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
  override val value: FaultToleranceValue
) : OutputMetric<FaultToleranceValue> {
  companion object {
    const val NAME = "FaultTolerance"
  }

  override val name: String = NAME
  override val unit: String? = null
}
