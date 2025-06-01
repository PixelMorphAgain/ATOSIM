package org.palladiosimulator.blockchainsystems.plugin.results.ui;

import java.util.List;
import java.io.File;
import java.util.ArrayList;

/**
 * Container for managing multiple results repositories.
 * Provides methods to add and retrieve repositories.
 *
 * @author Yannik Sproll
 */
public class ResultsRepositoryContainer {
    private final List<ResultsRepository> _repositories;

    public ResultsRepositoryContainer() {
        _repositories = new ArrayList<ResultsRepository>();
    }

    public List<ResultsRepository> getResultRepositories() {
        return _repositories;
    }

    public void addRepository(File repositoryPath) {
        _repositories.add(new ResultsRepository(repositoryPath, this));
    }
}
