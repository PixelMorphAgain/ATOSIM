package org.palladiosimulator.blockchainsystems.threesim.metrics

import kotlinx.serialization.Serializable

/**
 * Value of fault tolerance metric
 *
 * @author Davis Riedel
 */
@Serializable
class FaultToleranceValue private constructor(
  val throughputDelta: ThroughputDeltaValue,
  val confirmationLatencyDelta: ConfirmationLatencyDeltaValue,
) {
  companion object {
    fun of(
      throughputDelta: Double,
      confirmationLatencyDelta: Double
    ): FaultToleranceValue {
      return FaultToleranceValue(
        ThroughputDeltaValue.of(throughputDelta),
        ConfirmationLatencyDeltaValue.of(confirmationLatencyDelta)
      )
    }
  }
}

// The following are used for serialization

@Serializable
class ThroughputDeltaValue private constructor(
  val value: Double,
  val unit: String
) {
  companion object {
    fun of(value: Double): ThroughputDeltaValue {
      return ThroughputDeltaValue(value, "transactions/min")
    }
  }
}

@Serializable
class ConfirmationLatencyDeltaValue private constructor(
  val value: Double,
  val unit: String
) {
  companion object {
    fun of(value: Double): ConfirmationLatencyDeltaValue {
      return ConfirmationLatencyDeltaValue(value, "ms")
    }
  }
}
