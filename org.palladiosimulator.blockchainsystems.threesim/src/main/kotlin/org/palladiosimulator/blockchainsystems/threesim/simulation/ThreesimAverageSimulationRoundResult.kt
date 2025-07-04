package org.palladiosimulator.blockchainsystems.threesim.simulation

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
            AvailabilityScalability.NAME -> AvailabilityScalabilityCalculator.calculateAverage(it.value as List<AvailabilityScalability>)
            AvailabilitySecurity.NAME -> AvailabilitySecurityCalculator.calculateAverage(it.value as List<AvailabilitySecurity>)
            AverageConfirmationLatency.NAME -> AverageConfirmationLatencyCalculator.calculateAverage(it.value as List<AverageConfirmationLatency>)
            CensorshipResistance.NAME -> CensorshipResistanceCalculator.calculateAverage(it.value as List<CensorshipResistance>)
            ConfirmationLatency.NAME -> ConfirmationLatencyCalculator.calculateAverage(it.value as List<ConfirmationLatency>)
            Consistency.NAME -> ConsistencyCalculator.calculateAverage(it.value as List<Consistency>)
            CostOfAttack.NAME -> CostOfAttackCalculator.calculateAverage(it.value as List<CostOfAttack>)
            FaultTolerance.NAME -> FaultToleranceCalculator.calculateAverage(it.value as List<FaultTolerance>)
            GeographicalDiversity.NAME -> GeographicalDiversityCalculator.calculateAverage(it.value as List<GeographicalDiversity>)
            GiniCoefficient.NAME -> GiniCoefficientCalculator.calculateAverage(it.value as List<GiniCoefficient>)
            HerfindahlHirschmanIndex.NAME -> HerfindahlHirschmanIndexCalculator.calculateAverage(it.value as List<HerfindahlHirschmanIndex>)
            NakamotoCoefficient.NAME -> NakamotoCoefficientCalculator.calculateAverage(it.value as List<NakamotoCoefficient>)
            Reliability.NAME -> ReliabilityCalculator.calculateAverage(it.value as List<Reliability>)
            ShannonEntropy.NAME -> ShannonEntropyCalculator.calculateAverage(it.value as List<ShannonEntropy>)
            StaleBlockRate.NAME -> StaleBlockRateCalculator.calculateAverage(it.value as List<StaleBlockRate>)
            Throughput.NAME -> AverageThroughputCalculator.calculateAverage(it.value as List<Throughput>)
            else -> null
          }
        }
        .toCollection(OutputMetricsSet())

      return ThreesimAverageSimulationRoundResult(results)
    }
  }
}