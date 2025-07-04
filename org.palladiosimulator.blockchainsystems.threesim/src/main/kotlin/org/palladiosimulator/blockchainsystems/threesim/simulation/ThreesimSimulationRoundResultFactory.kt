package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.*
import org.palladiosimulator.blockchainsystems.threesim.monitoring.ThreesimSimulationMonitor
import org.palladiosimulator.blockchainsystems.threesim.metrics.utils.OutputMetricsSet

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

    // TODO: We are only considering the first node. The chain that most nodes agree upon should be used!!!
    val numberOfConfirmedTransactions = monitor.nodeTerminationStates.values.firstOrNull()
      ?.calculateNumberOfConfirmedTransactions() ?: 0

    val observationTime = 0 // TODO: Get the actual observation time from the simulation state

    return ThreesimSimulationRoundResult(
      outputMetrics = OutputMetricsSet.from(

        ShannonEntropyCalculator(
          k = 1.0, // TODO: Make k configurable
          blocksProposedPerNode = monitor.nodeTerminationStates.values.map { it.blocksProposedByNode }
        ),

        GeographicalDiversityCalculator(
          numberOfNodes = monitor.nodes.size,
          numberOfRegions = monitor.geographicalRegions?.getNumberOfRegions() ?: 0,
          numberOfNodesPerRegion = monitor.nodes
            .groupingBy { it.geographicalRegion.region }
            .eachCount().values
        ),

        NakamotoCoefficientCalculator(
          monitor.nodes.map { it.resourcePower },
          threshold = 0.51 // TODO: Make threshold configurable
        ),

        HerfindahlHirschmanIndexCalculator(

        ),

        GiniCoefficientCalculator(

        ),

        AvailabilityScalabilityCalculator(
          observationTime = observationTime,
          numberOfConfirmedTransactions = numberOfConfirmedTransactions,
          numberOfTransactions = monitor.numberOfSubmittedTransactions
        ),

        AverageConfirmationLatencyCalculator(
          // TODO: We are calculating the average for all nodes now. Maybe some metrics should be output per node?
          monitor.nodeTerminationStates.values.flatMap { it.calculateTransactionConfirmationDurations().values },
        ),

        AverageThroughputCalculator(
          numberOfConfirmedTransactions = numberOfConfirmedTransactions,
          observationTime = observationTime
        ),


        AvailabilitySecurityCalculator(

        ),

        ConsistencyCalculator(
          // TODO: Implement
          blockConfirmationTimePerConfirmedBlock = listOf(),
          blockProposalTimePerConfirmedBlock = listOf(),
        ),

        CensorshipResistanceCalculator(
          hashPowerPerNode = monitor.nodes.map { it.resourcePower }
        ),


        StaleBlockRateCalculator(

        )

        // TODO Implement other metrics

      )
    )
  }
}