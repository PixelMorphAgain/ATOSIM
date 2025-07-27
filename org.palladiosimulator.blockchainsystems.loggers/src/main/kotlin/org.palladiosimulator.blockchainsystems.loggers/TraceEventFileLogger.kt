package org.palladiosimulator.blockchainsystems.loggers

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLogOrigin
import org.palladiosimulator.blockchainsystems.loggers.abstractions.AbstractJsonLogger
import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException
import java.nio.file.Path
import java.util.*

/**
 * A logger that writes trace events to a file in JSON Lines format.
 *
 * @param filePath The path where the log file will be created.
 *
 * @author Davis Riedel
 */
class TraceEventFileLogger(private val filePath: String) : AbstractJsonLogger() {
  private var outFileWriter: BufferedWriter? = null

  override fun onTraceEventOccurred(traceEvent: TraceEvent, logOrigin: TraceEventLogOrigin) {
    try {
      outFileWriter?.write(getEventFormat(traceEvent, logOrigin) + "\n")
    } catch (e: IOException) {
      e.printStackTrace()
    }
  }

  fun flush() {
    try {
      outFileWriter?.flush()
    } catch (e: IOException) {
      e.printStackTrace()
    }
  }

  private fun close() {
    try {
      outFileWriter?.close()
    } catch (e: IOException) {
      e.printStackTrace()
    }
  }

  override fun initialize() {
    val p = Path.of(filePath, UUID.randomUUID().toString() + ".jsonl")
    try {
      outFileWriter = BufferedWriter(FileWriter(p.toString()))
    } catch (e: IOException) {
      e.printStackTrace()
    }
  }

  override fun cleanUp() {
    flush()
    close()
  }
}