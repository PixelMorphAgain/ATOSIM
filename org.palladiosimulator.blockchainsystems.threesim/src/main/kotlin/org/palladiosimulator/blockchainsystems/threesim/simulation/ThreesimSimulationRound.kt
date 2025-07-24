package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationRound
import org.palladiosimulator.blockchainsystems.core.simulation.termination.LongestChainExceededMaxLengthCondition
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystem
import org.palladiosimulator.blockchainsystems.core.tracing.TraceEventLogOutput
import org.palladiosimulator.blockchainsystems.threesim.monitoring.ThreesimSimulationMonitor
import org.palladiosimulator.blockchainsystems.threesim.simulation.results.ThreesimSimulationRoundResult
import org.palladiosimulator.blockchainsystems.threesim.simulation.results.ThreesimSimulationRoundResultFactory

/**
 * Single simulation round of 3SIM.
 *
 * @author Davis Riedel
 */
class ThreesimSimulationRound(
  blockchainSystem: BlockchainSystem,
  logOutputs: Set<TraceEventLogOutput>,
  maxAllowedBlockchainLength: Long,
  val threesimSimulationParameters: ThreesimSimulationParameters
) : SimulationRound<ThreesimSimulationRoundResult>(blockchainSystem, logOutputs) {
  override val monitor = ThreesimSimulationMonitor(
    LongestChainExceededMaxLengthCondition(
      maxAllowedBlockchainLength
    ),
    threesimSimulationParameters.throughputMonitoringInterval,
    threesimSimulationParameters.failureThroughputThreshold
  )

  override fun createSimulationRoundResult(finalSystemTime: Long): ThreesimSimulationRoundResult {
    return ThreesimSimulationRoundResultFactory(
      threesimSimulationParameters,
      monitor,
      finalSystemTime
    ).createSimulationRoundResult()
  }
}
