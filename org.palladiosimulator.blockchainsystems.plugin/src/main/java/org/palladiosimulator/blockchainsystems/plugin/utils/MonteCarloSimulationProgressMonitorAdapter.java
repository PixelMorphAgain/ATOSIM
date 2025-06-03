package org.palladiosimulator.blockchainsystems.plugin.jobs.montecarlosimulation;

import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.MonteCarloSimulationProgressMonitor;

public class MonteCarloSimulationProgressMonitorAdapter implements MonteCarloSimulationProgressMonitor {

    private final IProgressMonitor _progressMonitor;

    public MonteCarloSimulationProgressMonitorAdapter(IProgressMonitor progressMonitor) {
        _progressMonitor = progressMonitor;
    }

    @Override
    public void onSimulationStarted(long numberOfSimulationRounds) {
        _progressMonitor.beginTask("Running Monte-Carlo Simulation", (int) numberOfSimulationRounds);
    }

    @Override
    public synchronized void onSimulationRoundFinished() {
        _progressMonitor.worked(1);
    }

    @Override
    public void onSimulationFinished() {
        _progressMonitor.done();
    }

}
