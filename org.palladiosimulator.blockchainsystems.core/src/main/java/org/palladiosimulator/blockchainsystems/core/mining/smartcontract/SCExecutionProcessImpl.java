package org.palladiosimulator.blockchainsystems.core.mining.smartcontract;

import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcess;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.SCExecutionProcess;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Transaction;
import org.palladiosimulator.blockchainsystems.core.stochasticprocess.PoissonProcess;
import java.util.function.Consumer;
import java.util.random.RandomGenerator;

/**
 * @author Davis Riedel
 */
public class SCExecutionProcessImpl extends BlockchainNodeObject implements SCExecutionProcess {

    // TODO: Is a poissonProcess the right stochastic process for the probability of smart contract execution times?
    private final PoissonProcess _poissonProcess;

    private Consumer<Transaction> _onSCExecutedCallback;

    /**
     * Full nodes also execute transactions from all blocks they receive,
     * while miners only execute transactions of the blocks they propose
     */
    private boolean _isFullNode;

    public SCExecutionProcessImpl(
            boolean isFullNode,
            double meanExecutionTime,
            RandomGenerator randomGenerator
    ) {
        _poissonProcess = new PoissonProcess(1.0 / meanExecutionTime, randomGenerator);
        _onSCExecutedCallback = null;
        _isFullNode = isFullNode;
    }

    @Override
    public void dispatchEvent(Event event) {
        // TODO: Handle smart contract events
    }

    @Override
    public void setOnTransactionExecutedCallback(Consumer<Transaction> onTransactionExecutedCallback) {
        // TODO: Implement callback
    }
}
