package org.palladiosimulator.blockchainsystems.core.utils

/**
 * A thread-safe map that implements a simple counter for each key.
 *
 * @author Davis Riedel
 */
class CounterMap<T> {
  private val map: MutableMap<T, Int> = mutableMapOf()

  @Synchronized
  fun increment(key: T) {
    map[key] = (map[key] ?: 0) + 1
  }

  fun get(key: T): Int {
    return map[key] ?: 0
  }

  fun getAll(): Map<T, Int> {
    return map.toMap()
  }

  fun getValues(): Array<Int> {
    return map.values.toTypedArray()
  }
}