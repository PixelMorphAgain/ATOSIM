package org.palladiosimulator.blockchainsystems.threesim.creation.explicitnetwork

import org.palladiosimulator.blockchainsystems.bscm.blockchainsystem.BlockchainSystem as DesignBlockchainSystem
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ExplicitNetworkTopology
import org.palladiosimulator.blockchainsystems.core.blockchain.BlockchainFactoryImpl
import org.palladiosimulator.blockchainsystems.core.blockpropagation.BlockPropagationStrategyFactoryImpl
import org.palladiosimulator.blockchainsystems.core.transaction.propagation.TransactionPropagationStrategyFactoryImpl
import org.palladiosimulator.blockchainsystems.core.blocks.BlockFactoryImpl
import org.palladiosimulator.blockchainsystems.core.orphanblockpool.OrphanBlockPoolFactoryImpl
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystem
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemNodeFactory
import org.palladiosimulator.blockchainsystems.core.system.abstractions.*
import org.palladiosimulator.blockchainsystems.core.transaction.TrxMemPoolFactoryImpl
import org.palladiosimulator.blockchainsystems.threesim.creation.geography.ThreesimGeographicalRegionsResolver
import java.util.*

/**
 * Factory for creating a [BlockchainSystem] based on an [ExplicitNetworkTopology].
 *
 * @author Yannik Sproll, Davis Riedel
 */
class ExplicitNetworkBlockchainSystemFactory(
  private val designBlockchainSystem: DesignBlockchainSystem,
  private val explicitTopology: ExplicitNetworkTopology
) : BlockchainSystemFactory {
  private val networkFactory: ExplicitTopologyP2PNetworkFactory = ExplicitTopologyP2PNetworkFactory(explicitTopology)
  private val nodeAllocationResolver = ExplicitNetworkNodeAllocationResolver(explicitTopology)
  private val geographicalRegionsResolver = ThreesimGeographicalRegionsResolver(
    designBlockchainSystem.geographicalRegionsSpecification,
    nodeAllocationResolver
  );

  override fun createBlockchainSystem(): BlockchainSystem {
    val networkCreationResult = networkFactory.createP2PNetwork()

    val globalResourcePowerCalculator = ExplicitNetworkGlobalResourcePowerCalculator(explicitTopology)

    val blockFactory = createBlockFactory()

    val nodeFactory = createBlockchainSystemNodeFactory(
      nodeAllocationResolver,
      globalResourcePowerCalculator,
      blockFactory
    )

    return createBlockchainSystemInstance(
      networkCreationResult.getCreatedNetwork(),
      blockFactory,
      nodeFactory
    )
  }

  private fun createBlockchainSystemInstance(
    network: P2PNetwork,
    blockFactory: BlockFactory,
    nodeFactory: BlockchainSystemNodeFactory
  ): BlockchainSystem {
    val blockchainSystemId = UUID.randomUUID().toString()
    val blockchainSystemName = "BlockchainSystem_" + blockchainSystemId.substring(0, 8)

    val genesisBlock = blockFactory.createGenesisBlock()

    val blockchainSystemNodes = network.getNodes()
      .map { nodeFactory.createBlockchainSystemNode(it, genesisBlock) }
      .toHashSet()

    return BlockchainSystem(
      blockchainSystemId,
      blockchainSystemName,
      network,
      blockchainSystemNodes
    )
  }

  private fun createBlockchainSystemNodeFactory(
    nodeAllocationResolver: ExplicitNetworkNodeAllocationResolver,
    globalResourcePowerCalculator: ExplicitNetworkGlobalResourcePowerCalculator,
    blockFactory: BlockFactory
  ): BlockchainSystemNodeFactory {
    // Create factories independent of the metamodel information
    val blockchainFactory = BlockchainFactoryImpl()
    val blockPropagationStrategyFactory = BlockPropagationStrategyFactoryImpl()
    val transactionPropagationStrategyFactory = TransactionPropagationStrategyFactoryImpl()
    val orphanBlockPoolFactory = OrphanBlockPoolFactoryImpl()
    val trxMemPoolFactory = TrxMemPoolFactoryImpl()

    // TODO: Fix these

    // Create factories dependent of the metamodel information
    val miningProcessFactory: MiningProcessFactory = MiningProcessFactoryPluginImpl(
      nodeAllocationResolver,
      globalResourcePowerCalculator, designBlockchainSystem.getSpecification()
    )
    val blockValidatorFactory: BlockValidatorFactory = BlockValidatorFactoryPluginImpl(nodeAllocationResolver)
    val behaviorFactory: BlockchainSystemNodeBehaviorFactory = BlockchainSystemNodeBehaviorFactoryPluginImpl(
      maliciousNodesIdProvider
    )
    val tagProvider: BlockchainSystemNodeTagProvider = BlockchainSystemNodeTagProviderImpl(maliciousNodesIdProvider)

    return BlockchainSystemNodeFactory(
      blockFactory,
      blockchainFactory,
      miningProcessFactory,
      blockValidatorFactory,
      blockPropagationStrategyFactory,
      transactionPropagationStrategyFactory,
      trxMemPoolFactory,
      orphanBlockPoolFactory,
      behaviorFactory,
      geographicalRegionsResolver,
      tagProvider
    )
  }

  private fun createBlockFactory(): BlockFactoryImpl {
    // TODO: We no longer have mean block size, block size must be calculated based on transactions
    val blockSizeValueProvider: BlockSizeValueProvider =
      BlockSizeValueProvider(designBlockchainSystem.getSpecification().getMeanBlockSize())
    return BlockFactoryImpl(blockSizeValueProvider)
  }
}