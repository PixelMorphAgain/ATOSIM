package org.palladiosimulator.blockchainsystems.core.system

import org.palladiosimulator.blockchainsystems.core.common.BlockchainSimulationObject
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
import org.palladiosimulator.blockchainsystems.core.geography.GeographicalRegions
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetwork

/**
 * The [BlockchainSystem] class represents a blockchain system,
 * consisting of a set of blockchain system nodes and a P2P network.
 *
 * @author Yannik Sproll, Davis Riedel
 */
class BlockchainSystem(
  id: String,
  name: String,
  val network: P2PNetwork,
  val geographicalRegions: GeographicalRegions,
  val nodes: HashSet<BlockchainSystemNode>,
  val numberOfRequiredSecurityConfirmations: Int
) : BlockchainSimulationObject(id, name) {
  public override fun onInitialize() {
    network.initialize(simulationContext)
    nodes.forEach { it.initialize(simulationContext) }
  }

  public override fun onCleanup() {
    network.cleanup()
    nodes.forEach { it.cleanup() }
  }

  override fun dispatchEvent(event: Event) {
  }
}