package org.palladiosimulator.blockchainsystems.loggers.abstractions

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLogOrigin
import org.palladiosimulator.blockchainsystems.core.tracing.TraceEventLogOutput

/**
 * An abstract class for trace event loggers that write plain text logs.
 *
 * @author Davis Riedel
 */
abstract class AbstractJsonLogger() : TraceEventLogOutput {
  @Serializable
  internal data class LogEntry(
    val traceEvent: TraceEvent,
    val logOrigin: TraceEventLogOrigin
  )

  protected fun getEventFormat(traceEvent: TraceEvent, logOrigin: TraceEventLogOrigin): String {
    return Json.encodeToString(LogEntry(traceEvent, logOrigin))
  }
}