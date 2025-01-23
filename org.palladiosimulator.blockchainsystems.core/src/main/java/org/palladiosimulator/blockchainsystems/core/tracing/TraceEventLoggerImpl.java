package org.palladiosimulator.blockchainsystems.core.tracing;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.BiConsumer;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLogOrigin;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLogger;

public class TraceEventLoggerImpl implements TraceEventLogger {

	private static final Comparator<TraceEvent> EVENT_COMPARATOR = ((TraceEvent tev1, TraceEvent tev2) -> Long.compare(tev1.getOccurenceTime(), tev2.getOccurenceTime()));
	
	private final TraceEventLogOrigin _logOrigin;
	private final TreeSet<TraceEvent> _events;
	private final TraceEventConfiguration _traceEventConfiguration;
	
	private BiConsumer<TraceEvent, TraceEventLogOrigin> _traceEventCallback;
	
	public TraceEventLoggerImpl(TraceEventLogOrigin logOrigin, TraceEventConfiguration traceEventConfiguration) {
		_logOrigin = logOrigin;
		_traceEventConfiguration = traceEventConfiguration;
		
		_events = new TreeSet<TraceEvent>(EVENT_COMPARATOR);
		_traceEventCallback = null;
	}
	
	@Override
	public TraceEventLogOrigin getLogOrigin() {
		return _logOrigin;
	}

	@Override
	public void logEvent(TraceEvent traceEvent) {
		_events.add(traceEvent);
		
		notifyTraceEventOccured(traceEvent);
	}
	
	private void notifyTraceEventOccured(TraceEvent traceEvent) {
		if (_traceEventCallback != null) {
			_traceEventCallback.accept(traceEvent, _logOrigin);
		}
	}
	
	public void setTraceEventCalback(BiConsumer<TraceEvent, TraceEventLogOrigin> traceEventCallback) {
		_traceEventCallback = traceEventCallback;
	}

	@Override
	public boolean isEventTypeEnabled(String eventType) {
		return _traceEventConfiguration.isEventTypeEnabled(eventType);
	}
}
