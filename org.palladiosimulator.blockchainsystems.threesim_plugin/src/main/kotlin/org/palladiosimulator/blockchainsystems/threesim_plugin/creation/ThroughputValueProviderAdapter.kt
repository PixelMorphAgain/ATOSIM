package org.palladiosimulator.blockchainsystems.threesim_plugin.creation

import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.LinkThroughputSpecification
import org.palladiosimulator.blockchainsystems.core.common.abstractions.ValueProvider
import org.palladiosimulator.blockchainsystems.core.network.LinkThroughput
import org.palladiosimulator.blockchainsystems.core.utils.RandomValueProvider
import java.util.random.RandomGenerator

class ThroughputValueProviderAdapter(
  private val randomValueProvider: RandomValueProvider<LinkThroughput>
) : ValueProvider<LinkThroughput> {
  override fun getValue(): LinkThroughput {
    return randomValueProvider.getValue()
  }

  companion object {
    fun create(
      linkThroughputSpecification: LinkThroughputSpecification,
      randomGenerator: RandomGenerator
    ): ThroughputValueProviderAdapter {
      val valuesToProbabilitiesMapping = HashMap<LinkThroughput, Double>()

      for (throughputValue in linkThroughputSpecification.getValues()) {
        valuesToProbabilitiesMapping.put(
          LinkThroughput(throughputValue.getThroughput(), throughputValue.getDuration()),
          throughputValue.getProbability()
        )
      }

      val valueProvider = RandomValueProvider.create(valuesToProbabilitiesMapping, randomGenerator)
      return ThroughputValueProviderAdapter(valueProvider)
    }
  }
}