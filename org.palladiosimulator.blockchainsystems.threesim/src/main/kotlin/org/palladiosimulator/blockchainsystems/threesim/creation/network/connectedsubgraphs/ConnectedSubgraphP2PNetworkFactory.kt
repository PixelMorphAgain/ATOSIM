package org.palladiosimulator.blockchainsystems.threesim.creation.network.connectedsubgraphs

import org.jgrapht.graph.SimpleGraph
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ConnectedSubgraphsNetworkTopology
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.SubgraphSpecification
import org.palladiosimulator.blockchainsystems.core.network.P2PLink
import org.palladiosimulator.blockchainsystems.core.network.P2PNetworkImpl
import org.palladiosimulator.blockchainsystems.core.network.P2PNode
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkCreationResult
import java.util.random.RandomGenerator
import java.util.UUID
import kotlin.math.abs
import org.palladiosimulator.blockchainsystems.core.utils.CounterMap
import org.palladiosimulator.blockchainsystems.threesim.creation.network.AbstractThreesimP2PNetworkFactory
import org.palladiosimulator.blockchainsystems.threesim.utils.addBidirectionalEdge

/**
 * Factory for creating a P2P network based on a connected subgraph topology.
 *
 * @author Yannik Sproll, Davis Riedel
 */
class ConnectedSubgraphP2PNetworkFactory(
  areFailuresEnabled: Boolean,
  private val randomGenerator: RandomGenerator,
  private val topology: ConnectedSubgraphsNetworkTopology
) : AbstractThreesimP2PNetworkFactory(areFailuresEnabled) {
  override fun createP2PNetwork(): P2PNetworkCreationResult {
    val nodeIdToNodeTemplateIdMapping = HashMap<String, String>()

    val subgraphIdToSubgraphNodesMapping = HashMap<String, HashSet<P2PNode>>()
    val subGraphIdToProxyNodesMapping = HashMap<String, HashSet<P2PNode>>()
    val subGraphIdToLinkSpecificationMapping = HashMap<String, SubgraphSpecification>()

    // Fill mappings and create P2PNode instances
    topology.subgraphs.forEach { subgraphSpec ->
      subgraphIdToSubgraphNodesMapping.put(subgraphSpec.id, HashSet<P2PNode>())
      subGraphIdToProxyNodesMapping.put(subgraphSpec.id, HashSet<P2PNode>())
      subGraphIdToLinkSpecificationMapping.put(subgraphSpec.id, subgraphSpec)

      subgraphSpec.nodeTemplates.forEach { nodeTemplate ->
        (0..<nodeTemplate.numberOfNodeOccurences).forEach { _ ->
          val p2pNodeId = UUID.randomUUID().toString()
          val node = P2PNode(p2pNodeId)

          subgraphIdToSubgraphNodesMapping.get(subgraphSpec.id)?.add(node)

          if (nodeTemplate.isIsSubgraphProxy()) {
            subGraphIdToProxyNodesMapping.get(subgraphSpec.id)?.add(node)
          }

          nodeIdToNodeTemplateIdMapping.put(p2pNodeId, nodeTemplate.id)
        }
      }
    }

    val networkGraph = SimpleGraph<P2PNode, P2PLink>(P2PLink::class.java)

    // Create each subgraph and add it to the networkGraph
    subgraphIdToSubgraphNodesMapping.entries.forEach { entry ->
      val initialDegrees = CounterMap<P2PNode>()
      val subgraphSpec = subGraphIdToLinkSpecificationMapping.get(entry.key) ?: return@forEach

      // Add vertices of subgraph
      entry.value.forEach { node ->
        networkGraph.addVertex(node)
        initialDegrees.put(node, subgraphSpec.connectivity)
      }

      val subgraphNodes = initialDegrees.keys.toTypedArray()

      // Get link specification for subgraph internal links
      val subgraphLinkSpecification = subgraphSpec.linkAllocation

      val latencyValueProvider = createLatencyValueProvider(subgraphLinkSpecification.latencySpecification)
      val throughputValueProvider = createThroughputValueProvider(subgraphLinkSpecification.throughputSpecification)

      // Create a bidirectional spanning tree in subgraph
      for (i in 0..<subgraphNodes.size - 1) {
        val firstNode = subgraphNodes[i]
        val secondNode = subgraphNodes[i + 1]

        networkGraph.addBidirectionalEdge(
          firstNode,
          secondNode,
          P2PLink(
            latencyValueProvider,
            throughputValueProvider,
            firstNode,
            secondNode
          )
        )

        initialDegrees.decrement(firstNode)
        initialDegrees.decrement(secondNode)
      }

      // Enhance with random bidirectional edges
      val nodesToEnhance = initialDegrees.keys.toTypedArray()

      nodesToEnhance.forEach { currentNode ->
        var remainingDegree = initialDegrees.get(currentNode)

        while (remainingDegree > 0) {
          val potentialNodes = initialDegrees.keys
            .filter { it != currentNode }
            .filter { !networkGraph.containsEdge(it, currentNode) }

          if (potentialNodes.isEmpty()) {
            // Sometimes each node except for the last one has reached the maximum degree
            // The strategy here is to neglect the range parameters for the last node
            initialDegrees.decrement(currentNode)
            remainingDegree--
            continue
          }

          val randomPotentialNodeIndex = randomGenerator.nextInt(0, potentialNodes.size)
          val selectedNode = potentialNodes[randomPotentialNodeIndex]

          networkGraph.addBidirectionalEdge(
            currentNode,
            selectedNode,
            P2PLink(
              latencyValueProvider,
              throughputValueProvider,
              currentNode,
              selectedNode
            )
          )

          initialDegrees.decrement(currentNode)
          initialDegrees.decrement(selectedNode)

          remainingDegree--
        }
      }
    }

    // Add connections between the proxies of the subgraph;
    topology.subgraphLinks.forEach { subgraphLink ->
      val firstSubgraphSpec = subgraphLink.connectedSubgraphs[0]
      val secondSubgraphSpec = subgraphLink.connectedSubgraphs[1]

      val firstSubgraphProxies =
        subGraphIdToProxyNodesMapping.get(firstSubgraphSpec.id)?.toTypedArray() ?: return@forEach
      val secondSubgraphProxies =
        subGraphIdToProxyNodesMapping.get(secondSubgraphSpec.id)?.toTypedArray() ?: return@forEach

      val subgraphLinkSpecification = subgraphLink.allocation

      val latencyValueProvider = createLatencyValueProvider(subgraphLinkSpecification.latencySpecification)
      val throughputValueProvider = createThroughputValueProvider(subgraphLinkSpecification.throughputSpecification)

      firstSubgraphProxies.forEach { firstSubgraphProxy ->
        secondSubgraphProxies.forEach { secondSubgraphProxy ->
          networkGraph.addBidirectionalEdge(
            firstSubgraphProxy,
            secondSubgraphProxy,
            P2PLink(
              latencyValueProvider,
              throughputValueProvider,
              firstSubgraphProxy,
              secondSubgraphProxy
            )
          )
        }
      }
    }

    val networkImpl = P2PNetworkImpl.create(networkGraph)

    networkGraph.vertexSet().forEach { it.initNetwork(networkImpl) }

    for (e in networkGraph.edgeSet()) {
      println(
        (abs(networkGraph.getEdgeSource(e).endpointId.hashCode()).toString() + "-"
          + abs(networkGraph.getEdgeTarget(e).endpointId.hashCode()))
      )
    }

    return ConnectedSubgraphNetworkCreationResult(
      networkImpl,
      nodeIdToNodeTemplateIdMapping
    )
  }
}