package org.palladiosimulator.blockchainsystems.core.system.abstractions;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.Traceable;

import java.util.function.Consumer;

/**
 * @author Davis Riedel
 */
public interface SCExecutionProcess extends Traceable {

    void setOnTransactionExecutedCallback(Consumer<Transaction> onTransactionExecutedCallback);
}
