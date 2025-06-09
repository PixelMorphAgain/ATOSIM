package org.palladiosimulator.blockchainsystems.threesim.metrics.calculators

import org.palladiosimulator.blockchainsystems.threesim.metrics.GeographicalDiversity
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
  private val numberOfNodesPerRegion: List<Int>
) : OutputMetricCalculator<GeographicalDiversity> {
  override fun calculate(): GeographicalDiversity {
    val dqGeoTarget = calculateDqGeoTarget()
    val dqGeoExcl = calculateDqGeoExcl()
    val dqGeoEqual = calculateDqGeoEqual()

    val result = (dqGeoExcl - dqGeoTarget - dqGeoEqual) / (dqGeoExcl - dqGeoEqual)

    return GeographicalDiversity(result)
  }

  private fun calculateFirstFactor(numberOfRegionsWithNodes: Double): Double {
    val a = log(numberOfRegions, numberOfRegionsWithNodes + 1.0)
    val b = log(numberOfRegions, numberOfRegions + 1.0)
    val c = log(numberOfRegions, 2.0)
    val d = log(numberOfRegions + 1, numberOfRegions)
    return 2.0 - (a - b) / (c - d)
  }

  /*
   * @return the geographical diversity target
   */
  private fun calculateDqGeoTarget(): Double {
    val numberOfRegionsWithNodes = numberOfNodesPerRegion.count { it > 0 }.toDouble()
    val mu = numberOfNodes.toDouble() / numberOfRegions.toDouble()

    val first = calculateFirstFactor(numberOfRegions, numberOfRegionsWithNodes)

    val e = numberOfNodesPerRegion.sumOf { (it - mu).pow(2) }
    val second = sqrt(e / numberOfRegions)

    return first * second
  }

  /**
   * @return the geographical diversity, if all nodes were located in a single country
   */
  private fun calculateDqGeoExcl(): Double {
    val numberOfRegionsWithNodes = 1.0
    val mu = numberOfNodes / numberOfRegions

    val first = calculateFirstFactor(numberOfRegions, numberOfRegionsWithNodes)

    val e = (numberOfNodes - mu).pow(2) + (numberOfRegions - 1) * (0 - mu).pow(2)
    val second = sqrt(e / numberOfRegions)

    return first * second
  }

  /**
   * @return the geographical diversity, if all nodes are equally distributed across all countries
   */
  private fun calculateDqGeoEqual(): Double {
    val numberOfRegionsWithNodes = numberOfRegions
    // NOTE: the second factor evaluates to 0
    return calculateFirstFactor(numberOfRegions, numberOfRegionsWithNodes)
  }
}