package org.palladiosimulator.blockchainsystems.trilemma.util

import java.util.*
import java.util.random.RandomGenerator

class RandomValueProvider<T>(
  private val items: TreeMap<Int, RandomValueProviderItem<T>>,
  private val generator: RandomGenerator
) {
  val value: T
    get() {
      val selectionValue = generator.nextDouble()

      var index = 0

      var currentLowerBorder = 0.0
      var currentUpperBorder: Double = items.get(0)?.selectionValueBorder ?: 0.0

      while (!isInRange(selectionValue, currentLowerBorder, currentUpperBorder) && indexIsInValidRange(index)) {
        currentLowerBorder = currentUpperBorder
        currentUpperBorder = items.get(index + 1)?.selectionValueBorder ?: 0.0
        index++
      }

      return items.get(index)?.value ?: throw IllegalStateException("No value found for the generated random number.")
    }

  private fun indexIsInValidRange(index: Int): Boolean {
    return index < items.size - 1
  }

  companion object {
    private fun isInRange(value: Double, lowerBorder: Double, upperBorder: Double): Boolean {
      return lowerBorder <= value && value < upperBorder
    }

    private const val RANDOM_VALUES_SUM_MAX_DEVIATION = 0.005

    fun <T> create(randomValues: HashMap<T, Double>, generator: RandomGenerator): RandomValueProvider<T> {
      val randomValuesSum = randomValues
        .values
        .stream()
        .mapToDouble { x: Double -> x }
        .sum()

      // May not be greater than 1, but if it is not exactly one it can be tolerated
      // -> Last value gets the gap as an additional probability
      require(!(randomValuesSum > 1.0)) { "The sum of the provided probabilities is greater than one." }

      val deviation = 1.0 - randomValuesSum
      require(!(deviation > RANDOM_VALUES_SUM_MAX_DEVIATION)) { "The sum of the provided probabilities deviates more than allowed deviation maximum (0.005)." }

      val items = TreeMap<Int, RandomValueProviderItem<T>>()


      var index = 0
      var currentSelectionValueSum = 0.0

      for (entry in randomValues.entries) {
        currentSelectionValueSum += entry.value
        items.put(index, RandomValueProviderItem(currentSelectionValueSum, entry.key))

        index++
      }

      return RandomValueProvider(items, generator)
    }
  }
}