package org.palladiosimulator.blockchainsystems.core.blockchain

import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block
import org.palladiosimulator.blockchainsystems.core.block.abstractions.BlockAppendingResult
import org.palladiosimulator.blockchainsystems.core.block.abstractions.BlockType
import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Blockchain
import org.palladiosimulator.blockchainsystems.core.block.AppendedBlockImpl
import org.palladiosimulator.blockchainsystems.core.block.abstractions.AppendedBlock

/**
 * Implementation of the [Blockchain] interface.
 * This class manages the blockchain, including appending blocks, tracking the longest chains, and handling forks.
 *
 * @author Yannik Sproll, Davis Riedel
 */
class BlockchainImpl(
  private val genesisBlock: BlockchainElement
) : BlockchainNodeObject(), Blockchain {

  // Contains the newest blocks of the longest branches
  private val longestChainsLastBlocks: HashSet<BlockchainElement> = hashSetOf(genesisBlock)

  // Contains all blocks by their hashes
  private val blockchainElementsMap: HashMap<String, BlockchainElement> =
    hashMapOf(Pair(genesisBlock.block.hash, genesisBlock))

  private var length: Long = INITIAL_BLOCKCHAIN_LENGTH

  override fun dispatchEvent(event: Event) {
  }

  override fun getLastBlocksOfLongestChains(): Set<Block> {
    return longestChainsLastBlocks
      .map { it.block }
      .toSet()
  }

  override fun hasBlockWithHash(hash: String): Boolean {
    return blockchainElementsMap.containsKey(hash)
  }

  override fun getBlock(hash: String): Block? {
    return blockchainElementsMap[hash]?.block
  }


  override fun appendBlock(block: Block): BlockAppendingResult {
    if (hasBlockWithHash(block.hash)) {
      return BlockAppendingResult.createBlockAlreadyAppendedResult()
    }

    val previousBlockchainElement = blockchainElementsMap.getOrDefault(block.previousHash, null)

    // Check if there is a block in the blockchain that has the blocks previous hash as its hash
    if (previousBlockchainElement != null) {
      val newBlockchainElementPosition = previousBlockchainElement.position + 1

      if (this.length < newBlockchainElementPosition) {
        // Appended to one of the longest branches -> branch is now the single longest branch
        appendIncludedBlock(block, previousBlockchainElement, newBlockchainElementPosition)
        return BlockAppendingResult.createBlockAppendedResult(BlockType.IncludedBlock)
      } else if (this.length == newBlockchainElementPosition) {
        // Part of a branch that is now equally long as longest branch -> Potential fork
        appendForkingBlock(block, previousBlockchainElement, newBlockchainElementPosition)
        return BlockAppendingResult.createBlockAppendedResult(BlockType.ForkingBlock)
      } else {
        appendStaleBlock(block, previousBlockchainElement, newBlockchainElementPosition)
        return BlockAppendingResult.createBlockAppendedResult(BlockType.StaleBlock)
      }
    } else {
      // There is no block in the blockchain that has the block's previous hash as its hash -> block is an orphan block
      return BlockAppendingResult.createBlockNoAppendedBecauseOrphanBlockResult()
    }
  }


  private fun appendIncludedBlock(block: Block, previousBlockchainElement: BlockchainElement, blockPosition: Long) {
    val newBlockchainElement = BlockchainElement(
      AppendedBlockImpl.fromBlock(
        block,
        simulationContext.systemClock.currentTime
      ),
      previousBlockchainElement,
      BlockchainElementType.Included,
      blockPosition
    )

    // Store new block by hash
    blockchainElementsMap.put(block.hash, newBlockchainElement)

    this.length = blockPosition

    longestChainsLastBlocks.remove(previousBlockchainElement)

    val staleBlockBranches = HashSet<BlockchainElement>(longestChainsLastBlocks)

    longestChainsLastBlocks.clear()

    // Store new blockchain element as single longest blockchain element
    longestChainsLastBlocks.add(newBlockchainElement)

    logBlockAppended(block, blockPosition, previousBlockchainElement.block, BlockType.IncludedBlock)

    // If the blockchain is currently forked, mark blocks in other branches as stale blocks
    for (blockchainElement in staleBlockBranches) {
      traverseBlockchainAndChangeBlockTypes(
        blockchainElement,
        BlockchainElementType.Forking,
        BlockchainElementType.Stale
      )
    }

    // Mark (currently forked) descendants of new (latest) block as included
    traverseBlockchainAndChangeBlockTypes(
      previousBlockchainElement,
      BlockchainElementType.Forking,
      BlockchainElementType.Included
    )
  }


  private fun traverseUntilBlockAndChangeBlockTypesToForking(
    startingBlock: BlockchainElement,
    untilBlock: BlockchainElement
  ) {
    var currentBlock: BlockchainElement? = startingBlock
    while (currentBlock !== untilBlock) {
      changeBlockType(currentBlock, BlockchainElementType.Forking)
      currentBlock = currentBlock?.previousBlockchainElement
    }
  }

  private fun appendForkingBlock(
    block: Block,
    previousBlockchainElement: BlockchainElement,
    blockPosition: Long
  ) {
    // Get forking origin
    val newBlockchainElement = BlockchainElement(
      AppendedBlockImpl.fromBlock(
        block,
        simulationContext.systemClock.currentTime
      ),
      previousBlockchainElement,
      BlockchainElementType.Forking,
      blockPosition,
    )

    // Store new block by hash
    blockchainElementsMap.put(block.hash, newBlockchainElement)

    longestChainsLastBlocks.add(newBlockchainElement)


    logBlockAppended(block, blockPosition, previousBlockchainElement.block, BlockType.ForkingBlock)

    val forkOrigin = this.forkOrigin

    for (be in longestChainsLastBlocks) {
      traverseUntilBlockAndChangeBlockTypesToForking(be, forkOrigin)
    }
  }

  private fun getForkOrigin(): BlockchainElement {
    var blockchainElements = HashSet<BlockchainElement>()

    val min = longestChainsLastBlocks.minOf { it.position }

    for (be in longestChainsLastBlocks) {
      var currentBlockchainElement: BlockchainElement? = be
      while (currentBlockchainElement.position > min) {
        currentBlockchainElement = currentBlockchainElement?.previousBlockchainElement
      }

      blockchainElements.add(currentBlockchainElement)
    }

    while (blockchainElements.size > 1) {
      val previousBlockchainElements = HashSet<BlockchainElement>()
      for (be in blockchainElements) {
        previousBlockchainElements.add(be.previousBlockchainElement)
      }

      blockchainElements = previousBlockchainElements
    }

    return blockchainElements.first()
  }

  private fun traverseBlockchainAndChangeBlockTypes(
    startingElement: BlockchainElement,
    whileType: BlockchainElementType,
    newType: BlockchainElementType
  ) {
    var currentElement: BlockchainElement? = startingElement
    while (currentElement.type == whileType) {
      changeBlockType(currentElement, newType)
      currentElement = currentElement?.previousBlockchainElement
    }
  }

  private fun changeBlockType(blockchainElement: BlockchainElement, newBlockType: BlockchainElementType) {
    if (blockchainElement.type == newBlockType) return

    val oldBlockType = blockchainElement.type
    blockchainElement.type = newBlockType

    logBlockTypeChanged(
      blockchainElement,
      oldBlockType,
      newBlockType
    )
  }

  private fun logBlockTypeChanged(
    blockchainElement: BlockchainElement,
    oldBlockType: BlockchainElementType,
    newBlockType: BlockchainElementType
  ) {
    if (!traceEventLogger.isEventTypeEnabled(BlockAppendedTraceEvent.EVENT_TYPE)) {
      return
    }

    val event = BlockTypeChangedTraceEvent(
      simulationContext.systemClock.currentTime,
      blockchainElement.block,
      toBlockType(oldBlockType),
      toBlockType(newBlockType)
    )
    traceEventLogger.logEvent(event)
  }


  private fun appendStaleBlock(block: Block, previousBlockchainElement: BlockchainElement, blockPosition: Long) {
    val newBlockchainElement = BlockchainElement(
      AppendedBlockImpl.fromBlock(
        block,
        simulationContext.systemClock.currentTime
      )
      previousBlockchainElement,
      BlockchainElementType.Stale,
      blockPosition,
    )

    blockchainElementsMap.put(block.hash, newBlockchainElement)

    logBlockAppended(block, blockPosition, previousBlockchainElement.block, BlockType.StaleBlock)
  }


  private fun logBlockAppended(
    block: Block,
    blockPosition: Long,
    previousBlock: Block,
    blockType: BlockType
  ) {
    if (!traceEventLogger.isEventTypeEnabled(BlockAppendedTraceEvent.EVENT_TYPE)) {
      return
    }

    val event = BlockAppendedTraceEvent(
      simulationContext.systemClock.getCurrentTime(),
      block,
      blockPosition,
      previousBlock,
      blockType
    )
    traceEventLogger.logEvent(event)
  }


  override fun getBlocksAtPosition(position: Long): Set<Block> {
    if (position < INITIAL_BLOCKCHAIN_LENGTH) {
      return mutableSetOf<Block>()
    }

    return blockchainElementsMap
      .values
      .filter { it.position == position }
      .map { it.block }
      .toSet()
  }

  override fun getLength(): Long {
    return this.length
  }

  override fun getBlocks(): Set<Block> {
    return blockchainElementsMap.values
      .map { it.block }
      .toSet()
  }

  override fun getPositionOfBlock(block: Block): Long {
    return blockchainElementsMap[block.hash]?.position ?: UNKNOWN_BLOCK_POSITION_RESULT
  }

  override fun getSuccessorBlocks(hash: String): Set<Block>? {
    if (!hasBlockWithHash(hash)) return null

    val startingBlockchain: BlockchainElement = blockchainElementsMap.get(hash)!!

    val successorBlocks = HashSet<BlockchainElement>()
    var immediateSuccessorBlocks = startingBlockchain.nextBlockchainElements

    do {
      val nextImmediateBlockchainElements = HashSet<BlockchainElement>()
      for (be in immediateSuccessorBlocks) {
        nextImmediateBlockchainElements.addAll(be.nextBlockchainElements)
      }

      successorBlocks.addAll(immediateSuccessorBlocks)
      immediateSuccessorBlocks = nextImmediateBlockchainElements
    } while (!immediateSuccessorBlocks.isEmpty())

    return successorBlocks.map { it.block }.toSet()
  }

  override fun getImmediateSuccessorBlocks(hash: String): Set<Block>? {
    if (!hasBlockWithHash(hash)) return null

    val startingBlockchain: BlockchainElement = blockchainElementsMap.get(hash)!!

    return startingBlockchain.nextBlockchainElements.map { it.block }.toSet()
  }

  override fun getLongestSuccessorChainLength(hash: String): Long {
    if (!hasBlockWithHash(hash)) return 0

    // Null unwrap safe, because checked above
    val startingBlockchain: BlockchainElement = blockchainElementsMap[hash]!!

    var successorBlocks = startingBlockchain.nextBlockchainElements

    var length = 0

    while (!successorBlocks.isEmpty()) {
      val nextSuccessorBlocks = HashSet<BlockchainElement>()

      for (be in successorBlocks) {
        nextSuccessorBlocks.addAll(be.nextBlockchainElements)
      }

      successorBlocks = nextSuccessorBlocks
      length++
    }

    return length.toLong()
  }

  override fun getLongestChains(): List<ArrayList<AppendedBlock>> {
    return longestChainsLastBlocks.map {
      val blocks = ArrayList<AppendedBlock>()
      var currentElement: BlockchainElement? = it

      while (currentElement != null) {
        blocks.add(currentElement.block)
        currentElement = currentElement.previousBlockchainElement
      }

      blocks.reverse()

      blocks
    }
  }

  companion object {
    private const val INITIAL_BLOCKCHAIN_LENGTH: Long = 1
    private const val UNKNOWN_BLOCK_POSITION_RESULT: Long = -1

    private fun toBlockType(blockchainElementType: BlockchainElementType): BlockType {
      return when (blockchainElementType) {
        BlockchainElementType.Forking -> BlockType.ForkingBlock
        BlockchainElementType.Included -> BlockType.IncludedBlock
        BlockchainElementType.Stale -> BlockType.StaleBlock
      }
    }
  }
}