package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.FaultTolerance
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.utils.averageOf

/**
 * Calculates fault tolerance
 *
 * @author Davis Riedel
 */
class FaultToleranceCalculator() : OutputMetricCalculator<FaultTolerance> {
  override fun calculate(): FaultTolerance {
    val throughputDelta = TODO()
    val confirmationLatencyDelta = TODO()
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