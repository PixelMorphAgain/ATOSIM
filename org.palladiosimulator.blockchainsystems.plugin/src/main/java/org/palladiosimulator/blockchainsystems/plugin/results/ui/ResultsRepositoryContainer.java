package org.palladiosimulator.blockchainsystems.plugin.results.ui;

import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResultSummaryDeserializer;

import java.util.List;
import java.io.File;
import java.util.ArrayList;

/**
 * Container for managing multiple results repositories.
 * Provides methods to add and retrieve repositories.
 *
 * @author Yannik Sproll, Davis Riedel
 */
public class ResultsRepositoryContainer {
    private final List<ResultsRepository> _repositories;

    public ResultsRepositoryContainer() {
        _repositories = new ArrayList<>();
    }

    public List<ResultsRepository> getResultRepositories() {
        return _repositories;
    }

    public void addRepository(File repositoryPath, SimulationResultSummaryDeserializer deserializer) {
        _repositories.add(new ResultsRepository(repositoryPath, deserializer, this));
    }
}
