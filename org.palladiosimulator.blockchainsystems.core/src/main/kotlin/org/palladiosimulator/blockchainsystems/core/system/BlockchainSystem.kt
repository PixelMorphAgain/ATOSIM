package org.palladiosimulator.blockchainsystems.core.system

import org.palladiosimulator.blockchainsystems.core.common.BlockchainSimulationObject
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetwork
import java.util.Collections

/**
 * The [BlockchainSystem] class represents a blockchain system,
 * consisting of a set of blockchain system nodes and a P2P network.
 *
 * @author Yannik Sproll
 */
class BlockchainSystem(
  id: String,
  name: String,
  private val network: P2PNetwork,
  private val systemNodes: HashSet<BlockchainSystemNode>
) : BlockchainSimulationObject(id, name) {
  val nodes: MutableSet<BlockchainSystemNode>
    get() = Collections.unmodifiableSet(systemNodes)

  public override fun onInitialize() {
    network.initialize(simulationContext)
    systemNodes.forEach { it.initialize(simulationContext) }
  }

  public override fun onCleanup() {
    network.cleanup()
    systemNodes.forEach { it.cleanup() }
  }

  override fun dispatchEvent(event: Event) {
  }
}