package org.palladiosimulator.blockchainsystems.core.system.abstractions

import org.palladiosimulator.blockchainsystems.core.common.abstractions.Traceable
import org.palladiosimulator.blockchainsystems.core.transaction.TransactionSelectionResult
import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction
import java.util.TreeSet

/**
 * This interface represents a transaction memory pool (mempool) that stores transactions
 * before they are included in a block.
 *
 * @author Davis Riedel
 */
interface TrxMemPool : Traceable {
  /**
   * Stores a transaction in the mempool.
   *
   * @param transaction The transaction to store.
   */
  fun storeTransaction(transaction: Transaction)

  /**
   * Get all transactions in the mempool sorted by their fee rate in descending order.
   */
  fun getTransactionsSortedByFeeRate(): TreeSet<Transaction>
}