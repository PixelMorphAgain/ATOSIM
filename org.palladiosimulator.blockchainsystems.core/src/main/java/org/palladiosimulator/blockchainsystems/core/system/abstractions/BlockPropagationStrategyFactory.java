package org.palladiosimulator.blockchainsystems.core.system.abstractions;

/**
 * Interface for a factory that produces instances of {@code BlockPropagationStrategy}.
 * 
 * @author Yannik Sproll
 *
 */
public interface BlockPropagationStrategyFactory {

	/**
	 * Creates an instance of @code{BlockPropagationStrategy}
	 * 
	 * @return a @code{BlockPropagationStrategy} instance
	 */
	BlockPropagationStrategy createBlockPropagationStrategy();
}
