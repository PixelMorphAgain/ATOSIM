package org.palladiosimulator.blockchainsystems.core.mining.smartcontract

import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
import org.palladiosimulator.blockchainsystems.core.stochasticprocess.PoissonProcess
import org.palladiosimulator.blockchainsystems.core.system.abstractions.SCExecutionProcess
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Transaction
import java.util.function.Consumer
import java.util.random.RandomGenerator

/**
 * @author Davis Riedel
 */
class SCExecutionProcessImpl(
  val isFullNode: Boolean,
  meanExecutionTime: Double,
  randomGenerator: RandomGenerator
): BlockchainNodeObject(), SCExecutionProcess {

  private val poissonProcess = PoissonProcess(1.0 / meanExecutionTime, randomGenerator);
  private var onSCExecutedCallback: Consumer<Transaction>? = null

  override fun dispatchEvent(event: Event) {
    TODO("Not yet implemented")
  }

  override fun setOnTransactionExecutedCallback(onTransactionExecutedCallback: Consumer<Transaction>) {
    TODO("Not yet implemented")
  }
}