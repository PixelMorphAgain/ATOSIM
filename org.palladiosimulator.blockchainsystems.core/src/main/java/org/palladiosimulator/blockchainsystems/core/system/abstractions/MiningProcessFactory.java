package org.palladiosimulator.blockchainsystems.core.system.abstractions;

/**
 * Interface for a factory that produces instances of {@code MiningProcess}.
 *
 * @author Yannik Sproll
 */
public interface MiningProcessFactory {

    /**
     * Creates an instance of @code{MiningProcess} for a specified blockchain system node.
     *
     * @param nodeId the id of the node the created {@code MiningProcess} belongs to
     *
     * @return a @code{MiningProcess} instance
     */
    MiningProcess createMiningProcess(String nodeId);
}
