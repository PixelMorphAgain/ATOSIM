package org.palladiosimulator.blockchainsystems.threesim.monitoring

import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
import org.palladiosimulator.blockchainsystems.core.common.abstractions.EventDispatchable
import org.palladiosimulator.blockchainsystems.core.common.abstractions.SimulationContext
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLogOrigin
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Traceable

class MonitoringProcess : EventDispatchable, Traceable {
  override fun dispatchEvent(event: Event) {
    if (event.eventType == ThroughputMonitoringEvent.EVENT_TYPE) {
      // TODO: Handle measurement

      scheduleNewThroughputMonitoringEvent()
    }
  }

  override fun initializeLogger(logOrigin: TraceEventLogOrigin?) {
    TODO("Not yet implemented")
  }

  override fun initialize(simulationContext: SimulationContext?) {
    TODO("Not yet implemented")
  }

  override fun cleanup() {
    TODO("Not yet implemented")
  }

  private fun scheduleNewThroughputMonitoringEvent() {
    TODO()
  }
}