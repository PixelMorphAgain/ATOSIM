package org.palladiosimulator.blockchainsystems.core.common.abstractions;

/**
 * 
 * The @code{SimulationLifecycleAware} interface specifies lifecycle methods for
 * simulation objects.
 * 
 * @author Yannik Sproll
 *
 */
public interface SimulationLifecycleAware {

	/**
	 * Initializes with the specified simulation context.
	 * 
	 * @param simulationContext simulation context for the initialization
	 */
	void initialize(SimulationContext simulationContext);
	
	/**
	 * Cleans up.
	 */
	void cleanup();
}
