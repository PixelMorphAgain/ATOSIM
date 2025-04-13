package org.palladiosimulator.blockchainsystems.trilemma.metrics.calculators

import org.palladiosimulator.blockchainsystems.trilemma.metrics.FaultTolerance
import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetricCalculator

/**
 * Calculates fault tolerance
 *
 * @author Davis Riedel
 */
class FaultToleranceCalculator(
  private val throughputCalculatorWithoutFailedNodes: ThroughputCalculator,
  private val throughputCalculatorWithFailedNodes: ThroughputCalculator,
  private val confirmationLatencyCalculatorWithoutFailedNodes: ConfirmationLatencyCalculator,
  private val confirmationLatencyCalculatorWithFailedNodes: ConfirmationLatencyCalculator
): OutputMetricCalculator<FaultTolerance> {
  override fun calculate(): FaultTolerance {
    // TODO: is the difference calculated the right way round?
    val throughputDelta = throughputCalculatorWithoutFailedNodes.calculate().value - throughputCalculatorWithFailedNodes.calculate().value
    val confirmationLatencyDelta = confirmationLatencyCalculatorWithoutFailedNodes.calculate().value - confirmationLatencyCalculatorWithFailedNodes.calculate().value
    return FaultTolerance(Pair(throughputDelta, confirmationLatencyDelta))
  }
}