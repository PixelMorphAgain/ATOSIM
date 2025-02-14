package org.palladiosimulator.blockchainsystems.core.behaviors;

import java.util.Set;
import java.util.UUID;

import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeBehavior;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeContext;

public class HonestBlockchainSystemNodeBehavior extends BlockchainNodeObject implements BlockchainSystemNodeBehavior {

    @Override
    public void onBlockReceived(Block block, BlockchainSystemNodeContext context) {
        context.getBlockValidator().validateBlock(block);
    }

    @Override
    public void onBlockValidated(Block block, Boolean isValid, BlockchainSystemNodeContext context) {
        if (isValid != null && isValid) {

            boolean hasNewLongestChain = BehaviorUtils.appendBlockToBlockchain(block, context);
            if (hasNewLongestChain) {
                context.getMiningProcess().restartMining();
            }

            context.getBlockPropagationStrategy().distributeBlock(block); // Blocks are distributed too often
        }
    }

    @Override
    public void onBlockMined(Block block, BlockchainSystemNodeContext context) {
        BehaviorUtils.appendBlockToBlockchain(block, context);

        context.getBlockPropagationStrategy().distributeBlock(block);
    }

    @Override
    public Block onCreatingBlock(Long blockMinedAt, String previousBlockHash, BlockchainSystemNodeContext context) {
        return context.getBlockFactory().createBlock(
                UUID.randomUUID().toString(),
                previousBlockHash,
                context.getId(),
                blockMinedAt);
    }


    @Override
    public String onPreviousBlockSelection(BlockchainSystemNodeContext context) {
        Set<Block> blocks = context.getBlockchain().getLastBlocksOfLongestChains();
        return blocks.stream().findFirst().get().getHash();
    }

    @Override
    public void onNodeInitialized(BlockchainSystemNodeContext context) {
        context.getMiningProcess().startMining();
    }

    @Override
    public void dispatchEvent(Event event) {
    }
}
