package org.palladiosimulator.blockchainsystems.trilemma.metrics

import org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions.OutputMetric
import java.util.Currency

/**
 * Cost of Attack
 *
 * @property threshold the percentual power an attack has to have, to control the blockchain system (0-100)
 *
 * @author Davis Riedel
 */
data class CostOfAttack(
  override val value: Pair<Double, Currency>,
  val threshold: Int
): OutputMetric<Pair<Double, Currency>> {
  init {
    require(threshold >= 0)
    require(threshold <= 100)
  }

  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ costOfAttack=")
      append(value.component1())
      append(" ")
      append(value.component2().displayName)
      append(" }")
    }
  }
}
