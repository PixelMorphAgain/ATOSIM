package org.palladiosimulator.blockchainsystems.threesim.monitoring

import org.palladiosimulator.blockchainsystems.core.geography.GeographicalRegions
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemNode

class ThreesimSimulationMonitorState(
  val nodes: Set<BlockchainSystemNode>,
  val hashPowerPerNode: Collection<Double>,
  val blocksProposedPerNode: Collection<Int>,
  val geographicalRegions: GeographicalRegions,
  val numberOfNodesPerRegion: Collection<Int>,
  val numberOfSubmittedTransactions: Int,
  val numberOfConfirmedTransactions: Int,
  val transactionConfirmationDurations: Collection<Long>,
  val tokensHeldPerNode: Collection<Double>,
  val blockProposalTimeAndConfirmationTimePerConfirmedBlock: Collection<Pair<Long, Long>>,
//  val meanTimeToFailure: Long,
//  val meanTimeToRepair: Long,
  val numberOfStaleBlocks: Int,
  val numberOfConfirmedBlocks: Int
)