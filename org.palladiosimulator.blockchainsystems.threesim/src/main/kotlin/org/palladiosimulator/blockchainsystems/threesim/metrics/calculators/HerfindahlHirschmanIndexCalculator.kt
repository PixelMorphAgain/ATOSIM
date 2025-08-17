package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.HerfindahlHirschmanIndex
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import kotlin.math.pow
import org.palladiosimulator.blockchainsystems.threesim.utils.averageOf

/**
 * Calculates the Normalized Herfindahl-Hirschman-Index (HHI_norm)
 *
 * @property tokensHeldPerNode Denotes for each node i the amount of tokens it holds.
 *
 * @author Davis Riedel
 */
class HerfindahlHirschmanIndexCalculator(
  private val tokensHeldPerNode: Collection<Double>
) : OutputMetricCalculator<HerfindahlHirschmanIndex> {
  override fun calculate(): HerfindahlHirschmanIndex {
    val n = tokensHeldPerNode.size.toDouble() // number of validating nodes
    val total = tokensHeldPerNode.sum() // total amount of tokens held by all nodes
    val hhi = tokensHeldPerNode.sumOf { (it / total).pow(2) } // calculate HHI
    val hhiNorm = (hhi - 1 / n) / (1 - (1 / n)) // normalize HHI
    return HerfindahlHirschmanIndex(hhiNorm)
  }

  companion object : OutputMetricAverageCalculator<HerfindahlHirschmanIndex> {
    override fun calculateAverage(measurements: List<HerfindahlHirschmanIndex>): HerfindahlHirschmanIndex {
      return HerfindahlHirschmanIndex(measurements.averageOf { it.value })
    }
  }
}