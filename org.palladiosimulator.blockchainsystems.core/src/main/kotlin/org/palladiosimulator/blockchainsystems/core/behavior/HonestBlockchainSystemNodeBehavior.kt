package org.palladiosimulator.blockchainsystems.core.behavior

import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeBehavior
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeContext
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction
import java.util.*

/**
 * This behavior represents a node in the blockchain system that behaves honestly.
 *
 * @author Yannik Sproll
 */
class HonestBlockchainSystemNodeBehavior : BlockchainNodeObject(), BlockchainSystemNodeBehavior {
  override fun onBlockReceived(
    block: Block,
    context: BlockchainSystemNodeContext
  ) {
    context.getBlockValidator().validateBlock(block)
  }

  override fun onTransactionReceived(
    transaction: Transaction,
    context: BlockchainSystemNodeContext
  ) {
    // TODO: Implement transaction handling
    // Broadcast the transaction to neighbors
    // Include it in the transaction mem pool
    TODO("Not yet implemented")
  }

  override fun onBlockValidated(block: Block, isValid: Boolean, context: BlockchainSystemNodeContext) {
    if (!isValid) return

    val hasNewLongestChain = BehaviorUtils.appendBlockToBlockchain(block, context)
    if (hasNewLongestChain) {
      context.getMiningProcess().restartMining()
    }

    context.getBlockPropagationStrategy().distribute(block) // TODO: Blocks are distributed too often
  }

  override fun onBlockMined(block: Block, context: BlockchainSystemNodeContext) {
    BehaviorUtils.appendBlockToBlockchain(block, context)
    context.getBlockPropagationStrategy().distribute(block)
  }

  override fun onCreatingBlock(
    blockMinedAt: Long,
    previousBlockHash: String,
    context: BlockchainSystemNodeContext
  ): Block {
    // TODO: Calculate block size based on transactions
    return context.getBlockFactory().createBlock(
      UUID.randomUUID().toString(),
      previousBlockHash,
      context.getId(),
      blockMinedAt
    )
  }

  override fun onPreviousBlockSelection(context: BlockchainSystemNodeContext): String {
    val blocks = context.getBlockchain().getLastBlocksOfLongestChains()
    return blocks.stream().findFirst().get().getHash()
  }

  override fun onNodeInitialized(context: BlockchainSystemNodeContext) {
    context.getMiningProcess().startMining()
  }

  override fun dispatchEvent(event: Event) {
  }
}