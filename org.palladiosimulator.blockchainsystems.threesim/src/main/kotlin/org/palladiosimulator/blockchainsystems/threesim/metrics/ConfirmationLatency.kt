package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Confirmation latency
 *
 * @author Davis Riedel
 */
class ConfirmationLatency(
  value: Long
) : OutputMetric<Long>(value) {
  companion object {
    const val NAME = "ConfirmationLatency"
  }

  override val name: String = NAME
}
