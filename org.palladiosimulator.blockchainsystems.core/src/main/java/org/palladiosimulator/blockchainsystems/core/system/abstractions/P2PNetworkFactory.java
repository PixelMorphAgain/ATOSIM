package org.palladiosimulator.blockchainsystems.core.system.abstractions;

/**
 * Interface for a factory that produces instances of {@code P2PNetwork}.
 *
 * @author Yannik Sproll
 */
public interface P2PNetworkFactory {

    /**
     * Creates an instance of @code{P2PNetwork} and returns and instance of the {@code P2PNetworkCreationResult}
     * that contains the created {@code P2PNetwork} instance.
     *
     * @return a @code{P2PNetworkCreationResult} instance, containing the created network
     */
    P2PNetworkCreationResult createP2PNetwork();
}
