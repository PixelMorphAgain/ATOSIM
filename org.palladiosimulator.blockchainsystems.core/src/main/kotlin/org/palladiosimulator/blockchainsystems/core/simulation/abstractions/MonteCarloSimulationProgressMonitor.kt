package org.palladiosimulator.blockchainsystems.core.simulation.abstractions

interface MonteCarloSimulationProgressMonitor {
  fun onSimulationStarted(numberOfSimulationRounds: Long)

  fun onSimulationRoundFinished()

  fun onSimulationFinished()
}