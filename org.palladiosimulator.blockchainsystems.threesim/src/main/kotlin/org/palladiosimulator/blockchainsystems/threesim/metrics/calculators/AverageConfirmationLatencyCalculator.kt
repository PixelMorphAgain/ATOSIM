package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.AverageConfirmationLatency
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.AverageOutputMetric
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.AverageOutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.AverageOutputMetricImpl
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.utils.AverageCalculatorResult

/**
 * Calculates average confirmation latency that occurred during a single simulation round.
 *
 * @property confirmationLatencies each item is a duration between inclusion and confirmation of a transaction, in ms
 *
 * @author Davis Riedel
 */
class AverageConfirmationLatencyCalculator(
  private val confirmationLatencies: Collection<Long>
) : OutputMetricCalculator<AverageConfirmationLatency> {
  override fun calculate(): AverageConfirmationLatency {
    if (confirmationLatencies.isEmpty()) {
      return AverageConfirmationLatency(0.0)
    }

    return AverageConfirmationLatency(
      confirmationLatencies.sum().toDouble() / confirmationLatencies.size
    )
  }

  companion object : AverageOutputMetricCalculator<AverageConfirmationLatency>() {
    override fun getValue(metric: AverageConfirmationLatency): Double {
      return metric.value
    }

    override fun createResult(result: AverageCalculatorResult): AverageOutputMetric {
      return AverageOutputMetricImpl(
        name = AverageConfirmationLatency.NAME,
        average = result.average,
        unit = AverageConfirmationLatency.UNIT,
        standardDeviation = result.standardDeviation,
        coefficientOfVariation = result.coefficientOfVariation
      )
    }
  }
}