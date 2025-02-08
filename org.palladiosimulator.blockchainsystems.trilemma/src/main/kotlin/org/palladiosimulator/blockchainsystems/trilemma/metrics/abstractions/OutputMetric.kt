package org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions

interface OutputMetric<T> {
  val value: T

  /**
   * Writes a detailed representation of the event to the specified `StringBuilder`.
   *
   * @param stringBuilder the string builder to which event details are written
   */
  fun formatDetails(stringBuilder: StringBuilder)
}