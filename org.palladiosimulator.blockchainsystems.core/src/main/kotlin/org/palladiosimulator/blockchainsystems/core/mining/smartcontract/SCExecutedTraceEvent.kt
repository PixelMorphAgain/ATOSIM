package org.palladiosimulator.blockchainsystems.core.mining.smartcontract

import org.palladiosimulator.blockchainsystems.core.system.abstractions.Transaction
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent

/**
 * @author Davis Riedel
 */
class SCExecutedTraceEvent(
  private val occurrenceTime: Long,
  private val transaction: Transaction
) : TraceEvent {
  companion object {
    const val EVENT_TYPE = "SCExecutedTraceEvent"
  }

  override fun getOccurrenceTime(): Long = occurrenceTime
  override fun getEventType(): String = EVENT_TYPE

  override fun formatDetails(stringBuilder: StringBuilder) {
    stringBuilder.append("{ txId=")
    stringBuilder.append(transaction.txId)
    stringBuilder.append(" }")
  }
}
