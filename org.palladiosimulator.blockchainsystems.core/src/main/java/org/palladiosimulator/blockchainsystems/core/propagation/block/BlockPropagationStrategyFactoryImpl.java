package org.palladiosimulator.blockchainsystems.core.propagation.block;

import org.jetbrains.annotations.NotNull;
import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.propagation.PropagationStrategy;
import org.palladiosimulator.blockchainsystems.core.propagation.PropagationStrategyFactory;

/**
 * Factory implementation for creating instances of BlockPropagationStrategy.
 *
 * @author Yannik Sproll
 */
public class BlockPropagationStrategyFactoryImpl implements PropagationStrategyFactory<Block> {

    @Override
    public @NotNull PropagationStrategy<Block> createPropagationStrategy() {
        return new BlockPropagationStrategy();
    }
}
