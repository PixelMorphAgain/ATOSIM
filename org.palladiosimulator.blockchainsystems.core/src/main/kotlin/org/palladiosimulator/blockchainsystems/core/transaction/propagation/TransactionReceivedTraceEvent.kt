package org.palladiosimulator.blockchainsystems.core.transaction.propagation

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkEndpoint
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction

/**
 * @author Davis Riedel
 */
data class TransactionReceivedTraceEvent(
  override val occurrenceTime: Long,
  val sentTransaction: Transaction,
  val receivingNetworkEndpoint: P2PNetworkEndpoint
) : TraceEvent {
  companion object {
    const val EVENT_TYPE: String = "TransactionReceivedTraceEvent"
  }

  override val eventType = EVENT_TYPE

  override fun formatDetails(stringBuilder: StringBuilder) {
    stringBuilder.append("{ txId=")
    stringBuilder.append(sentTransaction.txId)
    stringBuilder.append("; receivedFromNetworkEndpoint=")
    stringBuilder.append(receivingNetworkEndpoint.getEndpointId())
    stringBuilder.append(" }")
  }
}