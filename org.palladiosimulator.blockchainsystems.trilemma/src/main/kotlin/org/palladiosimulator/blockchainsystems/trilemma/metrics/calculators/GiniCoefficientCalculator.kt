package org.palladiosimulator.blockchainsystems.trilemma.metrics.calculators

import org.palladiosimulator.blockchainsystems.trilemma.metrics.GiniCoefficient
import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetricCalculator
import kotlin.math.abs

/**
 * Calculates the Gini coefficient
 *
 * @property tokensOwnedPerMiner stores for each miner i how much tokens i has staked
 *
 * @author Davis Riedel
 */
class GiniCoefficientCalculator(
  private val tokensOwnedPerMiner: Array<Double>
): OutputMetricCalculator<GiniCoefficient> {
  override fun calculate(): GiniCoefficient {
    val sum = tokensOwnedPerMiner.sumOf { pi ->
      tokensOwnedPerMiner.sumOf { pj -> abs(pi - pj) }
    }
    val gini = sum / (2 * tokensOwnedPerMiner.count())
    return GiniCoefficient(gini)
  }
}