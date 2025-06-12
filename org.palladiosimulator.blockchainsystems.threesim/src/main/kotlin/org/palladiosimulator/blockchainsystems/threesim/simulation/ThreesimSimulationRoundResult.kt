package org.palladiosimulator.blockchainsystems.threesim.simulation

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationRoundResult
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric

/**
 * Result of a single simulation round of 3SIM.
 *
 * @author Davis Riedel
 */
class ThreesimSimulationRoundResult(
  val outputMetrics: List<OutputMetric<Any>>,
) : SimulationRoundResult