package org.palladiosimulator.blockchainsystems.threesim.monitoring

import org.palladiosimulator.blockchainsystems.threesim.utils.CircularBuffer

/**
 * Counts the number of confirmed transactions in a blockchain system.
 *
 * @author Davis Riedel
 */
class ConfirmedTransactionsCounter(
  private val numberOfRequiredSecurityConfirmations: Int
) {
  var numberOfConfirmedTransactions: Int = 0
    private set

  /**
   * For each added block, the number of transactions in that block is stored in a circular buffer.
   * The buffer size is equal to the number of required security confirmations.
   * If a new block is added and the buffer is full, this means that the oldest block is now confirmed.
   * The oldest entry stores the number of transactions in this block. It is removed from the buffer and added to the
   * total number of confirmed transactions.
   */
  private var unconfirmedTransactionsBuffer: CircularBuffer<Int> = CircularBuffer(numberOfRequiredSecurityConfirmations)

  /**
   * Track the number of transactions in the newly added block.
   *
   * @param numberOfTransactionsInBlock The number of transactions in the newly added block.
   */
  fun add(numberOfTransactionsInBlock: Int) {
    unconfirmedTransactionsBuffer.add(numberOfTransactionsInBlock)?.let { confirmedTrxs ->
      numberOfConfirmedTransactions += confirmedTrxs
    }
  }
}