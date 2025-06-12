package org.palladiosimulator.blockchainsystems.threesim.creation.explicitnetwork

import org.palladiosimulator.blockchainsystems.bscm.blockchainsystem.BlockchainSystem as DesignBlockchainSystem
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ExplicitNetworkTopology
import org.palladiosimulator.blockchainsystems.core.blockchain.BlockchainFactoryImpl
import org.palladiosimulator.blockchainsystems.core.blockpropagation.BlockPropagationStrategyFactoryImpl
import org.palladiosimulator.blockchainsystems.core.transaction.propagation.TransactionPropagationStrategyFactoryImpl
import org.palladiosimulator.blockchainsystems.core.block.BlockFactoryImpl
import org.palladiosimulator.blockchainsystems.core.block.abstractions.BlockFactory
import org.palladiosimulator.blockchainsystems.core.block.abstractions.BlockValidatorFactory
import org.palladiosimulator.blockchainsystems.core.mining.MiningProcessFactoryImpl
import org.palladiosimulator.blockchainsystems.core.orphanblockpool.OrphanBlockPoolFactoryImpl
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystem
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemNodeFactory
import org.palladiosimulator.blockchainsystems.core.system.abstractions.*
import org.palladiosimulator.blockchainsystems.core.transaction.TrxMemPoolFactoryImpl
import org.palladiosimulator.blockchainsystems.threesim.behavior.ThreesimBlockchainSystemNodeBehaviorFactory
import org.palladiosimulator.blockchainsystems.threesim.behavior.ThreesimTransactionSelectionProcessFactory
import org.palladiosimulator.blockchainsystems.threesim.creation.ThreesimBlockValidatorFactory
import org.palladiosimulator.blockchainsystems.threesim.creation.geography.ThreesimGeographicalRegionsResolver
import java.util.random.RandomGenerator
import org.palladiosimulator.blockchainsystems.threesim.behavior.ThreesimBlockchainSystemNodeTagProvider
import java.util.UUID

/**
 * Factory for creating a [BlockchainSystem] based on an [ExplicitNetworkTopology].
 *
 * @author Yannik Sproll, Davis Riedel
 */
class ExplicitNetworkBlockchainSystemFactory(
  private val designBlockchainSystem: DesignBlockchainSystem,
  private val explicitTopology: ExplicitNetworkTopology
) : BlockchainSystemFactory {
  private val networkFactory = ExplicitTopologyP2PNetworkFactory(explicitTopology)
  private val nodeAllocationResolver = ExplicitNetworkNodeAllocationResolver(explicitTopology)
  private val geographicalRegionsResolver = ThreesimGeographicalRegionsResolver(
    designBlockchainSystem.geographicalRegionsSpecification,
    nodeAllocationResolver
  );
  private val resourcePowerCalculator = ExplicitNetworkResourcePowerCalculator(explicitTopology)

  override fun createBlockchainSystem(): BlockchainSystem {
    val networkCreationResult = networkFactory.createP2PNetwork()

    val blockFactory = createBlockFactory()

    val nodeFactory = createBlockchainSystemNodeFactory(blockFactory)

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
    blockFactory: BlockFactory
  ): BlockchainSystemNodeFactory {
    // Create factories independent of the metamodel information
    val blockchainFactory = BlockchainFactoryImpl()
    val blockPropagationStrategyFactory = BlockPropagationStrategyFactoryImpl()
    val transactionPropagationStrategyFactory = TransactionPropagationStrategyFactoryImpl()
    val orphanBlockPoolFactory = OrphanBlockPoolFactoryImpl()
    val trxMemPoolFactory = TrxMemPoolFactoryImpl()

    // Create factories dependent of the metamodel information
    // TODO: Respect resource power in mining process
    val miningProcessFactory = MiningProcessFactoryImpl(
      meanBlockTime = designBlockchainSystem.specification.meanBlockTime,
      randomGenerator = RandomGenerator.of("Random"),
    )
    val transactionSelectionProcessFactory = ThreesimTransactionSelectionProcessFactory(
      maxBlockSize = designBlockchainSystem.specification.maxBlockSize
    )
    val blockValidatorFactory: BlockValidatorFactory = ThreesimBlockValidatorFactory(nodeAllocationResolver)
    val behaviorFactory: BlockchainSystemNodeBehaviorFactory = ThreesimBlockchainSystemNodeBehaviorFactory()
    val tagProvider: BlockchainSystemNodeTagProvider = ThreesimBlockchainSystemNodeTagProvider()

    return BlockchainSystemNodeFactory(
      blockFactory,
      blockchainFactory,
      miningProcessFactory,
      transactionSelectionProcessFactory,
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
    return BlockFactoryImpl()
  }
}