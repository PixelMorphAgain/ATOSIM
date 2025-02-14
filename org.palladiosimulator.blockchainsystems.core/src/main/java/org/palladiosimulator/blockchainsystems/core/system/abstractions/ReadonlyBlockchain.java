package org.palladiosimulator.blockchainsystems.core.system.abstractions;

import java.util.Set;

/**
 * The {@code ReadonlyBlockchain} interface represents
 * a readonly blockchain datastructure of a blockchain system node.
 * 
 * @author Yannik Sproll
 *
 */
public interface ReadonlyBlockchain {

	/**
	 * Returns a set of the latest blocks of the blockchain.
	 * If the blockchain is forked, this set contains more than one block.
	 * Otherwise it contains only one block.
	 * 
	 * @return set of the latest blocks in the blockchain
	 */
	Set<Block> getLastBlocksOfLongestChains();
	
	/**
	 * Returns all blocks in the blockchain
	 * 
	 * @return blocks in the blockchain
	 */
	Set<Block> getBlocks();
	
	/**
	 * Returns all blocks at the given position.
	 * If there are no stale blocks at this position in the blockchain this set only contains one block.
	 * 
	 * @return set of blocks at the specified position
	 */
	Set<Block> getBlocksAtPosition(long position);
	
	/**
	 * Returns the position of the block in the blockchain, or -1 if the block is not stored in the blockchain
	 * 
	 * @param block the block whose position is requested
	 * @return the position of the block or -1
	 */
	long getPositionOfBlock(Block block);
	
	/**
	 * Returns the length of the blockchain.
	 * 
	 * @return length of the blockchain
	 */
	long length();
	
	/**
	 * Check if there is a block with the specified hash in the blockchain.
	 * 
	 * @param hash the hash of the block to check
	 * @return true if the block is contained in the blockchain
	 */
	boolean hasBlockWithHash(String hash);
	
	/**
	 * Returns the block with the specified hash if it is contained in the blockchain.
	 * Otherwise it returns null.
	 * 
	 * @param hash the block identifier hash
	 * @return the block with specified hash as identifier
	 */
	Block getBlock(String hash);
	
	/**
	 * Returns all successor blocks the immediately follow the block with the specified hash if the block is contained in the blockchain.
	 * Otherwise returns null.
	 * 
	 * @param hash the block identifier hash
	 * @return set of all immediate successor blocks
	 */
	Set<Block> getImmediateSuccessorBlocks(String hash);
	
	/**
	 * Returns all successor blocks of the block with the specified hash if the block is contained in the blockchain.
	 * Otherwise returns null.
	 * 
	 * @param hash the block identifier hash
	 * @return set of all successor blocks
	 */
	Set<Block> getSuccessorBlocks(String hash);
	
	/**
	 * Returns the number of successors in the longest chain that is a successor to the block of the specified hash.
	 * If the block is not contained in the blockchain, returns 0.
	 * 
	 * @param hash the block identifier hash
	 * @return length of the longest successor chain
	 */
	long getLongestSuccessorChainLength(String hash);
}
