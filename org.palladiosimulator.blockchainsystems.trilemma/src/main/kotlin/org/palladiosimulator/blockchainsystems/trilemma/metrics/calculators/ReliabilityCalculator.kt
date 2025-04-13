package org.palladiosimulator.blockchainsystems.trilemma.metrics.calculators

import org.palladiosimulator.blockchainsystems.trilemma.metrics.Reliability
import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetricCalculator
import kotlin.time.Duration

/**
 * Calculates reliability
 *
 * @property systemUptime time taken for system to offer correct transactions
 * @property meanTimeToFailure average time until a failure occurs
 *
 * @author Davis Riedel
 */
class ReliabilityCalculator(
  private val systemUptime: Duration,
  private val meanTimeToFailure: Duration,
): OutputMetricCalculator<Reliability> {
  override fun calculate(): Reliability {
    val r = systemUptime.div(meanTimeToFailure)
    return Reliability(r)
  }
}