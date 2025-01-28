package org.palladiosimulator.blockchainsystems.core.mining.smartcontract

import org.palladiosimulator.blockchainsystems.core.system.abstractions.SCExecutionProcess
import org.palladiosimulator.blockchainsystems.core.system.abstractions.SCExecutionProcessFactory
import java.util.random.RandomGenerator

/**
 * @author Davis Riedel
 */
class SCExecutionProcessFactoryImpl: SCExecutionProcessFactory {
  override fun createSCExecutionProcess(
    nodeId: String,
    isFullNode: Boolean
  ): SCExecutionProcess {
    return SCExecutionProcessImpl(isFullNode, 5000000.0, RandomGenerator.of("Random"))
  }
}