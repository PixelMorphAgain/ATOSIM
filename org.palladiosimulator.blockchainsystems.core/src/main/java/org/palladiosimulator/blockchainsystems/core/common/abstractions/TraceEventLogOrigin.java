package org.palladiosimulator.blockchainsystems.core.common.abstractions;

/**
 * The @code{TraceEventLogOrigin} interface represents the origin component
 * of trace events.
 *
 * @author Yannik Sproll
 */
public interface TraceEventLogOrigin {

    /**
     * Returns a unique identifier of the trace event logorigin.
     *
     * @return trace event log origin identifier
     */
    String getId();

    /**
     * Returns the name of the trace event logorigin.
     *
     * @return trace event log origin identifier
     */
    String getName();
}
