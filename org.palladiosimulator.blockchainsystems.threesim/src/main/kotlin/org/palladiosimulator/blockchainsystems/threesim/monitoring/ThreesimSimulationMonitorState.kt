package org.palladiosimulator.blockchainsystems.threesim.monitoring

class ThreesimSimulationMonitorState(
  val numberOfNodes: Int,
  val hashPowerPerNode: Collection<Double>,
  val blocksProposedPerNode: Collection<Int>,
  val numberOfGeographicalRegions: Int,
  val numberOfNodesPerRegion: Collection<Int>,
  val numberOfSubmittedTransactions: Int,
  val numberOfConfirmedTransactions: Int,
  val transactionConfirmationDurations: Collection<Long>,
  val tokensHeldPerNode: Collection<Double>,
  val blockProposalTimeAndConfirmationTimePerConfirmedBlock: Collection<Pair<Long, Long>>,
  val meanTimeBetweenFailures: Long,
  val meanTimeToRepair: Long,
  val numberOfStaleBlocks: Int,
  val numberOfConfirmedBlocks: Int
)