package org.palladiosimulator.blockchainsystems.core.common;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.EventDispatchable;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.SimulationContext;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Traceable;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLogOrigin;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLogger;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEventLoggerContainer;

/**
 * The {@code BlockchainSimulationObject} is a base class for all classes that represent parts
 * of a blockchain system and that are log origins.
 * It provides the necessary fields to hold trace event logger and simulation context
 * and implements their initialization.
 * It can also be used as a log origin.
 *
 * @author Yannik Sproll
 * @implNote Do not call the initializeLogger method on child classes of this class. The class sets up the correct trace event logger by itself when calling initialize.
 */
public abstract class BlockchainSimulationObject implements EventDispatchable, Traceable, TraceEventLogOrigin {

    private final String _id;

    private final String _name;

    private SimulationContext _simulationContext;

    private TraceEventLogger _traceEventLogger;

    protected BlockchainSimulationObject(String id, String name) {
        _id = id;
        _name = name;
    }

    public String getId() {
        return _id;
    }

    public String getName() {
        return _name;
    }

    protected void onInitialize() {
    }

    public final void initialize(SimulationContext simulationContext) {
        _simulationContext = simulationContext;
        initializeLogger(this);
        onInitialize();
    }

    protected void onCleanup() {
    }

    public final void cleanup() {
        onCleanup();
        _traceEventLogger = null;
        _simulationContext = null;
    }

    public final void initializeLogger(TraceEventLogOrigin logOrigin) {
        TraceEventLoggerContainer loggerContainer = _simulationContext.getTraceEventLoggerContainer();
        loggerContainer.createTraceEventLogger(logOrigin);
        _traceEventLogger = loggerContainer.getLogger(logOrigin);
    }

    protected SimulationContext getSimulationContext() {
        return _simulationContext;
    }

    protected TraceEventLogger getTraceEventLogger() {
        return _traceEventLogger;
    }
}
