package org.palladiosimulator.blockchainsystems.core.mining.smartcontract;

import java.util.random.RandomGenerator;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcess;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcessFactory;

public class SCMiningProcessFactory implements MiningProcessFactory {

    @Override
    public MiningProcess createMiningProcess(String nodeId) {
        return new SCMiningProcess(5_000_000, RandomGenerator.of("Random"));
    }

}
