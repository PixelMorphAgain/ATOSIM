package org.palladiosimulator.blockchainsystems.core.behavior;

import org.jetbrains.annotations.NotNull;
import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeBehavior;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeContext;
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SelfishMiningNodeBehavior extends BlockchainNodeObject implements BlockchainSystemNodeBehavior {

    static {
        System.out.println("### SELFISH MINING CLASS LOADED ###");
    }

    private final HonestBlockchainSystemNodeBehavior honest = new HonestBlockchainSystemNodeBehavior();

    private final List<Block> privateChain = new ArrayList<>();
    private int lead = 0;

    @Override
    public void onNodeInitialized(BlockchainSystemNodeContext context) {
        privateChain.clear();
        lead = 0;

        // attacker starts mining
        context.getMiningProcess().startMining();
    }

    @Override
    public void onTransactionReceived(Transaction transaction, BlockchainSystemNodeContext context) {
        context.getTrxMemPool().storeTransaction(transaction);
        context.getTransactionPropagationStrategy().distribute(transaction);
    }

    @Override
    public void onBlockReceived(Block block, BlockchainSystemNodeContext context) {
        context.getBlockValidator().validateBlock(block);
    }

    @Override
    public void onBlockValidated(Block block, boolean isValid, BlockchainSystemNodeContext context) {
        if (!isValid) {
            return;
        }

        // Remove confirmed transactions from mempool
        context.getTrxMemPool().removeTransactions(block.getTransactions());

        boolean newLongest = BehaviorUtils.INSTANCE.appendBlockToBlockchain(block, context);

        if (newLongest) {
            context.getMiningProcess().restartMining();
        }

        // Selfish Mining release rules
        if (lead == 0) {
            // Behave honestly
            return;
        } else if (lead == 1) {
            // publish one block to create a tie
            publishOnePrivateBlock(context);
            privateChain.clear();
            lead = 0;
            return;
        } if (lead == 2) {
            // lead >= 2 -> publish entire private chain to secure win
            publishAllPrivateBlocks(context);
            privateChain.clear();
            lead = 0;
            return;
        }
        publishOnePrivateBlock(context);
        lead--;
    }

    @Override
    public void onBlockMined(Block block, BlockchainSystemNodeContext context) {
        // attacker mined a block, withhold
        System.out.println("ATTACKER MINED BLOCK " + block.getHash());
        privateChain.add(block);
        lead++;
        // DO NOT append or propagate here
    }

    @Override
    public Block onCreatingBlock(long blockMinedAt, String previousBlockHash, BlockchainSystemNodeContext context) {
        var selection =
                context.getTransactionSelectionProcess()
                        .selectTransactionsForBlock(context);

       // context.getTrxMemPool().removeTransactions(
        //        selection.getTransactions()
      //  );

        return context.getBlockFactory().createBlock(
                UUID.randomUUID().toString(),
                previousBlockHash,
                context.getId(),
                blockMinedAt,
                selection.getTotalSize(),
                selection.getTransactions()
        );
    }

    @NotNull
    @Override
    public String onPreviousBlockSelection(BlockchainSystemNodeContext context) {
        // Mine on private chain if it exists
        if (!privateChain.isEmpty()) {
            return privateChain.get(privateChain.size() - 1).getHash();
        }

        // behave honestly
        return honest.onPreviousBlockSelection(context);
    }

    private void publishOnePrivateBlock(BlockchainSystemNodeContext context) {
        if (privateChain.isEmpty()) {
            return;
        }

        Block publish = privateChain.remove(0);

        boolean newLongest =
                BehaviorUtils.INSTANCE.appendBlockToBlockchain(publish, context);

        if (newLongest) {
            context.getMiningProcess().restartMining();
        }

        // MUST propagate published block
        context.getBlockPropagationStrategy().distribute(publish);
    }

    private void publishAllPrivateBlocks(BlockchainSystemNodeContext context) {
        while (!privateChain.isEmpty()) {
            publishOnePrivateBlock(context);
        }
    }

    @Override
    public void dispatchEvent(Event event) {

    }
}