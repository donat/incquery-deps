/*
 * File WsChangeListener.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at 25 May 2012.
 */
package cern.devtools.depanalysis.modelfinder;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;

public class WorkspaceEventDispatcher implements IElementChangedListener {

	private final WsChangeListenerRepo listenerRepo;

	private final IncrementalWsModelBuilder builder;

	private final PreferenceStore prefs = new PreferenceStore();

	private List<IJavaProject> tracedProjects;

	public WorkspaceEventDispatcher() {
		listenerRepo = new WsChangeListenerRepo();
		builder = new IncrementalWsModelBuilder(listenerRepo, this);
	}

	public void registerWorkspaceListener(WsChangeEventListener l) {
		listenerRepo.addWsChangeEventListener(l);
	}

	public void deregisterWorkspaceListener(WsChangeEventListener l) {
		listenerRepo.removeWsChangeEventListener(l);
	}

	public List<IJavaProject> getTracedProjects() {
		if (tracedProjects == null) {
			initTracedProjectList();
		}
		return tracedProjects;
	}

	public void addTracedProject(IJavaProject project) {
		if (tracedProjects == null) {
			initTracedProjectList();
		}
		prefs.addTracedProject(project.getElementName());
		tracedProjects.add(project);
		builder.updateWorkspaceModel(WsChangeType.ADD_PROJECT, project);

	}

	public void removeTracedProject(IJavaProject project) {
		if (tracedProjects == null) {
			initTracedProjectList();
		}
		prefs.removeTracedProject(project.getElementName());
		tracedProjects.remove(project);
		builder.updateWorkspaceModel(WsChangeType.REMOVE_PROJECT, project);
	}

	private boolean isTracedProject(IJavaProject project) {
		if (tracedProjects == null) {
			initTracedProjectList();
		}
		return tracedProjects.contains(project);
	}

	private void initTracedProjectList() {
		try {
			List<String> enabledProjectNames = prefs.tracedProjectNames();
			tracedProjects = new LinkedList<IJavaProject>();
			IWorkspace jdtWorkspace = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot jdtWsRoot = jdtWorkspace.getRoot();
			for (IJavaProject project : JavaModelWalker.childrenOf(jdtWsRoot)) {
				if (enabledProjectNames.contains(project.getElementName())) {
					tracedProjects.add((IJavaProject) project);
				}
			}
		} catch (CoreException e) {
			// Should not happen.
			throw new RuntimeException(e);
		}
	}

	@Override
	public void elementChanged(final ElementChangedEvent event) {
		IJavaElementDelta delta = event.getDelta();

		try {
			traverseJavaModelRecursive(delta);
		} catch (Exception e) {
			// Print the reconcile process.
			System.err.println("<<Model got out of sync>>");
			e.printStackTrace();
			System.err.println("<<Reinitializing model>>");
			builder.rebuildWorkspaceModel(tracedProjects);

		}
	}

	private void traverseJavaModelRecursive(IJavaElementDelta delta) {
		for (IJavaElementDelta child : delta.getAffectedChildren()) {
			traverseJavaModelRecursive(child);
		}

		handleDelta(delta);
	}

	private void handleDelta(IJavaElementDelta delta) {
		IJavaElement elem = delta.getElement();
		
		if (!isTracedProject(elem.getJavaProject())) {
			return;
		}

		switch (delta.getKind()) {
		case IJavaElementDelta.ADDED:
			WsChangeType type = WsChangeType.forAddingJdtItem(elem);
			if (type == null) {
				logNonHandledEvent(delta);
			} else {
				builder.updateWorkspaceModel(type, elem);
			}
			break;
		case IJavaElementDelta.CHANGED:
			type = WsChangeType.forChangingJdtItem(elem, delta);
			if (type == null) {
				logNonHandledEvent(delta);
			} else {
				builder.updateWorkspaceModel(type, elem);
			}

			break;
		case IJavaElementDelta.REMOVED:
			type = WsChangeType.forRemovingJdtItem(elem);
			if (type == null) {
				logNonHandledEvent(delta);
			} else if (type == WsChangeType.REMOVE_PROJECT) {
				removeTracedProject((IJavaProject) elem);
			} else {
				// When remove delete the preference too.

				builder.updateWorkspaceModel(type, elem);
			}

			// Traversals.removeJdtElemFromEmfModel(workspace, delta.getElement());
			break;
		default:
		}
	}

	private void logNonHandledEvent(IJavaElementDelta delta) {
		//System.err.println("WARNING: Event not handled:" + delta.getElement().getClass() + " | " + delta);
	}
}
