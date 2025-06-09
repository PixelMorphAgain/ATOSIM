package org.palladiosimulator.blockchainsystems.core.simulation.abstractions

import org.palladiosimulator.blockchainsystems.core.monitoring.abstractions.SimulationMonitor

interface SimulationRoundResultFromSimulationMonitor<M : SimulationMonitor> {
  fun fromSimulationMonitor(monitor: M): SimulationRoundResult
}