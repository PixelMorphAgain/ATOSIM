package org.palladiosimulator.blockchainsystems.threesim.metrics;

import org.jetbrains.annotations.NotNull;
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric;

public class RaceAttackSuccess implements OutputMetric<Integer> {

    private final boolean succeeded;

    public RaceAttackSuccess(boolean succeeded) {
        this.succeeded = succeeded;
    }

    @Override
    public Integer getValue() {
        return succeeded ? 1 : 0;
    }

    @Override
    public @NotNull String getName() {
        return "Race Attack Success";
    }

    @Override
    public String getUnit() {
        return null;
    }
}
