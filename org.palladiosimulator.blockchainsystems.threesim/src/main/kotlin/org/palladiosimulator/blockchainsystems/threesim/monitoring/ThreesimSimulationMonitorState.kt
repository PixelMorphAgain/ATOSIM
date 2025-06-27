package org.palladiosimulator.blockchainsystems.threesim.monitoring

import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block
import org.palladiosimulator.blockchainsystems.core.geography.GeographicalRegions
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemNode

class ThreesimSimulationMonitorState(
  val forkedBlocks: Set<Block>,
  val nodes: Set<BlockchainSystemNode>,
  val blocksProposedPerNode: Map<String, Int>,
  val geographicalRegions: GeographicalRegions,
  val numberOfSubmittedTransactions: Int,
  val numberOfConfirmedTransactions: Int,
)