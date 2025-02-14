package org.palladiosimulator.blockchainsystems.core.system;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockFactory;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockPropagationStrategy;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockValidator;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Blockchain;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemNodeContext;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcess;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.NodeP2PNetworkInterface;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.OrphanBlockPool;

/**
 * 
 * The {@code BlockchainSystemNodeContextImpl} class is an implementation of the {@code BlockchainSystemNodeContext} interface.
 * It is a container that provides access to all components of a blockchain system node.
 * 
 * @author Yannik Sproll
 *
 */
public class BlockchainSystemNodeContextImpl implements BlockchainSystemNodeContext  {
	
	private final String _id;
	private final BlockPropagationStrategy _blockPropagationStrategy;
	private final NodeP2PNetworkInterface _networkInterface;
	private final MiningProcess _miningProcess;
	private final Blockchain _blockchain;
	private final BlockValidator _blockValidator;
	private final OrphanBlockPool _orphanBlockPool;
	private final BlockFactory _blockFactory;
	
	public BlockchainSystemNodeContextImpl(
			String id,
			BlockPropagationStrategy blockPropagationStrategy, 
			NodeP2PNetworkInterface networkInterface,
			MiningProcess miningProcess,
			Blockchain blockchain,
			BlockValidator blockValidator,
			OrphanBlockPool orphanBlockPool,
			BlockFactory blockFactory) {
		_id = id;
		_blockPropagationStrategy = blockPropagationStrategy;
		_networkInterface = networkInterface;
		_miningProcess = miningProcess;
		_blockchain = blockchain;
		_blockValidator = blockValidator;
		_blockFactory = blockFactory;
		_orphanBlockPool = orphanBlockPool;
	}

	@Override
	public String getId() {
		return _id;
	}
	
	@Override
	public BlockPropagationStrategy getBlockPropagationStrategy() {
		return _blockPropagationStrategy;
	}

	@Override
	public NodeP2PNetworkInterface getNetworkInterface() {
		return _networkInterface;
	}

	@Override
	public MiningProcess getMiningProcess() {
		return _miningProcess;
	}

	@Override
	public Blockchain getBlockchain() {
		return _blockchain;
	}

	@Override
	public OrphanBlockPool getOrphanBlockPool() {
		return _orphanBlockPool;
	}

	@Override
	public BlockFactory getBlockFactory() {
		return _blockFactory;
	}

	@Override
	public BlockValidator getBlockValidator() {
		return _blockValidator;
	}
}
