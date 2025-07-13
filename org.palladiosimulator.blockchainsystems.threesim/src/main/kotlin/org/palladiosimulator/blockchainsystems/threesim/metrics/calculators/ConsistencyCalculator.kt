package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.Consistency
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.utils.averageOf

/**
 * Calculates consistency
 *
 * @property blockProposalTimeAndConfirmationTimePerConfirmedBlock Denotes for each confirmed block i its proposal time and its confirmation time.
 *
 * @author Davis Riedel
 */
class ConsistencyCalculator(
  private val blockProposalTimeAndConfirmationTimePerConfirmedBlock: Collection<Pair<Long, Long>>,
) : OutputMetricCalculator<Consistency> {
  override fun calculate(): Consistency {
    val n = blockProposalTimeAndConfirmationTimePerConfirmedBlock.size
    val result = (1.0 / n) *
      blockProposalTimeAndConfirmationTimePerConfirmedBlock
        .sumOf { (blockConfirmationTime, blockProposalTime) ->
          blockConfirmationTime - blockProposalTime
        }

    return Consistency(result)
  }

  companion object : OutputMetricAverageCalculator<Consistency> {
    override fun calculateAverage(measurements: List<Consistency>): Consistency {
      return Consistency(measurements.averageOf { it.value })
    }
  }
}