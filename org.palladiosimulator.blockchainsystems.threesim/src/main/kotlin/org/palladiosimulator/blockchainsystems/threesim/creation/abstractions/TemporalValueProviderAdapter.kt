package org.palladiosimulator.blockchainsystems.threesim.creation.abstractions

import org.palladiosimulator.blockchainsystems.core.common.abstractions.SimulationContext
import org.palladiosimulator.blockchainsystems.core.common.abstractions.SimulationLifecycleAwareValueProvider
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TemporalValue
import org.palladiosimulator.blockchainsystems.core.utils.RandomValueProvider

/**
 * Adapter for a [RandomValueProvider] that provides temporal values (values valid for a specific duration).
 *
 * @param randomValueProvider the underlying random value provider that provides the temporal values.
 *
 * @author Davis Riedel
 */
open class TemporalValueProviderAdapter<V, T : TemporalValue<V>>(
  private val randomValueProvider: RandomValueProvider<T>
) : SimulationLifecycleAwareValueProvider<V> {
  var simulationContext: SimulationContext? = null

  var lastValue: V? = null
  var lastValueValidUntil: Long? = null

  override fun getValue(): V {
    val ctx = simulationContext
      ?: throw IllegalStateException("SimulationContext is not initialized. Call initialize() before using this provider.")

    // Use local variables to access the cached values in a thread-safe manner.
    val currentValue = lastValue
    val currentValidUntil = lastValueValidUntil

    return if (
      currentValue != null &&
      currentValidUntil != null &&
      currentValidUntil >= ctx.systemClock.currentTime
    ) {
      // If all conditions are met, the cached value is valid, return it.
      currentValue
    } else {
      // Otherwise, calculate a new value and cache it.
      val newValue = randomValueProvider.getValue()
      lastValue = newValue.value
      lastValueValidUntil = ctx.systemClock.currentTime + newValue.duration
      newValue.value
    }
  }

  override fun initialize(simulationContext: SimulationContext) {
    this.simulationContext = simulationContext
  }

  override fun cleanup() {
    simulationContext = null
    lastValue = null
  }
}