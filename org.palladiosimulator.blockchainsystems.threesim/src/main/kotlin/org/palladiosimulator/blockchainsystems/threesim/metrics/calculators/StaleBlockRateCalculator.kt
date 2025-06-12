package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.StaleBlockRate
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator

/**
 * Calculates stale block rate
 *
 * @property numberOfQueuedBlocks number of blocks in the main chain
 * @property numberOfConfirmedBlocks number of blocks upon confirmation after reaching consensus
 *
 * @author Davis Riedel
 */
class StaleBlockRateCalculator(
  private val numberOfQueuedBlocks: Int,
  private val numberOfConfirmedBlocks: Int
) : OutputMetricCalculator<StaleBlockRate> {
  override fun calculate(): StaleBlockRate {
    val sb = numberOfQueuedBlocks.toDouble() / numberOfConfirmedBlocks.toDouble()
    return StaleBlockRate(sb)
  }

  companion object : OutputMetricAverageCalculator<StaleBlockRate> {
    override fun calculateAverage(measurements: List<StaleBlockRate>): StaleBlockRate {
      return StaleBlockRate(measurements.sumOf { it.value } / measurements.size)
    }
  }
}