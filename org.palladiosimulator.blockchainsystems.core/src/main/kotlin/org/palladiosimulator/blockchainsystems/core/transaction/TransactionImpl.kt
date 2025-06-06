package org.palladiosimulator.blockchainsystems.core.transaction

import org.palladiosimulator.blockchainsystems.core.transaction.abstractions.Transaction

/**
 * Implementation of the [Transaction] interface.
 *
 * @property txId The unique identifier of the transaction.
 * @property size The size of the transaction in bytes.
 * @property creationTime The time when the transaction was created.
 * @property senderId The ID of the sender of the transaction.
 * @property recipientId The ID of the recipient of the transaction.
 * @property amount The amount of the transaction.
 * @property fee The fee associated with the transaction.
 *
 * @author Davis Riedel
 */
class TransactionImpl(
  private val txId: String,
  private val size: Int,
  private val creationTime: Long,
  private val senderId: String,
  private val recipientId: String,
  private val amount: Double,
  private val fee: Double
) : Transaction {
  override fun getTxId(): String {
    return txId
  }

  override fun getSize(): Int {
    return size
  }

  override fun getCreationTime(): Long {
    return creationTime
  }

  override fun getSenderId(): String {
    return senderId
  }

  override fun getRecipientId(): String {
    return recipientId
  }

  override fun getAmount(): Double {
    return amount
  }

  override fun getFee(): Double {
    return fee
  }
}