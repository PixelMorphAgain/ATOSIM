package org.palladiosimulator.blockchainsystems.core.system.abstractions;

/**
 * Interface for a factory that produces instances of {@code PropagationStrategy}.
 *
 * @param <T> the type of object to propagate
 *
 * @author Yannik Sproll, Davis Riedel
 */
public interface PropagationStrategyFactory<T> {

    /**
     * Creates an instance of @code{PropagationStrategy}
     *
     * @return a @code{PropagationStrategy} instance
     */
    PropagationStrategy<T> createPropagationStrategy();
}
