package org.palladiosimulator.blockchainsystems.core.mining.smartcontract;

import java.util.random.RandomGenerator;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.SCExecutionProcess;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.SCExecutionProcessFactory;

public class SCExecutionProcessFactoryImpl implements SCExecutionProcessFactory {

    @Override
    public SCExecutionProcess createSCExecutionProcess(String nodeId, boolean isFullNode) {
        // TODO: Adjust parameters for smart contracts
        return new SCExecutionProcessImpl(isFullNode, 5_000_000, RandomGenerator.of("Random"));
    }

}
