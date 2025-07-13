package org.palladiosimulator.blockchainsystems.threesim.monitoring

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent

class ThroughputMonitoringTraceEvent(
  override val occurrenceTime: Long,
) : TraceEvent {
  override val eventType: String = EVENT_TYPE

  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("ThroughputMonitoringTraceEvent: ")
      append("occurrenceTime: $occurrenceTime")
    }
  }

  companion object {
    const val EVENT_TYPE = "ThroughputMonitoringTraceEvent"
  }
}