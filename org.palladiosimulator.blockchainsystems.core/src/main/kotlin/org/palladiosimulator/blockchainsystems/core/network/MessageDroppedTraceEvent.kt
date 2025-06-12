package org.palladiosimulator.blockchainsystems.core.network

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent
import java.lang.StringBuilder

/**
 * Represents a trace event that is triggered when a message is dropped in the P2P network.
 *
 * @param message The message that was dropped.
 * @param occurrenceTime The time at which the event occurred.
 * @param target The target of the event, typically the component that handles the event.
 * @param recipientNode The node that was supposed to receive the message.
 * @param senderNode The node that sent the message.
 *
 * @author Davis Riedel
 */
data class MessageDroppedTraceEvent(
  val message: P2PLinkMessageFrame,
  val occurrenceTime: Long,
  val recipientNode: P2PNode,
  val senderNode: P2PNode,
) : TraceEvent {
  override fun getOccurrenceTime(): Long {
    return this.occurrenceTime
  }

  override fun getEventType(): String {
    return EVENT_TYPE
  }

  override fun formatDetails(stringBuilder: StringBuilder) {
    with(stringBuilder) {
      append("MessageDroppedTraceEvent: ")
      append("Message content: ")
      append(message.content)
      append(", Occurrence time: ")
      append(occurrenceTime)
      append(", Sender node: ")
      append(senderNode.endpointId)
      append(", Recipient node: ")
      append(recipientNode.endpointId)
    }
  }

  companion object {
    const val EVENT_TYPE = "MessageDroppedEvent"
  }
}