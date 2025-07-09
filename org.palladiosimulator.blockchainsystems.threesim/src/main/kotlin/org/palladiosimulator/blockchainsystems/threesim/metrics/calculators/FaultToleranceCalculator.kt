package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.FaultTolerance
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator

/**
 * Calculates fault tolerance
 *
 * @author Davis Riedel
 */
class FaultToleranceCalculator(
  private val throughputCalculatorWithoutFailedNodes: AverageThroughputCalculator,
  private val throughputCalculatorWithFailedNodes: AverageThroughputCalculator,
  private val confirmationLatencyCalculatorWithoutFailedNodes: AverageConfirmationLatencyCalculator,
  private val confirmationLatencyCalculatorWithFailedNodes: AverageConfirmationLatencyCalculator
) : OutputMetricCalculator<FaultTolerance> {
  override fun calculate(): FaultTolerance {
    val throughputDelta =
      throughputCalculatorWithoutFailedNodes.calculate().value - throughputCalculatorWithFailedNodes.calculate().value
    val confirmationLatencyDelta =
      confirmationLatencyCalculatorWithoutFailedNodes.calculate().value - confirmationLatencyCalculatorWithFailedNodes.calculate().value
    return FaultTolerance(Pair(throughputDelta, confirmationLatencyDelta))
  }

  companion object : OutputMetricAverageCalculator<FaultTolerance> {
    override fun calculateAverage(measurements: List<FaultTolerance>): FaultTolerance {
      val avgThroughputDelta = measurements.sumOf { it.value.first } / measurements.size
      val avgConfirmationLatencyDelta = measurements.sumOf { it.value.second } / measurements.size
      return FaultTolerance(Pair(avgThroughputDelta, avgConfirmationLatencyDelta))
    }
  }
}