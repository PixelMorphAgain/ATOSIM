package org.palladiosimulator.blockchainsystems.core.blockpropagation;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.PropagationStrategy;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.PropagationStrategyFactory;

public class BlockPropagationStrategyFactoryImpl implements PropagationStrategyFactory<Block> {

    @Override
    public PropagationStrategy<Block> createPropagationStrategy() {
        return new BlockPropagationStrategyImpl();
    }

}
