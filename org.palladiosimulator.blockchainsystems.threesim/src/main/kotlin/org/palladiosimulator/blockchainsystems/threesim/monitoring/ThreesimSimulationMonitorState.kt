package org.palladiosimulator.blockchainsystems.threesim.monitoring

import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block
import org.palladiosimulator.blockchainsystems.core.geography.GeographicalRegions
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemNode
import org.palladiosimulator.blockchainsystems.core.utils.CounterMap

class ThreesimSimulationMonitorState(
  val forkedBlocks: MutableSet<Block>,
  val nodes: MutableSet<BlockchainSystemNode>,
  val blocksProposedPerNode: CounterMap<Int>,
  val geographicalRegions: GeographicalRegions
)