package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetricCalculator
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
): OutputMetricCalculator<AvailabilitySecurity> {
  override fun calculate(): AvailabilitySecurity {
    // average time between consecutive failures
    val meanTimeBetweenFailure = meanTimeToFailure.plus(meanTimeToRepair)
    val a = meanTimeToFailure.div(meanTimeBetweenFailure)
    return AvailabilitySecurity(a)
  }
}