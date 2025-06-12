package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.Consistency
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import kotlin.time.ComparableTimeMark
import kotlin.time.DurationUnit

/**
 * Calculates consistency
 *
 * @property numberOfBlocks the number of blocks for which system times are measured
 * @property blockProposalTimePerRound the block proposal time in each round i
 * @property blockConfirmationTimePerRound the block confirmation time in each round i
 *
 * @author Davis Riedel
 */
class ConsistencyCalculator(
  private val numberOfBlocks: Int,
  private val blockProposalTimePerRound: List<ComparableTimeMark>,
  private val blockConfirmationTimePerRound: List<ComparableTimeMark>,
) : OutputMetricCalculator<Consistency> {
  override fun calculate(): Consistency {
    val sum = (1..numberOfBlocks).sumOf { i ->
      // TODO: Check if milliseconds are the right duration unit
      blockConfirmationTimePerRound[i].minus(blockProposalTimePerRound[i]).toDouble(DurationUnit.MILLISECONDS)
    }
    val result = (1 / numberOfBlocks.toDouble()) * sum;
    return Consistency(result)
  }

  companion object : OutputMetricAverageCalculator<Consistency> {
    override fun calculateAverage(measurements: List<Consistency>): Consistency {
      return Consistency(measurements.sumOf { it.value } / measurements.size)
    }
  }
}