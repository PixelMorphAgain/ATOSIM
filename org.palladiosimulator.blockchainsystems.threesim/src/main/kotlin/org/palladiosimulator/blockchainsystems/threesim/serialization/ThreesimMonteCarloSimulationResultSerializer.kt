package org.palladiosimulator.blockchainsystems.threesim.serialization

import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.descriptors.serialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.serializer
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.AverageOutputMetric

import org.palladiosimulator.blockchainsystems.threesim.metrics.utils.OutputMetricsSet
import org.palladiosimulator.blockchainsystems.threesim.simulation.results.ThreesimMonteCarloSimulationResult

/**
 * Custom Serializer for [ThreesimMonteCarloSimulationResult].
 *
 * @author Davis Riedel
 */
object ThreesimMonteCarloSimulationResultSerializer : KSerializer<ThreesimMonteCarloSimulationResult> {
  override val descriptor: SerialDescriptor = buildClassSerialDescriptor("ThreesimMonteCarloSimulationResult") {
    element("simulationType", serialDescriptor<String>())
    element("numberOfRounds", serialDescriptor<Int>())
    element("generalResults", serialDescriptor<OutputMetricsSet>())
    element("simulationRoundResults", serialDescriptor<List<OutputMetricsSet>>())
    element("averageSimulationRoundResult", serialDescriptor<List<AverageOutputMetric>>())
  }

  override fun serialize(encoder: Encoder, value: ThreesimMonteCarloSimulationResult) {
    with(encoder.beginStructure(descriptor)) {
      encodeStringElement(descriptor, 0, value.simulationType)
      encodeIntElement(descriptor, 1, value.simulationRoundResults.size)
      encodeSerializableElement(
        descriptor,
        2,
        OutputMetricsSetSerializer,
        value.generalResults.outputMetrics
      )
      encodeSerializableElement(
        descriptor,
        3,
        ListSerializer(OutputMetricsSetSerializer),
        value.simulationRoundResults.map { it.outputMetrics }
      )
      encodeSerializableElement(
        descriptor,
        4,
        ListSerializer(AverageOutputMetricSerializer),
        value.averageSimulationRoundResult.results
      )
      endStructure(descriptor)
    }
  }

  override fun deserialize(decoder: Decoder): ThreesimMonteCarloSimulationResult {
    throw UnsupportedOperationException("Deserialization of ThreesimMonteCarloSimulationResult is not supported")
  }
}
