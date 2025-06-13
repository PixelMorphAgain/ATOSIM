package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.GeographicalDiversity
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricAverageCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetricCalculator
import kotlin.math.log
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Calculates geographical diversity
 *
 * @author Davis Riedel
 */
class GeographicalDiversityCalculator(
  private val numberOfNodes: Int,
  private val numberOfRegions: Int,
  private val numberOfNodesPerRegion: Collection<Int>
) : OutputMetricCalculator<GeographicalDiversity> {
  /**
   * Calculates the geographical diversity based on the number of nodes, regions, and nodes per region.
   */
  override fun calculate(): GeographicalDiversity {
    val dqGeoTarget = calculateDqGeoTarget()
    val dqGeoExcl = calculateDqGeoExcl()
    val dqGeoEqual = calculateDqGeoEqual()

    val result = (dqGeoExcl - dqGeoTarget - dqGeoEqual) / (dqGeoExcl - dqGeoEqual)

    return GeographicalDiversity(result)
  }

  /**
   * Calculates the first factor of the geographical diversity formula.
   *
   * @param numberOfRegionsWithNodes the number of regions that have at least one node
   * @return the first factor of the geographical diversity formula
   */
  private fun calculateFirstFactor(numberOfRegionsWithNodes: Double): Double {
    val a = log(numberOfRegions.toDouble(), numberOfRegionsWithNodes + 1.0)
    val b = log(numberOfRegions.toDouble(), numberOfRegions + 1.0)
    val c = log(numberOfRegions.toDouble(), 2.0)
    val d = log(numberOfRegions + 1.0, numberOfRegions.toDouble())
    return 2.0 - (a - b) / (c - d)
  }

  /**
   * @return the geographical diversity target
   */
  private fun calculateDqGeoTarget(): Double {
    val numberOfRegionsWithNodes = numberOfNodesPerRegion.count { it > 0 }.toDouble()
    val mu = numberOfNodes.toDouble() / numberOfRegions.toDouble()

    val first = calculateFirstFactor(numberOfRegionsWithNodes)

    val e = numberOfNodesPerRegion.sumOf { (it - mu).pow(2) }
    val second = sqrt(e / numberOfRegions)

    return first * second
  }

  /**
   * @return the geographical diversity, if all nodes were located in a single country
   */
  private fun calculateDqGeoExcl(): Double {
    val numberOfRegionsWithNodes = 1.0
    val mu = numberOfNodes / numberOfRegions.toDouble()

    val first = calculateFirstFactor(numberOfRegionsWithNodes)

    val e = (numberOfNodes - mu).pow(2) + (numberOfRegions - 1) * (0 - mu).pow(2)
    val second = sqrt(e / numberOfRegions)

    return first * second
  }

  /**
   * @return the geographical diversity, if all nodes are equally distributed across all countries
   */
  private fun calculateDqGeoEqual(): Double {
    // NOTE: the second factor evaluates to 0
    return calculateFirstFactor(numberOfRegions.toDouble())
  }

  companion object : OutputMetricAverageCalculator<GeographicalDiversity> {
    override fun calculateAverage(measurements: List<GeographicalDiversity>): GeographicalDiversity {
      return GeographicalDiversity(measurements.sumOf { it.value } / measurements.size)
    }
  }
}