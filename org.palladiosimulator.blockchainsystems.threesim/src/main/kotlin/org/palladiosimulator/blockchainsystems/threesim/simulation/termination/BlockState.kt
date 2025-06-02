package org.palladiosimulator.blockchainsystems.threesim.simulation.termination

import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockType

class BlockState(
  val block: Block,
  val blockPosition: Long,
  var blockType: BlockType
)