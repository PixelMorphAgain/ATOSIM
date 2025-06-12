package org.palladiosimulator.blockchainsystems.core.network

import org.palladiosimulator.blockchainsystems.core.common.P2PNetworkObject
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
import org.palladiosimulator.blockchainsystems.core.common.abstractions.SimulationLifecycleAwareValueProvider
import org.palladiosimulator.blockchainsystems.core.common.abstractions.ValueProvider
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Message

/**
 * Unidirectional link between two [P2PNode]s in a P2P network.
 *
 * @author Davis Riedel, Yannik Sproll
 */
class P2PLink(
  private val latencyValueProvider: SimulationLifecycleAwareValueProvider<Long>,
  private val throughputValueProvider: SimulationLifecycleAwareValueProvider<Int>,
  private val fromNode: P2PNode,
  private val toNode: P2PNode
) : P2PNetworkObject() {
  override fun onInitialize() {
    super.onInitialize()
    latencyValueProvider.initialize(simulationContext)
    throughputValueProvider.initialize(simulationContext)
  }

  override fun onCleanup() {
    super.onCleanup()
    latencyValueProvider.cleanup()
    throughputValueProvider.cleanup()
  }

  fun send(messageContent: Message) {
    val msEvent = MessageSentEvent(
      simulationContext.systemClock.getCurrentTime(),
      P2PLinkMessageFrame(
        messageContent,
        simulationContext.systemClock.getCurrentTime()
      ),
      this,
      toNode,
      fromNode
    )

    simulationContext
      .eventCoordinator
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
    val latency = latencyValueProvider.getValue()
    val throughput = throughputValueProvider.getValue()
    val messageSize = event.message.content.getSize().toLong()

    if (throughput <= 0) {
      // Link failed, log message dropped event
      if (!traceEventLogger.isEventTypeEnabled(MessageDroppedTraceEvent.EVENT_TYPE)) return
      traceEventLogger.logEvent(
        MessageDroppedTraceEvent(
          event.message,
          simulationContext.systemClock.currentTime,
          this,
          event.recipientNode,
          event.senderNode
        )
      )
    } else {
      // Link is operational, send message

      val transmissionDuration = latency + messageSize / throughput

      val event = MessageReceivedEvent(
        event.message,
        simulationContext.systemClock.currentTime + transmissionDuration,
        this,
        event.recipientNode,
        event.senderNode
      )

      simulationContext
        .eventCoordinator
        .raiseEvent(event)
    }
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