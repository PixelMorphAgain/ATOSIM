package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.FaultTolerance
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import kotlin.time.Duration

/**
 * Calculates fault tolerance
 *
 * @author Davis Riedel
 */
class FaultToleranceCalculator(
  private val throughputCalculatorWithoutFailedNodes: AverageThroughputCalculator,
  private val throughputCalculatorWithFailedNodes: AverageThroughputCalculator,
  private val confirmationLatencyCalculatorWithoutFailedNodes: ConfirmationLatencyCalculator,
  private val confirmationLatencyCalculatorWithFailedNodes: ConfirmationLatencyCalculator
) : OutputMetricCalculator<FaultTolerance> {
  override fun calculate(): FaultTolerance {
    // TODO: is the difference calculated the right way round?
    val throughputDelta =
      throughputCalculatorWithoutFailedNodes.calculate().value - throughputCalculatorWithFailedNodes.calculate().value
    val confirmationLatencyDelta =
      confirmationLatencyCalculatorWithoutFailedNodes.calculate().value - confirmationLatencyCalculatorWithFailedNodes.calculate().value
    return FaultTolerance(Pair(throughputDelta, confirmationLatencyDelta))
  }

  companion object : OutputMetricAverageCalculator<FaultTolerance> {
    override fun calculateAverage(measurements: List<FaultTolerance>): FaultTolerance {
      val avgThroughputDelta = measurements.sumOf { it.value.first } / measurements.size
      val avgConfirmationLatencyDelta = measurements.map { it.value.second }.reduce(Duration::plus) / measurements.size
      return FaultTolerance(Pair(avgThroughputDelta, avgConfirmationLatencyDelta))
    }
  }
}