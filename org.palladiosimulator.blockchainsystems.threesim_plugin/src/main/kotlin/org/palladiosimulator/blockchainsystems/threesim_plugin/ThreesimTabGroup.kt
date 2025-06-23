package org.palladiosimulator.blockchainsystems.threesim_plugin

import org.eclipse.debug.ui.AbstractLaunchConfigurationTab
import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup
import org.eclipse.debug.ui.CommonTab
import org.eclipse.debug.ui.ILaunchConfigurationDialog
import org.palladiosimulator.blockchainsystems.plugin.tabs.*

class ThreesimTabGroup : AbstractLaunchConfigurationTabGroup() {
  public override fun createTabs(arg0: ILaunchConfigurationDialog?, arg1: String?) {
    setTabs(
      ArchitecturalModelsTab(),
      SimulationTypeTab(),
      SimulationTerminationTab(),
      LoggingTab(),
      CommonTab()
    )
  }
}