package org.palladiosimulator.blockchainsystems.core.transactionpropagation

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkEndpoint
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Transaction

/**
 * @author Davis Riedel
 */
@JvmRecord
data class TransactionSentTraceEvent(
  private val occurrenceTime: Long,
  val sentTransaction: Transaction?,
  val receivingNetworkEndpoint: P2PNetworkEndpoint?
) : TraceEvent {
  companion object {
    const val EVENT_TYPE: String = "TransactionSentTraceEvent"
  }

  override fun getOccurrenceTime(): Long = occurrenceTime
  override fun getEventType(): String = EVENT_TYPE

  override fun formatDetails(stringBuilder: StringBuilder) {
    stringBuilder.append("{ txId=")
    stringBuilder.append(sentTransaction!!.getTxId())
    stringBuilder.append("; sentToNetworkEndpoint=")
    stringBuilder.append(receivingNetworkEndpoint!!.getEndpointId())
    stringBuilder.append(" }")
  }
}