package org.palladiosimulator.blockchainsystems.plugin.ui.abstractions

import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.swt.SWT
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.events.VerifyListener
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.Text

/**
 * Abstract class for creating a labeled text field with associated validation and
 * configuration handling.
 *
 * @param parent The parent composite in which the text field and label will be created.
 * @param labelText The text to display on the label associated with the text field.
 * @param verifier The listener to handle verification events for the text field.
 * @property attributeKey The key used to store and retrieve the text field's value in the launch configuration.
 * @property defaultValue The default value to use if the launch configuration does not specify a value.
 * @property isValueValid A function that checks if the provided value is valid according to specific criteria.
 *
 * @author Davis Riedel
 */
class TextField(
  parent: Composite,
  labelText: String,
  verifier: VerifyListener,
  private val attributeKey: String,
  private val defaultValue: String,
  val isValueValid: (String) -> Boolean
) {
  /**
   * Label associated with the text field.
   */
  val label: Label

  /**
   * Text control for user input.
   */
  val textControl: Text

  /**
   * Constructor to initialize the label and text control.
   */
  init {
    label = Label(parent, SWT.NONE)
    label.text = labelText
    label.layoutData = GridData(SWT.BEGINNING, SWT.CENTER, false, false)

    textControl = Text(parent, SWT.BORDER)
    textControl.layoutData = GridData(SWT.FILL, SWT.CENTER, true, false)
    textControl.addVerifyListener(verifier)
  }

  /**
   * Initializes the text field from the launch configuration.
   */
  fun initializeFrom(configuration: ILaunchConfiguration) {
    try {
      textControl.text = configuration.getAttribute(attributeKey, defaultValue)
    } catch (_: Exception) {
      textControl.text = defaultValue
    }
  }

  /**
   * Applies the text field's value to the launch configuration working copy.
   */
  fun performApply(configuration: ILaunchConfigurationWorkingCopy) {
    configuration.setAttribute(attributeKey, textControl.text ?: defaultValue)
  }

  /**
   * Sets the default value for the text field to the launch configuration working copy.
   */
  fun setDefaults(configuration: ILaunchConfigurationWorkingCopy) {
    configuration.setAttribute(attributeKey, defaultValue)
  }
}
