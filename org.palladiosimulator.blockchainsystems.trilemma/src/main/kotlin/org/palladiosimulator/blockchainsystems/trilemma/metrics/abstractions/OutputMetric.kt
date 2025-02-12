package org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions

/**
 * Represents an output metric computed by the simulator
 *
 * @author Davis Riedel
 */
interface OutputMetric<T> {
  /**
   * The computed value of the output metric
   */
  val value: T

  /**
   * Writes a representation of the output metric to the specified `StringBuilder`.
   *
   * @param stringBuilder the string builder to which the metric's details are written
   */
  fun formatDetails(stringBuilder: StringBuilder)
}