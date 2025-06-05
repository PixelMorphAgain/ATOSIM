package org.palladiosimulator.blockchainsystems.core.system

import org.palladiosimulator.blockchainsystems.core.geography.GeographicalRegion
import org.palladiosimulator.blockchainsystems.core.system.abstractions.*

/**
 * The [BlockchainSystemNodeContextImpl] class is an implementation of the [BlockchainSystemNodeContext] interface.
 * It is a container that provides access to all components of a blockchain system node.
 *
 * @author Yannik Sproll, Davis Riedel
 */
class BlockchainSystemNodeContextImpl(
  private val id: String,
  private val blockPropagationStrategy: PropagationStrategy<Block>,
  private val transactionPropagationStrategy: PropagationStrategy<Transaction>,
  private val networkInterface: NodeP2PNetworkInterface,
  private val miningProcess: MiningProcess,
  private val blockchain: Blockchain,
  private val blockValidator: BlockValidator,
  private val orphanBlockPool: OrphanBlockPool,
  private val blockFactory: BlockFactory,
  private val geographicalRegion: GeographicalRegion
) : BlockchainSystemNodeContext {
  override fun getId() = id
  override fun getBlockPropagationStrategy() = blockPropagationStrategy
  override fun getTransactionPropagationStrategy() = transactionPropagationStrategy
  override fun getNetworkInterface() = networkInterface
  override fun getMiningProcess() = miningProcess
  override fun getBlockchain() = blockchain
  override fun getOrphanBlockPool() = orphanBlockPool
  override fun getBlockFactory() = blockFactory
  override fun getBlockValidator() = blockValidator
  override fun getGeographicalRegion() = geographicalRegion
}