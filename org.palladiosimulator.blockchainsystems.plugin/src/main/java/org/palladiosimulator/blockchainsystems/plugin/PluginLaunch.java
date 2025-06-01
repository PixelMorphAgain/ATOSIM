package org.palladiosimulator.blockchainsystems.plugin;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.palladiosimulator.blockchainsystems.plugin.common.Attributes;
import org.palladiosimulator.blockchainsystems.plugin.common.SelectedSimulationType;
import org.palladiosimulator.blockchainsystems.plugin.jobs.SimulationJob;
import org.palladiosimulator.blockchainsystems.plugin.jobs.singlesimulation.SingleSimulationJob;

public class PluginLaunch extends LaunchConfigurationDelegate {

    @Override
    public void launch(ILaunchConfiguration configuration, String arg1, ILaunch arg2, IProgressMonitor progressMonitor)
            throws CoreException {

        SelectedSimulationType simulationType = getSelectedSimulationTypeFromConfig(configuration);

        // TODO: Create trilemma simulation
        if (simulationType == SelectedSimulationType.Single) {
//            SingleSimulationJob job = new SingleSimulationJob(configuration);
//            job.schedule();
        } else if (simulationType == SelectedSimulationType.MonteCarlo) {
//            SimulationJob job = new SimulationJob(configuration);
//            job.schedule();
        }
    }

    // SimulationConfig Util
    public static SelectedSimulationType getSelectedSimulationTypeFromConfig(
            ILaunchConfiguration configuration
    ) throws CoreException {
        return Enum.valueOf(
                SelectedSimulationType.class,
                configuration.getAttribute(
                        Attributes.SimulationType.SIMULATION_TYPE_ATTRIBUTE,
                        Attributes.SimulationType.SIMULATION_TYPE_ATTRIBUTE_DEFAULT
                )
        );
    }
}
