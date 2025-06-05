package org.palladiosimulator.blockchainsystems.core.system.abstractions

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
}