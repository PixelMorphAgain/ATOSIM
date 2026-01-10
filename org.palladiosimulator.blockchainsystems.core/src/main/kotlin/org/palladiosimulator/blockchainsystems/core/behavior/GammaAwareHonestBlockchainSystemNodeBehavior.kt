package org.palladiosimulator.blockchainsystems.core.behavior

import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block
import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeBehavior
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeContext
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction
import java.util.*
import kotlin.random.Random

/**
 * Honest mining behavior with gamma-based fork tie-breaking.
 *
 * When multiple longest chains exist, the miner follows
 * the attacker's branch with probability gamma.
 */
class GammaAwareHonestBlockchainSystemNodeBehavior(
    private val attackerNodeIds: Set<String>,
    private val gamma: Double
) : BlockchainNodeObject(), BlockchainSystemNodeBehavior {

    private val random = Random.Default

    override fun onNodeInitialized(context: BlockchainSystemNodeContext) {
        context.miningProcess.startMining()
    }

    override fun onTransactionReceived(
        transaction: Transaction,
        context: BlockchainSystemNodeContext
    ) {
        context.trxMemPool.storeTransaction(transaction)
        context.transactionPropagationStrategy.distribute(transaction)
    }

    override fun onBlockReceived(block: Block, context: BlockchainSystemNodeContext) {
        context.blockValidator.validateBlock(block)
    }

    override fun onBlockValidated(
        block: Block,
        isValid: Boolean,
        context: BlockchainSystemNodeContext
    ) {
        if (!isValid) return

        context.trxMemPool.removeTransactions(block.transactions)

        val hasNewLongestChain =
            BehaviorUtils.appendBlockToBlockchain(block, context)

        if (hasNewLongestChain) {
            context.miningProcess.restartMining()
        }

        context.blockPropagationStrategy.distribute(block)
    }

    override fun onBlockMined(block: Block, context: BlockchainSystemNodeContext) {
        BehaviorUtils.appendBlockToBlockchain(block, context)
        context.blockPropagationStrategy.distribute(block)
    }

    override fun onCreatingBlock(
        blockMinedAt: Long,
        previousBlockHash: String,
        context: BlockchainSystemNodeContext
    ): Block {
        val selected = context.transactionSelectionProcess
            .selectTransactionsForBlock(context)

        context.trxMemPool.removeTransactions(selected.transactions)

        return context.blockFactory.createBlock(
            UUID.randomUUID().toString(),
            previousBlockHash,
            context.id,
            blockMinedAt,
            selected.totalSize,
            selected.transactions
        )
    }

    override fun onPreviousBlockSelection(context: BlockchainSystemNodeContext): String {
        val tips = context.blockchain.getLastBlocksOfLongestChains()

        // No fork → honest behavior
        if (tips.size <= 1) {
            return tips.first().hash
        }

        val attackerTips = tips.filter { it.originId in attackerNodeIds }
        val honestTips = tips.filter { it.originId !in attackerNodeIds }

        // Preserve honest semantics if fork isn't attacker vs honest
        if (attackerTips.isEmpty() || honestTips.isEmpty()) {
            return tips.first().hash
        }

        val chosen =
            if (random.nextDouble() < gamma)
                attackerTips.random(random)
            else
                honestTips.random(random)

        return chosen.hash
    }

    override fun dispatchEvent(event: Event) {}
}
