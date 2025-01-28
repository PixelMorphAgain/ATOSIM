package org.palladiosimulator.blockchainsystems.core.mining.smartcontract

import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcess
import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcessFactory
import java.util.random.RandomGenerator

/**
 * @author Davis Riedel
 */
class SCMiningProcessFactory: MiningProcessFactory {
  override fun createMiningProcess(nodeId: String): MiningProcess {
    // TODO: Allow configuration of isFullNode and set sensible values for parameters
    val scExecutionProcess = SCExecutionProcessImpl(true, 5000000.0, RandomGenerator.of("TrxRandom"));
    return SCMiningProcess(scExecutionProcess, 5000000.0, RandomGenerator.of("BlockRandom"));
  }
}