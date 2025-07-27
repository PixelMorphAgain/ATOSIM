package org.palladiosimulator.blockchainsystems.core.transaction.abstractions

import org.palladiosimulator.blockchainsystems.core.common.abstractions.Traceable
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
   * Gets a transaction with a given ID from the mempool.
   *
   * @param txId The ID of the transaction
   */
  fun getTransactionById(txId: String): Transaction?

  /**
   * Get all transactions in the mempool sorted by their fee rate in descending order.
   */
  fun getTransactionsSortedByFeeRate(): TreeSet<Transaction>
}