package org.palladiosimulator.blockchainsystems.plugin.utils

import kotlinx.serialization.json.Json
import org.eclipse.core.runtime.CoreException
import org.eclipse.debug.core.ILaunchConfiguration
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResult
import org.palladiosimulator.blockchainsystems.plugin.common.Attributes
import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException
import java.nio.file.Path
import java.time.Instant
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

/**
 * Utility class for saving simulation result summaries.
 *
 * @author Yannik Sproll, Davis Riedel
 */
object SummaryUtils {
  @Throws(CoreException::class)
  fun saveResultSummary(
    result: SimulationResult,
    configuration: ILaunchConfiguration
  ) {
    val path: String = configuration.getAttribute(
      Attributes.ArchitecturalModels.SIMULATION_RESULT_FILE_DIRECTORY,
      Attributes.ArchitecturalModels.SIMULATION_RESULT_FILE_DIRECTORY_DEFAULT
    )

    val fileName: String = currentTimeFormatted + "-" + result.getSimulationType() + ".dssimresult"
    val fullFilePath = Path.of(path, fileName).toString()

    try {
      BufferedWriter(FileWriter(fullFilePath)).use { writer ->
        writer.write(Json.encodeToString(result))
      }
    } catch (e: IOException) {
      System.err.println("An error occurred while writing to the file " + fullFilePath + ".")
      e.printStackTrace()
    }
  }

  private val currentTimeFormatted: String
    get() {
      val now = Instant.now()

      // Convert Instant to ZonedDateTime in the system default time zone
      val zonedDateTime = ZonedDateTime.ofInstant(now, ZoneId.systemDefault())

      // Define the desired format
      val formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss")

      // Format the ZonedDateTime
      return zonedDateTime.format(formatter)
    }
}