package org.palladiosimulator.blockchainsystems.core.transaction.abstractions

import org.palladiosimulator.blockchainsystems.core.common.abstractions.Traceable

/**
 * The [TransactionSubmissionProcess] generates transactions and submits them to the blockchain network.
 *
 * @author Davis Riedel
 */
interface TransactionSubmissionProcess : Traceable {

  /**
   * Sets the callback that is invoked when the transaction submission process submits a
   * new transaction to a validating node.
   */
  fun setOnTransactionSubmittedCallback(
    onTransactionSubmittedCallback: () -> Unit,
  )

  /**
   * Starts the mining of new blocks.
   */
  fun startTransactionSubmissionProcess()

  /**
   * Stops the mining of new blocks.
   */
  fun stopTransactionSubmissionProcess()
}