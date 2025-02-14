package org.palladiosimulator.blockchainsystems.core.common.abstractions;

/**
 * 
 * The @code{TraceEventLogger} interface specifies a logger to
 * which trace events can be written.
 * 
 * @author Yannik Sproll
 *
 */
public interface TraceEventLogger {

	/**
	 * 
	 * Returns the log origin associated with this logger.
	 * 
	 * @return the associated log origin
	 */
	TraceEventLogOrigin getLogOrigin();
	
	/**
	 * 
	 * Logs the specified trace events.
	 * 
	 * @param traceEvent the trace event to log
	 */
	void logEvent(TraceEvent traceEvent);
	
	/**
	 * Checks if the specified event type is enabled and therefore should be logged.
	 * 
	 * @param eventType the event type to check
	 * @return true if the event should be logged, false otherwise
	 */
	boolean isEventTypeEnabled(String eventType);
}
