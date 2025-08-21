package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.AvailabilitySecurity
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.AverageOutputMetric
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.AverageOutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.AverageOutputMetricImpl
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.utils.AverageCalculatorResult

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

  companion object : AverageOutputMetricCalculator<AvailabilitySecurity>() {
    override fun getValue(metric: AvailabilitySecurity): Double {
      return metric.value
    }

    override fun createResult(result: AverageCalculatorResult): AverageOutputMetric {
      return AverageOutputMetricImpl(
        name = AvailabilitySecurity.NAME,
        average = result.average,
        unit = AvailabilitySecurity.UNIT,
        standardDeviation = result.standardDeviation,
        coefficientOfVariation = result.coefficientOfVariation
      )
    }
  }
}