package org.palladiosimulator.blockchainsystems.core.blockvalidation;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockValidator;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockValidatorFactory;

public class BlockValidatorFactoryImpl implements BlockValidatorFactory {

    private final long _blockValidationDuration;

    public BlockValidatorFactoryImpl(long blockValidationDuration) {
        _blockValidationDuration = blockValidationDuration;
    }

    @Override
    public BlockValidator createBlockValidator(String nodeId) {
        return new BlockValidatorImpl(() -> _blockValidationDuration);
    }

}
