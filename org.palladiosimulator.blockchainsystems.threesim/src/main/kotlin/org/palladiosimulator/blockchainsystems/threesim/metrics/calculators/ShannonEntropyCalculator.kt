package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.ShannonEntropy
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import kotlin.math.ln

/**
 * Calculates Shannon Entropy
 *
 * @property k the constant factor k of the Shannon Entropy
 * @property totalBlocksProposedPerNode stores for each node i the amount of blocks proposed by i
 *
 * @author Davis Riedel
 */
class ShannonEntropyCalculator(
  private val k: Double,
  private val totalBlocksProposedPerNode: Array<Int>
) : OutputMetricCalculator<ShannonEntropy> {
  override fun calculate(): ShannonEntropy {
    val totalProposedBlocks = totalBlocksProposedPerNode.sum();
    val sum = totalBlocksProposedPerNode.sumOf {
      val b = it.toDouble() / totalProposedBlocks
      b * ln(b)
    }
    val result = -1 * k * sum
    return ShannonEntropy(result)
  }

  companion object : OutputMetricAverageCalculator<ShannonEntropy> {
    override fun calculateAverage(measurements: List<ShannonEntropy>): ShannonEntropy {
      return ShannonEntropy(measurements.sumOf { it.value } / measurements.size)
    }
  }
}