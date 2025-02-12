package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetricCalculator
import kotlin.time.ComparableTimeMark

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
): OutputMetricCalculator<ConfirmationLatency> {
  override fun calculate(): ConfirmationLatency {
    val cl =  blockConfirmationTime - blockProposalTime
    return ConfirmationLatency(cl)
  }
}

// TODO: Calculate alternative confirmation latency CL = SecurityConfirmation * BlockCreationInterval (see paper)