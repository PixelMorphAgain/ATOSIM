package org.palladiosimulator.blockchainsystems.threesim.metrics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric;

public class AttackerRevenueShare implements OutputMetric<Double> {
    private final double value;

    public AttackerRevenueShare(double value) {
        this.value = value;
    }

    @Override
    public Double getValue() {
        return value;
    }

    @Override
    @NotNull
    public String getName() {
        return "Attacker Revenue Share";
    }

    @Override
    @Nullable
    public String getUnit() {
        return "%";
    }
}
