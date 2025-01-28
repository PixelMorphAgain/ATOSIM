package org.palladiosimulator.blockchainsystems.core.system.abstractions;

import java.util.Set;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.Traceable;

/**
 * The @code{TransactionPool} interface is an abstraction of a transaction pool,
 * that is used by blockchain system nodes to store submitted but not yet executed transaction.
 *
 * @author Davis Riedel
 */
public interface TransactionPool extends Traceable {

  Transaction getTransactionById(String txId);

  /**
   * Stores the specified transaction in the pool.
   *
   * @param
   */
  void storeTransaction(Transaction transaction);
}
