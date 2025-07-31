package org.palladiosimulator.blockchainsystems.threesim.creation

import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.LinkThroughputSpecification
import org.palladiosimulator.blockchainsystems.core.common.abstractions.SimulationContext
import org.palladiosimulator.blockchainsystems.core.common.abstractions.SimulationLifecycleAwareValueProvider

class StaticThroughputValueProvider(
  private val throughput: Long
) : SimulationLifecycleAwareValueProvider<Long> {
  override fun getValue(): Long? {
    return throughput
  }

  override fun initialize(simulationContext: SimulationContext) {
    // NOTE: No op, just for compatibility with the non-static latency value provider interface
  }

  override fun cleanup() {
    // NOTE: No op, just for compatibility with the non-static latency value provider interface
  }

  companion object {
    fun create(
      linkThroughputSpecification: LinkThroughputSpecification
    ): StaticThroughputValueProvider {
      return StaticThroughputValueProvider(linkThroughputSpecification.staticThroughput)
    }
  }
}