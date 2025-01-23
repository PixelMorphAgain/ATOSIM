package org.palladiosimulator.blockchainsystems.core.system.abstractions;

/**
 * The @code{BlockAppendingResult} class describes
 * the result of a block appending operation on a blockchain.
 * 
 * @author Yannik Sproll
 *
 */
public class BlockAppendingResult {
	private BlockAppendingResultType _type;
	private BlockType _blockType;
	
	private BlockAppendingResult(BlockAppendingResultType type, BlockType blockType) {
		_type = type;
		_blockType = blockType;
	}
	
	/**
	 * 
	 * @return
	 */
	public BlockAppendingResultType getType() {
		return _type;
	}
	
	/**
	 * 
	 * @return
	 */
	public BlockType getBlockType() {
		return _blockType;
	}
	
	/**
	 * 
	 * @param blockType
	 * @return
	 */
	public static BlockAppendingResult createBlockAppendedResult(BlockType blockType) {
		return new BlockAppendingResult(BlockAppendingResultType.Appended, blockType);
	}
	
	/**
	 * 
	 * @return
	 */
	public static BlockAppendingResult createBlockAlreadyAppendedResult() {
		return new BlockAppendingResult(BlockAppendingResultType.AlreadyAppended, null);
	}
	
	/**
	 * 
	 * @return
	 */
	public static BlockAppendingResult createBlockNoAppendedBecauseOrphanBlockResult() {
		return new BlockAppendingResult(BlockAppendingResultType.NotAppendedBecauseOrphanBlock, null);
	}
}
