package org.palladiosimulator.blockchainsystems.threesim.metrics

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import java.util.Currency

/**
 * Cost of Attack
 *
 * @property value cost of attack represented as a Pair of the monetary value and its currency
 * @property threshold the percentual power an attack has to have, to control the blockchain system (0-100)
 *
 * @author Davis Riedel
 */
data class CostOfAttack(
  override val value: Pair<Double, Currency>,
  val threshold: Int
) : OutputMetric<Pair<Double, Currency>>() {
  override val name: String = "CostOfAttack"

  init {
    require(threshold >= 0)
    require(threshold <= 100)
  }

  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ ")
      append(name)
      append("=")
      append(value.first)
      append(" ")
      append(value.second.displayName)
      append(" }")
    }
  }
}
