package org.palladiosimulator.blockchainsystems.threesim.simulation.logoutputs

import org.palladiosimulator.blockchainsystems.core.tracing.TraceEventLogOutput

interface LogOutputProvider {
  val logOutputs: MutableSet<TraceEventLogOutput>
}