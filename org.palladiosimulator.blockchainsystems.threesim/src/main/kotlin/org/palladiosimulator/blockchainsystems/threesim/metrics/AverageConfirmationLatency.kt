package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import kotlinx.serialization.Serializable

/**
 * Average confirmation latency
 *
 * @author Davis Riedel
 */
@Serializable
class AverageConfirmationLatency(
  value: Double
) : OutputMetric<Double>(value) {
  companion object {
    const val NAME = "AverageConfirmationLatency"
  }

  override val name: String = NAME
}
