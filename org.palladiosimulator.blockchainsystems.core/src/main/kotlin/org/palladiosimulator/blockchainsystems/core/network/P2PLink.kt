package org.palladiosimulator.blockchainsystems.core.network

import org.palladiosimulator.blockchainsystems.core.common.P2PNetworkObject
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
import org.palladiosimulator.blockchainsystems.core.common.abstractions.SimulationLifecycleAwareValueProvider
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Message
import kotlin.math.roundToLong

/**
 * Unidirectional link between two [P2PNode]s in a P2P network.
 *
 * @author Davis Riedel, Yannik Sproll
 */
class P2PLink(
  private val latencyValueProvider: SimulationLifecycleAwareValueProvider<Long>,
  private val throughputValueProvider: SimulationLifecycleAwareValueProvider<Long>,
  val fromNode: P2PNode,
  val toNode: P2PNode
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
      simulationContext.systemClock.currentTime,
      P2PLinkMessageFrame(
        messageContent,
        simulationContext.systemClock.currentTime
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
    when (event.eventType) {
      MessageDroppedEvent.EVENT_TYPE -> handleMessageDroppedEvent(event as MessageDroppedEvent)
      MessageReceivedEvent.EVENT_TYPE -> handleMessageReceivedEvent(event as MessageReceivedEvent)
      MessageSentEvent.EVENT_TYPE -> handleMessageSentEvent(event as MessageSentEvent)
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

  private fun handleMessageDroppedEvent(event: MessageDroppedEvent) {
    event
      .senderNode
      .onMessageDropped(
        event.message.content,
        event.recipientNode
      )
  }

  private fun handleMessageSentEvent(event: MessageSentEvent) {
    val mbps = throughputValueProvider.getValue() // in Megabits per second (Mbps)

    val event = if (mbps <= 0) {
      // Link failed, raise message dropped event
      MessageDroppedEvent(
        event.message,
        simulationContext.systemClock.currentTime,
        this,
        event.recipientNode,
        event.senderNode
      )
    } else {
      // Link is operational, send message

      val latency = latencyValueProvider.getValue()
      val messageSize = event.message.content.getSize().toLong()

      val bpms = mbps * 1_000_000.0 / 8 // Convert Mbps to bytes per millisecond
      val transmissionDuration = (latency + messageSize / bpms).roundToLong()

      MessageReceivedEvent(
        event.message,
        simulationContext.systemClock.currentTime + transmissionDuration,
        this,
        event.recipientNode,
        event.senderNode
      )
    }

    simulationContext
      .eventCoordinator
      .raiseEvent(event)
  }
}