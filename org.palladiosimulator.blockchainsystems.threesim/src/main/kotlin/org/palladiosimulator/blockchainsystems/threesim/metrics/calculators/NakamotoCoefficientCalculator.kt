package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.NakamotoCoefficient
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator

/**
 * Calculates the Nakamoto coefficient
 *
 * @property tokensStakedPerNode stores for each node i how many tokens i has staked
 * @property threshold the threshold to compute the Nakamoto coefficient for
 *
 * @author Davis Riedel
 */
class NakamotoCoefficientCalculator(
  private val tokensStakedPerNode: Array<Double>,
  private val threshold: Double
) : OutputMetricCalculator<NakamotoCoefficient> {
  override fun calculate(): NakamotoCoefficient {
    tokensStakedPerNode.indices.forEach { k ->
      val sum = (1..k).sumOf { tokensStakedPerNode[it] }
      if (sum >= threshold) return NakamotoCoefficient(k, threshold);
    }
    // NOTE: Should not be reached
    return NakamotoCoefficient(tokensStakedPerNode.count(), threshold)
  }
}