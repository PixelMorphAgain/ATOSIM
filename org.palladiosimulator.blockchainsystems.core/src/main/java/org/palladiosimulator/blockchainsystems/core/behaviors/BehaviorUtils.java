package org.palladiosimulator.blockchainsystems.core.behaviors;

import java.util.Set;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockAppendingResult;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockAppendingResultType;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockType;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeContext;

/**
 * The {@code BehaviorUtils} class provides common behavior methods used by behavior implementations.
 *
 * @author Yannik Sproll
 */
public class BehaviorUtils {

    private BehaviorUtils() {
    }

    /**
     * Appends the specified to the blockchain, if possible.
     * If there is no matching previous block, the block is stored in the orphan block pool.
     * If there are descending blocks to the current block, these blocks are also appended to the blockchain.
     * The method returns a value that indicates if the blockchain has a new longest branch.
     *
     * @param block   the block to add to the blockchain
     * @param context the context of a blockchain system node
     * @return true if the blockchain has a new longest branch, false otherwise
     */
    public static boolean appendBlockToBlockchain(Block block, BlockchainSystemNodeContext context) {
        BlockAppendingResult blockAppendingResult = context.getBlockchain().appendBlock(block);

        if (blockAppendingResult.getType() == BlockAppendingResultType.Appended) {
            BlockType appendedBlockType = blockAppendingResult.getBlockType();

            Set<Block> orphanBlocks = context.getOrphanBlockPool().getBlocksByPreviousBlockHash(block.getHash());
            boolean hasNewLongestBranch = appendedBlockType == BlockType.IncludedBlock;

            for (Block orphanBlock : orphanBlocks) {
                boolean hasNewLongestBranchInner = appendBlockToBlockchain(orphanBlock, context);
                if (!hasNewLongestBranch) {
                    hasNewLongestBranch = hasNewLongestBranchInner;
                }
            }

            return appendedBlockType == BlockType.IncludedBlock;

        } else if (blockAppendingResult.getType() == BlockAppendingResultType.NotAppendedBecauseOrphanBlock) {
            context.getOrphanBlockPool().storeBlock(block);
        }

        return false;
    }
}
