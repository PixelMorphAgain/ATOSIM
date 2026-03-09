package org.palladiosimulator.blockchainsystems.threesim.metrics;

import org.jetbrains.annotations.NotNull;
import org.palladiosimulator.blockchainsystems.threesim.metrics.abstractions.OutputMetric;

import java.util.List;

public class RaceAttackSuccess implements OutputMetric<Integer> {

    public static final String NAME = "Race Attack Success";

    private final boolean succeeded;

    public RaceAttackSuccess(boolean succeeded) {
        this.succeeded = succeeded;
    }

    @Override
    public Integer getValue() {
        return succeeded ? 1 : 0;
    }

    @Override
    @NotNull
    public String getName() {
        return NAME;
    }

    @Override
    public String getUnit() {
        return null;
    }
}
