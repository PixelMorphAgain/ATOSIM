package org.palladiosimulator.blockchainsystems.trilemma.simulation.logoutputs

import org.palladiosimulator.blockchainsystems.core.tracing.TraceEventLogOutput

interface LogOutputProvider {
  val logOutputs: MutableSet<TraceEventLogOutput>
}