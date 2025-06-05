package org.palladiosimulator.blockchainsystems.core.system

import org.palladiosimulator.blockchainsystems.core.geography.GeographicalRegionsResolver
import org.palladiosimulator.blockchainsystems.core.system.abstractions.*


/**
 * Factory for creating instances of [BlockchainSystemNode].
 *
 * @author Yannik Sproll, Davis Riedel
 */
class BlockchainSystemNodeFactory(
  private val blockFactory: BlockFactory,
  private val blockchainFactory: BlockchainFactory,
  private val miningProcessFactory: MiningProcessFactory,
  private val blockValidatorFactory: BlockValidatorFactory,
  private val blockPropagationStrategyFactory: PropagationStrategyFactory<Block>,
  private val transactionPropagationStrategyFactory: PropagationStrategyFactory<Transaction>,
  private val orphanBlockPoolFactory: OrphanBlockPoolFactory,
  private val behaviorFactory: BlockchainSystemNodeBehaviorFactory,
  private val geographicalRegionsResolver: GeographicalRegionsResolver,
  private val tagProvider: BlockchainSystemNodeTagProvider
) {
  fun createBlockchainSystemNode(
    networkInterface: NodeP2PNetworkInterface,
    genesisBlock: Block
  ): BlockchainSystemNode {
    val nodeId = networkInterface.getEndpointId()
    return BlockchainSystemNode(
      nodeId,
      "BlockchainSystemNode_$nodeId",
      blockPropagationStrategyFactory.createPropagationStrategy(),
      transactionPropagationStrategyFactory.createPropagationStrategy(),
      networkInterface,
      miningProcessFactory.createMiningProcess(nodeId),
      blockchainFactory.createBlockchain(genesisBlock, nodeId),
      blockValidatorFactory.createBlockValidator(nodeId),
      orphanBlockPoolFactory.createOrphanBlockPool(nodeId),
      blockFactory,
      behaviorFactory.create(nodeId),
      geographicalRegionsResolver.getGeographicalRegionOfNode(nodeId),
      tagProvider.getTags(nodeId)
    )
  }
}