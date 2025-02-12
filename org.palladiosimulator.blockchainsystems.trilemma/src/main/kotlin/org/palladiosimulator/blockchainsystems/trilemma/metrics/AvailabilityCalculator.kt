package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetricCalculator
import kotlin.time.Duration

/**
 * Calculates availability regarding scalability
 *
 * @property observationTime the observed timespan
 * @property numberOfConfirmedTransactions the number of confirmed transactions within the observation time
 * @property numberOfTransactions the total number of transactions within the observation time
 *
 * @author Davis Riedel
 */
class AvailabilityCalculator(
  private val observationTime: Duration,
  private val numberOfConfirmedTransactions: Int,
  private val numberOfTransactions: Int
): OutputMetricCalculator<Availability> {
  override fun calculate(): Availability {
    val availability = numberOfConfirmedTransactions.toDouble() / numberOfTransactions.toDouble()
    return Availability(availability, observationTime)
  }
}