package org.palladiosimulator.blockchainsystems.core.system.abstractions;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.Tracable;

/**
 * The {@code Blockchain} interface represents
 * the blockchain datastructure of a blockchain system node.
 * 
 * @author Yannik Sproll
 *
 */
public interface Blockchain extends ReadonlyBlockchain, Tracable {
	
	/**
	 * Appends the specified block to the blockchain.
	 * It returns a @code{BlockAppendingResult} that describes how and if the block was added to the blockchain.
	 * 
	 * @param block the block to append to the blockchain
	 * @return the @code{BlockAppendingResult} that describes the result of the append operation
	 */
	BlockAppendingResult appendBlock(Block block);
}
