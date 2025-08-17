package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.FaultTolerance
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.utils.averageOf
import kotlin.math.abs

/**
 * Calculates fault tolerance
 *
 * @author Davis Riedel
 */
class FaultToleranceCalculator(
  private val averageThroughputWithoutFailures: Double,
  private val averageThroughputWithFailures: Double,
  private val averageConfirmationLatencyWithoutFailures: Double,
  private val averageConfirmationLatencyWithFailures: Double,
) : OutputMetricCalculator<FaultTolerance> {
  override fun calculate(): FaultTolerance {
    val throughputDelta = abs(averageThroughputWithoutFailures - averageThroughputWithFailures)
    val confirmationLatencyDelta =
      abs(averageConfirmationLatencyWithoutFailures - averageConfirmationLatencyWithFailures)
    return FaultTolerance(Pair(throughputDelta, confirmationLatencyDelta))
  }

  companion object : OutputMetricAverageCalculator<FaultTolerance> {
    override fun calculateAverage(measurements: List<FaultTolerance>): FaultTolerance {
      val avgThroughputDelta = measurements.averageOf { it.value.first }
      val avgConfirmationLatencyDelta = measurements.averageOf { it.value.second }
      return FaultTolerance(Pair(avgThroughputDelta, avgConfirmationLatencyDelta))
    }
  }
}