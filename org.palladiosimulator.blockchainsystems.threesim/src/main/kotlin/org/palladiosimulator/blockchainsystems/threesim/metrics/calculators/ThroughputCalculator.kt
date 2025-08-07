package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.Throughput
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.utils.averageOf

/**
 * Calculates throughput
 *
 * @property numberOfConfirmedTransactions number of successfully processed transactions
 * @property observationTime observation time in milliseconds
 *
 * @author Davis Riedel
 */
class ThroughputCalculator(
  private val numberOfConfirmedTransactions: Int,
  private val observationTime: Long,
) : OutputMetricCalculator<Throughput> {
  override fun calculate(): Throughput {
    return Throughput(
      (numberOfConfirmedTransactions.toDouble() / observationTime.toDouble()) * 1000 // Convert ms to seconds
    )
  }

  companion object : OutputMetricAverageCalculator<Throughput> {
    override fun calculateAverage(measurements: List<Throughput>): Throughput {
      return Throughput(measurements.averageOf { it.value })
    }
  }
}