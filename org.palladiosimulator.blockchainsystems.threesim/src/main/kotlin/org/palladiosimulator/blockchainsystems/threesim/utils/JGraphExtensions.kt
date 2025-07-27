package org.palladiosimulator.blockchainsystems.threesim.utils

import org.jgrapht.graph.AbstractBaseGraph

fun <V, E> AbstractBaseGraph<V, E>.addBidirectionalEdge(
  source: V,
  target: V,
  element: E
) {
  this.addEdge(source, target, element)
  this.addEdge(target, source, element)
}
