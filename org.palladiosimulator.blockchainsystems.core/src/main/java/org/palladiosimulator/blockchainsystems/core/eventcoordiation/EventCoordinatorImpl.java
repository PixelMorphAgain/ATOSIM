package org.palladiosimulator.blockchainsystems.core.eventcoordiation;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.EventCoordinator;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.EventDispatchable;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.SystemClockControl;

public class EventCoordinatorImpl implements EventCoordinator {

    private static final Comparator<Event> EVENT_TIME_COMPARATOR = ((Event e1, Event e2) -> Long.compare(e1.getOccurrenceTime(), e2.getOccurrenceTime()));

    private SystemClockControl _clock;
    private final TreeMap<Long, EffectsTimeSlice> _eventTimeSlices;
    private final HashMap<EventDispatchable, TreeSet<Event>> _eventsPerOrigin;
    private final TerminationCondition _terminationCondition;


    public EventCoordinatorImpl(SystemClockControl clock, TerminationCondition terminationCondition) {
        _clock = clock;
        _terminationCondition = terminationCondition;

        _eventTimeSlices = new TreeMap<Long, EffectsTimeSlice>();
        _eventsPerOrigin = new HashMap<EventDispatchable, TreeSet<Event>>();
    }

    public void processEvents() {
        while (hasUnprocessedEvents() && !_terminationCondition.shouldTerminate()) {
            processCurrentSlice();
            purgeProcessedSlices();
            advanceCurrentTime();
        }
    }

    private boolean hasUnprocessedEvents() {
        return !_eventTimeSlices.isEmpty();
    }

    private void purgeProcessedSlices() {
        if (_eventTimeSlices.isEmpty()) return;

        Long firstTimestamp = _eventTimeSlices.firstKey();

        while (firstTimestamp != null && firstTimestamp <= _clock.getCurrentTime()) {
            removeEventsAt(firstTimestamp);

            if (_eventTimeSlices.isEmpty()) break;

            firstTimestamp = _eventTimeSlices.firstKey();
        }
    }

    private void removeEventsAt(long timestamp) {
        EffectsTimeSlice eventTimeSlice = _eventTimeSlices.getOrDefault(timestamp, null);
        if (eventTimeSlice != null) {

            for (Event event : eventTimeSlice.getEvents()) {
                TreeSet<Event> events = _eventsPerOrigin.getOrDefault(event.getOrigin(), null);
                if (events != null) {
                    events.remove(event);
                }
            }

            _eventTimeSlices.remove(_clock.getCurrentTime());
        }
    }

    private void processCurrentSlice() {
        long eventOccurrenceTime = _clock.getCurrentTime();
        EffectsTimeSlice currentSlice = _eventTimeSlices.get(eventOccurrenceTime);

        if (currentSlice == null) return;

        for (Event event : currentSlice.getEvents()) {
            dispatchEvent(event);
        }
    }

    private void advanceCurrentTime() {
        if (_eventTimeSlices.isEmpty()) return;

        long nextEventTime = _eventTimeSlices.firstKey();
        _clock.progressClockTo(nextEventTime);
    }

    @Override
    public void raiseEvent(Event event) {
        if (event.getOccurrenceTime() > _clock.getCurrentTime()) {
            scheduleEvent(event);
        } else if (event.getOccurrenceTime() == _clock.getCurrentTime()) {
            dispatchEvent(event);
        }
    }

    private void scheduleEvent(Event event) {
        long eventOccurrenceTime = event.getOccurrenceTime();
        EffectsTimeSlice timeSlice = _eventTimeSlices.computeIfAbsent(eventOccurrenceTime, EffectsTimeSlice::new);

        timeSlice.addEvent(event);

        TreeSet<Event> events = _eventsPerOrigin.getOrDefault(event.getOrigin(), null);
        if (events == null) {
            events = new TreeSet<Event>(EVENT_TIME_COMPARATOR);
            _eventsPerOrigin.put(event.getOrigin(), events);
        }

        events.add(event);
    }

    @Override
    public void cancelEventsFor(EventDispatchable eventOrigin) {
        TreeSet<Event> events = _eventsPerOrigin.getOrDefault(eventOrigin, null);

        if (events != null && !events.isEmpty()) {
            for (Event event : events) {
                // Can only cancel events in the future
                // Prevents concurrent access exception if events from the current time slice are cancelled
                if (event.getOccurrenceTime() <= _clock.getCurrentTime()) {
                    continue;
                }

                EffectsTimeSlice timeSlice = _eventTimeSlices.get(event.getOccurrenceTime());
                timeSlice.removeEvent(event);
            }
            events.clear();
        }
    }

    private void dispatchEvent(Event event) {
        event
                .getOrigin()
                .dispatchEvent(event);
    }
}
