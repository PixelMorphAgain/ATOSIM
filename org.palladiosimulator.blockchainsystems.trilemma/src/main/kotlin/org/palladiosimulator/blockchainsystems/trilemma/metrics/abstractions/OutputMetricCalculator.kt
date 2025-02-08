package org.palladiosimulator.blockchainsystems.trilemma.metrics.abstractions

interface OutputMetricCalculator<M: OutputMetric<*>> {
  fun calculate(): M;
}