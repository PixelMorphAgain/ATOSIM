package org.palladiosimulator.blockchainsystems.threesim_plugin

import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab
import org.eclipse.jface.layout.GridLayoutFactory
import org.eclipse.swt.SWT
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Group
import org.palladiosimulator.blockchainsystems.plugin.common.Attributes
import org.palladiosimulator.blockchainsystems.plugin.ui.abstractions.TextField
import org.palladiosimulator.blockchainsystems.plugin.utils.DoubleVerifier
import org.palladiosimulator.blockchainsystems.plugin.utils.LongVerifier

/**
 * Tab for configuring Threesim-specific simulation parameters.
 *
 * @author Davis Riedel
 */
class ThreesimTab : AbstractLaunchConfigurationTab() {
  companion object {
    private const val MIN_RELIABILITY_OBSERVATION_TIMESPAN = 1L
    private val NAKAMOTO_COEFFICIENT_THRESHOLD_RANGE = 0.0..1.0
    private const val MIN_SHANNON_ENTROPY_K = 0.0
    private val FAILURE_THROUGHPUT_THRESHOLD_RANGE = 0.0..1.0
    private const val MIN_THROUGHPUT_MONITORING_INTERVAL = 1L
  }

  private var isInitialized = false

  private lateinit var throughputMonitoringIntervalField: TextField
  private lateinit var failureThroughputThresholdField: TextField
  private lateinit var shannonEntropyKField: TextField
  private lateinit var nakamotoCoefficientThresholdField: TextField
  private lateinit var reliabilityObservationTimespanField: TextField

  override fun createControl(parent: Composite) {
    val root = Composite(parent, SWT.BORDER)
    GridLayoutFactory.swtDefaults().numColumns(1).applyTo(root)

    val group = Group(root, SWT.NONE)
    group.text = "3SIM Parameters"
    GridLayoutFactory.swtDefaults().numColumns(2).spacing(0, 10).applyTo(group)
    group.layoutData = GridData(SWT.FILL, SWT.BEGINNING, true, false)

    throughputMonitoringIntervalField = TextField(
      group,
      "Throughput Monitoring Interval:",
      LongVerifier,
      Attributes.Threesim.THROUGHPUT_MONITORING_INTERVAL,
      Attributes.Threesim.THROUGHPUT_MONITORING_INTERVAL_DEFAULT,
      isValueValid = { it.toLongOrNull()?.let { it > MIN_THROUGHPUT_MONITORING_INTERVAL } ?: false }
    )

    failureThroughputThresholdField = TextField(
      group,
      "Failure Throughput Threshold:",
      DoubleVerifier,
      Attributes.Threesim.FAILURE_THROUGHPUT_THRESHOLD,
      Attributes.Threesim.FAILURE_THROUGHPUT_THRESHOLD_DEFAULT,
      isValueValid = { it.toDoubleOrNull()?.let { it in FAILURE_THROUGHPUT_THRESHOLD_RANGE } ?: false }
    )

    shannonEntropyKField = TextField(
      group,
      "Shannon Entropy K:",
      DoubleVerifier,
      Attributes.Threesim.SHANNON_ENTROPY_K,
      Attributes.Threesim.SHANNON_ENTROPY_K_DEFAULT,
      isValueValid = { it.toDoubleOrNull()?.let { it > MIN_SHANNON_ENTROPY_K } ?: false }
    )

    nakamotoCoefficientThresholdField = TextField(
      group,
      "Nakamoto Coefficient Threshold:",
      DoubleVerifier,
      Attributes.Threesim.NAKAMOTO_COEFFICIENT_THRESHOLD,
      Attributes.Threesim.NAKAMOTO_COEFFICIENT_THRESHOLD_DEFAULT,
      isValueValid = { it.toDoubleOrNull()?.let { it in NAKAMOTO_COEFFICIENT_THRESHOLD_RANGE } ?: false }
    )

    reliabilityObservationTimespanField = TextField(
      group,
      "Reliability Observation Timespan:",
      LongVerifier,
      Attributes.Threesim.RELIABILITY_OBSERVATION_TIMESPAN,
      Attributes.Threesim.RELIABILITY_OBSERVATION_TIMESPAN_DEFAULT,
      isValueValid = { it.toLongOrNull()?.let { it > MIN_RELIABILITY_OBSERVATION_TIMESPAN } ?: false }
    )

    control = root
    isInitialized = true
  }

  override fun getName(): String {
    return "3SIM Parameters"
  }

  override fun initializeFrom(configuration: ILaunchConfiguration) {
    if (!isInitialized) return

    throughputMonitoringIntervalField.initializeFrom(configuration)
    failureThroughputThresholdField.initializeFrom(configuration)
    shannonEntropyKField.initializeFrom(configuration)
    nakamotoCoefficientThresholdField.initializeFrom(configuration)
    reliabilityObservationTimespanField.initializeFrom(configuration)
  }

  override fun performApply(configuration: ILaunchConfigurationWorkingCopy) {
    if (!isInitialized) return

    throughputMonitoringIntervalField.performApply(configuration)
    failureThroughputThresholdField.performApply(configuration)
    shannonEntropyKField.performApply(configuration)
    nakamotoCoefficientThresholdField.performApply(configuration)
    reliabilityObservationTimespanField.performApply(configuration)
  }

  override fun setDefaults(configuration: ILaunchConfigurationWorkingCopy) {
    if (!isInitialized) return

    throughputMonitoringIntervalField.setDefaults(configuration)
    failureThroughputThresholdField.setDefaults(configuration)
    shannonEntropyKField.setDefaults(configuration)
    nakamotoCoefficientThresholdField.setDefaults(configuration)
    reliabilityObservationTimespanField.setDefaults(configuration)
  }

  override fun activated(workingCopy: ILaunchConfigurationWorkingCopy) {
    super.activated(workingCopy)
    updateLaunchConfigurationDialog()
  }

  override fun isValid(launchConfig: ILaunchConfiguration): Boolean {
    if (!isInitialized) return false

    return throughputMonitoringIntervalField.isValid() &&
      failureThroughputThresholdField.isValid() &&
      shannonEntropyKField.isValid() &&
      nakamotoCoefficientThresholdField.isValid() &&
      reliabilityObservationTimespanField.isValid()
  }
}