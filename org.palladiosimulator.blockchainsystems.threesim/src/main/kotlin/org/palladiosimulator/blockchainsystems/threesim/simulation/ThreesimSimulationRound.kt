package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationRound
import org.palladiosimulator.blockchainsystems.core.simulation.termination.LongestChainExceededMaxLengthCondition
import org.palladiosimulator.blockchainsystems.core.tracing.TraceEventLogOutput
import org.palladiosimulator.blockchainsystems.threesim.creation.ThreesimBlockchainSystemFactory
import org.palladiosimulator.blockchainsystems.threesim.monitoring.ThreesimSimulationMonitor
import org.palladiosimulator.blockchainsystems.threesim.monitoring.ThroughputMonitoringProcess
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
  blockchainSystemFactory.createBlockchainSystem(),
  logOutputs,
  monitor = ThreesimSimulationMonitor(
    LongestChainExceededMaxLengthCondition(
      maxAllowedBlockchainLength
    ),
    threesimSimulationParameters.throughputMonitoringInterval,
    threesimSimulationParameters.failureThroughputThreshold
  )
) {
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

  override fun createSimulationRoundResult(finalSystemTime: Long): ThreesimSimulationRoundResult {
    return ThreesimSimulationRoundResultFactory(
      threesimSimulationParameters,
      monitor,
      finalSystemTime
    ).createSimulationRoundResult()
  }

}
