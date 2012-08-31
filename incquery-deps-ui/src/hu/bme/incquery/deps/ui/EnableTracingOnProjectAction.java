/*
 * File EnableAction.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jul 12, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package hu.bme.incquery.deps.ui;

import hu.bme.incquery.deps.core.Activator;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class EnableTracingOnProjectAction implements IObjectActionDelegate {
	
	
	public EnableTracingOnProjectAction() {
	}

	@Override
	public void run(IAction action) {
		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		if (selection != null && selection instanceof TreeSelection) {
			TreeSelection ts = (TreeSelection) selection;
			Object firstElement = ts.getFirstElement();
			if (firstElement instanceof IJavaProject) {
				IJavaProject project = (IJavaProject) firstElement;
				if (!Activator.getDefault().getWsService().isTracedProject(project)) {
					Activator.getDefault().getWsService().addTracedProjectAndDiscoverIt(project);
					try {
						PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("hu.bme.incquery.deps.viewer.modelviewer");
					} catch (PartInitException e) {
						// Should not happen.
						throw new RuntimeException(e);
					}
				}
				else {
					Activator.getDefault().getWsService().removeTracedProjectWithStructure(project);
				}
			}
			
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection != null && selection instanceof TreeSelection) {
			TreeSelection ts = (TreeSelection) selection;
			Object firstElement = ts.getFirstElement();
			if (firstElement instanceof IJavaProject) {
				IJavaProject project = (IJavaProject) firstElement;
				if (Activator.getDefault().getWsService().isTracedProject(project)) {
					action.setText("Disable Dependency Analysis");
				}
				else {
					action.setText("Enable Dependency Analysis");
				}
			}
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		//Do nothing
	}
}
