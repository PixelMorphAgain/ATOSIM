package org.palladiosimulator.blockchainsystems.core.system.abstractions;

import java.util.Set;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.SimulationLifecycleAware;

/**
 * The @code{P2PNetwork} interface is an abstraction of a
 * blockchain system's underlying P2P network.
 * 
 * @author Yannik Sproll
 *
 */
public interface P2PNetwork extends SimulationLifecycleAware {
	
	/**
	 * Returns all network interfaces of the network.
	 * 
	 * @return set of network interfaces
	 */
	Set<NodeP2PNetworkInterface> getNodes();
	
	/**
	 * Returns the neighbors of the specified network interface
	 * 
	 * @param networkInterface the network interface
	 * @return a set of neighbor network endpoints
	 */
	Set<P2PNetworkEndpoint> getNeighbors(NodeP2PNetworkInterface networkInterface);
	
	/**
	 * Multicasts the specified message from the sending network interface
	 * to all of its neighbors.
	 * 
	 * @param sendingNetworkInterface the network interface from which the message is sent
	 * @param content the message that is multicasted
	 */
	void multicast(NodeP2PNetworkInterface sendingNetworkInterface, Message content);
	
	/**
	 * Sends a message from the sending network interface to the receiving network interface.
	 * 
	 * @param sendingNetworkInterface the network interface that sends the specified message
	 * @param receivingNetworkInterface the network interface that receives the specified message
	 * @param content the message that is sent.
	 */
	void send(NodeP2PNetworkInterface sendingNetworkInterface, NodeP2PNetworkInterface receivingNetworkInterface, Message content);
}
