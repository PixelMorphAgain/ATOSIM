// TODO: Why is BTOState not used anymore? Something is broken

//package org.palladiosimulator.blockchainsystems.threesim.simulation.termination
//
//import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block
//import org.palladiosimulator.blockchainsystems.core.block.abstractions.BlockType
//
//
///**
// * Represents the state of a BTO in the blockchain simulation.
// *
// * @property btoState The state of the BTO block.
// * @property numberOfBlocksRequiredForBTOAcceptance The number of blocks required for BTO acceptance.
// *
// * @author Yannik Sproll, Davis Riedel
// */
//class BTOState(
//  private val btoState: BlockState,
//  private val numberOfBlocksRequiredForBTOAcceptance: Int
//) {
//  private val btoSuccessorsByHashes = HashMap<String, BlockState>()
//
//  var isBTOAccepted: Boolean = false
//    private set
//
//  var wasBTOAccepted: Boolean = false
//    private set
//
//  fun isBlockSuccessorOfBTO(block: Block): Boolean {
//    return btoState.block.getHash() === block.getPreviousHash()
//      || btoSuccessorsByHashes.containsKey(block.getPreviousHash())
//  }
//
//  fun addBTOSuccessorBlock(blockState: BlockState) {
//    if (!isBlockSuccessorOfBTO(blockState.block)) return
//    btoSuccessorsByHashes.put(blockState.block.getHash(), blockState)
//    updateIsBTOAccepted()
//  }
//
//  fun onBTOBlockTypeChanged(newBlockType: BlockType) {
//    btoState.blockType = newBlockType
//    updateIsBTOAccepted()
//  }
//
//  private fun updateIsBTOAccepted() {
//    if (isBTOIncluded && hasRequiredLongestChainSuccessorForAcceptance()) {
//      isBTOAccepted = true
//      if (!wasBTOAccepted) wasBTOAccepted = true
//    } else {
//      isBTOAccepted = false
//    }
//  }
//
//  private fun hasRequiredLongestChainSuccessorForAcceptance(): Boolean {
//    return this.numberOfLongestChainSuccessors >= numberOfBlocksRequiredForBTOAcceptance
//  }
//
//  val isBTOIncluded: Boolean
//    private set
//    get() = btoState.blockType == BlockType.IncludedBlock
//
//  val numberOfLongestChainSuccessors: Long
//    private set
//    get() {
//      if (btoSuccessorsByHashes.isEmpty()) return 0
//
//      val latestSuccessorPosition = btoSuccessorsByHashes
//        .values
//        .stream()
//        .mapToLong { obj: BlockState -> obj.blockPosition }
//        .max()
//        .getAsLong()
//
//      return latestSuccessorPosition - btoState.blockPosition
//    }
//
//  val bto: BlockState
//    private set
//    get() = btoState
//}