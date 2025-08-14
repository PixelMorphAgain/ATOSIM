package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationRound
import org.palladiosimulator.blockchainsystems.core.simulation.termination.LongestChainExceededMaxLengthCondition
import org.palladiosimulator.blockchainsystems.core.tracing.TraceEventLogOutput
import org.palladiosimulator.blockchainsystems.threesim.creation.ThreesimBlockchainSystemFactory
import org.palladiosimulator.blockchainsystems.threesim.monitoring.ThreesimSimulationMonitor
import org.palladiosimulator.blockchainsystems.threesim.monitoring.ThroughputMonitoringProcess
import org.palladiosimulator.blockchainsystems.threesim.simulation.results.ThreesimNoFailuresPartialSimulationRoundResult
import org.palladiosimulator.blockchainsystems.threesim.simulation.results.ThreesimSimulationRoundResult
import org.palladiosimulator.blockchainsystems.threesim.simulation.results.ThreesimSimulationRoundResultFactory
import java.util.UUID

/**
 * Single simulation round of 3SIM.
 *
 * @author Davis Riedel
 */
class ThreesimSimulationRound(
  private val blockchainSystemFactory: ThreesimBlockchainSystemFactory,
  logOutputs: Set<TraceEventLogOutput>,
  private val maxAllowedBlockchainLength: Long,
  private val threesimSimulationParameters: ThreesimSimulationParameters,
) : SimulationRound<ThreesimSimulationMonitor, ThreesimSimulationRoundResult>(
  blockchainSystemFactory.createBlockchainSystem(true),
  logOutputs,
  monitor = ThreesimSimulationMonitor(
    LongestChainExceededMaxLengthCondition(
      maxAllowedBlockchainLength
    ),
    threesimSimulationParameters.throughputMonitoringInterval,
    threesimSimulationParameters.failureThroughputThreshold
  )
) {

  private lateinit var noFailuresPartialSimulationRoundResult: ThreesimNoFailuresPartialSimulationRoundResult

  private val throughputMonitoringProcess = ThroughputMonitoringProcess(
    UUID.randomUUID().toString(),
    "Throughput monitoring process",
    threesimSimulationParameters.throughputMonitoringInterval
  )

  override fun initialize() {
    super.initialize()
    throughputMonitoringProcess.initialize(context)
  }

  override fun cleanup() {
    throughputMonitoringProcess.cleanup()
    super.cleanup()
  }

  override fun run(): ThreesimSimulationRoundResult {
    // First run a round without any node or link failures
    // to gather the best case throughput and confirmation latency
    noFailuresPartialSimulationRoundResult = ThreesimNoFailuresPartialSimulationRound(
      // Create a new blockchain system without failures
      blockchainSystemFactory.createBlockchainSystem(false),
      logOutputs,
      maxAllowedBlockchainLength,
      threesimSimulationParameters
    ).run()

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
