package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetricCalculator
import kotlin.math.ln

class ShannonEntropyCalculator(
  private val k: Double,
  private val totalBlocksProposedPerNode: Array<Int>
): OutputMetricCalculator<ShannonEntropy> {
  override fun calculate(): ShannonEntropy {
    val totalProposedBlocks = totalBlocksProposedPerNode.sum();
    val sum = totalBlocksProposedPerNode.sumOf {
      val b = it.toDouble() / totalProposedBlocks
      b * ln(b)
    }
    val result = -1 * k * sum
    return ShannonEntropy(result)
  }
}