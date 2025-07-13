package org.palladiosimulator.blockchainsystems.threesim.monitoring

import org.palladiosimulator.blockchainsystems.core.common.BlockchainSimulationObject
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.AverageThroughputCalculator

class ThroughputMonitoringProcess(
  id: String,
  name: String,
  private val throughputMeasurementInterval: Long
) : BlockchainSimulationObject(id, name) {

  override fun dispatchEvent(event: Event) {
    if (event.eventType == ThroughputMonitoringEvent.EVENT_TYPE) {
      if (!traceEventLogger.isEventTypeEnabled(ThroughputMonitoringTraceEvent.EVENT_TYPE)) return

      traceEventLogger.logEvent(
        ThroughputMonitoringTraceEvent(
          occurrenceTime = event.occurrenceTime
        )
      )

      scheduleNewThroughputMonitoringEvent()
    }
  }

  private fun scheduleNewThroughputMonitoringEvent() {
    simulationContext.eventCoordinator
      .raiseEvent(
        ThroughputMonitoringEvent(
          simulationContext.time + throughputMeasurementInterval,
          this
        )
      )
  }
}