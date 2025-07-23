package org.palladiosimulator.blockchainsystems.threesim_plugin

import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab
import org.eclipse.jface.layout.GridLayoutFactory
import org.eclipse.swt.SWT
import org.eclipse.swt.events.*
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Group
import org.eclipse.swt.widgets.Text
import org.palladiosimulator.blockchainsystems.plugin.common.Attributes
import org.palladiosimulator.blockchainsystems.plugin.utils.DoubleVerifier
import org.palladiosimulator.blockchainsystems.plugin.utils.LongVerifier

/**
 * Tab for configuring Threesim-specific simulation parameters.
 *
 * @author Davis Riedel
 */
class ThreesimTab : AbstractLaunchConfigurationTab() {
  companion object {
    private const val MINIMUM_NUMBER_OF_REQUIRED_SECURITY_CONFIRMATIONS = 1L
    private const val MINIMUM_RELIABILITY_OBSERVATION_TIMESPAN = 1L
  }

  private var numberOfRequiredSecurityConfirmationsText: Text? = null
  private var shannonEntropyKText: Text? = null
  private var nakamotoCoefficientThresholdText: Text? = null
  private var reliabilityObservationTimespanText: Text? = null

  override fun createControl(parent: Composite) {
    val root = Composite(parent, SWT.BORDER)
    setControl(root)

    GridLayoutFactory
      .swtDefaults()
      .numColumns(1)
      .applyTo(root)

    createSimulationTypeGroup(root)
  }

  private fun createSimulationTypeGroup(parent: Composite) {
    val group = Group(parent, SWT.NONE)
    group.setText("3SIM Simulation Parameters")
    GridLayoutFactory.swtDefaults().numColumns(1).spacing(0, 10).applyTo(group)
    group.setLayoutData(GridData(SWT.FILL, SWT.BEGINNING, true, false))

    numberOfRequiredSecurityConfirmationsText = Text(group, SWT.BORDER)
    numberOfRequiredSecurityConfirmationsText?.setLayoutData(GridData(SWT.FILL, SWT.CENTER, true, false))
    numberOfRequiredSecurityConfirmationsText?.addVerifyListener(LongVerifier)
    numberOfRequiredSecurityConfirmationsText?.addModifyListener { updateLaunchConfigurationDialog() }

    shannonEntropyKText = Text(group, SWT.BORDER)
    shannonEntropyKText?.setLayoutData(GridData(SWT.FILL, SWT.CENTER, true, false))
    shannonEntropyKText?.addVerifyListener(DoubleVerifier)
    shannonEntropyKText?.addModifyListener { updateLaunchConfigurationDialog() }

    nakamotoCoefficientThresholdText = Text(group, SWT.BORDER)
    nakamotoCoefficientThresholdText?.setLayoutData(GridData(SWT.FILL, SWT.CENTER, true, false))
    nakamotoCoefficientThresholdText?.addVerifyListener(DoubleVerifier)
    nakamotoCoefficientThresholdText?.addModifyListener { updateLaunchConfigurationDialog() }

    reliabilityObservationTimespanText = Text(group, SWT.BORDER)
    reliabilityObservationTimespanText?.setLayoutData(GridData(SWT.FILL, SWT.CENTER, true, false))
    reliabilityObservationTimespanText?.addVerifyListener(LongVerifier)
    reliabilityObservationTimespanText?.addModifyListener { updateLaunchConfigurationDialog() }
  }

  private fun isNumberOfRequiredSecurityConfirmationsValid(): Boolean {
    val nr = numberOfRequiredSecurityConfirmationsText?.text?.toLongOrNull() ?: return false
    return nr > MINIMUM_NUMBER_OF_REQUIRED_SECURITY_CONFIRMATIONS
  }

  private fun isShannonEntropyKValid(): Boolean {
    val k = shannonEntropyKText?.text?.toDoubleOrNull() ?: return false
    return k > 0.0
  }

  private fun isNakamotoCoefficientThresholdValid(): Boolean {
    val threshold = nakamotoCoefficientThresholdText?.text?.toDoubleOrNull() ?: return false
    return threshold in 0.0..1.0
  }

  private fun isReliabilityObservationTimespanValid(): Boolean {
    val timespan = reliabilityObservationTimespanText?.text?.toLongOrNull() ?: return false
    return timespan > MINIMUM_RELIABILITY_OBSERVATION_TIMESPAN
  }

  override fun getName(): String {
    return "3SIM Simulation Parameters"
  }

  override fun initializeFrom(configuration: ILaunchConfiguration) {
    try {
      numberOfRequiredSecurityConfirmationsText?.text =
        configuration.getAttribute(
          Attributes.Threesim.NUMBER_OF_REQUIRED_SECURITY_CONFIRMATIONS,
          Attributes.Threesim.NUMBER_OF_REQUIRED_SECURITY_CONFIRMATIONS_DEFAULT
        )
    } catch (_: Exception) {
      numberOfRequiredSecurityConfirmationsText?.text =
        Attributes.Threesim.NUMBER_OF_REQUIRED_SECURITY_CONFIRMATIONS_DEFAULT
    }

    try {
      shannonEntropyKText?.text =
        configuration.getAttribute(
          Attributes.Threesim.SHANNON_ENTROPY_K,
          Attributes.Threesim.SHANNON_ENTROPY_K_DEFAULT
        )
    } catch (_: Exception) {
      shannonEntropyKText?.text = Attributes.Threesim.SHANNON_ENTROPY_K_DEFAULT
    }

    try {
      nakamotoCoefficientThresholdText?.text =
        configuration.getAttribute(
          Attributes.Threesim.NAKAMOTO_COEFFICIENT_THRESHOLD,
          Attributes.Threesim.NAKAMOTO_COEFFICIENT_THRESHOLD_DEFAULT
        )
    } catch (_: Exception) {
      nakamotoCoefficientThresholdText?.text = Attributes.Threesim.NAKAMOTO_COEFFICIENT_THRESHOLD_DEFAULT
    }

    try {
      reliabilityObservationTimespanText?.text =
        configuration.getAttribute(
          Attributes.Threesim.RELIABILITY_OBSERVATION_TIMESPAN,
          Attributes.Threesim.RELIABILITY_OBSERVATION_TIMESPAN_DEFAULT
        )
    } catch (_: Exception) {
      reliabilityObservationTimespanText?.text = Attributes.Threesim.RELIABILITY_OBSERVATION_TIMESPAN_DEFAULT
    }
  }

  override fun performApply(configuration: ILaunchConfigurationWorkingCopy) {
    configuration.setAttribute(
      Attributes.Threesim.NUMBER_OF_REQUIRED_SECURITY_CONFIRMATIONS,
      numberOfRequiredSecurityConfirmationsText?.text
        ?: Attributes.Threesim.NUMBER_OF_REQUIRED_SECURITY_CONFIRMATIONS_DEFAULT
    )
    configuration.setAttribute(
      Attributes.Threesim.SHANNON_ENTROPY_K,
      shannonEntropyKText?.text ?: Attributes.Threesim.SHANNON_ENTROPY_K_DEFAULT
    )
    configuration.setAttribute(
      Attributes.Threesim.NAKAMOTO_COEFFICIENT_THRESHOLD,
      nakamotoCoefficientThresholdText?.text ?: Attributes.Threesim.NAKAMOTO_COEFFICIENT_THRESHOLD_DEFAULT
    )
    configuration.setAttribute(
      Attributes.Threesim.RELIABILITY_OBSERVATION_TIMESPAN,
      reliabilityObservationTimespanText?.text ?: Attributes.Threesim.RELIABILITY_OBSERVATION_TIMESPAN_DEFAULT
    )
  }

  override fun setDefaults(configuration: ILaunchConfigurationWorkingCopy) {
    configuration.setAttribute(
      Attributes.Threesim.NUMBER_OF_REQUIRED_SECURITY_CONFIRMATIONS,
      Attributes.Threesim.NUMBER_OF_REQUIRED_SECURITY_CONFIRMATIONS_DEFAULT
    )
    configuration.setAttribute(
      Attributes.Threesim.SHANNON_ENTROPY_K,
      Attributes.Threesim.SHANNON_ENTROPY_K_DEFAULT
    )
    configuration.setAttribute(
      Attributes.Threesim.NAKAMOTO_COEFFICIENT_THRESHOLD,
      Attributes.Threesim.NAKAMOTO_COEFFICIENT_THRESHOLD_DEFAULT
    )
    configuration.setAttribute(
      Attributes.Threesim.RELIABILITY_OBSERVATION_TIMESPAN,
      Attributes.Threesim.RELIABILITY_OBSERVATION_TIMESPAN_DEFAULT
    )
  }

  override fun activated(workingCopy: ILaunchConfigurationWorkingCopy?) {
    super.activated(workingCopy)
    updateLaunchConfigurationDialog()
  }

  override fun isValid(launchConfig: ILaunchConfiguration?): Boolean {
    return isNumberOfRequiredSecurityConfirmationsValid() && isShannonEntropyKValid() && isNakamotoCoefficientThresholdValid() && isReliabilityObservationTimespanValid()
  }
}