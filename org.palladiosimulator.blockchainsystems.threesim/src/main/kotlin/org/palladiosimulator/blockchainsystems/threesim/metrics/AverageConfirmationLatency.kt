package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import kotlin.time.Duration

/**
 * Average confirmation latency
 *
 * @author Davis Riedel
 */
class AverageConfirmationLatency(
  value: Duration
) : OutputMetric<Duration>(value) {
  companion object {
    const val NAME = "AverageConfirmationLatency"
  }

  override val name: String = AvailabilitySecurity.Companion.NAME
}
