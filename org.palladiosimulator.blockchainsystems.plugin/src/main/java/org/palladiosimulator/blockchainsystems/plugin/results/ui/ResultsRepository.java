package org.palladiosimulator.blockchainsystems.plugin.results.ui;

import java.io.File;
import java.io.FileFilter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Represents a repository for simulation results.
 * Provides methods to retrieve simulation result files from a specified directory.
 *
 * @param directory The directory where simulation results are stored.
 * @param container The container that holds the results repository.
 * @author Yannik Sproll
 */
public record ResultsRepository(
        File directory,
        ResultsRepositoryContainer container
) {

    private static final FileFilter textFileFilter = new FileFilter() {
        @Override
        public boolean accept(File file) {
            return file.isFile() && file.getName().endsWith(".dssimresult");
        }
    };

    public List<SimulationResultFile> getSimulationResults() {
        return Stream.of(directory.listFiles(textFileFilter))
                .map(x -> new SimulationResultFile(x, this))
                .collect(Collectors.toList());
    }
}
