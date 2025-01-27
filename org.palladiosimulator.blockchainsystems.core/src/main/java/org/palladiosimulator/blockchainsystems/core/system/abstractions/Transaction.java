package org.palladiosimulator.blockchainsystems.core.system.abstractions;

/**
 * The {@code Transaction} interface represents a transaction that can be included in a block.
 *
 * @author Davis Riedel
 */
public interface Transaction {
    /**
     * @return the hash uniquely identifying the transaction
     */
    String getTxId();

    /**
     * @return the maximum amount of gas that can be used by the transaction
     */
    int getGasLimit();

    /**
     * @return the gas price of the transaction in GWEI
     */
    int getGasPrice();

    /**
     * @return the gas actually used by the transaction
     */
    int getGasUsed();
}
