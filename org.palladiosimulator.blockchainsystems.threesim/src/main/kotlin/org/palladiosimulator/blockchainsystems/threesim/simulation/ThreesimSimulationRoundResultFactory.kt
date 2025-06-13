package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.threesim.metrics.AvailabilityScalability
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.AvailabilityScalabilityCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.CensorshipResistanceCalculator
import org.palladiosimulator.blockchainsystems.threesim.monitoring.ThreesimSimulationMonitor
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.GeographicalDiversityCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.ShannonEntropyCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.utils.OutputMetricsSet
import kotlin.time.Duration

class ThreesimSimulationRoundResultFactory(
  private val monitor: ThreesimSimulationMonitor
) {
  fun createSimulationRoundResult(): ThreesimSimulationRoundResult {
    val state = monitor.getFinalState()

    return ThreesimSimulationRoundResult(
      outputMetrics = OutputMetricsSet.from(

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
          hashPowerPerNode = state.nodes.map { it.resourcePower }
        ).calculate(),

        AvailabilityScalabilityCalculator(
          observationTime = Duration.ZERO, // TODO: Get the actual observation time from the simulation state
          numberOfConfirmedTransactions = state.numberOfConfirmedTransactions,
          numberOfTransactions = state.numberOfSubmittedTransactions
        ).calculate()

        // TODO: Implement other metrics

      )
    )
  }
}