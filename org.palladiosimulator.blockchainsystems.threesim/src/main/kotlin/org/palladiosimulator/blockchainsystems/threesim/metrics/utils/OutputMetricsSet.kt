package org.palladiosimulator.blockchainsystems.threesim.metrics.utils

import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric
import java.util.TreeSet

/**
 * A set of output metrics. Each metric is uniquely identified by its name.
 *
 * @author Davis Riedel
 */
class OutputMetricsSet : TreeSet<OutputMetric<*>>(compareBy { it.name })