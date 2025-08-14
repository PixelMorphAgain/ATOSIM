package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import kotlinx.serialization.Serializable

/**
 * Shannon Entropy
 *
 * @author Davis Riedel
 */
@Serializable
class ShannonEntropy(
  override val value: Double
) : OutputMetric<Double> {
  companion object {
    const val NAME = "ShannonEntropy"
  }

  override val name: String = NAME
}
