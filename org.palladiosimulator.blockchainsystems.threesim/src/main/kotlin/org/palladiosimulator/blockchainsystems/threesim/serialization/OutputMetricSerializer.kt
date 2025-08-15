package org.palladiosimulator.blockchainsystems.threesim.serialization

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.descriptors.serialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

object OutputMetricSerializer : KSerializer<OutputMetric<*>> {
  override val descriptor: SerialDescriptor = buildClassSerialDescriptor("OutputMetric") {
    element("name", serialDescriptor<String>())
    element("value", serialDescriptor<String>())
  }

  override fun serialize(encoder: Encoder, value: OutputMetric<*>) {
    val compositeOutput = encoder.beginStructure(descriptor)
    compositeOutput.encodeStringElement(descriptor, 0, value.name)
    compositeOutput.encodeStringElement(
      descriptor,
      1,
      value.value.toString() // Safe because we know that value is a type that can be represented as a String
    )
    compositeOutput.endStructure(descriptor)
  }

  override fun deserialize(decoder: Decoder): OutputMetric<*> {
    throw UnsupportedOperationException("Deserialization of OutputMetric is not supported")
  }
}
