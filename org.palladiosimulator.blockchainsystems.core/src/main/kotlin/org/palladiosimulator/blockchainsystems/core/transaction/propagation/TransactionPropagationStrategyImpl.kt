package org.palladiosimulator.blockchainsystems.core.transaction.propagation

import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Blockchain
import org.palladiosimulator.blockchainsystems.core.system.abstractions.NodeP2PNetworkInterface
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkEndpoint
import org.palladiosimulator.blockchainsystems.core.system.abstractions.PropagationStrategy
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction
import java.util.function.Consumer

class TransactionPropagationStrategyImpl : BlockchainNodeObject(), PropagationStrategy<Transaction> {
  override fun dispatchEvent(event: Event?) {
    TODO("Not yet implemented")
  }

  override fun distribute(element: Transaction) {
    TODO("Not yet implemented")
  }

  override fun distribute(
    element: Block,
    neighborEndpoints: MutableSet<P2PNetworkEndpoint>
  ) {
    TODO("Not yet implemented")
  }

  override fun setNetworkInterface(networkInterface: NodeP2PNetworkInterface) {
    TODO("Not yet implemented")
  }

  override fun setBlockchain(blockchain: Blockchain) {
    TODO("Not yet implemented")
  }

  override fun setOnReceivedCallback(onBlockReceivedCallback: Consumer<Transaction>) {
    TODO("Not yet implemented")
  }
}