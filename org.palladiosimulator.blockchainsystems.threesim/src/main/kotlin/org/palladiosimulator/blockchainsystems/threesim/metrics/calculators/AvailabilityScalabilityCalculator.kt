package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.AvailabilityScalability
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.utils.averageOf

/**
 * Calculates availability regarding scalability
 *
 * @property observationTime the observed timespan in ms
 * @property numberOfConfirmedTransactions the number of confirmed transactions within the observation time
 * @property numberOfTransactions the total number of transactions within the observation time
 *
 * @author Davis Riedel
 */
class AvailabilityScalabilityCalculator(
  private val observationTime: Long,
  private val numberOfConfirmedTransactions: Int,
  private val numberOfTransactions: Int
) : OutputMetricCalculator<AvailabilityScalability> {
  override fun calculate(): AvailabilityScalability {
    val availability = numberOfConfirmedTransactions.toDouble() / numberOfTransactions.toDouble()
    return AvailabilityScalability(availability, observationTime)
  }

  companion object : OutputMetricAverageCalculator<AvailabilityScalability> {
    override fun calculateAverage(measurements: List<AvailabilityScalability>): AvailabilityScalability {
      val avgValue = measurements.averageOf { it.value }
      val avgObservationTime = measurements.averageOf { it.observationTime }
      return AvailabilityScalability(avgValue, avgObservationTime.toLong())
    }
  }
}