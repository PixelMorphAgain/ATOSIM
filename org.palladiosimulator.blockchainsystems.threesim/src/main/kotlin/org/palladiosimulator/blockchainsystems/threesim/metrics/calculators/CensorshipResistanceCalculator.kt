package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.CensorshipResistance
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator

/**
 * Calculates Censorship Resistance
 *
 * @property hashPowerPerNode Stores for each node i its hash power
 *
 * @author Davis Riedel
 */
class CensorshipResistanceCalculator(
  private val hashPowerPerNode: Array<Double>
) : OutputMetricCalculator<CensorshipResistance> {
  override fun calculate(): CensorshipResistance {
    val sum = hashPowerPerNode.sum()
    val n = hashPowerPerNode.count().toDouble()
    val result = 1 - 2 * ((1 / n) * sum)
    return CensorshipResistance(result)
  }

  companion object : OutputMetricAverageCalculator<CensorshipResistance> {
    override fun calculateAverage(measurements: List<CensorshipResistance>): CensorshipResistance {
      return CensorshipResistance(measurements.sumOf { it.value } / measurements.size)
    }
  }
}