package org.palladiosimulator.blockchainsystems.threesim.creation.explicitnetwork

import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ExplicitNetworkTopology
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystem
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkCreationResult
import org.palladiosimulator.blockchainsystems.core.system.abstractions.ResourcePowerCalculator
import org.palladiosimulator.blockchainsystems.threesim.creation.ThreesimBlockchainSystemFactory
import org.palladiosimulator.blockchainsystems.threesim.creation.abstractions.NodeAllocationResolver
import org.palladiosimulator.blockchainsystems.bscm.blockchainsystem.BlockchainSystem as DesignBlockchainSystem

/**
 * Factory for creating a [BlockchainSystem] based on an [ExplicitNetworkTopology].
 *
 * @author Yannik Sproll, Davis Riedel
 */
class ExplicitNetworkBlockchainSystemFactory(
  designBlockchainSystem: DesignBlockchainSystem,
  explicitTopology: ExplicitNetworkTopology
) : ThreesimBlockchainSystemFactory(designBlockchainSystem, explicitTopology) {
  override val networkFactory = ExplicitTopologyP2PNetworkFactory(explicitTopology)

  override fun getNodeAllocationResolver(networkCreationResult: P2PNetworkCreationResult): NodeAllocationResolver {
    return ExplicitNetworkNodeAllocationResolver(networkTopology)
  }

  override fun getResourcePowerCalculator(networkCreationResult: P2PNetworkCreationResult): ResourcePowerCalculator {
    return ExplicitNetworkResourcePowerCalculator(networkTopology)
  }
}