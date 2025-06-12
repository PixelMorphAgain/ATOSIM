package org.palladiosimulator.blockchainsystems.core.common.abstractions

/**
 * The [TraceEvent] interface represents an event that can be used
 * to trace event that occurred during the simulation.
 *
 * @author Yannik Sproll, Davis Riedel
 */
interface TraceEvent {
  /**
   * Returns the occurrence time of the event.
   *
   * @return occurrence time of the event.
   */
  val occurrenceTime: Long

  /**
   * Returns the type of the event.
   *
   * @return the event type.
   */
  val eventType: String

  /**
   * Writes a detailed representation of the event to the specified `StringBuilder`.
   *
   * @param stringBuilder the string builder to which event details are written
   */
  fun formatDetails(stringBuilder: StringBuilder)
}