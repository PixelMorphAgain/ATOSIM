package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.ConfirmationLatency
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator

/**
 * Calculates confirmation latency
 *
 * @property blockProposalTime system time when new block is issued
 * @property blockConfirmationTime system time when new block is confirmed
 *
 * @author Davis Riedel
 */
class ConfirmationLatencyCalculator(
  private val blockProposalTime: Long,
  private val blockConfirmationTime: Long
) : OutputMetricCalculator<ConfirmationLatency> {
  override fun calculate(): ConfirmationLatency {
    val cl = blockConfirmationTime - blockProposalTime
    return ConfirmationLatency(cl)
  }
}