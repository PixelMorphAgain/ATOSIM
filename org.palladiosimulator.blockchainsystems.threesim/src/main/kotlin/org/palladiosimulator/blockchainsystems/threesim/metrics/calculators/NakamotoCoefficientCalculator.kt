package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.NakamotoCoefficient
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.utils.averageOf

/**
 * Calculates the Nakamoto coefficient
 *
 * @property hashingPowerPerNode the hashing power of each validating node in the system
 * @property threshold the threshold to compute the Nakamoto coefficient for
 *
 * @author Davis Riedel
 */
class NakamotoCoefficientCalculator(
  private val hashingPowerPerNode: Collection<Double>,
  private val threshold: Double
) : OutputMetricCalculator<NakamotoCoefficient> {
  override fun calculate(): NakamotoCoefficient {
    val totalHashingPower = hashingPowerPerNode.sum()
    if (totalHashingPower == 0.0) return NakamotoCoefficient(0, threshold)

    val sortedHashingPowers = hashingPowerPerNode.sortedDescending()

    val coefficient = sortedHashingPowers
      .runningReduce { acc, d -> acc + d } // Calculate cumulative hashing power for each entry
      .indexOfFirst { it / totalHashingPower >= threshold } // Find first index where cumulative hashing power >= threshold
      .let { if (it == -1) sortedHashingPowers.size else it + 1 } // +1 because index is 0-based. If not found, return size of array.

    return NakamotoCoefficient(coefficient, threshold)
  }

  companion object : OutputMetricAverageCalculator<NakamotoCoefficient> {
    override fun calculateAverage(measurements: List<NakamotoCoefficient>): NakamotoCoefficient {
      // NOTE: We assume the first threshold is the same for all measurements
      val threshold = measurements.firstOrNull()?.threshold ?: 0.5
      return NakamotoCoefficient(measurements.averageOf { it.value }.toInt(), threshold)
    }
  }
}