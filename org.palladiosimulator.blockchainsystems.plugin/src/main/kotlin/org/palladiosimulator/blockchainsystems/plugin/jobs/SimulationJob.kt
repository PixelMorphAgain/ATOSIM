package org.palladiosimulator.blockchainsystems.plugin.jobs

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.debug.core.ILaunchConfiguration
import org.palladiosimulator.blockchainsystems.plugin.creation.SimulationFactory

/**
 * Job that executes a simulation based on the provided launch configuration.
 *
 * @property configuration The launch configuration containing the parameters for the simulation.
 * @property simulationFactory The factory used to create the simulation instance.
 *
 * @author Davis Riedel
 */
class SimulationJob(
  private val configuration: ILaunchConfiguration,
  private val simulationFactory: SimulationFactory,
  val jobName: String
) : Job(jobName) {
  override fun run(progressMonitor: IProgressMonitor): IStatus {
    val simulation = simulationFactory.create(configuration, progressMonitor);

    val result = simulation.run();

    try {
      SummaryUtils.saveResultSummary(result.getSummary(), configuration);
    } catch (e: CoreException) {
      e.printStackTrace();
    }

    return Status.OK_STATUS
  }
}

// TODO: SM-SIM Version below
// TODO: Monte Carlo
//package org.palladiosimulator.blockchainsystems.plugin.jobs.montecarlosimulation;
//
//import org.eclipse.core.runtime.CoreException;
//import org.eclipse.core.runtime.IProgressMonitor;
//import org.eclipse.core.runtime.IStatus;
//import org.eclipse.core.runtime.Status;
//import org.eclipse.core.runtime.jobs.Job;
//import org.eclipse.debug.core.ILaunchConfiguration;
//import org.palladiosimulator.blockchainsystems.doublespending.simulation.MonteCarloDoubleSpendingAttackSimulation;
//import org.palladiosimulator.blockchainsystems.doublespending.simulation.MonteCarloDoubleSpendingAttackSimulationResult;
//import org.palladiosimulator.blockchainsystems.plugin.jobs.InitializationUtils;
//import org.palladiosimulator.blockchainsystems.doublespending.simulation.SimulationRoundInterpretationImpl;
//import org.palladiosimulator.blockchainsystems.plugin.jobs.SummaryUtils;
//import org.palladiosimulator.blockchainsystems.doublespending.simulation.SimulationResultSummary;
//
//public class MonteCarloSimulationJob extends Job {
//
//  private final ILaunchConfiguration _configuration;
//
//  public MonteCarloSimulationJob(ILaunchConfiguration configuration) {
//    super("Monte-Carlo Simulation Job");
//    _configuration = configuration;
//  }
//
//  @Override
//  protected IStatus run(IProgressMonitor progressMonitor) {
//
//    MonteCarloDoubleSpendingAttackSimulation simulation;
//    try {
//      simulation = new MonteCarloDoubleSpendingAttackSimulation(
//        InitializationUtils.createBlockchainSystemFactory(_configuration),
//      InitializationUtils.createLogOutputProviderFromConfig(_configuration),
//      new SimulationRoundInterpretationImpl(),
//      new MonteCarloSimulationProgressMonitorAdapter(progressMonitor),
//      InitializationUtils.getMaximumAllowedBlockchainLengthFromConfig(_configuration),
//      InitializationUtils.getNumberOfMonteCarloSimulationRoundsFromConfig(_configuration)
//      );
//    } catch (NumberFormatException | CoreException e) {
//    e.printStackTrace();
//    return Status.OK_STATUS;
//  }
//
//    MonteCarloDoubleSpendingAttackSimulationResult result = simulation.run();
//
//    SimulationResultSummary summary = new SimulationResultSummary(
//      "Monte-Carlo Simulation",
//      result.attackerWonRounds(),
//      result.systemWonRounds(),
//      result.unambiguousRounds(),
//      result.getAttackSuccessProbability()
//    );
//
//    try {
//      SummaryUtils.saveResultSummary(summary, _configuration);
//    } catch (CoreException e) {
//      e.printStackTrace();
//    }
//
//    return Status.OK_STATUS;
//  }
//
//}

// TODO: single
//package org.palladiosimulator.blockchainsystems.plugin.jobs.singlesimulation;
//
//import org.eclipse.core.runtime.CoreException;
//import org.eclipse.core.runtime.IProgressMonitor;
//import org.eclipse.core.runtime.IStatus;
//import org.eclipse.core.runtime.Status;
//import org.eclipse.core.runtime.jobs.Job;
//import org.eclipse.debug.core.ILaunchConfiguration;
//import org.palladiosimulator.blockchainsystems.doublespending.simulation.InterpretedResult;
//import org.palladiosimulator.blockchainsystems.doublespending.simulation.SingleDoubleSpendingAttackSimulation;
//import org.palladiosimulator.blockchainsystems.plugin.jobs.InitializationUtils;
//import org.palladiosimulator.blockchainsystems.doublespending.simulation.SimulationRoundInterpretationImpl;
//import org.palladiosimulator.blockchainsystems.plugin.jobs.SummaryUtils;
//import org.palladiosimulator.blockchainsystems.doublespending.simulation.DoubleSpendingSimulationResultSummary;
//
//public class SingleSimulationJob extends Job {
//
//    private final ILaunchConfiguration _configuration;
//
//    public SingleSimulationJob(ILaunchConfiguration configuration) {
//        super("Single Simulation Job");
//        _configuration = configuration;
//    }
//
//    @Override
//    protected IStatus run(IProgressMonitor arg0) {
//        SingleDoubleSpendingAttackSimulation simulation;
//        try {
//            simulation = new SingleDoubleSpendingAttackSimulation(
//                    InitializationUtils.createBlockchainSystemFactory(_configuration),
//                    InitializationUtils.createLogOutputProviderFromConfig(_configuration),
//                    new SimulationRoundInterpretationImpl(),
//                    InitializationUtils.getMaximumAllowedBlockchainLengthFromConfig(_configuration));
//        } catch (NumberFormatException | CoreException e) {
//            e.printStackTrace();
//            return Status.OK_STATUS;
//        }
//
//        InterpretedResult result = simulation.run();
//
//        DoubleSpendingSimulationResultSummary summary = new DoubleSpendingSimulationResultSummary(
//                "Single Simulation",
//                (long) (result == InterpretedResult.AttackerWon ? 1 : 0),
//                (long) (result == InterpretedResult.SystemWon ? 1 : 0),
//                (long) (result == InterpretedResult.Unambiguous ? 1 : 0),
//                null);
//
//        try {
//            SummaryUtils.saveResultSummary(summary, _configuration);
//        } catch (CoreException e) {
//            e.printStackTrace();
//        }
//
//        return Status.OK_STATUS;
//    }
//
//}
