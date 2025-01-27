package org.palladiosimulator.blockchainsystems.core.tracing;

import java.util.HashMap;
import java.util.HashSet;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLogOrigin;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLogger;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLoggerContainer;

public class TraceEventLoggerContainerImpl implements TraceEventLoggerContainer {

    private final HashMap<String, TraceEventLogger> _loggers;

    private final TraceEventConfiguration _traceEventConfiguration;

    private final HashSet<TraceEventSubscriber> _eventSubscribers;

    public TraceEventLoggerContainerImpl(TraceEventConfiguration traceEventConfiguration) {
        _loggers = new HashMap<String, TraceEventLogger>();
        _traceEventConfiguration = traceEventConfiguration;
        _eventSubscribers = new HashSet<TraceEventSubscriber>();
    }

    public TraceEventLoggerContainerImpl() {
        _loggers = new HashMap<String, TraceEventLogger>();
        _traceEventConfiguration = new AllTraceEventsEnabledTraceEventConfiguration();
        _eventSubscribers = new HashSet<TraceEventSubscriber>();
    }

    public void addSubscriber(TraceEventSubscriber subscriber) {
        _eventSubscribers.add(subscriber);
    }

    public void removeSubscriber(TraceEventSubscriber subscriber) {
        _eventSubscribers.remove(subscriber);
    }

    private void notifySubscribers(TraceEvent traceEvent, TraceEventLogOrigin logOrigin) {
        for (TraceEventSubscriber subscriber : _eventSubscribers) {
            subscriber.onTraceEventOccurred(traceEvent, logOrigin);
        }
    }

    @Override
    public void createTraceEventLogger(TraceEventLogOrigin logOrigin) {
        if (_loggers.containsKey(logOrigin.getId())) {
            return;
        }

        TraceEventLoggerImpl loggerImpl = new TraceEventLoggerImpl(logOrigin, _traceEventConfiguration);
        loggerImpl.setTraceEventCalback(this::notifySubscribers);
        _loggers.put(logOrigin.getId(), loggerImpl);

    }

    @Override
    public TraceEventLogger getLogger(TraceEventLogOrigin logOrigin) {
        return _loggers.get(logOrigin.getId());
    }
}
