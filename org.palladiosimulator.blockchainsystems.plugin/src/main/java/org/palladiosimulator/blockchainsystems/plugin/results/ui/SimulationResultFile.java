package org.palladiosimulator.blockchainsystems.plugin.results.ui;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.palladiosimulator.blockchainsystems.plugin.results.SimulationResultSummary;

public record SimulationResultFile(
        File file,
        ResultsRepository repository) {

    public List<ResultFileValue> getValues() {
        Path filePath = Paths.get(file.getPath());

        // Read the file content
        try {
            String content = Files.readString(filePath);

            SimulationResultSummary summary = SimulationResultSummary.deserializeFromTextFile(content);
            ArrayList<ResultFileValue> values = new ArrayList<ResultFileValue>();
            if (summary.getSimulationType() != null) {
                values.add(new ResultFileValue("Simulation Type", summary.getSimulationType(), this));
            }
            if (summary.getAttackerWonRounds() != null) {
                values.add(new ResultFileValue("Attacker Won Rounds", summary.getAttackerWonRounds().toString(), this));
            }
            if (summary.getSystemWonRounds() != null) {
                values.add(new ResultFileValue("System Won Rounds", summary.getSystemWonRounds().toString(), this));
            }
            if (summary.getUnambiguousRounds() != null) {
                values.add(new ResultFileValue("Unambiguous Rounds", summary.getUnambiguousRounds().toString(), this));
            }
            if (summary.getAttackSuccessProbability() != null) {
                values.add(new ResultFileValue("Attack Success Probability", summary.getAttackSuccessProbability().toString(),
                        this));
            }

            return values;
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
            return Collections.emptyList();
        }
    }
}
