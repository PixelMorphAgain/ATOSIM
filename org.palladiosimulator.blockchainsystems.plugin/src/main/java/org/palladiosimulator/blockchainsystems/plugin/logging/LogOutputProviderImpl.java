package org.palladiosimulator.blockchainsystems.plugin.logging;

import java.util.HashSet;
import java.util.Set;

import org.palladiosimulator.blockchainsystems.core.simulation.logoutputs.abstractions.LogOutputProvider;
import org.palladiosimulator.blockchainsystems.core.tracing.TraceEventLogOutput;
import org.palladiosimulator.blockchainsystems.loggers.*;

/**
 * Implementation of the {@link LogOutputProvider} interface.
 * Supports console, file, and database logging.
 *
 * @author Yannik Sproll
 */
public class LogOutputProviderImpl implements LogOutputProvider {

    private final boolean _useConsoleLogging;

    private final boolean _useFileLogging;
    private final String _fileLoggingDirectoryPath;

    private final boolean _useDatabaseLogging;
    private final String _dbServer;
    private final String _dbName;
    private final int _dbPort;
    private final String _dbUsername;
    private final String _dbPassword;

    public LogOutputProviderImpl(
            boolean useConsoleLogging,
            boolean useFileLogging,
            String fileLoggingDirectoryPath,
            boolean useDatabaseLogging,
            String dbServer,
            int dbPort,
            String dbName,
            String dbUsername,
            String dbPassword
    ) {
        _useConsoleLogging = useConsoleLogging;
        _useFileLogging = useFileLogging;
        _fileLoggingDirectoryPath = fileLoggingDirectoryPath;
        _useDatabaseLogging = useDatabaseLogging;
        _dbServer = dbServer;
        _dbName = dbName;
        _dbPort = dbPort;
        _dbUsername = dbUsername;
        _dbPassword = dbPassword;
    }


    public Set<TraceEventLogOutput> getLogOutputs() {
        HashSet<TraceEventLogOutput> logOutputs = new HashSet<TraceEventLogOutput>();

        if (_useConsoleLogging) {
            logOutputs.add(createConsoleLogger());
        }

        if (_useFileLogging) {
            logOutputs.add(createFileLogger());
        }

        if (_useDatabaseLogging) {
            logOutputs.add(createDatabaseLogger());
        }

        return logOutputs;
    }

    private TraceEventLogOutput createConsoleLogger() {
        return new TraceEventConsoleLogger();
    }

    private TraceEventLogOutput createFileLogger() {
        return new TraceEventFileLogger(_fileLoggingDirectoryPath);
    }

    private TraceEventLogOutput createDatabaseLogger() {
        return new TraceEventPostgresDbLogger(
                _dbServer,
                _dbPort,
                _dbName,
                _dbUsername,
                _dbPassword
        );
    }
}
