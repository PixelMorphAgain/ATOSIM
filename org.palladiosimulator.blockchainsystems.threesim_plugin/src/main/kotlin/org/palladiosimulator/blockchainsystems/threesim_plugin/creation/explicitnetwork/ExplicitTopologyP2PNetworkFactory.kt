package org.palladiosimulator.blockchainsystems.threesim_plugin.creation.explicitnetwork

import org.jgrapht.Graph
import org.jgrapht.graph.SimpleGraph
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ExplicitNetworkTopology
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.Node
import org.palladiosimulator.blockchainsystems.core.network.P2PLink
import org.palladiosimulator.blockchainsystems.core.network.P2PNetworkImpl
import org.palladiosimulator.blockchainsystems.core.network.P2PNode
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkCreationResult
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkFactory
import org.palladiosimulator.blockchainsystems.threesim_plugin.creation.LatencyValueProviderAdapter
import org.palladiosimulator.blockchainsystems.threesim_plugin.creation.ThroughputValueProviderAdapter
import java.util.random.RandomGenerator

/**
 * Factory for creating a P2P network based on an explicit network topology from the metamodel.
 *
 * @param topology the explicit network topology obtained from the metamodel.
 *
 * @author Davis Riedel
 */
class ExplicitTopologyP2PNetworkFactory(private val topology: ExplicitNetworkTopology) : P2PNetworkFactory {
  override fun createP2PNetwork(): P2PNetworkCreationResult {
    val networkGraph: Graph<P2PNode, P2PLink> = SimpleGraph(P2PLink::class.java)

    val p2pNodeMappings = HashMap<String, P2PNode>()

    // Add nodes to the graph
    for (designNode in topology.getNodes()) {
      val nodeImpl = P2PNode(designNode.id)

      p2pNodeMappings.put(designNode.id, nodeImpl)
      networkGraph.addVertex(nodeImpl)
    }

    // Add links to the graph
    for (designLink in topology.getLinks()) {
      val fromDesignNode: Node = designLink.getFromNode()
      val toDesignNode: Node = designLink.getToNode()

      val fromP2PNode: P2PNode = p2pNodeMappings.get(fromDesignNode.id)!!
      val toP2PNode: P2PNode = p2pNodeMappings.get(toDesignNode.id)!!

      val link = P2PLink(
        LatencyValueProviderAdapter.create(
          designLink.getSpecification().getLatencySpecification(),
          RandomGenerator.of("Random")
        ),
        ThroughputValueProviderAdapter.create(
          designLink.getSpecification().getThroughputSpecification(),
          RandomGenerator.of("Random")
        ),
        fromP2PNode,
        toP2PNode
      )

      networkGraph.addEdge(
        fromP2PNode,
        toP2PNode,
        link
      )
    }

    val networkImpl = P2PNetworkImpl.create(networkGraph)

    // Initialize the nodes with a reference to the network
    for (p2pNode in p2pNodeMappings.values) {
      p2pNode.initNetwork(networkImpl)
    }

    return ExplicitP2PNetworkCreationResult(networkImpl)
  }
}