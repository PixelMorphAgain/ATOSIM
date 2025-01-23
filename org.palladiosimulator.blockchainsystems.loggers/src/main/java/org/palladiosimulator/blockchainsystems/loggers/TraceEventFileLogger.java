package org.palladiosimulator.blockchainsystems.loggers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.UUID;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLogOrigin;
import org.palladiosimulator.blockchainsystems.core.tracing.TraceEventLogOutput;

public class TraceEventFileLogger implements TraceEventLogOutput {

	private final StringBuilder _eventFormatBuilder;
	private final String _filePath;
	private BufferedWriter _outFileWriter;
	
	public TraceEventFileLogger(String filePath) {
		_eventFormatBuilder = new StringBuilder();
		_filePath = filePath;
	}
	
	@Override
	public void onTraceEventOccured(TraceEvent traceEvent, TraceEventLogOrigin logOrigin) {
		_eventFormatBuilder.setLength(0);
		_eventFormatBuilder.append("[");
		_eventFormatBuilder.append(formatMilliseconds(traceEvent.getOccurenceTime()));
		_eventFormatBuilder.append("]");
		_eventFormatBuilder.append(logOrigin.getName());
		_eventFormatBuilder.append("|");
		_eventFormatBuilder.append(traceEvent.getEventType());
		_eventFormatBuilder.append(": ");
		
		traceEvent.formatDetails(_eventFormatBuilder);
		_eventFormatBuilder.append(System.lineSeparator());
		
		try {
			_outFileWriter.write(_eventFormatBuilder.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void flush() {
		try {
			_outFileWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void close() {
		try {
			_outFileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String formatMilliseconds(long milliseconds) {
        // Calculate the components of the time span
        long hours = milliseconds / 3600000;
        long remainingAfterHours = milliseconds % 3600000;
        
        long minutes = remainingAfterHours / 60000;
        long remainingAfterMinutes = remainingAfterHours % 60000;
        
        long seconds = remainingAfterMinutes / 1000;
        long remainingMilliseconds = remainingAfterMinutes % 1000;
        
        // Format the components into a string
        return String.format("%02d:%02d:%02d.%03d", hours, minutes, seconds, remainingMilliseconds);
    }

	@Override
	public void initialize() {
		Path p = Path.of(_filePath, UUID.randomUUID().toString() + ".txt");
		
		try {
			_outFileWriter = new BufferedWriter(new FileWriter(p.toString()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void cleanUp() {
		flush();
		close();
	}
}
