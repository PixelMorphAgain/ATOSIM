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
  private val threesimSimulationParameters: ThreesimSimulationParameters,
  private val monitor: ThreesimSimulationMonitor,
  private val finalSystemTime: Long,
) {
  fun createSimulationRoundResult(): ThreesimSimulationRoundResult {

    val state = monitor.getFinalState(finalSystemTime)

    return ThreesimSimulationRoundResult(
      outputMetrics = OutputMetricsSet.from(

        ShannonEntropyCalculator(
          k = threesimSimulationParameters.shannonEntropyK,
          blocksProposedPerNode = state.blocksProposedPerNode
        ),

        GeographicalDiversityCalculator(
          numberOfNodes = state.numberOfNodes,
          numberOfRegions = state.numberOfGeographicalRegions,
          numberOfNodesPerRegion = state.numberOfNodesPerRegion
        ),

        NakamotoCoefficientCalculator(
          state.hashPowerPerNode,
          threshold = threesimSimulationParameters.nakamotoCoefficientThreshold
        ),

        HerfindahlHirschmanIndexCalculator(
          tokensHeldPerNode = state.tokensHeldPerNode
        ),

        GiniCoefficientCalculator(
          tokensHeldPerNode = state.tokensHeldPerNode
        ),

        AvailabilityScalabilityCalculator(
          observationTime = finalSystemTime,
          numberOfConfirmedTransactions = state.numberOfConfirmedTransactions,
          numberOfTransactions = state.numberOfSubmittedTransactions
        ),

        AverageConfirmationLatencyCalculator(
          state.transactionConfirmationDurations
        ),

        AverageThroughputCalculator(
          numberOfConfirmedTransactions = state.numberOfConfirmedTransactions,
          observationTime = finalSystemTime
        ),

        AvailabilitySecurityCalculator(
          meanTimeToFailure = state.meanTimeBetweenFailures,
          meanTimeToRepair = state.meanTimeToRepair
        ),

        ConsistencyCalculator(
          blockProposalTimeAndConfirmationTimePerConfirmedBlock = state.blockProposalTimeAndConfirmationTimePerConfirmedBlock
        ),

//        FaultToleranceCalculator(TODO()),

        ReliabilityCalculator(
          timespan = threesimSimulationParameters.reliabilityObservationTimespan,
          meanTimeBetweenFailures = state.meanTimeBetweenFailures
        ),

        StaleBlockRateCalculator(
          numberOfStaleBlocks = state.numberOfStaleBlocks,
          numberOfConfirmedBlocks = state.numberOfConfirmedBlocks
        )

        // Cost of Attack (skipped) and Censorship Resistance (no longer part of the paper) not implemented
      )
    )
  }
}