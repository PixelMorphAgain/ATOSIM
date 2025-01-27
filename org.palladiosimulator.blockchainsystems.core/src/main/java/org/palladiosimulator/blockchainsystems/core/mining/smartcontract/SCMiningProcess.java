package org.palladiosimulator.blockchainsystems.core.mining.smartcontract;

import org.palladiosimulator.blockchainsystems.core.mining.SimpleMiningProcess;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.SCExecutionProcess;

import java.util.random.RandomGenerator;

/**
 * Creates a {@code MiningProcess} that executes smart contracts.
 *
 * @author Davis Riedel
 */
public class SCMiningProcess extends SimpleMiningProcess {

    private final SCExecutionProcess scExecutionProcess;

    public SCMiningProcess(
            SCExecutionProcess scExecutionProcess,
            double meanBlockTime,
            RandomGenerator randomGenerator
    ) {
        super(meanBlockTime, randomGenerator);
        this.scExecutionProcess = scExecutionProcess;
    }

    // TODO: Handle mining with SC execution

}
