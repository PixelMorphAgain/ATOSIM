package org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions

interface OutputMetricAverageCalculator<M : OutputMetric<*>> {
  fun calculateAverage(measurements: List<M>): M
}