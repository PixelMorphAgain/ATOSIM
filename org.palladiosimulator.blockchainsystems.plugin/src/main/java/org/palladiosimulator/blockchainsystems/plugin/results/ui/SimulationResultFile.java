package org.palladiosimulator.blockchainsystems.plugin.results.ui;

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResultSummary;
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResultSummaryDeserializer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Map;

/**
 * Represents a simulation result file and provides methods to extract values from it.
 * This class reads the content of the file and extracts relevant simulation results.
 *
 * @param file       the file containing the simulation results
 * @param repository the repository where this file is stored
 * @param serializer the serializer used to deserialize the simulation result summary
 * @author Yannik Sproll, Davis Riedel
 */
public record SimulationResultFile(
        File file,
        ResultsRepository repository,
        SimulationResultSummaryDeserializer serializer
) {
    public Map<String, String> getValues() {
        Path filePath = Paths.get(file.getPath());
        try {
            String content = Files.readString(filePath);
            SimulationResultSummary summary = serializer.deserializeFromText(content);
            return summary.getValues();
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
            return Collections.emptyMap();
        }
    }
}
