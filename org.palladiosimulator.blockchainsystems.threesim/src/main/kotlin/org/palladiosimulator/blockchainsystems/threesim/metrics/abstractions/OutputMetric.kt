package org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions

import kotlinx.serialization.Serializable

/**
 * Represents an output metric in 3SIM
 *
 * @param T the type of the value of the output metric
 *
 * @property value the computed value of the output metric
 *
 * @author Davis Riedel
 */
@Serializable
abstract class OutputMetric<T>(
  val value: T
) {
  /**
   * The name of the output metric, used for identification in results
   */
  abstract val name: String
}