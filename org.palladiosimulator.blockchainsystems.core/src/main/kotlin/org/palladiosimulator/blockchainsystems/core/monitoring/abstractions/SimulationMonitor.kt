package org.palladiosimulator.blockchainsystems.core.monitoring.abstractions

import org.palladiosimulator.blockchainsystems.core.eventcoordination.TerminationCondition
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemNode
import org.palladiosimulator.blockchainsystems.core.tracing.TraceEventSubscriber

interface SimulationMonitor : TraceEventSubscriber, TerminationCondition {
  fun initializeNodes(nodes: Set<BlockchainSystemNode>)
}