package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.threesim.monitoring.ThreesimSimulationMonitor
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.GeographicalDiversityCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.ShannonEntropyCalculator

class ThreesimSimulationRoundResultFactory(
  private val monitor: ThreesimSimulationMonitor
) {
  fun createSimulationRoundResult(): ThreesimSimulationRoundResult {
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
        ).calculate(),

        ShannonEntropyCalculator(
          k = 1.0, // TODO: Make k configurable
          totalBlocksProposedPerNode = monitor.blocksProposedPerNode.getValues()
        ).calculate()

        // TODO: Implement other metrics

      )
    )
  }
}