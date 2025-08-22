package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.GiniCoefficient
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.AverageOutputMetric
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.AverageOutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.AverageOutputMetricImpl
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.utils.AverageCalculatorResult
import kotlin.math.abs

/**
 * Calculates the Gini coefficient
 *
 * @property tokensHeldPerNode stores for each miner i how much tokens i owns
 *
 * @author Davis Riedel
 */
class GiniCoefficientCalculator(
  private val tokensHeldPerNode: List<Double>
) : OutputMetricCalculator<GiniCoefficient> {
  override fun calculate(): GiniCoefficient {
    if (tokensHeldPerNode.isEmpty()) {
      return GiniCoefficient(0.0)
    }

    val range = (0 until tokensHeldPerNode.size)
    val sum = range.sumOf { i ->
      range.sumOf { j ->
        abs(tokensHeldPerNode[i] - tokensHeldPerNode[j])
      }
    }
    val gini = sum / (2 * tokensHeldPerNode.size * tokensHeldPerNode.sum())
   
    return GiniCoefficient(gini)
  }

  companion object : AverageOutputMetricCalculator<GiniCoefficient>() {
    override fun getValue(metric: GiniCoefficient): Double {
      return metric.value
    }

    override fun createResult(result: AverageCalculatorResult): AverageOutputMetric {
      return AverageOutputMetricImpl(
        name = GiniCoefficient.NAME,
        average = result.average,
        standardDeviation = result.standardDeviation,
        coefficientOfVariation = result.coefficientOfVariation
      )
    }
  }
}