package org.palladiosimulator.blockchainsystems.trilemma.metrics.calculators

import org.palladiosimulator.blockchainsystems.trilemma.metrics.SuccessRate
import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetricCalculator
import kotlin.time.Duration

/**
 * Calculates success rate
 *
 * @property observationTime the observed timespan
 * @property numberOfSuccessfulTransactions the number of successful transactions within the observation time
 * @property numberOfTransactions the total number of transactions within the observation time
 *
 * @author Davis Riedel
 */
class SuccessRateCalculator(
  private val observationTime: Duration,
  private val numberOfSuccessfulTransactions: Int,
  private val numberOfTransactions: Int
): OutputMetricCalculator<SuccessRate> {
  override fun calculate(): SuccessRate {
    val sr = numberOfSuccessfulTransactions.toDouble() / numberOfTransactions.toDouble()
    return SuccessRate(sr, observationTime)
  }
}