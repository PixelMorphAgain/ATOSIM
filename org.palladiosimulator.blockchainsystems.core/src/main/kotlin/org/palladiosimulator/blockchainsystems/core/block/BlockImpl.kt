package org.palladiosimulator.blockchainsystems.core.block

import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction

open class BlockImpl(
  override val hash: String,
  override val previousHash: String?,
  override val originId: String?,
  override val blockMinedTimestamp: Long,
  override val size: Int,
  override val transactions: Set<Transaction>,
  val tags: Set<String>
) : Block {
  override fun hasTag(tag: String): Boolean {
    return tags.contains(tag)
  }
}