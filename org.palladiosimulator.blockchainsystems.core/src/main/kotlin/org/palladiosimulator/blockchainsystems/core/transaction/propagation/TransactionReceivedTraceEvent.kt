package org.palladiosimulator.blockchainsystems.core.transaction.propagation

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkEndpoint
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction

/**
 * @author Davis Riedel
 */
@JvmRecord
data class TransactionReceivedTraceEvent(
  private val occurrenceTime: Long,
  val sentTransaction: Transaction,
  val receivingNetworkEndpoint: P2PNetworkEndpoint
) : TraceEvent {
  companion object {
    const val EVENT_TYPE: String = "TransactionReceivedTraceEvent"
  }

  override fun getOccurrenceTime(): Long = occurrenceTime
  override fun getEventType(): String = EVENT_TYPE

  override fun formatDetails(stringBuilder: StringBuilder) {
    stringBuilder.append("{ txId=")
    stringBuilder.append(sentTransaction.getTxId())
    stringBuilder.append("; receivedFromNetworkEndpoint=")
    stringBuilder.append(receivingNetworkEndpoint.getEndpointId())
    stringBuilder.append(" }")
  }
}