package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import kotlin.time.Duration

/**
 * Average confirmation latency
 *
 * @author Davis Riedel
 */
data class AverageConfirmationLatency(
  override val value: Duration
) : OutputMetric<Duration>() {
  override val name: String = "AverageConfirmationLatency"
}
