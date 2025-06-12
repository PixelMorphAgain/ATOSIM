package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import kotlin.time.Duration

/**
 * Confirmation latency
 *
 * @author Davis Riedel
 */
class ConfirmationLatency(
  value: Duration
) : OutputMetric<Duration>(value) {
  companion object {
    const val NAME = "ConfirmationLatency"
  }

  override val name: String = NAME
}
