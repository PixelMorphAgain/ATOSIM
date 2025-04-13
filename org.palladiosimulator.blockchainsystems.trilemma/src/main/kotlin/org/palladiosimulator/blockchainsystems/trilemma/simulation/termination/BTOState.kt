package org.palladiosimulator.blockchainsystems.trilemma.simulation.termination

import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockType

class BTOState(
  private val btoState: BlockState,
  private val numberOfBlocksRequiredForBTOAcceptance: Int
) {
  private val btouSuccessorsByHashes = HashMap<String, BlockState>()

  var isBTOAccepted: Boolean = false
    private set

  var wasBTOAccepted: Boolean = false
    private set

  fun isBlockSuccessorOfBTO(block: Block): Boolean {
    return btoState.block.getHash() === block.getPreviousHash()
      || btouSuccessorsByHashes.containsKey(block.getPreviousHash())
  }

  fun addBTOSuccessorBlock(blockState: BlockState) {
    if (!isBlockSuccessorOfBTO(blockState.block)) return
    btouSuccessorsByHashes.put(blockState.block.getHash(), blockState)
    updateIsBTOAccepted()
  }

  fun onBTOBlockTypeChanged(newBlockType: BlockType) {
    btoState.blockType = newBlockType
    updateIsBTOAccepted()
  }

  private fun updateIsBTOAccepted() {
    if (isBTOIncluded && hasRequiredLongestChainSuccessorForAcceptance()) {
      isBTOAccepted = true
      if (!wasBTOAccepted) wasBTOAccepted = true
    } else {
      isBTOAccepted = false
    }
  }

  private fun hasRequiredLongestChainSuccessorForAcceptance(): Boolean {
    return this.numberOfLongestChainSuccessors >= numberOfBlocksRequiredForBTOAcceptance
  }

  val isBTOIncluded: Boolean
    private set
    get() = btoState.blockType == BlockType.IncludedBlock

  val numberOfLongestChainSuccessors: Long
    private set
    get() {
      if (btouSuccessorsByHashes.isEmpty()) return 0

      val latestSuccessorPosition = btouSuccessorsByHashes
        .values
        .stream()
        .mapToLong { obj: BlockState -> obj.blockPosition }
        .max()
        .getAsLong()

      return latestSuccessorPosition - btoState.blockPosition
    }

  val bto: BlockState
    private set
    get() = btoState
}