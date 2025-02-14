package org.palladiosimulator.blockchainsystems.core.system.abstractions;

import java.util.function.BiConsumer;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.Traceable;

/**
 * The @code{BlockValidator} interface is an abstraction of the block validation component
 * of a blockchain system node.
 *
 * @author Yannik Sproll
 */
public interface BlockValidator extends Traceable {

    /**
     * Submits a block for validation.
     *
     * @param block the block to be validated.
     */
    void validateBlock(Block block);

    /**
     * Sets a callback that is invoked if the validation of a block has finished.
     *
     * @param onBlockValidatedCallback callback that is invoked when a block validation is finished
     */
    void setOnBlockValidatedCallback(BiConsumer<Block, Boolean> onBlockValidatedCallback);
}
