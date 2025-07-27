package org.palladiosimulator.blockchainsystems.threesim.monitoring

import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
import org.palladiosimulator.blockchainsystems.core.common.abstractions.EventDispatchable

data class ThroughputMonitoringEvent(
  private val occurrenceTime: Long,
  private val target: EventDispatchable,
) : Event {
  override fun getOccurrenceTime(): Long {
    return occurrenceTime
  }

  override fun getEventType(): String {
    return EVENT_TYPE
  }

  override fun getOrigin(): EventDispatchable {
    return target
  }

  override fun getValueFormatted(): String {
    return this.toString()
  }

  companion object {
    const val EVENT_TYPE = "ThroughputMonitoringEvent"
  }
}