package org.palladiosimulator.blockchainsystems.core.transaction

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Transaction

/**
 * @author Davis Riedel
 */
@JvmRecord
data class TransactionStoredInPoolTraceEvent(
  private val occurrenceTime: Long,
  val storedTransaction: Transaction?
) : TraceEvent {
  companion object {
    const val EVENT_TYPE: String = "TransactionStoredInPoolTraceEvent"
  }

  override fun getOccurrenceTime(): Long = occurrenceTime
  override fun getEventType(): String = EVENT_TYPE

  override fun formatDetails(stringBuilder: StringBuilder) {
    stringBuilder.append("{ txId=")
    stringBuilder.append(storedTransaction!!.getTxId())
    stringBuilder.append(" }")
  }
}