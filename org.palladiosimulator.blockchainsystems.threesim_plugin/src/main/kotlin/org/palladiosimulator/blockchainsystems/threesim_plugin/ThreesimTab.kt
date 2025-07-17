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
import org.palladiosimulator.blockchainsystems.plugin.validation.ValidationUtils

/**
 * Tab for configuring Threesim-specific simulation parameters.
 *
 * @author Davis Riedel
 */
class ThreesimTab : AbstractLaunchConfigurationTab() {
  companion object {
    private const val MINIMUM_NUMBER_OF_REQUIRED_SECURITY_CONFIRMATIONS: Long = 1
  }

  private var numberOfRequiredSecurityConfirmationsText: Text? = null

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
    group.setText("Simulation Type")
    GridLayoutFactory.swtDefaults().numColumns(1).spacing(0, 10).applyTo(group)
    group.setLayoutData(GridData(SWT.FILL, SWT.BEGINNING, true, false))

    numberOfRequiredSecurityConfirmationsText = Text(group, SWT.BORDER)
    numberOfRequiredSecurityConfirmationsText?.setLayoutData(GridData(SWT.FILL, SWT.CENTER, true, false))
    numberOfRequiredSecurityConfirmationsText?.addVerifyListener(NumberVerifier)
    numberOfRequiredSecurityConfirmationsText?.addModifyListener {
      updateLaunchConfigurationDialog()
    }
  }

  private fun isNumberOfRequiredSecurityConfirmationsValid(): Boolean {
    val text = numberOfRequiredSecurityConfirmationsText?.getText() ?: return false

    return ValidationUtils.isStringPopulated(text)
      && ValidationUtils.isNumber(text)
      && ValidationUtils.isInRange(
      text.toLong(),
      MINIMUM_NUMBER_OF_REQUIRED_SECURITY_CONFIRMATIONS,
      Long.Companion.MAX_VALUE
    )
  }

  override fun getName(): String {
    return "Simulation Type"
  }

  override fun initializeFrom(configuration: ILaunchConfiguration) {
    try {
      numberOfRequiredSecurityConfirmationsText?.setText(
        configuration.getAttribute(
          Attributes.Threesim.NUMBER_OF_REQUIRED_SECURITY_CONFIRMATIONS,
          Attributes.Threesim.NUMBER_OF_REQUIRED_SECURITY_CONFIRMATIONS_DEFAULT
        )
      )
    } catch (_: Exception) {
      numberOfRequiredSecurityConfirmationsText?.setText(Attributes.Threesim.NUMBER_OF_REQUIRED_SECURITY_CONFIRMATIONS_DEFAULT)
    }
  }

  override fun performApply(configuration: ILaunchConfigurationWorkingCopy) {
    configuration.setAttribute(
      Attributes.Threesim.NUMBER_OF_REQUIRED_SECURITY_CONFIRMATIONS,
      numberOfRequiredSecurityConfirmationsText?.getText()
        ?: Attributes.Threesim.NUMBER_OF_REQUIRED_SECURITY_CONFIRMATIONS_DEFAULT
    )
  }

  override fun setDefaults(configuration: ILaunchConfigurationWorkingCopy) {
    configuration.setAttribute(
      Attributes.Threesim.NUMBER_OF_REQUIRED_SECURITY_CONFIRMATIONS,
      Attributes.Threesim.NUMBER_OF_REQUIRED_SECURITY_CONFIRMATIONS_DEFAULT
    )
  }

  override fun activated(workingCopy: ILaunchConfigurationWorkingCopy?) {
    super.activated(workingCopy)
    updateLaunchConfigurationDialog()
  }

  override fun isValid(launchConfig: ILaunchConfiguration?): Boolean {
    return this.isNumberOfRequiredSecurityConfirmationsValid()
  }

  object NumberVerifier : VerifyListener {
    override fun verifyText(e: VerifyEvent) {
      val oldText = (e.widget as Text).getText()
      val newText = oldText.substring(0, e.start) + e.text + oldText.substring(e.end)

      if (!ValidationUtils.isNumber(newText)) {
        e.doit = false
      }
    }
  }
}