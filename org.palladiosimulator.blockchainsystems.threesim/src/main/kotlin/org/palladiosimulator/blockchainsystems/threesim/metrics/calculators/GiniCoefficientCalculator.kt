package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.GiniCoefficient
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.utils.averageOf
import kotlin.math.abs

/**
 * Calculates the Gini coefficient
 *
 * @property tokensHeldPerNode stores for each miner i how much tokens i owns
 *
 * @author Davis Riedel
 */
class GiniCoefficientCalculator(
  private val tokensHeldPerNode: Collection<Double>
) : OutputMetricCalculator<GiniCoefficient> {
  override fun calculate(): GiniCoefficient {
    val sum = tokensHeldPerNode.sumOf { pi ->
      tokensHeldPerNode.sumOf { pj -> abs(pi - pj) }
    }
    val gini = sum / (2 * tokensHeldPerNode.count())
    return GiniCoefficient(gini)
  }

  companion object : OutputMetricAverageCalculator<GiniCoefficient> {
    override fun calculateAverage(measurements: List<GiniCoefficient>): GiniCoefficient {
      return GiniCoefficient(measurements.averageOf { it.value })
    }
  }
}