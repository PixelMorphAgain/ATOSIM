package org.palladiosimulator.blockchainsystems.core.behavior;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeBehavior;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeContext;
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction;

/**
 * Honest mining behavior with gamma-based fork tie-breaking.
 */
public class GammaAwareHonestBlockchainSystemNodeBehavior
        extends BlockchainNodeObject
        implements BlockchainSystemNodeBehavior {

    private final Set<String> attackerNodeIds;
    private final double gamma;
    private final Random random = new Random();

    public GammaAwareHonestBlockchainSystemNodeBehavior(
            Set<String> attackerNodeIds,
            double gamma
    ) {
        this.attackerNodeIds = attackerNodeIds;
        this.gamma = gamma;
    }

    @Override
    public void onNodeInitialized(BlockchainSystemNodeContext context) {
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

        context.getBlockPropagationStrategy().distribute(block);
    }

    @Override
    public void onBlockMined(Block block, BlockchainSystemNodeContext context) {
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
        return new HonestBlockchainSystemNodeBehavior().onPreviousBlockSelection(context);
    }

    @Override
    public void dispatchEvent(Event event) {
    }
}