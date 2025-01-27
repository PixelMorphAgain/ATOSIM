package org.palladiosimulator.blockchainsystems.core.system.abstractions;

/**
 * Interface for a factory that produces instances of {@code BlockchainSystemNodeBehavior}.
 *
 * @author Yannik Sproll
 */
public interface BlockchainSystemNodeBehaviorFactory {

    /**
     * Creates an instance of {@code BlockchainSystemNodeBehavior} for a specified blockchain system node.
     *
     * @param nodeId the id of the node the created {@code BlockchainSystemNodeBehavior} belongs to
     * @return a {@code BlockchainSystemNodeBehavior} instance
     */
    BlockchainSystemNodeBehavior create(String nodeId);
}
