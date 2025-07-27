package org.palladiosimulator.blockchainsystems.plugin.results.ui

import java.io.File

/**
 * Container for managing multiple results repositories.
 * Provides methods to add and retrieve repositories.
 *
 * @author Yannik Sproll, Davis Riedel
 */
class ResultsRepositoryContainer {
  val resultRepositories: MutableList<ResultsRepository> = ArrayList()

  fun addRepository(repositoryPath: File) {
    resultRepositories.add(ResultsRepository(repositoryPath, this))
  }
}