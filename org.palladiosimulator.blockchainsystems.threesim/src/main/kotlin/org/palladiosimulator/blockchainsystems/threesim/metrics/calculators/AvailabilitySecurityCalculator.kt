package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.AvailabilitySecurity
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.utils.averageOf

/**
 * Calculates availability regarding security
 *
 * @property meanTimeBetweenFailures average time between consecutive failures
 * @property meanTimeToRepair average time to recover from failure
 *
 * @author Davis Riedel
 */
class AvailabilitySecurityCalculator(
  private val meanTimeBetweenFailures: Double,
  private val meanTimeToRepair: Double,
) : OutputMetricCalculator<AvailabilitySecurity> {
  override fun calculate(): AvailabilitySecurity {
    return AvailabilitySecurity(
      meanTimeBetweenFailures / (meanTimeBetweenFailures + meanTimeToRepair)
    )
  }

  companion object : OutputMetricAverageCalculator<AvailabilitySecurity> {
    override fun calculateAverage(measurements: List<AvailabilitySecurity>): AvailabilitySecurity {
      return AvailabilitySecurity(measurements.averageOf { it.value })
    }
  }
}