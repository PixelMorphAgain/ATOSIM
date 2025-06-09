package org.palladiosimulator.blockchainsystems.core.blockvalidation;

import java.util.function.BiConsumer;

import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.ValueProvider;
import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.block.abstractions.BlockValidator;

public class BlockValidatorImpl extends BlockchainNodeObject implements BlockValidator {

    private final ValueProvider<Long> _blockValidationDurationProvider;
    private BiConsumer<Block, Boolean> _onBlockValidatedCallback;

    public BlockValidatorImpl(ValueProvider<Long> blockValidationDurationProvider) {
        _blockValidationDurationProvider = blockValidationDurationProvider;
        _onBlockValidatedCallback = null;
    }

    @Override
    public void validateBlock(Block block) {
        BlockValidationStartedEvent blockValidationStartedEvent = new BlockValidationStartedEvent(
                getSimulationContext().getSystemClock().getCurrentTime(),
                this,
                block);

        getSimulationContext()
                .getEventCoordinator()
                .raiseEvent(blockValidationStartedEvent);

    }

    @Override
    public void dispatchEvent(Event event) {
        switch (event.getEventType()) {
            case BlockValidationStartedEvent.EVENT_NAME:
                handleBlockValidationStartedEvent((BlockValidationStartedEvent) event);
                break;
            case BlockValidationFinishedEvent.EVENT_NAME:
                handleBlockValidationFinishedEvent((BlockValidationFinishedEvent) event);
                break;
        }
    }

    private void handleBlockValidationStartedEvent(BlockValidationStartedEvent event) {
        BlockValidationFinishedEvent bvhEvent = new BlockValidationFinishedEvent(
                getSimulationContext().getSystemClock().getCurrentTime() + _blockValidationDurationProvider.getValue(),
                this,
                event.block());
        getSimulationContext().getEventCoordinator().raiseEvent(bvhEvent);
    }

    private void handleBlockValidationFinishedEvent(BlockValidationFinishedEvent event) {
        notifyBlockValidated(event.block());
    }

    private void notifyBlockValidated(Block block) {
        if (_onBlockValidatedCallback != null) {
            _onBlockValidatedCallback.accept(block, true);
        }
    }

    @Override
    public void setOnBlockValidatedCallback(BiConsumer<Block, Boolean> onBlockValidatedCallback) {
        _onBlockValidatedCallback = onBlockValidatedCallback;
    }

}
