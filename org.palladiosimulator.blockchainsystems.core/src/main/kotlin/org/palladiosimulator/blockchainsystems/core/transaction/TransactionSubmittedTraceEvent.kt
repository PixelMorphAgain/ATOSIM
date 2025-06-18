package org.palladiosimulator.blockchainsystems.core.transaction

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction

data class TransactionSubmittedTraceEvent(
  override val occurrenceTime: Long,
  val transaction: Transaction
) : TraceEvent {
  companion object {
    const val EVENT_TYPE = "TransactionSubmittedTraceEvent"
  }

  override val eventType = EVENT_TYPE

  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("{ txId=")
      append(transaction.txId)
      append(", size=")
      append(transaction.size)
      append(", amount=")
      append(transaction.amount)
      append(", fee=")
      append(transaction.fee)
      append("}")
    }
  }
}