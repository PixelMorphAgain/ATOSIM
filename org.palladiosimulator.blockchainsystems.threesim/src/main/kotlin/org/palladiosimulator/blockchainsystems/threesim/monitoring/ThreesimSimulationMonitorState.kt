package org.palladiosimulator.blockchainsystems.threesim.monitoring

import org.palladiosimulator.blockchainsystems.core.block.abstractions.Block
import org.palladiosimulator.blockchainsystems.core.geography.GeographicalRegions
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemNode

class ThreesimSimulationMonitorState(
  val forkedBlocks: Set<Block>,
  val nodes: Set<BlockchainSystemNode>,
  val hashPowerPerNode: Collection<Double>,
  val blocksProposedPerNode: Map<String, Int>,
  val geographicalRegions: GeographicalRegions,
  val numberOfNodesPerRegion: Collection<Int>,
  val numberOfSubmittedTransactions: Int,
  val numberOfConfirmedTransactions: Int,
  val transactionConfirmationDurations: Collection<Long>,
  val tokensHeldPerNode: Collection<Double>,
  val blockConfirmationTimePerConfirmedBlock: Collection<Long>,
  val blockProposalTimePerConfirmedBlock: Collection<Long>,
  val meanTimeToFailure: Long,
  val meanTimeToRepair: Long,
  val numberOfStaleBlocks: Int,
  val numberOfConfirmedBlocks: Int
)