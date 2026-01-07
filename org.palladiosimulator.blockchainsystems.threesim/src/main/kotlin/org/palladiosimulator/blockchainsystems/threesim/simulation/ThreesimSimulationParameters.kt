package org.palladiosimulator.blockchainsystems.threesim.simulation

import kotlinx.serialization.Serializable

/**
 * Configurable parameters for the 3SIM simulation.
 *
 * @author Davis Riedel
 */
@Serializable
class ThreesimSimulationParameters(
  val failureThroughputThreshold: Double, // trx / s
  val shannonEntropyK: Double, // 0.0..1.0
  val nakamotoCoefficientThreshold: Double, // 0.0 .. 100.0 %
  val reliabilityObservationTimespan: Double, // hours

  //Attack Parameters
  val attackType: AttackType = AttackType.NONE,

  //ID of attacker nodes
  val attackerNodeIds: Set<String> = emptySet<String>(),

  //Attacker hash power share
  val attackerHashPower: Double = 0.0, //0.0 .. 1.0

  //Gamma parameter for selfish/stubborn mining
  val gamma: Double = 0.0 // 0.0 .. 1.0
)