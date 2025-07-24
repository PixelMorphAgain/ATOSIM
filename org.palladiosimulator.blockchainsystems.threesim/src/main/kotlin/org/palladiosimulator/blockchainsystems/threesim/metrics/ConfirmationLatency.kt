package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import kotlinx.serialization.Serializable

/**
 * Confirmation latency
 *
 * @author Davis Riedel
 */
@Serializable
class ConfirmationLatency(
  override val value: Long
) : OutputMetric<Long>() {
  companion object {
    const val NAME = "ConfirmationLatency"
  }

  override val name: String = NAME
}
