package org.palladiosimulator.blockchainsystems.plugin.tabs;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;

public class BlockchainSystemSimulatorTabGroup extends AbstractLaunchConfigurationTabGroup {

    @Override
    public void createTabs(ILaunchConfigurationDialog arg0, String arg1) {
        setTabs(
                new AbstractLaunchConfigurationTab[] {
                        new ArchitecturalModelsTab(),
                        new SimulationTypeTab(),
                        new SimulationTerminationTab(),
                        new LoggingTab(),
                        new CommonTab()
                });
    }

}
