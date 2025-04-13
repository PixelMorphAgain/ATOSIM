package org.palladiosimulator.blockchainsystems.trilemma.simulation

interface MonteCarloSimulationProgressMonitor {
  fun onSimulationStarted(numberOfSimulationRounds: Long)

  fun onSimulationRoundFinished()

  fun onSimulationFinished()
}