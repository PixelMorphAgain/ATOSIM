package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetricCalculator
import kotlin.math.pow

/**
 * Calculates the Herfindahl-Hirschman-Index (HHI)
 *
 * @property tokensHeldPerNode Denotes for each node i the amount of tokens it holds.
 *
 * @author Davis Riedel
 */
class HerfindahlHirschmanIndexCalculator(
  private val tokensHeldPerNode: Array<Double>
): OutputMetricCalculator<HerfindahlHirschmanIndex> {
  override fun calculate(): HerfindahlHirschmanIndex {
    val n = tokensHeldPerNode.count()
    val hhi = tokensHeldPerNode.sumOf { (it / n).pow(2) }
    return HerfindahlHirschmanIndex(hhi)
  }
}