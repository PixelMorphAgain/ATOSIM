package org.palladiosimulator.blockchainsystems.threesim.metrics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric;

public class FinneyAttackSuccess implements OutputMetric<Integer> {

    public static final String NAME = "Finney Attack Success";

    private final boolean value;

    public FinneyAttackSuccess(boolean value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value ? 1 : 0;
    }

    @Override
    @NotNull
    public String getName() {
        return NAME;
    }

    @Override
    @Nullable
    public String getUnit() {
        return null;
    }
}
