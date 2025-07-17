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

  @Synchronized
  fun decrement(key: T) {
    if (map.containsKey(key)) {
      val newValue = map[key]!! - 1
      if (newValue <= 0) {
        map.remove(key)
      } else {
        map[key] = newValue
      }
    }
  }

  fun get(key: T): Int {
    return map[key] ?: 0
  }

  fun getAll(): Map<T, Int> {
    return map
  }

  val values: Collection<Int>
    get() = map.values

  val keys: Set<T>
    get() = map.keys
}