package org.palladiosimulator.blockchainsystems.threesim.creation.network

import org.palladiosimulator.blockchainsystems.bscm.linkallocation.LinkLatencySpecification
import org.palladiosimulator.blockchainsystems.bscm.linkallocation.LinkThroughputSpecification
import org.palladiosimulator.blockchainsystems.core.common.abstractions.SimulationLifecycleAwareValueProvider
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkFactory
import org.palladiosimulator.blockchainsystems.threesim.creation.LatencyValueProviderAdapter
import org.palladiosimulator.blockchainsystems.threesim.creation.StaticLatencyValueProvider
import org.palladiosimulator.blockchainsystems.threesim.creation.StaticThroughputValueProvider
import org.palladiosimulator.blockchainsystems.threesim.creation.ThroughputValueProviderAdapter
import java.util.random.RandomGenerator

/**
 * Abstract factory for creating a P2P network in 3SIM. Stores common methods for explicit and connected subgraphs network factories.
 *
 * @param areFailuresEnabled Indicates whether the simulation run simulates failed links.
 *
 * @author Davis Riedel
 */
abstract class AbstractThreesimP2PNetworkFactory(
  protected val areFailuresEnabled: Boolean
) : P2PNetworkFactory {
  protected fun createLatencyValueProvider(
    latencySpecification: LinkLatencySpecification
  ): SimulationLifecycleAwareValueProvider<Long> {
    if (areFailuresEnabled) {
      return LatencyValueProviderAdapter.create(
        latencySpecification.dynamicLatency,
        RandomGenerator.of("Random")
      )
    }
    return StaticLatencyValueProvider(latencySpecification.staticLatency)
  }

  protected fun createThroughputValueProvider(
    throughputSpecification: LinkThroughputSpecification
  ): SimulationLifecycleAwareValueProvider<Long> {
    if (areFailuresEnabled) {
      return ThroughputValueProviderAdapter.create(
        throughputSpecification.dynamicThroughput,
        RandomGenerator.of("Random")
      )
    }
    return StaticThroughputValueProvider(throughputSpecification.staticThroughput)
  }
}