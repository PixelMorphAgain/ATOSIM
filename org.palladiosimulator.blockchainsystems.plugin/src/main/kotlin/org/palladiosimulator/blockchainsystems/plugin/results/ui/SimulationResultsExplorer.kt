package org.palladiosimulator.blockchainsystems.plugin.results.ui

import org.eclipse.jface.action.Action
import org.eclipse.jface.layout.GridDataFactory
import org.eclipse.jface.layout.GridLayoutFactory
import org.eclipse.jface.viewers.ITreeContentProvider
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.TreeViewer
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.DirectoryDialog
import org.eclipse.ui.part.ViewPart
import org.palladiosimulator.blockchainsystems.core.simulation.abstractions.SimulationResultSummaryDeserializer
import java.io.File

/**
 * This class provides a view for exploring simulation results.
 *
 * @author Yannik Sproll, Davis Riedel
 */
abstract class SimulationResultsExplorer : ViewPart() {
  private val repositoryContainer = ResultsRepositoryContainer()
  private var viewer: TreeViewer? = null

  internal class DirectoryContentProvider : ITreeContentProvider {
    override fun getElements(inputElement: Any?): Array<Any?> {
      if (inputElement is ResultsRepositoryContainer) {
        return inputElement.resultRepositories.toTypedArray()
      }

      return arrayOfNulls<Any>(0)
    }

    override fun getChildren(parentElement: Any?): Array<Any?> {
      if (parentElement is ResultsRepository) {
        return parentElement.simulationResults.toTypedArray()
      }
      if (parentElement is SimulationResultFile) {
        return parentElement.getValues().values.toTypedArray()
      }

      return arrayOfNulls<Any>(0)
    }

    override fun getParent(element: Any?): Any? {
      if (element is SimulationResultFile) {
        return element.repository
      }
      if (element is ResultsRepository) {
        return element.container
      }
      if (element is ResultFileValue) {
        return element.file
      }
      return null
    }

    override fun hasChildren(element: Any?): Boolean {
      if (element is ResultsRepository) {
        return !element.simulationResults.isEmpty()
      }
      if (element is SimulationResultFile) {
        return !element.values.isEmpty()
      }
      return false
    }
  }

  override fun createPartControl(parent: Composite) {
    GridLayoutFactory
      .swtDefaults()
      .numColumns(1)
      .spacing(0, 0)
      .equalWidth(true)
      .applyTo(parent)
    // Create the tree viewer
    viewer = TreeViewer(parent, SWT.MULTI or SWT.H_SCROLL or SWT.V_SCROLL)
    GridDataFactory
      .swtDefaults()
      .grab(true, true)
      .align(SWT.FILL, SWT.FILL)
      .applyTo(viewer!!.tree)
    viewer!!.setContentProvider(DirectoryContentProvider())
    viewer!!.setLabelProvider(object : LabelProvider() {
      override fun getText(element: Any?): String? {
        if (element is ResultsRepository) {
          return element.directory.getName() + " (" + element.directory.path + ")"
        }
        if (element is SimulationResultFile) {
          return element.file.getName()
        }
        if (element is ResultFileValue) {
          return element.format()
        }
        return super.getText(element)
      }
    })
    viewer!!.setInput(repositoryContainer)


    val toolBarManager = viewSite.actionBars.toolBarManager

    toolBarManager.add(loadRepositoryAction(parent))

    val refreshAction: Action = object : Action() {
      override fun run() {
        viewer!!.refresh()
      }
    }
    refreshAction.setText("Refresh")
    refreshAction.setToolTipText("Refresh")
    toolBarManager.add(refreshAction)

    parent.layout()
  }

  abstract fun getSimulationResultSummaryDeserializerForDirectory(directory: File): SimulationResultSummaryDeserializer?

  private fun loadRepositoryAction(parent: Composite): Action {
    val action: Action = object : Action() {
      override fun run() {
        val dialog = DirectoryDialog(parent.getShell(), SWT.OPEN)
        dialog.setText("Select a Directory")
        dialog.setFilterPath(System.getProperty("user.home"))
        val directoryPath = dialog.open()
        if (directoryPath != null) {
          val directory = File(directoryPath)
          if (directory.isDirectory()) {
            getSimulationResultSummaryDeserializerForDirectory(directory)?.let { deserializer ->
              repositoryContainer.addRepository(directory, deserializer)
              viewer!!.refresh()
            }
          }
        }
      }
    }
    action.setText("Load Repository")
    action.setToolTipText("Load a simulation results repository")
    return action
  }

  override fun setFocus() {
    viewer!!.control.setFocus()
  }
}