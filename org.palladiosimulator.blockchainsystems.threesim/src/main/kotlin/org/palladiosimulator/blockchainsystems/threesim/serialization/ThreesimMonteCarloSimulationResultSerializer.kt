package org.palladiosimulator.blockchainsystems.threesim.serialization

import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.descriptors.serialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

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
    element("simulationRoundResults", serialDescriptor<List<OutputMetricsSet>>())
    element("averageSimulationRoundResult", serialDescriptor<OutputMetricsSet>())
  }

  override fun serialize(encoder: Encoder, value: ThreesimMonteCarloSimulationResult) {
    with(encoder.beginStructure(descriptor)) {
      encodeStringElement(descriptor, 0, value.simulationType)
      encodeSerializableElement(
        descriptor,
        1,
        ListSerializer(OutputMetricsSetSerializer),
        value.simulationRoundResults.map { it.outputMetrics }
      )
      encodeSerializableElement(
        descriptor,
        2,
        OutputMetricsSetSerializer,
        value.averageSimulationRoundResult.outputMetrics
      )
      endStructure(descriptor)
    }
  }

  override fun deserialize(decoder: Decoder): ThreesimMonteCarloSimulationResult {
    throw UnsupportedOperationException("Deserialization of ThreesimMonteCarloSimulationResult is not supported")
  }
}
