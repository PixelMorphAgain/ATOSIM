package org.palladiosimulator.blockchainsystems.threesim.serialization

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.descriptors.serialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

import org.palladiosimulator.blockchainsystems.threesim.metrics.utils.OutputMetricsSet
import org.palladiosimulator.blockchainsystems.threesim.simulation.results.ThreesimSingleSimulationResult

/**
 * Custom Serializer for [ThreesimSingleSimulationResult].
 *
 * @author Davis Riedel
 */
object ThreesimSingleSimulationResultSerializer : KSerializer<ThreesimSingleSimulationResult> {
  override val descriptor: SerialDescriptor = buildClassSerialDescriptor("ThreesimSingleSimulationResult") {
    element("simulationType", serialDescriptor<String>())
    element("simulationRoundResult", serialDescriptor<OutputMetricsSet>())
  }

  override fun serialize(encoder: Encoder, value: ThreesimSingleSimulationResult) {
    with(encoder.beginStructure(descriptor)) {
      encodeStringElement(descriptor, 0, value.simulationType)
      encodeSerializableElement(
        descriptor,
        1,
        OutputMetricsSetSerializer,
        value.simulationRoundResult.outputMetrics
      )
      endStructure(descriptor)
    }
  }

  override fun deserialize(decoder: Decoder): ThreesimSingleSimulationResult {
    throw UnsupportedOperationException("Deserialization of ThreesimSingleSimulationResult is not supported")
  }
}
