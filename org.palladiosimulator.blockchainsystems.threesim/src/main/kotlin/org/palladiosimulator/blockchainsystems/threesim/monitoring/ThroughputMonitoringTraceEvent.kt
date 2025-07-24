package org.palladiosimulator.blockchainsystems.threesim.monitoring

import kotlinx.serialization.Serializable
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent

@Serializable
class ThroughputMonitoringTraceEvent(
  override val occurrenceTime: Long,
) : TraceEvent {
  override val eventType: String = EVENT_TYPE

  companion object {
    const val EVENT_TYPE = "ThroughputMonitoringTraceEvent"
  }
}