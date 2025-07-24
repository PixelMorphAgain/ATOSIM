package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import kotlinx.serialization.Serializable

/**
 * Stale block rate
 *
 * @author Davis Riedel
 */
@Serializable
class StaleBlockRate(
  value: Double
) : OutputMetric<Double>(value) {
  companion object {
    const val NAME = "StaleBlockRate"
  }

  override val name: String = NAME
}
