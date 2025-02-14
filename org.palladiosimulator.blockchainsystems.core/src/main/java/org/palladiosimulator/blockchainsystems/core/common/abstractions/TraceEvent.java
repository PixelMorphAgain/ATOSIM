package org.palladiosimulator.blockchainsystems.core.common.abstractions;

/**
 * 
 * The @code{TraceEvent} interface represents an event that can be used
 * to trace event that occurred during the simulation.
 * 
 * @author Yannik Sproll
 *
 */
public interface TraceEvent {

	/**
	 * 
	 * Returns the occurrence time of the event.
	 * 
	 * @return occurence time of the event.
	 */
	long getOccurenceTime();
	
	/**
	 * 
	 * Returns the type of the event.
	 * 
	 * @return the event type.
	 */
	String getEventType();
	
	/**
	 * 
	 * Writes a detailed representation of the event to the specified {@code StringBuilder}.
	 * 
	 * @param stringBuilder the string builder to which event details are written
	 */
	void formatDetails(StringBuilder stringBuilder);
}
