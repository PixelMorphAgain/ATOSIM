package org.palladiosimulator.blockchainsystems.core.system.abstractions;

/**
 * Interface for a factory that produces instances of {@code Transaction}.
 *
 * @author Davis Riedel
 */
public interface TransactionFactory {
    /**
     * Creates a new transaction with the specified data.
     *
     * @param gasLimit the gas limit of the transaction
     * @param gasPrice the gas price of the transaction in GWEI
     * @return a @code{Transaction} instance
     */
    Transaction createTransaction(int gasLimit, int gasPrice);
}
