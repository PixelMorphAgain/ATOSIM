package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.CostOfAttack
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import org.palladiosimulator.blockchainsystems.threesim.utils.averageOf
import java.util.Currency

/**
 * Calculates cost of attack
 *
 * @property numberOfMiners number of miners in the system
 * @property hashPowerNeededPerMiner hash power needed per miner i
 * @property costPerHashUnit cost for one hash unit
 * @property threshold the percentual power needed to control the system
 *
 * @author Davis Riedel
 */
class CostOfAttackCalculator(
  private val numberOfMiners: Int,
  private val hashPowerNeededPerMiner: Array<Double>,
  private val costPerHashUnit: Pair<Double, Currency>,
  private val threshold: Int
) : OutputMetricCalculator<CostOfAttack> {
  init {
    require(threshold >= 0)
    require(threshold <= 100)
  }

  override fun calculate(): CostOfAttack {
    val c = costPerHashUnit.first
    val t = threshold / 100
    val sum = (1..numberOfMiners).sumOf { i ->
      hashPowerNeededPerMiner[i]
    }
    val result = t * c * sum
    return CostOfAttack(Pair(result, costPerHashUnit.second), threshold)
  }

  companion object : OutputMetricAverageCalculator<CostOfAttack> {
    override fun calculateAverage(measurements: List<CostOfAttack>): CostOfAttack {
      // TODO: We assume the first currency and threshold are the same for all measurements
      val currency = measurements.firstOrNull()?.value?.second ?: Currency.getInstance("USD")
      val threshold = measurements.firstOrNull()?.threshold ?: 0
      val avgValue = measurements.averageOf { it.value.first }
      return CostOfAttack(Pair(avgValue, currency), threshold)
    }
  }
}