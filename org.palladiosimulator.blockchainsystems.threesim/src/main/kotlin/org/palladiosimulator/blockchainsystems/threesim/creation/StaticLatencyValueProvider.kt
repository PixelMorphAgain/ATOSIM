package org.palladiosimulator.blockchainsystems.threesim.creation

import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.LinkLatencySpecification
import org.palladiosimulator.blockchainsystems.core.common.abstractions.SimulationContext
import org.palladiosimulator.blockchainsystems.core.common.abstractions.SimulationLifecycleAwareValueProvider

class StaticLatencyValueProvider(
  private val latency: Long
) : SimulationLifecycleAwareValueProvider<Long> {
  override fun getValue(): Long? {
    return latency
  }

  override fun initialize(simulationContext: SimulationContext) {
    // NOTE: No op, just for compatibility with the non-static latency value provider interface
  }

  override fun cleanup() {
    // NOTE: No op, just for compatibility with the non-static latency value provider interface
  }

  companion object {
    fun create(
      linkLatencySpecification: LinkLatencySpecification
    ): StaticLatencyValueProvider {
      return StaticLatencyValueProvider(linkLatencySpecification.staticLatency)
    }
  }
}