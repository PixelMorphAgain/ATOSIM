package org.palladiosimulator.blockchainsystems.threesim.creation

import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.LinkLatencySpecification
import org.palladiosimulator.blockchainsystems.core.common.abstractions.ValueProvider
import org.palladiosimulator.blockchainsystems.core.network.LinkLatency
import org.palladiosimulator.blockchainsystems.core.utils.RandomValueProvider
import org.palladiosimulator.blockchainsystems.threesim.creation.abstractions.TemporalValueProviderAdapter
import java.util.random.RandomGenerator

/**
 * Adapter for a [ValueProvider] that provides [LinkLatency] values based on the [LinkLatencySpecification] from the metamodel.
 *
 * @param randomValueProvider the underlying random value provider that provides the latency values.
 *
 * @author Davis Riedel
 */
class LatencyValueProviderAdapter(
  randomValueProvider: RandomValueProvider<LinkLatency>,
) : TemporalValueProviderAdapter<Long, LinkLatency>(randomValueProvider) {
  companion object {
    fun create(
      linkLatencySpecification: LinkLatencySpecification,
      randomGenerator: RandomGenerator
    ): LatencyValueProviderAdapter {
      val valuesToProbabilitiesMapping: HashMap<LinkLatency, Double> =
        linkLatencySpecification.values.associateTo {
          LinkLatency(it.getLatency(), it.getDuration()) to it.getProbability()
        }

      val valueProvider = RandomValueProvider.create(
        valuesToProbabilitiesMapping,
        randomGenerator
      )

      return LatencyValueProviderAdapter(valueProvider)
    }
  }
}