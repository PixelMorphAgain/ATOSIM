package org.palladiosimulator.blockchainsystems.core.blockchain

import org.palladiosimulator.blockchainsystems.core.block.abstractions.AppendedBlock
import java.util.Collections

/**
 * An element in the simulator's blockchain abstraction
 *
 * @author Yannik Sproll, Davis Riedel
 */
class BlockchainElement(
  val block: AppendedBlock,
  val previousBlockchainElement: BlockchainElement?,
  var type: BlockchainElementType,
  val position: Long
) {
  private val mutableNextBlockchainElements: HashSet<BlockchainElement> = hashSetOf()

  val nextBlockchainElements: Set<BlockchainElement>
    get() = Collections.unmodifiableSet(mutableNextBlockchainElements)

  init {
    previousBlockchainElement?.mutableNextBlockchainElements?.add(this)
  }
}