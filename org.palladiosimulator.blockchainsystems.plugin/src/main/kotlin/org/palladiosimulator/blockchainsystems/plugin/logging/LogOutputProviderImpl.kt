package org.palladiosimulator.blockchainsystems.plugin.logging

import kotlinx.serialization.json.Json
import org.palladiosimulator.blockchainsystems.core.simulation.logoutputs.abstractions.LogOutputProvider
import org.palladiosimulator.blockchainsystems.core.tracing.TraceEventLogOutput
import org.palladiosimulator.blockchainsystems.loggers.TraceEventConsoleLogger
import org.palladiosimulator.blockchainsystems.loggers.TraceEventFileLogger
import org.palladiosimulator.blockchainsystems.loggers.TraceEventPostgresDbLogger

/**
 * Implementation of the [LogOutputProvider] interface.
 * Supports console, file, and database logging.
 *
 * @author Yannik Sproll, Davis Riedel
 */
class LogOutputProviderImpl(
  private val jsonSerializer: Json,
  private val useConsoleLogging: Boolean,
  private val useFileLogging: Boolean,
  private val fileLoggingDirectoryPath: String,
  private val useDatabaseLogging: Boolean,
  private val dbServer: String,
  private val dbPort: String,
  private val dbName: String,
  private val dbUsername: String,
  private val dbPassword: String
) : LogOutputProvider {

  override val logOutputs: MutableSet<TraceEventLogOutput>
    get() {
      val logOutputs = HashSet<TraceEventLogOutput>()

      if (useConsoleLogging) {
        logOutputs.add(createConsoleLogger())
      }

      if (useFileLogging) {
        logOutputs.add(createFileLogger())
      }

      if (useDatabaseLogging) {
        logOutputs.add(createDatabaseLogger())
      }

      return logOutputs
    }

  private fun createConsoleLogger(): TraceEventLogOutput {
    return TraceEventConsoleLogger(jsonSerializer)
  }

  private fun createFileLogger(): TraceEventLogOutput {
    return TraceEventFileLogger(
      jsonSerializer,
      fileLoggingDirectoryPath
    )
  }

  private fun createDatabaseLogger(): TraceEventLogOutput {
    return TraceEventPostgresDbLogger(
      dbServer,
      dbPort,
      dbName,
      dbUsername,
      dbPassword
    )
  }
}