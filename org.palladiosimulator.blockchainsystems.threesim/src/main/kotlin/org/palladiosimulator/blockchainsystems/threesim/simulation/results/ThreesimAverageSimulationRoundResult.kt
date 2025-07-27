package org.palladiosimulator.blockchainsystems.threesim.simulation.results

import kotlinx.serialization.Serializable
import org.palladiosimulator.blockchainsystems.threesim.metrics.AvailabilityScalability
import org.palladiosimulator.blockchainsystems.threesim.metrics.AvailabilitySecurity
import org.palladiosimulator.blockchainsystems.threesim.metrics.AverageConfirmationLatency
import org.palladiosimulator.blockchainsystems.threesim.metrics.AverageThroughput
import org.palladiosimulator.blockchainsystems.threesim.metrics.CensorshipResistance
import org.palladiosimulator.blockchainsystems.threesim.metrics.Consistency
import org.palladiosimulator.blockchainsystems.threesim.metrics.FaultTolerance
import org.palladiosimulator.blockchainsystems.threesim.metrics.GeographicalDiversity
import org.palladiosimulator.blockchainsystems.threesim.metrics.GiniCoefficient
import org.palladiosimulator.blockchainsystems.threesim.metrics.HerfindahlHirschmanIndex
import org.palladiosimulator.blockchainsystems.threesim.metrics.NakamotoCoefficient
import org.palladiosimulator.blockchainsystems.threesim.metrics.Reliability
import org.palladiosimulator.blockchainsystems.threesim.metrics.ShannonEntropy
import org.palladiosimulator.blockchainsystems.threesim.metrics.StaleBlockRate
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.AvailabilityScalabilityCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.AvailabilitySecurityCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.AverageConfirmationLatencyCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.AverageThroughputCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.CensorshipResistanceCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.ConsistencyCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.FaultToleranceCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.GeographicalDiversityCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.GiniCoefficientCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.HerfindahlHirschmanIndexCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.NakamotoCoefficientCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.ReliabilityCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.ShannonEntropyCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.calculators.StaleBlockRateCalculator
import org.palladiosimulator.blockchainsystems.threesim.metrics.utils.OutputMetricsSet

/**
 * Average result of several simulation rounds of 3SIM.
 *
 * @author Davis Riedel
 */
@Serializable
data class ThreesimAverageSimulationRoundResult(
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
            AvailabilityScalability.Companion.NAME -> AvailabilityScalabilityCalculator.Companion.calculateAverage(it.value as List<AvailabilityScalability>)
            AvailabilitySecurity.Companion.NAME -> AvailabilitySecurityCalculator.Companion.calculateAverage(it.value as List<AvailabilitySecurity>)
            AverageConfirmationLatency.Companion.NAME -> AverageConfirmationLatencyCalculator.Companion.calculateAverage(
              it.value as List<AverageConfirmationLatency>
            )

            CensorshipResistance.Companion.NAME -> CensorshipResistanceCalculator.Companion.calculateAverage(it.value as List<CensorshipResistance>)
            Consistency.Companion.NAME -> ConsistencyCalculator.Companion.calculateAverage(it.value as List<Consistency>)
//            CostOfAttack.NAME -> CostOfAttackCalculator.calculateAverage(it.value as List<CostOfAttack>)
            FaultTolerance.Companion.NAME -> FaultToleranceCalculator.Companion.calculateAverage(it.value as List<FaultTolerance>)
            GeographicalDiversity.Companion.NAME -> GeographicalDiversityCalculator.Companion.calculateAverage(it.value as List<GeographicalDiversity>)
            GiniCoefficient.Companion.NAME -> GiniCoefficientCalculator.Companion.calculateAverage(it.value as List<GiniCoefficient>)
            HerfindahlHirschmanIndex.Companion.NAME -> HerfindahlHirschmanIndexCalculator.Companion.calculateAverage(it.value as List<HerfindahlHirschmanIndex>)
            NakamotoCoefficient.Companion.NAME -> NakamotoCoefficientCalculator.Companion.calculateAverage(it.value as List<NakamotoCoefficient>)
            Reliability.Companion.NAME -> ReliabilityCalculator.Companion.calculateAverage(it.value as List<Reliability>)
            ShannonEntropy.Companion.NAME -> ShannonEntropyCalculator.Companion.calculateAverage(it.value as List<ShannonEntropy>)
            StaleBlockRate.Companion.NAME -> StaleBlockRateCalculator.Companion.calculateAverage(it.value as List<StaleBlockRate>)
            AverageThroughput.Companion.NAME -> AverageThroughputCalculator.Companion.calculateAverage(it.value as List<AverageThroughput>)
            else -> null
          }
        }
        .toCollection(OutputMetricsSet())

      return ThreesimAverageSimulationRoundResult(results)
    }
  }
}