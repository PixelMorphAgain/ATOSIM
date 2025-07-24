package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import kotlinx.serialization.Serializable

/**
 * Consistency
 *
 * @author Davis Riedel
 */
@Serializable
class Consistency(
  value: Double
) : OutputMetric<Double>(value) {
  companion object {
    const val NAME = "Consistency"
  }

  override val name: String = NAME
}
