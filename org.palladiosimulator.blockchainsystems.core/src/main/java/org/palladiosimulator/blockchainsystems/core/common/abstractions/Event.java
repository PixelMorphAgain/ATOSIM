package org.palladiosimulator.blockchainsystems.core.common.abstractions;

/**
 * The @code{Event} interface represents a simulation event.
 * 
 * @author Yannik Sproll
 *
 */
public interface Event {

	/**
	 * Returns the occurence time of the event.
	 * 
	 * @return the occurence time of the event
	 */
	long getOccurenceTime();
	
	/**
	 * Returns the type of the event.
	 * 
	 * @return type of the event
	 */
	String getEventType();
	
	/**
	 * Returns the origin component where the event occured.
	 * 
	 * @return event origin
	 */
	EventDispatchable getOrigin();
	
	/**
	 * Returns a string formatted version of the event.
	 * 
	 * @return formatted version of the event
	 */
	String getValueFormatted();
}
