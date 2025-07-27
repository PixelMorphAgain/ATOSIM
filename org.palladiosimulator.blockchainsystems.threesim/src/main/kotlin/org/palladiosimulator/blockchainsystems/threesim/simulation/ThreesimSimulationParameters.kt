package org.palladiosimulator.blockchainsystems.threesim.simulation

/**
 * Configurable parameters for the 3SIM simulation.
 *
 * @author Davis Riedel
 */
data class ThreesimSimulationParameters(
  val throughputMonitoringInterval: Long,
  val failureThroughputThreshold: Double,
  val shannonEntropyK: Double,
  val nakamotoCoefficientThreshold: Double,
  val reliabilityObservationTimespan: Long
)