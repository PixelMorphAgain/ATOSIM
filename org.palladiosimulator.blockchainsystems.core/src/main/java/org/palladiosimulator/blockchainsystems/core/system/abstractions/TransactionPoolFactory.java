package org.palladiosimulator.blockchainsystems.core.system.abstractions;

/**
 * Interface for a factory that produces instances of {@code TransactionPool}.
 *
 * @author Davis Riedel
 */
public interface TransactionPoolFactory {

    /**
     * Creates an instance of @code{TransactionPool} for a specified blockchain system node.
     *
     * @param nodeId the id of the node the created {@code TransactionPool} belongs to
     * @return a @code{TransactionPool} instance
     */
    TransactionPool createTransactionPool(String nodeId);
}
