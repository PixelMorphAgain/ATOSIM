package org.palladiosimulator.blockchainsystems.core.transaction

import kotlinx.serialization.Serializable
import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction

// TODO: Why is this not used?

/**
 * Trace event that is triggered when a transaction is included in a block.
 *
 * @author Davis Riedel
 */
@Serializable
data class TransactionIncludedInBlockTraceEvent(
  override val occurrenceTime: Long,
  val transaction: Transaction,
  val block: Block
) : TraceEvent {
  companion object {
    const val EVENT_TYPE: String = "TransactionIncludedInBlockTraceEvent"
  }

  override val eventType = EVENT_TYPE
}