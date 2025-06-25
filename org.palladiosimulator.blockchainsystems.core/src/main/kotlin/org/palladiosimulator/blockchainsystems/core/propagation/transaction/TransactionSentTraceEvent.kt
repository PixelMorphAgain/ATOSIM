package org.palladiosimulator.blockchainsystems.core.propagation.transaction

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkEndpoint
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction

/**
 * @author Davis Riedel
 */
data class TransactionSentTraceEvent(
  override val occurrenceTime: Long,
  val sentTransaction: Transaction,
  val receivingNetworkEndpoint: P2PNetworkEndpoint
) : TraceEvent {
  companion object {
    const val EVENT_TYPE = "TransactionSentTraceEvent"
  }

  override val eventType = EVENT_TYPE

  override fun formatDetails(stringBuilder: StringBuilder) {
    stringBuilder.append("{ txId=")
    stringBuilder.append(sentTransaction.txId)
    stringBuilder.append("; sentToNetworkEndpoint=")
    stringBuilder.append(receivingNetworkEndpoint.getEndpointId())
    stringBuilder.append(" }")
  }
}