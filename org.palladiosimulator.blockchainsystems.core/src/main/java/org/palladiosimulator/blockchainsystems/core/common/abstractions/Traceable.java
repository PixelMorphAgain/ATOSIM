package org.palladiosimulator.blockchainsystems.core.common.abstractions;

/**
 * The @code{Traceable} interface specifies the initialization method
 * for a @code{TraceEventLogOrigin}. This @code{TraceEventLogOrigin}
 * instance is used as a log origin for trace events.
 *
 * @author Yannik Sproll
 */
public interface Traceable extends SimulationLifecycleAware {

    /**
     * Initializes with the specified log origin used for trace events.
     *
     * @param logOrigin the log origin used for trace events
     */
    void initializeLogger(TraceEventLogOrigin logOrigin);
}
