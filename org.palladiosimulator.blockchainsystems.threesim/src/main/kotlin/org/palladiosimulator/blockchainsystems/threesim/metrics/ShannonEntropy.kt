package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Shannon Entropy
 *
 * @author Davis Riedel
 */
class ShannonEntropy(
  value: Double
) : OutputMetric<Double>(value) {
  companion object {
    const val NAME = "ShannonEntropy"
  }

  override val name: String = NAME
}
