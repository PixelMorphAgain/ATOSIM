package org.palladiosimulator.blockchainsystems.core.simulation.abstractions;

import org.palladiosimulator.blockchainsystems.core.clock.SimulationClock
import org.palladiosimulator.blockchainsystems.core.common.SimulationContextImpl
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystem
import org.palladiosimulator.blockchainsystems.core.tracing.TraceEventLogOutput
import org.palladiosimulator.blockchainsystems.core.eventcoordination.EventCoordinatorImpl
import org.palladiosimulator.blockchainsystems.core.monitoring.abstractions.SimulationMonitor
import org.palladiosimulator.blockchainsystems.core.tracing.TraceEventLoggerContainerImpl

/**
 * Represents a single round of simulation.
 * This class serves as a base for more specific simulation rounds.
 *
 * @author Davis Riedel
 */
abstract class SimulationRound<R : SimulationRoundResult>(
  protected val blockchainSystem: BlockchainSystem,
  protected val logOutputs: Set<TraceEventLogOutput>
) {
  protected abstract val monitor: SimulationMonitor

  protected val clock = SimulationClock()
  protected val eventCoordinator = EventCoordinatorImpl(
    clock,
    monitor
  )
  protected val traceEventLoggerContainer = TraceEventLoggerContainerImpl()

  protected val context = SimulationContextImpl(
    eventCoordinator,
    clock,
    traceEventLoggerContainer,
  )

  init {
    // Set up trace event subscribers
    traceEventLoggerContainer.addSubscriber(monitor)
    logOutputs.forEach { traceEventLoggerContainer.addSubscriber(it) }
  }


  fun run(): R {
    // Initialization
    logOutputs.forEach { it.initialize() }
    monitor.initializeNodes(blockchainSystem.nodes)
    blockchainSystem.initialize(context)

    // Start processing events - processing will stop if termination condition is met
    eventCoordinator.processEvents()

    // Clean up log outputs
    logOutputs.forEach { it.cleanUp() }

    return createSimulationRoundResult()
  }

  abstract fun createSimulationRoundResult(): R
}
