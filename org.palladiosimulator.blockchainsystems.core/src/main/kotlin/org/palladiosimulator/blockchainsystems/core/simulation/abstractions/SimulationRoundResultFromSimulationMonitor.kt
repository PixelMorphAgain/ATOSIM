package org.palladiosimulator.blockchainsystems.core.simulation.abstractions

import org.palladiosimulator.blockchainsystems.core.monitoring.abstractions.SimulationMonitor

interface SimulationRoundResultFromSimulationMonitor {
  fun fromSimulationMonitor(monitor: SimulationMonitor): SimulationRoundResult
}