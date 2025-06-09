package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import kotlin.time.Duration

/**
 * Availability regarding security
 *
 * @author Davis Riedel
 */
data class AvailabilitySecurity(
  override val value: Double
) : OutputMetric<Double>() {
  override val name: String = "AvailabilitySecurity"
}
