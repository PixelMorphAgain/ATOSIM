package org.palladiosimulator.blockchainsystems.core.transaction

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction

/**
 * @author Davis Riedel
 */
data class TransactionStoredInMemPoolTraceEvent(
  override val occurrenceTime: Long,
  val storedTransaction: Transaction
) : TraceEvent {
  companion object {
    const val EVENT_TYPE: String = "TransactionStoredInPoolTraceEvent"
  }

  override val eventType = EVENT_TYPE

  override fun formatDetails(stringBuilder: StringBuilder) {
    stringBuilder.append("{ txId=")
    stringBuilder.append(storedTransaction.txId)
    stringBuilder.append(" }")
  }
}