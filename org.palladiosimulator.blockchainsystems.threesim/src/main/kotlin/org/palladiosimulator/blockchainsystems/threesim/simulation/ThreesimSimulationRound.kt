package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationRound
import org.palladiosimulator.blockchainsystems.core.simulation.termination.LongestChainExceededMaxLengthCondition
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystem
import org.palladiosimulator.blockchainsystems.core.tracing.TraceEventLogOutput
import org.palladiosimulator.blockchainsystems.threesim.monitoring.ThreesimSimulationMonitor

/**
 * Single simulation round of 3SIM.
 *
 * @author Davis Riedel
 */
class ThreesimSimulationRound(
  blockchainSystem: BlockchainSystem,
  logOutputs: Set<TraceEventLogOutput>,
  val maxAllowedBlockchainLength: Long,
  val numberOfRequiredSecurityConfirmations: Int
) : SimulationRound<ThreesimSimulationRoundResult>(blockchainSystem, logOutputs) {
  override val monitor = ThreesimSimulationMonitor(
    LongestChainExceededMaxLengthCondition(
      maxAllowedBlockchainLength
    ),
    numberOfRequiredSecurityConfirmations
  )

  override fun createSimulationRoundResult(finalSystemTime: Long): ThreesimSimulationRoundResult {
    return ThreesimSimulationRoundResultFactory(
      monitor, finalSystemTime
    ).createSimulationRoundResult()
  }
}
