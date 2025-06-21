package org.palladiosimulator.blockchainsystems.plugin.results.ui;

public record ResultFileValue(
        String key,
        String value,
        SimulationResultFile file) {

    public String format() {
        return key + ": " + value;
    }
}
