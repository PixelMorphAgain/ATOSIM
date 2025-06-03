package org.palladiosimulator.blockchainsystems.threesim.simulation.termination

import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockType

/**
 * Represents the state of a block in the blockchain simulation.
 *
 * @property block The block itself.
 * @property blockPosition The position of the block in the blockchain.
 * @property blockType The type of the block (e.g. included, stale, forking).
 *
 * @author Davis Riedel
 */
data class BlockState(
  val block: Block,
  val blockPosition: Long,
  var blockType: BlockType
)