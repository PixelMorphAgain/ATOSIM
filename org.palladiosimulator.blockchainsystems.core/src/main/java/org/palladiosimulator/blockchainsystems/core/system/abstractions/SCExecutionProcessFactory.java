package org.palladiosimulator.blockchainsystems.core.system.abstractions;

/**
 * Interface for a factory that produces instances of {@code SCExecutionProcess}.
 *
 * @author Davis Riedel
 */
public interface SCExecutionProcessFactory {

    /**
     * Creates an instance of @code{SCExecutionProcess} for a specified blockchain system node.
     *
     * @param nodeId the id of the node the created {@code SCExecutionProcess} belongs to
     *
     * @return a @code{SCExecutionProcess} instance
     */
    SCExecutionProcess createSCExecutionProcess(String nodeId, boolean isFullNode);
}
