package org.palladiosimulator.blockchainsystems.core.system.abstractions;

/**
 * Interface for a factory that produces instances of {@code BlockValidator}.
 *
 * @author Yannik Sproll
 */
public interface BlockValidatorFactory {

    /**
     * Returns an instance of @code{BlockValidator} for a specified blockchain system node.
     *
     * @param nodeId the id of the node the created {@code MiningProcess} belongs to
     * @return instance of @cod€{BlockValidator}
     */
    BlockValidator createBlockValidator(String nodeId);
}
