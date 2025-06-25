package org.palladiosimulator.blockchainsystems.core.propagation.block

import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block
import org.palladiosimulator.blockchainsystems.core.propagation.GossipPropagationStrategy
import org.palladiosimulator.blockchainsystems.core.propagation.MessageImpl
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Message
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkEndpoint

/**
 * Propagation strategy for blocks in a blockchain system.
 * This strategy handles the propagation of blocks through the network using a gossip protocol.
 *
 * @author Davis Riedel
 */
class BlockPropagationStrategy : GossipPropagationStrategy<Block>() {
  override val INV_MESSAGE_KEY: String = "BLOCK_INV"
  override val GET_DATA_MESSAGE_KEY: String = "BLOCK_GET_DATA"
  override val ELEMENT_MESSAGE_KEY: String = "BLOCK_MSG"

  private val MESSAGE_HEADER_BYTE_SIZE = 24
  private val INV_MESSAGE_BYTE_SIZE = 20
  private val GET_DATA_MESSAGE_BYTE_SIZE = 20


  override fun createInvMessage(element: Block): Message {
    return MessageImpl(element.hash, INV_MESSAGE_KEY, MESSAGE_HEADER_BYTE_SIZE + INV_MESSAGE_BYTE_SIZE)
  }

  override fun createGetDataMessage(elementId: String): Message {
    return MessageImpl(elementId, GET_DATA_MESSAGE_KEY, MESSAGE_HEADER_BYTE_SIZE + GET_DATA_MESSAGE_BYTE_SIZE)
  }

  override fun createElementMessage(element: Block): Message {
    return MessageImpl(element, ELEMENT_MESSAGE_KEY, MESSAGE_HEADER_BYTE_SIZE + element.size)
  }


  override fun handleInvMessageReceived(
    message: Message,
    senderNetworkEndpoint: P2PNetworkEndpoint
  ) {
    context?.blockchain?.let { blockchain ->
      val hash = message.getContent() as String
      if (blockchain.hasBlockWithHash(hash)) {
        // Block already exists, no need to request it
        return
      }
      networkInterface?.send(
        createGetDataMessage(hash),
        senderNetworkEndpoint
      )
    }
  }

  override fun handleGetDataMessageReceived(
    message: Message,
    senderNetworkEndpoint: P2PNetworkEndpoint
  ) {
    val hash = message.getContent() as String
    context?.blockchain?.getBlock(hash)?.let { block ->
      networkInterface?.send(createElementMessage(block), senderNetworkEndpoint)
      logBlockSent(block, senderNetworkEndpoint)
    }
  }

  override fun handleElementMessageReceived(
    message: Message,
    senderNetworkEndpoint: P2PNetworkEndpoint
  ) {
    val block = message.getContent() as Block

    logBlockReceived(block, senderNetworkEndpoint)

    notifyBlockReceived(block)
  }


  private fun notifyBlockReceived(block: Block) {
    onReceivedCallback?.invoke(block)
  }

  private fun logBlockSent(block: Block, receiverNetworkEndpoint: P2PNetworkEndpoint) {
    if (!traceEventLogger.isEventTypeEnabled(BlockSentTraceEvent.EVENT_TYPE)) {
      return
    }

    val event = BlockSentTraceEvent(
      simulationContext.getSystemClock().getCurrentTime(),
      block,
      receiverNetworkEndpoint
    )
    traceEventLogger.logEvent(event)
  }

  private fun logBlockReceived(block: Block, senderNetworkEndpoint: P2PNetworkEndpoint) {
    if (!traceEventLogger.isEventTypeEnabled(BlockReceivedTraceEvent.EVENT_TYPE)) {
      return
    }

    val event = BlockReceivedTraceEvent(
      simulationContext.getSystemClock().getCurrentTime(),
      block,
      senderNetworkEndpoint
    )
    traceEventLogger.logEvent(event)
  }
}