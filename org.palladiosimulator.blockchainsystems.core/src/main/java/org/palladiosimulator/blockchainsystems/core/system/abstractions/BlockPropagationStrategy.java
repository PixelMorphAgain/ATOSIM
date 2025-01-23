package org.palladiosimulator.blockchainsystems.core.system.abstractions;

import java.util.Set;
import java.util.function.Consumer;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.Tracable;

/**
 * The @code{BlockPropagationStrategy} interface is an abstraction
 * of the strategy used to exchange blocks between nodes.
 * 
 * @author Yannik Sproll
 *
 */
public interface BlockPropagationStrategy extends Tracable {

	/**
	 * Distributes the specified block to all neighbors.
	 * 
	 * @param block the block to distribute
	 */
	void distributeBlock(Block block);
	
	/**
	 * Distributes the specified block to the specified neighbors.
	 * 
	 * @param block the block to distribute
	 * @param neighborEndpoints the neighbors to receive the block
	 */
	void distributeBlock(Block block, Set<P2PNetworkEndpoint> neighborEndpoints);
	
	/**
	 * Sets the network interface used to send the blocks to the neighbors.
	 * 
	 * @param networkInterface used to send blocks
	 */
	void setNetworkInterface(NodeP2PNetworkInterface networkInterface);
	
	/**
	 * Sets the blockchain instance.
	 * 
	 * @param blockchain
	 */
	void setBlockchain(Blockchain blockchain);
	
	/**
	 * Sets a callback that is invoked if a block is received from the assigned network interface.
	 * 
	 * @param onBlockReceivedCallback callback that is invoked when a new block is received
	 */
	void setOnBlockReceivedCallback(Consumer<Block> onBlockReceivedCallback);
}
