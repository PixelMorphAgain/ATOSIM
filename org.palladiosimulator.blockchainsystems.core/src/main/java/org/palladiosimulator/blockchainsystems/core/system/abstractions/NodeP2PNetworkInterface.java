package org.palladiosimulator.blockchainsystems.core.system.abstractions;

import java.util.Set;
import java.util.function.BiConsumer;

/**
 * The @code{NodeP2PNetworkInterface} interface represents the interface
 * between a blockchain system node and the underlying P2P network.
 *
 * @author Yannik Sproll
 */
public interface NodeP2PNetworkInterface extends P2PNetworkEndpoint {

    /**
     * Sends (multicasts) a given message to all neighbors of a blockchain system node.
     *
     * @param message the message to be multicasted
     */
    void multicast(Message message);

    /**
     * Sends the specified message to the specified recipient.
     * This recipient must be a neighbor of the current blockchain system node.
     *
     * @param message   the message to send
     * @param recipient the recipient neighbor of the message
     */
    void send(Message message, P2PNetworkEndpoint recipient);

    /**
     * Returns a set of network endpoints, one for each neighbor node.
     *
     * @return set of neighbor network endpoints
     */
    Set<P2PNetworkEndpoint> getNeighbors();

    /**
     * Sets the callback that is invoked when a message is received from
     * one of the current blockchain system neighbors.
     *
     * @param onMessageReceivedCallback the callback to be set
     */
    public void setOnReceivedCallback(BiConsumer<Message, P2PNetworkEndpoint> onMessageReceivedCallback);
}
