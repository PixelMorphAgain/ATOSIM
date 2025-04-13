package org.palladiosimulator.blockchainsystems.trilemma.simulation.termination

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent

interface NodeTerminationState {
  fun onTraceEventOccurred(traceEvent: TraceEvent)
}