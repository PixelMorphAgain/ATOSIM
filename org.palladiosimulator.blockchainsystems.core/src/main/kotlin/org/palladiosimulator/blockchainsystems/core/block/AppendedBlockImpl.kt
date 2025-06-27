package org.palladiosimulator.blockchainsystems.core.block

import org.palladiosimulator.blockchainsystems.core.block.abstractions.AppendedBlock
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction

class AppendedBlockImpl private constructor(
  override val appendedTimestamp: Long,
  hash: String,
  previousHash: String?,
  originId: String?,
  blockMinedTimestamp: Long,
  size: Int,
  transactions: Set<Transaction>,
  tags: Set<String>
) : AppendedBlock, BlockImpl(
  hash,
  previousHash,
  originId,
  blockMinedTimestamp,
  size,
  transactions,
  tags
) {
  companion object {
    fun fromBlock(
      block: BlockImpl,
      appendedTimestamp: Long,
    ): AppendedBlockImpl {
      return AppendedBlockImpl(
        appendedTimestamp,
        block.hash,
        block.previousHash,
        block.originId,
        block.blockMinedTimestamp,
        block.size,
        block.transactions,
        block.tags
      )
    }
  }
}