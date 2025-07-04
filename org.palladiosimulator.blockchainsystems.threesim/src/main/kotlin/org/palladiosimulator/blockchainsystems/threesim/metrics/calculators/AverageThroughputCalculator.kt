package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.Throughput
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator

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
) : OutputMetricCalculator<Throughput> {
  override fun calculate(): Throughput {
    val t = numberOfConfirmedTransactions.toDouble() / observationTime.toDouble()
    return Throughput(t)
  }

  companion object : OutputMetricAverageCalculator<Throughput> {
    override fun calculateAverage(measurements: List<Throughput>): Throughput {
      return Throughput(measurements.sumOf { it.value } / measurements.size)
    }
  }
}