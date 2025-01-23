package org.palladiosimulator.blockchainsystems.core.system.abstractions;

/**
 * The {@code P2PNetworkCreationResult} class is a wrapper for {@code P2PNetwork} instances
 * created by a {@code P2PNetworkFactory}.
 * 
 * @author Yannik Sproll
 *
 */
public interface P2PNetworkCreationResult {

	/**
	 * Returns the created instance of the {@code P2PNetwork}.
	 * 
	 * @return instance of {@code P2PNetwork}
	 */
	P2PNetwork	getCreatedNetwork();
}
