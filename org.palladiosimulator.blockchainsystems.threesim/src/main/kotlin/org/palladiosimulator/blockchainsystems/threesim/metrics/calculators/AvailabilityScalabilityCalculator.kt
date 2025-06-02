package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.AvailabilityScalability
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
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
class AvailabilityScalabilityCalculator(
  private val observationTime: Duration,
  private val numberOfConfirmedTransactions: Int,
  private val numberOfTransactions: Int
) : OutputMetricCalculator<AvailabilityScalability> {
  override fun calculate(): AvailabilityScalability {
    val availability = numberOfConfirmedTransactions.toDouble() / numberOfTransactions.toDouble()
    return AvailabilityScalability(availability, observationTime)
  }
}