package org.palladiosimulator.blockchainsystems.core.blockpropagation;

import org.jetbrains.annotations.NotNull;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.PropagationStrategy;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.PropagationStrategyFactory;

/**
 * Factory implementation for creating instances of BlockPropagationStrategy.
 *
 * @author Yannik Sproll
 */
public class BlockPropagationStrategyFactoryImpl implements PropagationStrategyFactory<Block> {

    @Override
    public @NotNull PropagationStrategy<Block> createPropagationStrategy() {
        return new BlockPropagationStrategyImpl();
    }
}
