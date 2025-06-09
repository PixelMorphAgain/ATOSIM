package org.palladiosimulator.blockchainsystems.core.system.abstractions;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Traceable;

/**
 * The @code{MiningProcess} interface represents the mining process running
 * on a blockchain system node.
 *
 * @author Yannik Sproll
 */
public interface MiningProcess extends Traceable {

    /**
     * Sets the callback that is invoked when the mining process mined a new block.
     *
     * @param onBlockMinedCallback the mining finished callback
     */
    void setOnBlockMinedCallback(Consumer<Block> onBlockMinedCallback);

    /**
     * Sets the callback that is invoked when a block object must be created for the mining process.
     *
     * @param onCreatingBlockCallback the block creation callback
     */
    void setOnCreatingBlockCallback(BiFunction<Long, String, Block> onCreatingBlockCallback);

    /**
     * Sets the callback that requests a previous block for the next block to be mined.
     *
     * @param previousBlockSelectionCallback previous block selection callback
     */
    void setPreviousBlockSelectionCallback(Supplier<String> previousBlockSelectionCallback);

    /**
     * Starts the mining of new blocks.
     */
    void startMining();

    /**
     * Interrupts the mining of the current process and starts the mining of a new block.
     */
    void restartMining();

    /**
     * Stops the mining of new blocks.
     */
    void stopMining();
}
