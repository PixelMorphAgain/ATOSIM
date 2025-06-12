package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.ConfirmationLatency
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import kotlin.time.ComparableTimeMark
import kotlin.time.Duration

/**
 * Calculates confirmation latency
 *
 * @property blockProposalTime system time when new block is issued
 * @property blockConfirmationTime system time when new block is confirmed
 *
 * @author Davis Riedel
 */
class ConfirmationLatencyCalculator(
  private val blockProposalTime: ComparableTimeMark,
  private val blockConfirmationTime: ComparableTimeMark
) : OutputMetricCalculator<ConfirmationLatency> {
  override fun calculate(): ConfirmationLatency {
    val cl = blockConfirmationTime - blockProposalTime
    return ConfirmationLatency(cl)
  }

  companion object : OutputMetricAverageCalculator<ConfirmationLatency> {
    override fun calculateAverage(measurements: List<ConfirmationLatency>): ConfirmationLatency {
      val avgValue = measurements.map { it.value }.reduce(Duration::plus) / measurements.size
      return ConfirmationLatency(avgValue)
    }
  }
}

// TODO: Calculate alternative confirmation latency CL = SecurityConfirmation * BlockCreationInterval (see paper)