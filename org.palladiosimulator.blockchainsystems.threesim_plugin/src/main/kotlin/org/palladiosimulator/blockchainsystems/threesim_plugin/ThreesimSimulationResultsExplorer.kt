package org.palladiosimulator.blockchainsystems.threesim_plugin

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResultSummaryDeserializer
import org.palladiosimulator.blockchainsystems.plugin.results.ui.SimulationResultsExplorer
import org.palladiosimulator.blockchainsystems.threesim.simulation.ThreesimSimulationResultSummaryDeserializer
import java.io.File

/**
 * This class provides a view for exploring 3SIM simulation results.
 *
 * @author Davis Riedel
 */
class ThreesimSimulationResultsExplorer : SimulationResultsExplorer() {
  override fun getSimulationResultSummaryDeserializerForDirectory(directory: File): SimulationResultSummaryDeserializer? {
    return ThreesimSimulationResultSummaryDeserializer
  }
}