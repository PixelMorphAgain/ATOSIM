package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.AvailabilityScalabilityCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.CensorshipResistanceCalculator
import org.palladiosimulator.blockchainsystems.threesim.monitoring.ThreesimSimulationMonitor
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.GeographicalDiversityCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.ShannonEntropyCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.utils.OutputMetricsSet
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.AverageConfirmationLatencyCalculator

/**
 * Factory for creating a [ThreesimSimulationRoundResult] based on the current state of the simulation.
 *
 * @author Davis Riedel
 */
class ThreesimSimulationRoundResultFactory(
  private val monitor: ThreesimSimulationMonitor
) {
  fun createSimulationRoundResult(): ThreesimSimulationRoundResult {

    // TODO: We have an output set for each node!!! Change this!!!

    return ThreesimSimulationRoundResult(
      outputMetrics = OutputMetricsSet.from(

        GeographicalDiversityCalculator(
          numberOfNodes = monitor.nodes.size,
          numberOfRegions = monitor.geographicalRegions?.getNumberOfRegions() ?: 0,
          numberOfNodesPerRegion = monitor.nodes
            .groupingBy { it.geographicalRegion.region }
            .eachCount().values
        ).calculate(),

        ShannonEntropyCalculator(
          k = 1.0, // TODO: Make k configurable
          totalBlocksProposedPerNode = monitor.nodeTerminationStates.values.map { it.blocksProposedByNode }
        ).calculate(),

        CensorshipResistanceCalculator(
          hashPowerPerNode = monitor.nodes.map { it.resourcePower }
        ).calculate(),

        AvailabilityScalabilityCalculator(
          observationTime = 0, // TODO: Get the actual observation time from the simulation state
          // TODO: We are only considering the first node. The chain that most nodes agree upon should be used!!!
          numberOfConfirmedTransactions = monitor.nodeTerminationStates.values.firstOrNull()
            ?.calculateNumberOfConfirmedTransactions() ?: 0,
          numberOfTransactions = monitor.numberOfSubmittedTransactions
        ).calculate(),

        AverageConfirmationLatencyCalculator(
          // TODO: We are calculating the average for all nodes now. Maybe some metrics should be output per node?
          monitor.nodeTerminationStates.values.flatMap { it.calculateTransactionConfirmationDurations().values },
        ).calculate(),

        // TODO: Implement other metrics

      )
    )
  }
}