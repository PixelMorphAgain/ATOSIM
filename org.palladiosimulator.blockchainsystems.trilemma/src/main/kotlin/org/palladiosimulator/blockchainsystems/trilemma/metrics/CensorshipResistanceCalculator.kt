package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetricCalculator

class CensorshipResistanceCalculator(
  private val hashPowerPerNode: Array<Double>
): OutputMetricCalculator<CensorshipResistance> {
  override fun calculate(): CensorshipResistance {
    val sum = hashPowerPerNode.sum()
    val n =  hashPowerPerNode.count().toDouble()
    val result = 1 - 2 * ((1/n) * sum)
    return CensorshipResistance(result)
  }
}