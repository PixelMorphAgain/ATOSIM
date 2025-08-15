package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.AverageConfirmationLatency
import org.palladiosimulator.blockchainsystems.threesim.metrics.Throughput
import org.palladiosimulator.blockchainsystems.threesim.metrics.FaultTolerance
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.utils.averageOf

/**
 * Calculates fault tolerance
 *
 * @author Davis Riedel
 */
class FaultToleranceCalculator(
  private val noFailuresThroughput: Throughput,
  private val throughput: Throughput,
  private val noFailuresConfirmationLatency: AverageConfirmationLatency,
  private val confirmationLatency: AverageConfirmationLatency
) : OutputMetricCalculator<FaultTolerance> {
  override fun calculate(): FaultTolerance {
    // TODO: Is this the right way around?
    val throughputDelta = noFailuresThroughput.value - throughput.value
    val confirmationLatencyDelta = noFailuresConfirmationLatency.value - confirmationLatency.value
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