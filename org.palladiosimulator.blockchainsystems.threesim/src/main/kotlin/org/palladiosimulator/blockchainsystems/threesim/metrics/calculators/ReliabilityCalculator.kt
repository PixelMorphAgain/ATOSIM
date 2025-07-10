package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.Reliability
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator

/**
 * Calculates reliability
 *
 * @property totalOperatingTime time taken for system to offer correct transactions
 * @property meanTimeBetweenFailures average time until a failure occurs
 *
 * @author Davis Riedel
 */
class ReliabilityCalculator(
  private val totalOperatingTime: Long,
  private val meanTimeBetweenFailures: Long,
) : OutputMetricCalculator<Reliability> {
  override fun calculate(): Reliability {
    val r = totalOperatingTime.toDouble() / meanTimeBetweenFailures
    return Reliability(r)
  }

  companion object : OutputMetricAverageCalculator<Reliability> {
    override fun calculateAverage(measurements: List<Reliability>): Reliability {
      return Reliability(measurements.sumOf { it.value } / measurements.size)
    }
  }
}