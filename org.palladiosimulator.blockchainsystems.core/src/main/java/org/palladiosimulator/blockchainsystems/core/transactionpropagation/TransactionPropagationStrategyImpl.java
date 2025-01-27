package org.palladiosimulator.blockchainsystems.core.transactionpropagation;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.SimulationContext;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLogOrigin;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Blockchain;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.NodeP2PNetworkInterface;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkEndpoint;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.PropagationStrategy;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Transaction;

import java.util.Set;
import java.util.function.Consumer;

// TODO: Needs to be implemented

public class TransactionPropagationStrategyImpl implements PropagationStrategy<Transaction> {
    @Override
    public void distribute(Transaction propagationObject) {

    }

    @Override
    public void distribute(Transaction propagationObject, Set<P2PNetworkEndpoint> neighborEndpoints) {

    }

    @Override
    public void setNetworkInterface(NodeP2PNetworkInterface networkInterface) {

    }

    @Override
    public void setBlockchain(Blockchain blockchain) {

    }

    @Override
    public void setOnPropagatedObjectReceivedCallback(Consumer<Transaction> onPropagatedObjectReceivedCallback) {

    }

    @Override
    public void initializeLogger(TraceEventLogOrigin logOrigin) {

    }

    @Override
    public void initialize(SimulationContext simulationContext) {

    }

    @Override
    public void cleanup() {

    }
}
