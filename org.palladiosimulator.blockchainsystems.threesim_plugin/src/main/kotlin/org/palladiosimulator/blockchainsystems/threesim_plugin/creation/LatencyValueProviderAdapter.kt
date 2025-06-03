package org.palladiosimulator.blockchainsystems.threesim_plugin.creation

import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.LinkLatencySpecification
import org.palladiosimulator.blockchainsystems.core.common.abstractions.ValueProvider
import org.palladiosimulator.blockchainsystems.core.network.LinkLatency
import org.palladiosimulator.blockchainsystems.core.utils.RandomValueProvider
import java.util.random.RandomGenerator

/**
 * Adapter for a [ValueProvider] that provides [LinkLatency] values based on the [LinkLatencySpecification] from the metamodel.
 *
 * @param randomValueProvider the underlying random value provider that provides the latency values.
 *
 * @author Davis Riedel
 */
class LatencyValueProviderAdapter(
  private val randomValueProvider: RandomValueProvider<LinkLatency>
) : ValueProvider<LinkLatency> {
  override fun getValue(): LinkLatency {
    return randomValueProvider.getValue()
  }

  companion object {
    fun create(
      linkLatencySpecification: LinkLatencySpecification,
      randomGenerator: RandomGenerator
    ): LatencyValueProviderAdapter {
      val valuesToProbabilitiesMapping = HashMap<LinkLatency, Double>()

      for (latencyValue in linkLatencySpecification.getValues()) {
        valuesToProbabilitiesMapping.put(
          LinkLatency(latencyValue.getLatency(), latencyValue.getDuration()),
          latencyValue.getProbability()
        )
      }

      val valueProvider = RandomValueProvider.create(valuesToProbabilitiesMapping, randomGenerator)
      return LatencyValueProviderAdapter(valueProvider)
    }
  }
}