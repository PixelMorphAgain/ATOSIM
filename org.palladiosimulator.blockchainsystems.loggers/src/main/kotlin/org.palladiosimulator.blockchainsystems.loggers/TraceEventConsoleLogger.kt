package org.palladiosimulator.blockchainsystems.loggers

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLogOrigin
import org.palladiosimulator.blockchainsystems.loggers.abstractions.AbstractJsonLogger

/**
 * A logger that prints trace events to the console in JSON format.
 *
 * @author Davis Riedel
 */
class TraceEventConsoleLogger : AbstractJsonLogger() {
  override fun onTraceEventOccurred(traceEvent: TraceEvent, logOrigin: TraceEventLogOrigin) {
    println(getEventFormat(traceEvent, logOrigin))
  }

  override fun initialize() {}

  override fun cleanUp() {}
}