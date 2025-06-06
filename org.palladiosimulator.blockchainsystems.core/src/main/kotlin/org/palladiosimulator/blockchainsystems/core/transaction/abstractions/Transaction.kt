package org.palladiosimulator.blockchainsystems.core.transaction.abstractions

import org.palladiosimulator.blockchainsystems.core.system.abstractions.Propagatable

interface Transaction : Propagatable {
  /**
   * Returns the unique identifier of the transaction.
   *
   * @return the transaction ID
   */
  fun getTxId(): String

  /**
   * Returns the size of the transaction in bytes.
   *
   * @return the size of the transaction
   */
  fun getSize(): Int

  /**
   * Returns the time when the transaction was created.
   *
   * @return the creation time of the transaction
   */
  fun getCreationTime(): Long


  /**
   * Returns the ID of the sender of the transaction.
   *
   * @return the sender's ID
   */
  fun getSenderId(): String

  /**
   * Returns the ID of the recipient of the transaction.
   *
   * @return the recipient's ID
   */
  fun getRecipientId(): String

  /**
   * Returns the amount of the transaction.
   *
   * @return the transaction amount
   */
  fun getAmount(): Double

  /**
   * Returns the fee associated with the transaction.
   *
   * @return the transaction fee
   */
  fun getFee(): Double
}