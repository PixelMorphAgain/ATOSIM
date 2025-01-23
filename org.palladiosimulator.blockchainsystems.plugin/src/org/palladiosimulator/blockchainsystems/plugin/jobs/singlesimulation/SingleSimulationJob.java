package org.palladiosimulator.blockchainsystems.plugin.jobs.singlesimulation;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.palladiosimulator.blockchainsystems.doublespending.simulation.InterpretedResult;
import org.palladiosimulator.blockchainsystems.doublespending.simulation.SingleDoubleSpendingAttackSimulation;
import org.palladiosimulator.blockchainsystems.plugin.jobs.common.InitializationUtils;
import org.palladiosimulator.blockchainsystems.plugin.jobs.common.SimulationRoundInterpretationImpl;
import org.palladiosimulator.blockchainsystems.plugin.jobs.common.SummaryUtils;
import org.palladiosimulator.blockchainsystems.plugin.results.SimulationResultSummary;

public class SingleSimulationJob extends Job {

private final ILaunchConfiguration _configuration;
	
	public SingleSimulationJob(ILaunchConfiguration configuration) {
		super("Single Simulation Job");
		_configuration = configuration;
	}

	@Override
	protected IStatus run(IProgressMonitor arg0) {
		SingleDoubleSpendingAttackSimulation simulation;
		try {
			simulation = new SingleDoubleSpendingAttackSimulation(
					InitializationUtils.createBlockchainSystemFactory(_configuration),
					InitializationUtils.createLogOuputProviderFromConfig(_configuration),
					new SimulationRoundInterpretationImpl(),
					InitializationUtils.getMaximumAllowdBlockchainLengthFromConfig(_configuration));
		} catch (NumberFormatException | CoreException e) {
			e.printStackTrace();
			return Status.OK_STATUS;
		}
		
		InterpretedResult result = simulation.run();
		
		SimulationResultSummary summary = new SimulationResultSummary(
				"Single Simulation",
				(long) (result == InterpretedResult.AttackerWon ? 1 : 0),
				(long) (result == InterpretedResult.SystemWon ? 1 : 0),
				(long) (result == InterpretedResult.Unambiguous ? 1 : 0),
				null);
		
		try {
			SummaryUtils.saveResultSummary(summary, _configuration);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		return Status.OK_STATUS;
	}

}
