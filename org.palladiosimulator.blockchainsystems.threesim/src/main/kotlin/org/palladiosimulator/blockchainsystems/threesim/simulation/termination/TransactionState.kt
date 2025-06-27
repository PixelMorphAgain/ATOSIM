package org.palladiosimulator.blockchainsystems.threesim.simulation.termination

import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction

data class TransactionState(
  val transaction: Transaction,
  var addedToMemPoolTime: Long
)