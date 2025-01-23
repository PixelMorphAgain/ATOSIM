package org.palladiosimulator.blockchainsystems.core.mining;

import java.util.random.RandomGenerator;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcess;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcessFactory;

public class MiningProcessFactoryImpl implements MiningProcessFactory {

	@Override
	public MiningProcess createMiningProcess(String nodeId) {
		return new MiningProcessImpl(5_000_000, RandomGenerator.of("Random"));
	}

}
