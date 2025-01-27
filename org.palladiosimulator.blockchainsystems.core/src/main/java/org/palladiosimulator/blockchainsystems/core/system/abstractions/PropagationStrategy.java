package org.palladiosimulator.blockchainsystems.core.system.abstractions;

import java.util.Set;
import java.util.function.Consumer;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.Traceable;

/**
 * The @code{PropagationStrategy} interface is an abstraction
 * of the strategy used to exchange objects between nodes.
 *
 * @param <T> the type of object to propagate
 *
 * @author Yannik Sproll, Davis Riedel
 */
public interface PropagationStrategy<T> extends Traceable {

    /**
     * Distributes the specified object to all neighbors.
     *
     * @param propagationObject the object to distribute
     */
    void distribute(T propagationObject);

    /**
     * Distributes the specified block to the specified neighbors.
     *
     * @param propagationObject the object to distribute
     * @param neighborEndpoints the neighbors to receive the block
     */
    void distribute(T propagationObject, Set<P2PNetworkEndpoint> neighborEndpoints);

    /**
     * Sets the network interface used to send the object to the neighbors.
     *
     * @param networkInterface used to send objects
     */
    void setNetworkInterface(NodeP2PNetworkInterface networkInterface);

    /**
     * Sets the blockchain instance.
     *
     * @param blockchain the blockchain instance
     */
    void setBlockchain(Blockchain blockchain);

    /**
     * Sets a callback that is invoked if a propagated object is received from the assigned network interface.
     *
     * @param onPropagatedObjectReceivedCallback callback that is invoked when a new object is received
     */
    void setOnPropagatedObjectReceivedCallback(Consumer<T> onPropagatedObjectReceivedCallback);
}
