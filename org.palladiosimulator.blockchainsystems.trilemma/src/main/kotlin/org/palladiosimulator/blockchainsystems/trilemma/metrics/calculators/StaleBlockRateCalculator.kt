package org.palladiosimulator.blockchainsystems.trilemma.metrics.calculators

import org.palladiosimulator.blockchainsystems.trilemma.metrics.StaleBlockRate
import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetricCalculator

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
): OutputMetricCalculator<StaleBlockRate> {
  override fun calculate(): StaleBlockRate {
    val sb = numberOfQueuedBlocks.toDouble() / numberOfConfirmedBlocks.toDouble()
    return StaleBlockRate(sb)
  }
}