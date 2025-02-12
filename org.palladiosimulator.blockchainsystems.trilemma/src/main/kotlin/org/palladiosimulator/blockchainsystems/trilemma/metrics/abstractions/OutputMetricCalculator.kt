package org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions

/**
 * Interface for a class that computes an output metric
 *
 * @author Davis Riedel
 */
interface OutputMetricCalculator<M: OutputMetric<*>> {
  fun calculate(): M;
}