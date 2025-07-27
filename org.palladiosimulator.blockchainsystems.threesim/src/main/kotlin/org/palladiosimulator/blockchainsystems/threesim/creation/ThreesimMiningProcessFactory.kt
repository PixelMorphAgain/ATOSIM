package org.palladiosimulator.blockchainsystems.threesim.creation

import org.palladiosimulator.blockchainsystems.bscm.blockchainsystem.BlockchainSystemSpecification
import org.palladiosimulator.blockchainsystems.bscm.blockchainsystemComponentRepository.MiningProcessComponent
import org.palladiosimulator.blockchainsystems.core.mining.MiningProcessImpl
import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcess
import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcessFactory
import org.palladiosimulator.blockchainsystems.core.system.abstractions.ResourcePowerCalculator
import org.palladiosimulator.blockchainsystems.threesim.creation.abstractions.NodeAllocationResolver
import java.util.random.RandomGenerator


/**
 * Factory for creating a [MiningProcess] for a blockchain node in 3SIM.
 *
 * @author Davis Riedel
 */
class ThreesimMiningProcessFactory(
  private val blockchainSystemSpecification: BlockchainSystemSpecification,
  private val resourcePowerCalculator: ResourcePowerCalculator,
  private val nodeAllocationResolver: NodeAllocationResolver
) : MiningProcessFactory {
  override fun createMiningProcess(nodeId: String): MiningProcess {
    val nodeResourcePower = nodeAllocationResolver
      .getNodeAllocation(nodeId)
      ?.allocationContexts
      ?.filter { it.assemblyContext.encapsulatedComponent is MiningProcessComponent }
      ?.sumOf { it.resourceContainer.resourcePower }
      ?: throw IllegalArgumentException("No resource power found for node with ID: $nodeId")

    val nodeResourcePowerShare = nodeResourcePower / resourcePowerCalculator.calculateGlobalResourcePower()

    val globalAverageBlockArrivalTime = blockchainSystemSpecification.meanBlockTime
    val nodeAverageBlockArrivalTime = globalAverageBlockArrivalTime / nodeResourcePowerShare

    return MiningProcessImpl(
      nodeAverageBlockArrivalTime,
      RandomGenerator.of("Random")
    )
  }
}
