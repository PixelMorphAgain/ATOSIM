package org.palladiosimulator.blockchainsystems.trilemma.metrics.calculators

import org.palladiosimulator.blockchainsystems.trilemma.metrics.Throughput
import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetricCalculator
import kotlin.time.Duration
import kotlin.time.DurationUnit

/**
 * Calculates throughput
 *
 * @property numberOfSuccessfulTransactions number of successfully processed transactions
 * @property blockConfirmationTime system time to confirm a new block
 * @property blockProposalTime system time to issue new block
 *
 * @author Davis Riedel
 */
class ThroughputCalculator(
  private val numberOfSuccessfulTransactions: Int,
  private val blockConfirmationTime: Duration,
  private val blockProposalTime: Duration,
): OutputMetricCalculator<Throughput> {
  override fun calculate(): Throughput {
    // TODO: Are milliseconds the right duration unit?
    val t = numberOfSuccessfulTransactions.toDouble() / (blockConfirmationTime.minus(blockProposalTime)).toDouble(DurationUnit.MILLISECONDS)
    return Throughput(t)
  }
}

// TODO: The alternative throughput is not yet implemented (see paper)