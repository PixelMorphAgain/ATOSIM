package org.palladiosimulator.blockchainsystems.core.behavior;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeBehavior;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeContext;
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction;

/**
 * Trail-Stubborn Mining behavior.
 *
 * Difference to Lead-Stubborn Mining:
 * - When lead == 0 and an honest block appears, the attacker does NOT
 *   immediately give up if a private block exists.
 * - Instead, the attacker publishes one private block to attempt recovery
 *   and create a competing fork.
 */

public class TrailStubbornMiningNodeBehavior
        extends BlockchainNodeObject
        implements BlockchainSystemNodeBehavior {

    private final List<Block> privateChain = new ArrayList<>();
    private int lead = 0;

    @Override
    public void onNodeInitialized(BlockchainSystemNodeContext context) {
        privateChain.clear();
        lead = 0;
        context.getMiningProcess().startMining();
    }

    @Override
    public void onTransactionReceived(
            Transaction transaction,
            BlockchainSystemNodeContext context
    ) {
        context.getTrxMemPool().storeTransaction(transaction);
        context.getTransactionPropagationStrategy().distribute(transaction);
    }

    @Override
    public void onBlockReceived(Block block, BlockchainSystemNodeContext context) {
        context.getBlockValidator().validateBlock(block);
    }

    @Override
    public void onBlockValidated(
            Block block,
            boolean isValid,
            BlockchainSystemNodeContext context
    ) {
        if (!isValid) return;

        context.getTrxMemPool().removeTransactions(block.getTransactions());

        boolean newLongest =
                BehaviorUtils.INSTANCE.appendBlockToBlockchain(block, context);

        if (newLongest) {
            context.getMiningProcess().restartMining();
        }

        // ---- TRAIL-STUBBORN RELEASE RULES ----
        if (lead == 0) {
            if (!privateChain.isEmpty()) {
                // DIFFERENCE to Lead-Stubborn:
                // try to recover by creating a competing fork
                publishOnePrivateBlock(context);
            } else {
                // no private blocks → honest behavior
                context.getBlockPropagationStrategy().distribute(block);
            }
        }
        else if (lead == 1) {
            // same as Lead-Stubborn: keep mining privately
        }
        else {
            // lead >= 2 → publish one block to stay ahead
            publishOnePrivateBlock(context);
            lead--;
        }
    }

    @Override
    public void onBlockMined(Block block, BlockchainSystemNodeContext context) {
        privateChain.add(block);
        lead++;
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

        context.getTrxMemPool().removeTransactions(selection.getTransactions());

        return context.getBlockFactory().createBlock(
                UUID.randomUUID().toString(),
                previousBlockHash,
                context.getId(),
                blockMinedAt,
                selection.getTotalSize(),
                selection.getTransactions()
        );
    }

    @Override
    public String onPreviousBlockSelection(
            BlockchainSystemNodeContext context
    ) {
        if (!privateChain.isEmpty()) {
            return privateChain.get(privateChain.size() - 1).getHash();
        }

        var heads =
                context.getBlockchain()
                        .getLastBlocksOfLongestChains()
                        .stream()
                        .toList();

        return heads.get((int) (Math.random() * heads.size())).getHash();
    }

    private void publishOnePrivateBlock(BlockchainSystemNodeContext context) {
        if (privateChain.isEmpty()) return;

        Block publish = privateChain.remove(0);

        boolean newLongest =
                BehaviorUtils.INSTANCE.appendBlockToBlockchain(publish, context);

        if (newLongest) {
            context.getMiningProcess().restartMining();
        }

        context.getBlockPropagationStrategy().distribute(publish);
    }

    @Override
    public void dispatchEvent(Event event) {
        // not used
    }
}