package org.palladiosimulator.blockchainsystems.plugin.results.ui;

import java.io.File;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.ui.part.ViewPart;

public class SimulationResultsExplorer extends ViewPart {
    public static final String ID = "com.example.directorytreeview.view";

    private final ResultsRepositoryContainer _repositoryContainer = new ResultsRepositoryContainer();
    private TreeViewer viewer;

    class DirectoryContentProvider implements ITreeContentProvider {
        @Override
        public Object[] getElements(Object inputElement) {
            if (inputElement instanceof ResultsRepositoryContainer container) {
                return container.getResultRepositories().toArray();
            }

            return new Object[0];
        }

        @Override
        public Object[] getChildren(Object parentElement) {
            if (parentElement instanceof ResultsRepository repository) {
                return repository.getSimulationResults().toArray();
            }
            if (parentElement instanceof SimulationResultFile file) {
                return file.getValues().toArray();
            }

            return new Object[0];
        }

        @Override
        public Object getParent(Object element) {
            if (element instanceof SimulationResultFile file) {
                return file.repository();
            }
            if (element instanceof ResultsRepository repository) {
                return repository.container();
            }
            if (element instanceof ResultFileValue value) {
                return value.file();
            }
            return null;
        }

        @Override
        public boolean hasChildren(Object element) {
            if (element instanceof ResultsRepository repository) {
                return !repository.getSimulationResults().isEmpty();
            }
            if (element instanceof SimulationResultFile file) {
                return !file.getValues().isEmpty();
            }
            return false;
        }
    }

    @Override
    public void createPartControl(Composite parent) {
        GridLayoutFactory
                .swtDefaults()
                .numColumns(1)
                .spacing(0, 0)
                .equalWidth(true)
                .applyTo(parent);
        // Create the tree viewer
        viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
        GridDataFactory
                .swtDefaults()
                .grab(true, true)
                .align(SWT.FILL, SWT.FILL)
                .applyTo(viewer.getTree());
        viewer.setContentProvider(new DirectoryContentProvider());
        viewer.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                if (element instanceof ResultsRepository repository) {
                    return repository.directory().getName() + " (" + repository.directory().getPath() + ")";
                }
                if (element instanceof SimulationResultFile file) {
                    return file.file().getName();
                }
                if (element instanceof ResultFileValue value) {
                    return value.format();
                }
                return super.getText(element);
            }
        });
        viewer.setInput(_repositoryContainer);


        IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();

        // Add the action to the toolbar
        Action loadRepositoryAction = new Action() {
            @Override
            public void run() {
                DirectoryDialog dialog = new DirectoryDialog(parent.getShell(), SWT.OPEN);
                dialog.setText("Select a Directory");
                dialog.setFilterPath(System.getProperty("user.home"));
                String directoryPath = dialog.open();
                if (directoryPath != null) {
                    File directory = new File(directoryPath);
                    if (directory.isDirectory()) {
                        _repositoryContainer.addRepository(directory);
                        viewer.refresh();
                    }
                }
            }
        };
        loadRepositoryAction.setText("Load Repository");
        loadRepositoryAction.setToolTipText("Load a simulation results repository");
        toolBarManager.add(loadRepositoryAction);

        Action refreshAction = new Action() {
            @Override
            public void run() {
                viewer.refresh();
            }
        };
        refreshAction.setText("Refresh");
        refreshAction.setToolTipText("Refresh");
        toolBarManager.add(refreshAction);

        parent.layout();
    }

    @Override
    public void setFocus() {
        viewer.getControl().setFocus();
    }

}
