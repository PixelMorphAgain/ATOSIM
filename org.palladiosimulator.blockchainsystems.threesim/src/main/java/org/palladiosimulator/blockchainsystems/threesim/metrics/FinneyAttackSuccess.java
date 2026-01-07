package org.palladiosimulator.blockchainsystems.threesim.metrics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric;

public class FinneyAttackSuccess implements OutputMetric<Boolean> {
    private final boolean value;

    public FinneyAttackSuccess(boolean value) {
        this.value = value;
    }
    @Override
    public Boolean getValue() {
        return value;
    }

    @Override
    @NotNull
    public String getName() {
        return "Finney Attack Success";
    }

    @Override
    @Nullable
    public String getUnit() {
        return null;
    }
}
