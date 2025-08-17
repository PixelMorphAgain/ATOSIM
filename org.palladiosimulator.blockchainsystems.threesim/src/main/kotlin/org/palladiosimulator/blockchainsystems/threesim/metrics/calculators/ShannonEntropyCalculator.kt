package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.ShannonEntropy
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.utils.averageOf
import kotlin.math.log

/**
 * Calculates Shannon Entropy
 *
 * @property k the constant factor k of the Shannon Entropy
 * @property blocksProposedPerNode stores for each node i the amount of blocks proposed by i
 *
 * @author Davis Riedel
 */
class ShannonEntropyCalculator(
  private val k: Double,
  private val blocksProposedPerNode: Collection<Int>
) : OutputMetricCalculator<ShannonEntropy> {
  override fun calculate(): ShannonEntropy {
    val totalNumOfBlocksProposed = blocksProposedPerNode.sum();
    val sum = blocksProposedPerNode.sumOf {
      val b = it.toDouble() / totalNumOfBlocksProposed // Probability of block proposed by node i
      b * log(b, 2.0)
    }
    val result = -1 * k * sum
    return ShannonEntropy(result)
  }

  companion object : OutputMetricAverageCalculator<ShannonEntropy> {
    override fun calculateAverage(measurements: List<ShannonEntropy>): ShannonEntropy {
      return ShannonEntropy(measurements.averageOf { it.value })
    }
  }
}