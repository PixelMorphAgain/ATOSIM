package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.GeographicalDiversity
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import kotlin.math.log
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Calculates geographical diversity
 *
 * @property numberOfNodesPerCountry Stores for each country i the amount of nodes located in country i.
 *                                   The length of the array indicates the overall number of countries.
 *                                   If no nodes are located in country i, the value at index i is 0.
 *
 * @author Davis Riedel
 */
class GeographicalDiversityCalculator(
  private val numberOfNodesPerCountry: Array<Int>,
) : OutputMetricCalculator<GeographicalDiversity> {
  override fun calculate(): GeographicalDiversity {
    val dqGeoTarget = calculateDqGeoTarget()
    val dqGeoExcl = calculateDqGeoExcl()
    val dqGeoEqual = calculateDqGeoEqual()

    val result = (dqGeoExcl - dqGeoTarget - dqGeoEqual) / (dqGeoExcl - dqGeoEqual)

    return GeographicalDiversity(result)
  }

  private fun calculateFirstFactor(numberOfCountries: Double, numberOfCountriesWithNodes: Double): Double {
    val a = log(numberOfCountries, numberOfCountriesWithNodes + 1.0)
    val b = log(numberOfCountries, numberOfCountries + 1.0)
    val c = log(numberOfCountries, 2.0)
    val d = log(numberOfCountries + 1, numberOfCountries)
    return 2.0 - (a - b) / (c - d)
  }

  /*
   * @return the geographical diversity target
   */
  private fun calculateDqGeoTarget(): Double {
    val numberOfCountries = numberOfNodesPerCountry.count().toDouble()
    val numberOfCountriesWithNodes = numberOfNodesPerCountry.count { it > 0 }.toDouble()
    val mu = numberOfNodesPerCountry.sum() / numberOfCountries

    val first = calculateFirstFactor(numberOfCountries, numberOfCountriesWithNodes)

    val e = numberOfNodesPerCountry.sumOf { (it - mu).pow(2) }
    val second = sqrt(e / numberOfCountries)

    return first * second
  }

  /**
   * @return the geographical diversity, if all nodes were located in a single country
   */
  private fun calculateDqGeoExcl(): Double {
    val numberOfCountries = numberOfNodesPerCountry.count().toDouble()
    val numberOfCountriesWithNodes = 1.0
    val numberOfNodes = numberOfNodesPerCountry.sum()
    val mu = numberOfNodes / numberOfCountries

    val first = calculateFirstFactor(numberOfCountries, numberOfCountriesWithNodes)

    val e = (numberOfNodes - mu).pow(2) + (numberOfCountries - 1) * (0 - mu).pow(2)
    val second = sqrt(e / numberOfCountries)

    return first * second
  }

  /**
   * @return the geographical diversity, if all nodes are equally distributed across all countries
   */
  private fun calculateDqGeoEqual(): Double {
    val numberOfCountries = numberOfNodesPerCountry.count().toDouble()
    val numberOfCountriesWithNodes = numberOfCountries

    // NOTE: the second factor evaluates to 0

    return calculateFirstFactor(numberOfCountries, numberOfCountriesWithNodes)
  }
}