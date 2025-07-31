package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationRound
import org.palladiosimulator.blockchainsystems.core.simulation.termination.LongestChainExceededMaxLengthCondition
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystem
import org.palladiosimulator.blockchainsystems.core.tracing.TraceEventLogOutput
import org.palladiosimulator.blockchainsystems.threesim.monitoring.ThreesimSimulationMonitor
import org.palladiosimulator.blockchainsystems.threesim.simulation.results.ThreesimNoFailuresPartialSimulationRoundResult
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
  private val maxAllowedBlockchainLength: Long,
  private val threesimSimulationParameters: ThreesimSimulationParameters
) : SimulationRound<ThreesimSimulationRoundResult>(blockchainSystem, logOutputs) {

  private lateinit var noFailuresPartialSimulationRoundResult: ThreesimNoFailuresPartialSimulationRoundResult

  override val monitor = ThreesimSimulationMonitor(
    LongestChainExceededMaxLengthCondition(
      maxAllowedBlockchainLength
    ),
    threesimSimulationParameters.throughputMonitoringInterval,
    threesimSimulationParameters.failureThroughputThreshold
  )

  override fun run(): ThreesimSimulationRoundResult {
    // First run a round without any node or link failures
    // to gather the best case throughput and confirmation latency
    noFailuresPartialSimulationRoundResult = ThreesimNoFailuresPartialSimulationRound(
      blockchainSystem,
      logOutputs,
      maxAllowedBlockchainLength,
      threesimSimulationParameters
    ).run()

    // Reset the blockchain system for the actual simulation round
    blockchainSystem.cleanup()

    // Run the actual simulation round
    return super.run()
  }

  override fun createSimulationRoundResult(finalSystemTime: Long): ThreesimSimulationRoundResult {
    return ThreesimSimulationRoundResultFactory(
      threesimSimulationParameters,
      monitor,
      finalSystemTime,
      noFailuresPartialSimulationRoundResult
    ).createSimulationRoundResult()
  }
}
