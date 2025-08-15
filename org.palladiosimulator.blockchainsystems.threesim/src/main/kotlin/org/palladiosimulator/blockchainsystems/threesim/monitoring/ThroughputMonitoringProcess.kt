package org.palladiosimulator.blockchainsystems.threesim.monitoring

import org.palladiosimulator.blockchainsystems.core.common.BlockchainSimulationObject
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
import org.palladiosimulator.blockchainsystems.core.common.abstractions.SimulationContext

/**
 * Monitors the throughput of the blockchain system by periodically raising a trace event
 *
 * @param id unique identifier of the process
 * @param name name of the process
 * @property throughputMonitoringInterval the interval in milliseconds at which the throughput is measured
 *
 * @author Davis Riedel
 */
class ThroughputMonitoringProcess(
  id: String,
  name: String,
  private val throughputMonitoringInterval: Long
) : BlockchainSimulationObject(id, name) {

  private var isActive = false

  fun startMonitoring() {
    if (isActive) return
    isActive = true

    // Schedule the first throughput monitoring event
    scheduleNewThroughputMonitoringEvent()
  }

  fun stopMonitoring() {
    if (!isActive) return
    isActive = false

    // Cancel any pending throughput monitoring events
    cancelPendingEvent()
  }

  override fun initialize(simulationContext: SimulationContext) {
    super.initialize(simulationContext)
    startMonitoring()
  }

  override fun cleanup() {
    stopMonitoring()
    super.cleanup()
  }

  private fun cancelPendingEvent() {
    simulationContext.eventCoordinator
      .cancelEventsFor(this)
  }

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
          simulationContext.systemClock.currentTime + throughputMonitoringInterval,
          this
        )
      )
  }
}