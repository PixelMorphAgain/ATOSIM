package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.HerfindahlHirschmanIndex
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import kotlin.math.pow

/**
 * Calculates the Herfindahl-Hirschman-Index (HHI)
 *
 * @property tokensHeldPerNode Denotes for each node i the amount of tokens it holds.
 *
 * @author Davis Riedel
 */
class HerfindahlHirschmanIndexCalculator(
  private val tokensHeldPerNode: Collection<Double>
) : OutputMetricCalculator<HerfindahlHirschmanIndex> {
  override fun calculate(): HerfindahlHirschmanIndex {
    val n = tokensHeldPerNode.count()
    val hhi = tokensHeldPerNode.sumOf { (it / n).pow(2) }
    return HerfindahlHirschmanIndex(hhi)
  }

  companion object : OutputMetricAverageCalculator<HerfindahlHirschmanIndex> {
    override fun calculateAverage(measurements: List<HerfindahlHirschmanIndex>): HerfindahlHirschmanIndex {
      return HerfindahlHirschmanIndex(measurements.sumOf { it.value } / measurements.size)
    }
  }
}