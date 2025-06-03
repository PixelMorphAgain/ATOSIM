package org.palladiosimulator.blockchainsystems.core.blockchain;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Blockchain;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainFactory;

/**
 * Implementation of the {@link BlockchainFactory} interface.
 * This factory is responsible for creating a new blockchain with a given genesis block.
 *
 * @author Yannik Sproll
 */
public class BlockchainFactoryImpl implements BlockchainFactory {

    @Override
    public Blockchain createBlockchain(Block genesisBlock, String nodeId) {
        BlockchainElement genesisBlockchainElement = new BlockchainElement(
                genesisBlock,
                null,
                BlockchainElementType.Included,
                1
        );

        return new BlockchainImpl(genesisBlockchainElement);
    }

}
