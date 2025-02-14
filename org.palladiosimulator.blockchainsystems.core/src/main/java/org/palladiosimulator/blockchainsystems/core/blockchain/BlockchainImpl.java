package org.palladiosimulator.blockchainsystems.core.blockchain;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockAppendingResult;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockType;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Blockchain;

public class BlockchainImpl extends BlockchainNodeObject implements Blockchain {

    private static final long INITIAL_BLOCKCHAIN_LENGTH = 1;
    private static final long UNKNOWN_BLOCK_POSITION_RESULT = -1;

    // Contains the newest blocks of the longest branches
    private final HashSet<BlockchainElement> _longestChainsLastBlocks;
    // Contains all blocks by their hashes
    private final HashMap<String, BlockchainElement> _blockchainElementsMap;
    @SuppressWarnings("unused")
    private final BlockchainElement _genesisBlock;
    private long _blockchainLength;

    public BlockchainImpl(BlockchainElement genesisBlock) {
        _longestChainsLastBlocks = new HashSet<BlockchainElement>();
        _blockchainElementsMap = new HashMap<String, BlockchainElement>();

        _genesisBlock = genesisBlock;
        _blockchainElementsMap.put(genesisBlock.getBlock().getHash(), genesisBlock);
        _longestChainsLastBlocks.add(genesisBlock);
        _blockchainLength = INITIAL_BLOCKCHAIN_LENGTH;
    }

    @Override
    public void dispatchEvent(Event event) {
    }

    public long getLength() {
        return _blockchainLength;
    }

    @Override
    public Set<Block> getLastBlocksOfLongestChains() {
        return _longestChainsLastBlocks
                .stream()
                .map(BlockchainElement::getBlock)
                .collect(Collectors.toSet());
    }

    @Override
    public boolean hasBlockWithHash(String hash) {
        return _blockchainElementsMap.containsKey(hash);
    }

    @Override
    public Block getBlock(String hash) {
        BlockchainElement blockchainElement = _blockchainElementsMap.getOrDefault(hash, null);
        return blockchainElement != null ? blockchainElement.getBlock() : null;
    }


    @Override
    public BlockAppendingResult appendBlock(Block block) {
        if (hasBlockWithHash(block.getHash())) {
            return BlockAppendingResult.createBlockAlreadyAppendedResult();
        }

        BlockchainElement previousBlockchainElement = _blockchainElementsMap.getOrDefault(block.getPreviousHash(), null);

        // Check if there is a block in the blockchain that has the blocks previous hash as its hash
        if (previousBlockchainElement != null) {

            long newBlockchainElementPosition = previousBlockchainElement.getPosition() + 1;

            if (_blockchainLength < newBlockchainElementPosition) {
                // Appended to one of the longest branches -> branch is now the single longest branch
                appendIncludedBlock(block, previousBlockchainElement, newBlockchainElementPosition);
                return BlockAppendingResult.createBlockAppendedResult(BlockType.IncludedBlock);
            } else if (_blockchainLength == newBlockchainElementPosition) {
                // Part of a branch that is now equally long as longest branch -> Potential fork
                appendForkingBlock(block, previousBlockchainElement, newBlockchainElementPosition);
                return BlockAppendingResult.createBlockAppendedResult(BlockType.ForkingBlock);
            } else {
                appendStaleBlock(block, previousBlockchainElement, newBlockchainElementPosition);
                return BlockAppendingResult.createBlockAppendedResult(BlockType.StaleBlock);
            }
        } else {
            // There is no block in the blockchain that has the block's previous hash as its hash -> block is an orphan block
            return BlockAppendingResult.createBlockNoAppendedBecauseOrphanBlockResult();
        }
    }


    private void appendIncludedBlock(Block block, BlockchainElement previousBlockchainElement, long blockPosition) {
        BlockchainElement newBlockchainElement = new BlockchainElement(
                block,
                previousBlockchainElement,
                BlockchainElementType.Included,
                blockPosition);

        // Store new block by hash
        _blockchainElementsMap.put(block.getHash(), newBlockchainElement);

        _blockchainLength = blockPosition;

        _longestChainsLastBlocks.remove(previousBlockchainElement);

        HashSet<BlockchainElement> staleBlockBranches = new HashSet<BlockchainElement>(_longestChainsLastBlocks);

        _longestChainsLastBlocks.clear();

        // Store new blockchain element as single longest blockchain element
        _longestChainsLastBlocks.add(newBlockchainElement);

        logBlockAppended(block, blockPosition, previousBlockchainElement.getBlock(), BlockType.IncludedBlock);

        // If the blockchain is currently forked, mark blocks in other branches as stale blocks
        for (BlockchainElement blockchainElement : staleBlockBranches) {
            traverseBlockchainAndChangeBlockTypes(blockchainElement, BlockchainElementType.Forking, BlockchainElementType.Stale);
        }

        // Mark (currently forked) descendants of new (latest) block as included
        traverseBlockchainAndChangeBlockTypes(previousBlockchainElement, BlockchainElementType.Forking, BlockchainElementType.Included);
    }


    private void traverseUntilBlockAndChangeBlockTypesToForking(BlockchainElement startingBlock, BlockchainElement untilBlock) {
        BlockchainElement currentBlock = startingBlock;
        while (currentBlock != untilBlock) {
            changeBlockType(currentBlock, BlockchainElementType.Forking);
            currentBlock = currentBlock.getPreviousBlockchainElement();
        }
    }

    private void appendForkingBlock(Block block, BlockchainElement previousBlockchainElement, long blockPosition) {
        // Get forking origin
        BlockchainElement newBlockchainElement = new BlockchainElement(
                block,
                previousBlockchainElement,
                BlockchainElementType.Forking,
                blockPosition);

        // Store new block by hash
        _blockchainElementsMap.put(block.getHash(), newBlockchainElement);

        _longestChainsLastBlocks.add(newBlockchainElement);


        logBlockAppended(block, blockPosition, previousBlockchainElement.getBlock(), BlockType.ForkingBlock);

        BlockchainElement forkOrigin = getForkOrigin();

        for (BlockchainElement be : _longestChainsLastBlocks) {
            traverseUntilBlockAndChangeBlockTypesToForking(be, forkOrigin);
        }
    }

    private BlockchainElement getForkOrigin() {
        HashSet<BlockchainElement> blockchainElements = new HashSet<BlockchainElement>();

        long min = _longestChainsLastBlocks.stream().mapToLong(BlockchainElement::getPosition).min().getAsLong();

        for (BlockchainElement be : _longestChainsLastBlocks) {
            BlockchainElement currentBlockchainElement = be;
            while (currentBlockchainElement.getPosition() > min) {
                currentBlockchainElement = currentBlockchainElement.getPreviousBlockchainElement();
            }

            blockchainElements.add(currentBlockchainElement);
        }

        while (blockchainElements.size() > 1) {
            HashSet<BlockchainElement> previousBlockchainElements = new HashSet<BlockchainElement>();
            for (BlockchainElement be : blockchainElements) {
                previousBlockchainElements.add(be.getPreviousBlockchainElement());
            }

            blockchainElements = previousBlockchainElements;
        }

        return blockchainElements.stream().findFirst().get();
    }

    private void traverseBlockchainAndChangeBlockTypes(BlockchainElement startingElement, BlockchainElementType whileType, BlockchainElementType newType) {
        BlockchainElement currentElement = startingElement;
        while (currentElement != null && currentElement.getType() == whileType) {
            changeBlockType(currentElement, newType);
            currentElement = currentElement.getPreviousBlockchainElement();
        }
    }

    private void changeBlockType(BlockchainElement blockchainElement, BlockchainElementType newBlockType) {
        if (blockchainElement.getType() == newBlockType) return;

        BlockchainElementType oldBlockType = blockchainElement.getType();
        blockchainElement.setType(newBlockType);


        logBlockTypeChanged(
                blockchainElement,
                oldBlockType,
                newBlockType);
    }

    private void logBlockTypeChanged(BlockchainElement blockchainElement, BlockchainElementType oldBlockType, BlockchainElementType newBlockType) {
        if (!getTraceEventLogger().isEventTypeEnabled(BlockAppendedTraceEvent.EVENT_TYPE)) return;

        BlockTypeChangedTraceEvent event = new BlockTypeChangedTraceEvent(
                getSimulationContext().getSystemClock().getCurrentTime(),
                blockchainElement.getBlock(),
                toBlockType(oldBlockType),
                toBlockType(newBlockType));
        getTraceEventLogger().logEvent(event);
    }

    private static BlockType toBlockType(BlockchainElementType blockchainElementType) {
        return switch (blockchainElementType) {
            case Forking -> BlockType.ForkingBlock;
            case Included -> BlockType.IncludedBlock;
            case Stale -> BlockType.StaleBlock;
        };
    }


    private void appendStaleBlock(Block block, BlockchainElement previousBlockchainElement, long blockPosition) {
        BlockchainElement newBlockchainElement = new BlockchainElement(
                block,
                previousBlockchainElement,
                BlockchainElementType.Stale,
                blockPosition);

        _blockchainElementsMap.put(block.getHash(), newBlockchainElement);

        logBlockAppended(block, blockPosition, previousBlockchainElement.getBlock(), BlockType.StaleBlock);
    }


    private void logBlockAppended(Block block, long blockPosition, Block previousBlock, BlockType blockType) {
        if (!getTraceEventLogger().isEventTypeEnabled(BlockAppendedTraceEvent.EVENT_TYPE)) return;

        BlockAppendedTraceEvent event = new BlockAppendedTraceEvent(
                getSimulationContext().getSystemClock().getCurrentTime(),
                block,
                blockPosition,
                previousBlock,
                blockType);
        getTraceEventLogger().logEvent(event);
    }


    @Override
    public Set<Block> getBlocksAtPosition(long position) {
        if (position < INITIAL_BLOCKCHAIN_LENGTH) {
            return Collections.emptySet();
        }

        return _blockchainElementsMap
                .values()
                .stream()
                .filter(x -> x.getPosition() == position)
                .map(BlockchainElement::getBlock)
                .collect(Collectors.toSet());
    }

    @Override
    public long length() {
        return _blockchainLength;
    }

    @Override
    public Set<Block> getBlocks() {
        return _blockchainElementsMap
                .values()
                .stream()
                .map(BlockchainElement::getBlock)
                .collect(Collectors.toUnmodifiableSet());
    }

    @Override
    public long getPositionOfBlock(Block block) {
        BlockchainElement blockchainElement = _blockchainElementsMap.getOrDefault(block.getHash(), null);

        return blockchainElement != null ? blockchainElement.getPosition() : UNKNOWN_BLOCK_POSITION_RESULT;
    }

    @Override
    public Set<Block> getSuccessorBlocks(String hash) {
        if (!hasBlockWithHash(hash)) return null;

        BlockchainElement startingBlockchain = _blockchainElementsMap.get(hash);

        HashSet<BlockchainElement> successorBlocks = new HashSet<BlockchainElement>();
        Set<BlockchainElement> immediateSuccessorBlocks = startingBlockchain.getNextBlockchainElements();

        do {
            HashSet<BlockchainElement> nextImmediateBlockchainElements = new HashSet<BlockchainElement>();
            for (BlockchainElement be : immediateSuccessorBlocks) {
                nextImmediateBlockchainElements.addAll(be.getNextBlockchainElements());
            }

            successorBlocks.addAll(immediateSuccessorBlocks);
            immediateSuccessorBlocks = nextImmediateBlockchainElements;
        } while (!immediateSuccessorBlocks.isEmpty());


        return successorBlocks.stream().map(BlockchainElement::getBlock).collect(Collectors.toSet());
    }

    @Override
    public Set<Block> getImmediateSuccessorBlocks(String hash) {
        if (!hasBlockWithHash(hash)) return null;

        BlockchainElement startingBlockchain = _blockchainElementsMap.get(hash);
        return startingBlockchain.getNextBlockchainElements().stream().map(x -> x.getBlock()).collect(Collectors.toSet());
    }

    @Override
    public long getLongestSuccessorChainLength(String hash) {
        if (!hasBlockWithHash(hash)) return 0;

        BlockchainElement startingBlockchain = _blockchainElementsMap.get(hash);

        Set<BlockchainElement> successorBlocks = startingBlockchain.getNextBlockchainElements();

        int length = 0;

        while (!successorBlocks.isEmpty()) {
            HashSet<BlockchainElement> nextSuccessorBlocks = new HashSet<BlockchainElement>();

            for (BlockchainElement be : successorBlocks) {
                nextSuccessorBlocks.addAll(be.getNextBlockchainElements());
            }

            successorBlocks = nextSuccessorBlocks;
            length++;
        }

        return length;
    }

}
