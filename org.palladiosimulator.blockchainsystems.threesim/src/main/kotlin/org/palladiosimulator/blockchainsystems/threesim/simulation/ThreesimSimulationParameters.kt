package org.palladiosimulator.blockchainsystems.threesim.simulation

data class ThreesimSimulationParameters(
  val numberOfRequiredSecurityConfirmations: Int,
  val shannonEntropyK: Double,
  val nakamotoCoefficientThreshold: Double,
  val reliabilityObservationTimespan: Long
)