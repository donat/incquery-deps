/*
 * File EnableAction.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jul 12, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

public class EnableTracingOnProjectAction implements IObjectActionDelegate {
	
	private final PreferenceStore prefs = new PreferenceStore();
	
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
				if (!prefs.tracedProjectNames().contains(project.getElementName())) {
					Activator.getDefault().getWsService().addTracedProject(project);
				}
				else {
					Activator.getDefault().getWsService().removeTracedProject(project);
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
				if (prefs.tracedProjectNames().contains(project.getElementName())) {
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
	}
}
