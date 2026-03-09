package org.palladiosimulator.blockchainsystems.threesim.metrics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric;

public class AttackerRevenueShare implements OutputMetric<Double> {

    public static final String NAME = "Attacker Revenue Share";
    public static final String UNIT = "%";

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
        return NAME;
    }

    @Override
    @Nullable
    public String getUnit() {
        return UNIT;
    }
}
