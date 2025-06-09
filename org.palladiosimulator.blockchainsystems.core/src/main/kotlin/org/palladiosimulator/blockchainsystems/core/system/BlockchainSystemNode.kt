package org.palladiosimulator.blockchainsystems.core.system

import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block
import org.palladiosimulator.blockchainsystems.core.block.abstractions.BlockFactory
import org.palladiosimulator.blockchainsystems.core.block.abstractions.BlockValidator
import org.palladiosimulator.blockchainsystems.core.common.BlockchainSimulationObject
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Taggable
import org.palladiosimulator.blockchainsystems.core.geography.GeographicalRegion
import org.palladiosimulator.blockchainsystems.core.system.abstractions.*
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.TransactionSelectionProcess

/**
 * The [BlockchainSystemNode] class represents a blockchain system node.
 * It uses abstractions for the relevant components of blockchain system nodes,
 * such as a blockchain data structure.
 * The [BlockchainSystemNode] class sets up the correct initialization and linking
 * for these abstractions.
 *
 * @author Yannik Sproll, Davis Riedel
 */
class BlockchainSystemNode(
  id: String,
  name: String,
  private val blockPropagationStrategy: PropagationStrategy<Block>,
  private val transactionPropagationStrategy: PropagationStrategy<Transaction>,
  private val networkInterface: NodeP2PNetworkInterface,
  private val miningProcess: MiningProcess,
  private val transactionSelectionProcess: TransactionSelectionProcess,
  private val blockchain: Blockchain,
  private val blockValidator: BlockValidator,
  private val trxMemPool: TrxMemPool,
  private val orphanBlockPool: OrphanBlockPool,
  private val blockFactory: BlockFactory,
  private val behavior: BlockchainSystemNodeBehavior,
  val geographicalRegion: GeographicalRegion,
  private val tags: MutableSet<String> = mutableSetOf()
) : BlockchainSimulationObject(id, name), Taggable {

  private val context: BlockchainSystemNodeContext = BlockchainSystemNodeContextImpl(
    id,
    blockPropagationStrategy,
    transactionPropagationStrategy,
    networkInterface,
    miningProcess,
    transactionSelectionProcess,
    blockchain,
    blockValidator,
    trxMemPool,
    orphanBlockPool,
    blockFactory,
    geographicalRegion
  )

  override fun onInitialize() {
    blockchain.initialize(simulationContext)
    blockchain.initializeLogger(this)

    transactionPropagationStrategy.setNetworkInterface(networkInterface)
    transactionPropagationStrategy.setBlockchain(blockchain)
    transactionPropagationStrategy.setOnReceivedCallback { this.onTransactionReceived(it) }
    transactionPropagationStrategy.initialize(simulationContext)
    transactionPropagationStrategy.initializeLogger(this)

    blockPropagationStrategy.setNetworkInterface(networkInterface)
    blockPropagationStrategy.setBlockchain(blockchain)
    blockPropagationStrategy.setOnReceivedCallback { this.onBlockReceived(it) }
    blockPropagationStrategy.initialize(simulationContext)
    blockPropagationStrategy.initializeLogger(this)

    blockValidator.setOnBlockValidatedCallback { block, isValid ->
      this.onBlockValidated(
        block,
        isValid
      )
    }
    blockValidator.initialize(simulationContext)
    blockValidator.initializeLogger(this)

    miningProcess.setOnBlockMinedCallback { block -> this.onBlockMined(block) }
    miningProcess.setPreviousBlockSelectionCallback { this.onPreviousBlockSelected() }
    miningProcess.setOnCreatingBlockCallback { blockMinedAt, previousBlockHash ->
      this.onCreatingBlock(
        blockMinedAt,
        previousBlockHash
      )
    }
    miningProcess.initialize(simulationContext)
    miningProcess.initializeLogger(this)

    transactionSelectionProcess.initialize(simulationContext)
    transactionSelectionProcess.initializeLogger(this)

    trxMemPool.initialize(simulationContext)
    trxMemPool.initializeLogger(this)

    orphanBlockPool.initialize(simulationContext)
    orphanBlockPool.initializeLogger(this)

    behavior.initialize(simulationContext)
    behavior.initializeLogger(this)
    behavior.onNodeInitialized(context)
  }

  override fun onCleanup() {
    trxMemPool.cleanup()
    orphanBlockPool.cleanup()
    miningProcess.cleanup()
    blockValidator.cleanup()
    blockPropagationStrategy.cleanup()
    blockchain.cleanup()
  }

  private fun onTransactionReceived(transaction: Transaction) {
    behavior.onTransactionReceived(transaction, context)
  }

  private fun onBlockReceived(block: Block) {
    behavior.onBlockReceived(block, context)
  }

  private fun onBlockValidated(block: Block, isValid: Boolean) {
    behavior.onBlockValidated(block, isValid, context)
  }

  private fun onCreatingBlock(blockMinedAt: Long, previousBlockHash: String): Block {
    return behavior.onCreatingBlock(blockMinedAt, previousBlockHash, context)
  }

  private fun onPreviousBlockSelected(): String {
    return behavior.onPreviousBlockSelection(context)
  }

  private fun onBlockMined(block: Block) {
    behavior.onBlockMined(block, context)
  }

  override fun dispatchEvent(event: Event) {
  }

  override fun hasTag(tag: String): Boolean {
    return tags.contains(tag)
  }
}
