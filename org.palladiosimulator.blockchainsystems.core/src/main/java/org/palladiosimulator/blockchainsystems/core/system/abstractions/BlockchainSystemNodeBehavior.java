package org.palladiosimulator.blockchainsystems.core.system.abstractions;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.Tracable;

/**
 * The @code{BlockchainSystemNodeBehavior} interfaces defines the behavior of
 * a blockchain system node. It provides callbacks to handle the various events
 * that can occur within an blockchain system node.
 * 
 * @author Yannik Sproll
 *
 */
public interface BlockchainSystemNodeBehavior extends Tracable {
	
	/**
	 * This callback is invoked when the node is initialized.
	 * 
	 * @param context the context of the blockchain system node
	 */
	void onNodeInitialized(BlockchainSystemNodeContext context);

	/**
	 * This callback is invoked when the node receives a block from one of its neighbors.
	 * 
	 * @param block the received block
	 * @param context the context of the blockchain system node
	 */
	void onBlockReceived(Block block, BlockchainSystemNodeContext context);
	
	/**
	 * This callback is invoked when the node has finished the validation of a block.
	 * 
	 * @param block the validated block
	 * @param isValid indicates if the block is valid
	 * @param context the context of the blockchain system node
	 */
	void onBlockValidated(Block block, Boolean isValid, BlockchainSystemNodeContext context);
	
	/**
	 * This callback is invoked when the node has finished mining a block.
	 * 
	 * @param block the block that was mined
	 * @param context the context of the blockchain system node
	 */
	void onBlockMined(Block block, BlockchainSystemNodeContext context);
	
	/**
	 * This callback is invoked when a block instance must be created.
	 * 
	 * @param blockMinedAt the time at which the block was mined
	 * @param blockHash the hash of the mined block
	 * @param previousBlockHash the hash of predecessor to the mined block
	 * @param context the context of the blockchain system node
	 * @return the block instance
	 */
	Block onCreatingBlock(Long blockMinedAt, String previousBlockHash, BlockchainSystemNodeContext context);
	
	/**
	 * This callback is invoked when a previous block for the next block mining must be selected.
	 * 
	 * @param context the context of the blockchain system node
	 * @return the hash of the selected previous block
	 */
	String onPreviousBlockSelection(BlockchainSystemNodeContext context);
}
