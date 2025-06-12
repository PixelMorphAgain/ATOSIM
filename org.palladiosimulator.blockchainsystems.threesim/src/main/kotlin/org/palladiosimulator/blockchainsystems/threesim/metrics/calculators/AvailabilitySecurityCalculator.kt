package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.AvailabilitySecurity
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import kotlin.time.Duration

/**
 * Calculates availability regarding security
 *
 * @property meanTimeToFailure average time blockchain system operates correctly
 * @property meanTimeToRepair average time to recover from failure
 *
 * @author Davis Riedel
 */
class AvailabilitySecurityCalculator(
  private val meanTimeToFailure: Duration,
  private val meanTimeToRepair: Duration,
) : OutputMetricCalculator<AvailabilitySecurity> {
  override fun calculate(): AvailabilitySecurity {
    // average time between consecutive failures
    val meanTimeBetweenFailure = meanTimeToFailure.plus(meanTimeToRepair)
    val a = meanTimeToFailure.div(meanTimeBetweenFailure)
    return AvailabilitySecurity(a)
  }


  companion object : OutputMetricAverageCalculator<AvailabilitySecurity> {
    override fun calculateAverage(measurements: List<AvailabilitySecurity>): AvailabilitySecurity {
      return AvailabilitySecurity(measurements.sumOf { it.value } / measurements.size)
    }
  }
}