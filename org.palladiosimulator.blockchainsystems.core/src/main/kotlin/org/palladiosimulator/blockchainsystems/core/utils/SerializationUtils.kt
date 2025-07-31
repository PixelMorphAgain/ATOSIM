package org.palladiosimulator.blockchainsystems.core.utils

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * A serializer for formatting milliseconds into a human-readable string format.
 *
 * This serializer converts a Long value representing milliseconds into a formatted string
 * of the form "HH:mm:ss.SSS".
 *
 * @author Davis Riedel, Yannik Sproll
 */
object MillisecondsSerializer : KSerializer<Long> {
  override val descriptor: SerialDescriptor =
    PrimitiveSerialDescriptor("Milliseconds", PrimitiveKind.STRING)

  override fun serialize(encoder: Encoder, value: Long) {
    val formattedString = formatMilliseconds(value)
    encoder.encodeString(formattedString)
  }

  override fun deserialize(decoder: Decoder): Long {
    // NOTE: We do not support deserializing formatted milliseconds yet.
    throw UnsupportedOperationException("Deserialization of formatted milliseconds is not implemented.")
  }

  private fun formatMilliseconds(milliseconds: Long): String {
    // Calculate the components of the time span
    val hours = milliseconds / 3600000
    val remainingAfterHours = milliseconds % 3600000

    val minutes = remainingAfterHours / 60000
    val remainingAfterMinutes = remainingAfterHours % 60000

    val seconds = remainingAfterMinutes / 1000
    val remainingMilliseconds = remainingAfterMinutes % 1000

    // Format the components into a string
    return String.format(
      "%02d:%02d:%02d.%03d",
      hours,
      minutes,
      seconds,
      remainingMilliseconds,
    )
  }
}