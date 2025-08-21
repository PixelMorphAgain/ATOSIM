package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.FaultTolerance
import org.palladiosimulator.blockchainsystems.threesim.metrics.FaultToleranceAverageOutputMetric
import org.palladiosimulator.blockchainsystems.threesim.metrics.FaultToleranceValue
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.utils.AverageCalculator
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

    return FaultTolerance(
      FaultToleranceValue.of(throughputDelta, confirmationLatencyDelta)
    )
  }

  companion object {
    fun calculateAverage(measurements: List<FaultTolerance>): FaultToleranceAverageOutputMetric {
      return FaultToleranceAverageOutputMetric.of(
        AverageCalculator.calculate(measurements.map { it.value.throughputDelta.value }),
        AverageCalculator.calculate(measurements.map { it.value.confirmationLatencyDelta.value })
      )
    }
  }
}