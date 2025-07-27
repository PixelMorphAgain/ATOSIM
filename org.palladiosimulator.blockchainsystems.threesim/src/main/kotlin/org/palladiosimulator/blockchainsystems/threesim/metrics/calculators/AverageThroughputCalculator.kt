package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.AverageThroughput
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.utils.averageOf

/**
 * Calculates throughput
 *
 * @property numberOfConfirmedTransactions number of successfully processed transactions
 * @property observationTime observation time, here equal to the duration of the simulation run
 *
 * @author Davis Riedel
 */
class AverageThroughputCalculator(
  private val numberOfConfirmedTransactions: Int,
  private val observationTime: Long,
) : OutputMetricCalculator<AverageThroughput> {
  override fun calculate(): AverageThroughput {
    val t = numberOfConfirmedTransactions.toDouble() / observationTime.toDouble()
    return AverageThroughput(t)
  }

  companion object : OutputMetricAverageCalculator<AverageThroughput> {
    override fun calculateAverage(measurements: List<AverageThroughput>): AverageThroughput {
      return AverageThroughput(measurements.averageOf { it.value })
    }
  }
}