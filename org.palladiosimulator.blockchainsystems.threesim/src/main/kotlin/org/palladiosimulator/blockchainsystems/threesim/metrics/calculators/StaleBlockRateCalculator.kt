package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.StaleBlockRate
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator

/**
 * Calculates stale block rate
 *
 * @property numberOfStaleBlocks number of stale blocks
 * @property numberOfConfirmedBlocks number of confirmed blocks
 *
 * @author Davis Riedel
 */
class StaleBlockRateCalculator(
  private val numberOfStaleBlocks: Int,
  private val numberOfConfirmedBlocks: Int
) : OutputMetricCalculator<StaleBlockRate> {
  override fun calculate(): StaleBlockRate {
    val sb = numberOfStaleBlocks.toDouble() / numberOfConfirmedBlocks.toDouble()
    return StaleBlockRate(sb)
  }

  companion object : OutputMetricAverageCalculator<StaleBlockRate> {
    override fun calculateAverage(measurements: List<StaleBlockRate>): StaleBlockRate {
      return StaleBlockRate(measurements.sumOf { it.value } / measurements.size)
    }
  }
}