package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.Consistency
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator

/**
 * Calculates consistency
 *
 * @property blockConfirmationTimePerConfirmedBlock Denotes for each confirmed block i the time it took to confirm it.
 * @property blockProposalTimePerConfirmedBlock Denotes for each confirmed block i the time it took to propose it.
 *
 * @author Davis Riedel
 */
class ConsistencyCalculator(
  private val blockConfirmationTimePerConfirmedBlock: List<Long>,
  private val blockProposalTimePerConfirmedBlock: List<Long>
) : OutputMetricCalculator<Consistency> {
  override fun calculate(): Consistency {
    require(blockConfirmationTimePerConfirmedBlock.size == blockProposalTimePerConfirmedBlock.size)

    val result = (1.0 / blockConfirmationTimePerConfirmedBlock.size) *
      blockConfirmationTimePerConfirmedBlock.zip(blockProposalTimePerConfirmedBlock)
        .sumOf { (blockConfirmationTime, blockProposalTime) ->
          blockConfirmationTime - blockProposalTime
        }

    return Consistency(result)
  }

  companion object : OutputMetricAverageCalculator<Consistency> {
    override fun calculateAverage(measurements: List<Consistency>): Consistency {
      return Consistency(measurements.sumOf { it.value } / measurements.size)
    }
  }
}