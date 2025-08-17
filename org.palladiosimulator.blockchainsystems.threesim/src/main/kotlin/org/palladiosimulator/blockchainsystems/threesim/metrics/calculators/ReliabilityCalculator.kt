package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.Reliability
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.utils.averageOf

/**
 * Calculates reliability of a blockchain system within the given quantifying timespan.
 *
 * @property timespan the timespan over which the reliability is calculated
 * @property meanTimeBetweenFailures average time until a failure occurs
 *
 * @author Davis Riedel
 */
class ReliabilityCalculator(
  private val timespan: Long,
  private val meanTimeBetweenFailures: Double,
) : OutputMetricCalculator<Reliability> {
  override fun calculate(): Reliability {
    val r = timespan.toDouble() / meanTimeBetweenFailures
    return Reliability(r)
  }

  companion object : OutputMetricAverageCalculator<Reliability> {
    override fun calculateAverage(measurements: List<Reliability>): Reliability {
      return Reliability(measurements.averageOf { it.value })
    }
  }
}