package org.palladiosimulator.blockchainsystems.threesim.simulation.results

import kotlinx.serialization.json.Json
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResult
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResultSerializer

class ThreesimSimulationResultSerializer(
  private val jsonSerializer: Json,
) : SimulationResultSerializer {
  override fun serialize(result: SimulationResult): String {
    return jsonSerializer.encodeToString(result)
  }
}
