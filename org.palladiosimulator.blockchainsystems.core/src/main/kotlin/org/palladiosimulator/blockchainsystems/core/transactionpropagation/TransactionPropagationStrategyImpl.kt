package org.palladiosimulator.blockchainsystems.core.transactionpropagation

import org.palladiosimulator.blockchainsystems.core.common.abstractions.SimulationContext
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLogOrigin
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Blockchain
import org.palladiosimulator.blockchainsystems.core.system.abstractions.NodeP2PNetworkInterface
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkEndpoint
import org.palladiosimulator.blockchainsystems.core.system.abstractions.PropagationStrategy
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Transaction
import java.util.function.Consumer

/**
 * @author Davis Riedel
 */
class TransactionPropagationStrategyImpl : PropagationStrategy<Transaction> {
  override fun distribute(propagationObject: Transaction) {
    TODO("Not yet implemented")
  }

  override fun distribute(
    propagationObject: Transaction,
    neighborEndpoints: Set<P2PNetworkEndpoint>
  ) {
    TODO("Not yet implemented")
  }

  override fun setNetworkInterface(networkInterface: NodeP2PNetworkInterface) {
    TODO("Not yet implemented")
  }

  override fun setBlockchain(blockchain: Blockchain) {
    TODO("Not yet implemented")
  }

  override fun setOnPropagatedObjectReceivedCallback(onPropagatedObjectReceivedCallback: Consumer<Transaction>) {
    TODO("Not yet implemented")
  }

  override fun initializeLogger(logOrigin: TraceEventLogOrigin) {
    TODO("Not yet implemented")
  }

  override fun initialize(simulationContext: SimulationContext) {
    TODO("Not yet implemented")
  }

  override fun cleanup() {
    TODO("Not yet implemented")
  }
}