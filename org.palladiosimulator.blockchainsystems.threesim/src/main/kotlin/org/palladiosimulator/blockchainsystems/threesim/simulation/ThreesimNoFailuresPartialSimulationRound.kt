package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationRound
import org.palladiosimulator.blockchainsystems.core.simulation.termination.LongestChainExceededMaxLengthCondition
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystem
import org.palladiosimulator.blockchainsystems.core.tracing.TraceEventLogOutput
import org.palladiosimulator.blockchainsystems.threesim.monitoring.ThreesimSimulationMonitor
import org.palladiosimulator.blockchainsystems.threesim.simulation.results.ThreesimNoFailuresPartialSimulationRoundResult
import org.palladiosimulator.blockchainsystems.threesim.simulation.results.ThreesimNoFailuresPartialSimulationRoundResultFactory

/**
 * To calculate the fault tolerance, we need to know the confirmation latency and throughput of
 * the system in the absence of any (node or link) failures. Therefore, before each simulation round
 * a round without any failures is executed to gather these metrics. This class implements such a round.
 *
 * @author Davis Riedel
 */
class ThreesimNoFailuresPartialSimulationRound(
  blockchainSystem: BlockchainSystem,
  logOutputs: Set<TraceEventLogOutput>,
  maxAllowedBlockchainLength: Long,
  threesimSimulationParameters: ThreesimSimulationParameters
) : SimulationRound<ThreesimSimulationMonitor, ThreesimNoFailuresPartialSimulationRoundResult>(
  blockchainSystem,
  logOutputs,
  monitor = ThreesimSimulationMonitor(
    LongestChainExceededMaxLengthCondition(
      maxAllowedBlockchainLength
    ),
    threesimSimulationParameters.throughputMonitoringInterval,
    threesimSimulationParameters.failureThroughputThreshold
  )
) {
  override fun createSimulationRoundResult(finalSystemTime: Long): ThreesimNoFailuresPartialSimulationRoundResult {
    return ThreesimNoFailuresPartialSimulationRoundResultFactory(
      monitor,
      finalSystemTime
    ).createSimulationRoundResult()
  }
}