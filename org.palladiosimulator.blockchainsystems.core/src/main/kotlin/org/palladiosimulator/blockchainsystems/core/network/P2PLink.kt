package org.palladiosimulator.blockchainsystems.core.network

import org.palladiosimulator.blockchainsystems.core.common.P2PNetworkObject
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
import org.palladiosimulator.blockchainsystems.core.common.abstractions.ValueProvider
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Message

class P2PLink(
  private val latencyValueProvider: ValueProvider<LinkLatency>,
  private val throughputValueProvider: ValueProvider<LinkThroughput>,
  private val fromNode: P2PNode,
  private val toNode: P2PNode
) : P2PNetworkObject() {
  fun send(messageContent: Message) {
    val msEvent = MessageSentEvent(
      simulationContext.getSystemClock().getCurrentTime(),
      P2PLinkMessageFrame(
        messageContent,
        simulationContext.getSystemClock().getCurrentTime()
      ),
      this,
      toNode,
      fromNode
    )

    simulationContext
      .getEventCoordinator()
      .raiseEvent(msEvent)
  }


  override fun dispatchEvent(event: Event) {
    when (event.getEventType()) {
      "MessageReceivedEvent" -> handleMessageReceivedEvent(event as MessageReceivedEvent)
      "MessageSentEvent" -> handleMessageSentEvent(event as MessageSentEvent)
    }
  }

  private fun handleMessageReceivedEvent(event: MessageReceivedEvent) {
    event
      .recipientNode
      .onReceive(
        event.message.content,
        event.senderNode
      )
  }

  private fun handleMessageSentEvent(event: MessageSentEvent) {
    val transmissionDuration = latencyValueProvider.getValue().latency + event.message.content.getSize()
      .toLong() / throughputValueProvider.getValue()!!

    val newMessageReceivedEvent = MessageReceivedEvent(
      event.message,
      simulationContext
        .getSystemClock()
        .getCurrentTime() + transmissionDuration,
      this,
      event.recipientNode,
      event.senderNode
    )

    simulationContext
      .getEventCoordinator()
      .raiseEvent(newMessageReceivedEvent)
  }

  companion object {
    fun create(
      latencyValueProvider: ValueProvider<LinkLatency>,
      throughputValueProvider: ValueProvider<LinkThroughput>,
      fromNode: P2PNode,
      toNode: P2PNode
    ): P2PLink {
      return P2PLink(
        latencyValueProvider,
        throughputValueProvider,
        fromNode,
        toNode
      )
    }
  }
}