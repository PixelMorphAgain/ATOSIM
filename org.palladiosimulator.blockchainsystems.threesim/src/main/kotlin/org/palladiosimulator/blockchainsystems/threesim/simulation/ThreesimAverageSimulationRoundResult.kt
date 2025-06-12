package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import org.palladiosimulator.blockchainsystems.threesim.metrics.utils.OutputMetricsSet
import org.palladiosimulator.blockchainsystems.threesim.metrics.*
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.*

/**
 * Average result of several simulation rounds of 3SIM.
 *
 * @author Davis Riedel
 */
class ThreesimAverageSimulationRoundResult(
  private val outputMetrics: OutputMetricsSet
) {
  companion object {
    /**
     * Creates a set of average results from a list of simulation round results.
     *
     * @param simulationRoundResults the list of simulation round results
     * @return the set of average results
     */
    fun fromSimulationRoundResults(simulationRoundResults: List<ThreesimSimulationRoundResult>): ThreesimAverageSimulationRoundResult {
      val results = simulationRoundResults
        .flatMap { it.outputMetrics }
        .groupBy { it.name }
        .mapNotNull {
          when (it.key) {
            AvailabilityScalability.NAME -> AvailabilityScalabilityCalculator.calculateAverage(it.value)
            AvailabilitySecurity.NAME -> AvailabilityScalabilityCalculator.calculateAverage(it.value)
            AverageConfirmationLatency.NAME -> AverageConfirmationLatencyCalculator.calculateAverage(it.value)
            CensorshipResistance.NAME -> CensorshipResistanceCalculator.calculateAverage(it.value)
            ConfirmationLatency.NAME -> ConfirmationLatencyCalculator.calculateAverage(it.value)
            Consistency.NAME -> ConsistencyCalculator.calculateAverage(it.value)
            CostOfAttack.NAME -> CostOfAttackCalculator.calculateAverage(it.value)
            FaultTolerance.NAME -> FaultToleranceCalculator.calculateAverage(it.value)
            GeographicalDiversity.NAME -> GeographicalDiversityCalculator.calculateAverage(it.value)
            GiniCoefficient.NAME -> GiniCoefficientCalculator.calculateAverage(it.value)
            HerfindahlHirschmanIndex.NAME -> HerfindahlHirschmanIndexCalculator.calculateAverage(it.value)
            NakamotoCoefficient.NAME -> NakamotoCoefficientCalculator.calculateAverage(it.value)
            Reliability.NAME -> ReliabilityCalculator.calculateAverage(it.value)
            ShannonEntropy.NAME -> ShannonEntropyCalculator.calculateAverage(it.value)
            StaleBlockRate.NAME -> StaleBlockRateCalculator.calculateAverage(it.value)
            Throughput.NAME -> ThroughputCalculator.calculateAverage(it.value)
            else -> null
          }
        }
        .toCollection(OutputMetricsSet())

      return ThreesimAverageSimulationRoundResult(results)
    }
  }
}