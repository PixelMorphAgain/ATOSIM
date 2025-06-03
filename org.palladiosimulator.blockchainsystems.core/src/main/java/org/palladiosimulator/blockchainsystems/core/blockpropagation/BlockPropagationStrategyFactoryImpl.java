package org.palladiosimulator.blockchainsystems.core.blockpropagation;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockPropagationStrategy;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockPropagationStrategyFactory;

/**
 * Factory implementation for creating instances of BlockPropagationStrategy.
 *
 * @author Yannik Sproll
 */
public class BlockPropagationStrategyFactoryImpl implements BlockPropagationStrategyFactory {

    @Override
    public BlockPropagationStrategy createBlockPropagationStrategy() {
        return new BlockPropagationStrategyImpl();
    }

}
