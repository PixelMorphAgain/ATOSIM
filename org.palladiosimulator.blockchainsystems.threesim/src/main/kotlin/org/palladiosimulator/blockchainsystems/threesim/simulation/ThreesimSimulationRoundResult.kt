package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationRoundResult
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationRoundResultFromSimulationMonitor
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.GeographicalDiversityCalculator
import org.palladiosimulator.blockchainsystems.threesim.monitoring.ThreesimSimulationMonitor

/**
 * Result of a single simulation round of 3SIM.
 *
 * @author Davis Riedel
 */
class ThreesimSimulationRoundResult(
  val outputMetrics: List<OutputMetric<Any>>,
) : SimulationRoundResult,
  SimulationRoundResultFromSimulationMonitor<ThreesimSimulationMonitor> by ThreesimSimulationRoundResult {

  companion object : SimulationRoundResultFromSimulationMonitor<ThreesimSimulationMonitor> {
    override fun fromSimulationMonitor(monitor: ThreesimSimulationMonitor): ThreesimSimulationRoundResult {
      val blockchainSystem = monitor.blockchainSystem
        ?: throw IllegalStateException("Blockchain system was not initialized in the simulation monitor.")

      return ThreesimSimulationRoundResult(
        outputMetrics = listOf(

          GeographicalDiversityCalculator(
            numberOfNodes = blockchainSystem.nodes.size,
            numberOfRegions = blockchainSystem.geographicalRegions.getNumberOfRegions(),
            numberOfNodesPerRegion = blockchainSystem.nodes
              .groupingBy { it.geographicalRegion.region }
              .eachCount().values
          ).calculate()

          // TODO: Implement other metrics

        )
      )
    }
  }

}
