package org.palladiosimulator.blockchainsystems.core.system;

/**
 * Interface for a factory that produces instances of {@code BlockchainSystem}.
 *
 * @author Yannik Sproll
 */
public interface BlockchainSystemFactory {

    /**
     * Creates an instance of the {@code BlockchainSystem} class.
     *
     * @return {@code BlockchainSystem} instance
     */
    BlockchainSystem createBlockchainSystem();
}
