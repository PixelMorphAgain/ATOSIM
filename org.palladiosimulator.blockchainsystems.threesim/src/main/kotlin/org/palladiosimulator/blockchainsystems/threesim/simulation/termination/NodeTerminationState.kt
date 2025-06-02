package org.palladiosimulator.blockchainsystems.threesim.simulation.termination

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent

interface NodeTerminationState {
  fun onTraceEventOccurred(traceEvent: TraceEvent)
}