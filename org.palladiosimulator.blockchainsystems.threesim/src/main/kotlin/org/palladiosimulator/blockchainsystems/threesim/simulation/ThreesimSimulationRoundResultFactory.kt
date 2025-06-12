package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.CensorshipResistanceCalculator
import org.palladiosimulator.blockchainsystems.threesim.monitoring.ThreesimSimulationMonitor
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.GeographicalDiversityCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.ShannonEntropyCalculator

class ThreesimSimulationRoundResultFactory(
  private val monitor: ThreesimSimulationMonitor
) {
  fun createSimulationRoundResult(): ThreesimSimulationRoundResult {
    monitor.state?.let { state ->
      return ThreesimSimulationRoundResult(
        outputMetrics = listOf(

          GeographicalDiversityCalculator(
            numberOfNodes = state.nodes.size,
            numberOfRegions = state.geographicalRegions.getNumberOfRegions(),
            numberOfNodesPerRegion = state.nodes
              .groupingBy { it.geographicalRegion.region }
              .eachCount().values
          ).calculate(),

          ShannonEntropyCalculator(
            k = 1.0, // TODO: Make k configurable
            totalBlocksProposedPerNode = state.blocksProposedPerNode.getValues()
          ).calculate(),

          CensorshipResistanceCalculator(
            state.nodes.map { it.resourcePower }
          ).calculate()

          // TODO: Implement other metrics

        )
      )
    }

    throw IllegalStateException("Simulation monitor state is not initialized.")
  }
}