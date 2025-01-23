package org.palladiosimulator.blockchainsystems.plugin.jobs.montecarlosimulation;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.palladiosimulator.blockchainsystems.doublespending.simulation.MonteCarloDoubleSpendingAttackSimulation;
import org.palladiosimulator.blockchainsystems.doublespending.simulation.MonteCarloDoubleSpendingAttackSimulationResult;
import org.palladiosimulator.blockchainsystems.plugin.jobs.common.InitializationUtils;
import org.palladiosimulator.blockchainsystems.plugin.jobs.common.SimulationRoundInterpretationImpl;
import org.palladiosimulator.blockchainsystems.plugin.jobs.common.SummaryUtils;
import org.palladiosimulator.blockchainsystems.plugin.results.SimulationResultSummary;

public class MonteCarloSimulationJob extends Job {

	private final ILaunchConfiguration _configuration;
	
	public MonteCarloSimulationJob(ILaunchConfiguration configuration) {
		super("Monte-Carlo Simulation Job");
		_configuration = configuration;
	}

	@Override
	protected IStatus run(IProgressMonitor progressMonitor) {
		
		MonteCarloDoubleSpendingAttackSimulation simulation;
		try {
			simulation = new MonteCarloDoubleSpendingAttackSimulation(
					InitializationUtils.createBlockchainSystemFactory(_configuration),
					InitializationUtils.createLogOuputProviderFromConfig(_configuration),
					new SimulationRoundInterpretationImpl(),
					new MonteCarloSimulationProgressMonitorAdapter(progressMonitor),
					InitializationUtils.getMaximumAllowdBlockchainLengthFromConfig(_configuration),
					InitializationUtils.getNumberOfMonteCarloSimulationRoundsFromConfig(_configuration));
		} catch (NumberFormatException | CoreException e) {
			e.printStackTrace();
			return Status.OK_STATUS;
		}
		
		MonteCarloDoubleSpendingAttackSimulationResult result = simulation.run();
		
		SimulationResultSummary summary = new SimulationResultSummary(
				"Monte-Carlo Simulation",
				result.attackerWonRounds(),
				result.systemWonRounds(),
				result.unambiguousRounds(),
				result.getAttackSuccessProbability());
		
		try {
			SummaryUtils.saveResultSummary(summary, _configuration);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		return Status.OK_STATUS;
	}

}
