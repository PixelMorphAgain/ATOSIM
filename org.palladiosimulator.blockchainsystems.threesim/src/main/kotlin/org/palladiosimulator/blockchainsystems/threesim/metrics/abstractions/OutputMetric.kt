package org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions

/**
 * Represents an output metric in 3SIM
 *
 * @param T the type of the value of the output metric
 *
 * @property value the computed value of the output metric
 *
 * @author Davis Riedel
 */
abstract class OutputMetric<T>(
  val value: T
) {
  /**
   * The name of the output metric, used for identification in results
   */
  abstract val name: String

  /**
   * Writes a representation of the output metric to the specified `StringBuilder`.
   *
   * @param stringBuilder the string builder to which the metric's details are written
   */
  open fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ ")
      append(name)
      append("=")
      append(value)
      append(" }")
    }
  }
}