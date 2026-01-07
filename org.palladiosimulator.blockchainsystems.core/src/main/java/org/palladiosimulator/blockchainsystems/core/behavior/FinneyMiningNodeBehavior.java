package org.palladiosimulator.blockchainsystems.core.behavior;

import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeBehavior;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeContext;
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction;

public class FinneyMiningNodeBehavior extends BlockchainNodeObject implements BlockchainSystemNodeBehavior {
    private Block privateBlock = null;
    private final HonestBlockchainSystemNodeBehavior honest = new HonestBlockchainSystemNodeBehavior();
    private boolean hasReleased = false;

    @Override
    public void dispatchEvent(Event event) {

    }

    @Override
    public void onNodeInitialized(BlockchainSystemNodeContext context) {
        privateBlock = null;
        hasReleased = false;
        context.getMiningProcess().startMining();
    }


    @Override
    public void onTransactionReceived(Transaction transaction, BlockchainSystemNodeContext context) {
        context.getTrxMemPool().storeTransaction(transaction);
        context.getTransactionPropagationStrategy().distribute(transaction);

        // Trigger Finney attack once
        if (privateBlock != null && !hasReleased) {
            releasePrivateBlock(context);
        }
    }


    @Override
    public void onBlockReceived(Block block, BlockchainSystemNodeContext context) {
        context.getBlockValidator().validateBlock(block);
    }


    @Override
    public void onBlockValidated(Block block, boolean isValid, BlockchainSystemNodeContext context) {
        if (!isValid) return;

        context.getTrxMemPool().removeTransactions(block.getTransactions());

        boolean newLongest =
                BehaviorUtils.INSTANCE.appendBlockToBlockchain(block, context);

        if (newLongest) {
            context.getMiningProcess().restartMining();
        }

        context.getBlockPropagationStrategy().distribute(block);
    }


    @Override
    public void onBlockMined(Block block, BlockchainSystemNodeContext context) {
        // Pre-mine exactly one block and withhold it
        if (privateBlock == null) {
            privateBlock = block;
            // DO NOT append or propagate
            return;
        }

        // After the attack is over, behave honestly
        BehaviorUtils.INSTANCE.appendBlockToBlockchain(block, context);
        context.getBlockPropagationStrategy().distribute(block);
    }


    @Override
    public Block onCreatingBlock(
            long blockMinedAt,
            String previousBlockHash,
            BlockchainSystemNodeContext context
    ) {
        var selection =
                context.getTransactionSelectionProcess()
                        .selectTransactionsForBlock(context);

        context.getTrxMemPool().removeTransactions(
                selection.getTransactions()
        );

        return context.getBlockFactory().createBlock(
                java.util.UUID.randomUUID().toString(),
                previousBlockHash,
                context.getId(),
                blockMinedAt,
                selection.getTotalSize(),
                selection.getTransactions()
        );
    }


    @Override
    public String onPreviousBlockSelection(BlockchainSystemNodeContext context) {
        if (privateBlock != null && !hasReleased) {
            return privateBlock.getHash();
        }
        return honest.onPreviousBlockSelection(context);
    }


    private void releasePrivateBlock(BlockchainSystemNodeContext context) {
        hasReleased = true;

        boolean newLongest =
                BehaviorUtils.INSTANCE.appendBlockToBlockchain(privateBlock, context);

        if (newLongest) {
            context.getMiningProcess().restartMining();
        }

        context.getBlockPropagationStrategy().distribute(privateBlock);
        privateBlock = null;
    }

}