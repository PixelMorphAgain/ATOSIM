package org.palladiosimulator.blockchainsystems.core.system.abstractions

import org.palladiosimulator.blockchainsystems.core.common.abstractions.Traceable
import java.util.function.Consumer

/**
 * The [BlockPropagationStrategy] interface is an abstraction
 * of the strategy used to exchange blocks and transactions between nodes.
 *
 * @author Yannik Sproll, Davis Riedel
 */
interface PropagationStrategy<E : Propagatable> : Traceable {
  /**
   * Distributes the specified element to all neighbors.
   *
   * @param element the element to distribute
   */
  fun distribute(element: E)

  /**
   * Distributes the specified element to the specified neighbors.
   *
   * @param element           the element to distribute
   * @param neighborEndpoints the neighbors to receive the element
   */
  fun distribute(element: Block, neighborEndpoints: MutableSet<P2PNetworkEndpoint>)

  /**
   * Sets the network interface used to send the elements to the neighbors.
   *
   * @param networkInterface used to send elements
   */
  fun setNetworkInterface(networkInterface: NodeP2PNetworkInterface)

  /**
   * Sets the blockchain instance.
   *
   * @param blockchain the blockchain instance
   */
  fun setBlockchain(blockchain: Blockchain)

  /**
   * Sets a callback that is invoked if an element is received from the assigned network interface.
   *
   * @param onReceivedCallback callback that is invoked when a new element is received
   */
  fun setOnReceivedCallback(onBlockReceivedCallback: Consumer<E>)
}