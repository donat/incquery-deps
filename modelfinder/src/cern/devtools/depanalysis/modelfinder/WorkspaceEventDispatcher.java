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
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;

public class WorkspaceEventDispatcher implements IElementChangedListener {

	private final WsChangeListenerRepo listenerRepo;

	private final BuildScheduler builder;

	private final PreferenceStore prefs = new PreferenceStore();

	private List<IJavaProject> tracedProjects;

	public WorkspaceEventDispatcher() {
		listenerRepo = new WsChangeListenerRepo();
		builder = new BuildScheduler(listenerRepo, this);
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
		builder.addProject(project);

	}

	public void removeTracedProject(IJavaProject project) {
		if (tracedProjects == null) {
			initTracedProjectList();
		}
		prefs.removeTracedProject(project.getElementName());
		tracedProjects.remove(project);
		builder.removeProject(project);
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
			System.err.println("<<Model out of sync>>");
			e.printStackTrace();
			System.err.println("<<Reinitializing model>>");
			builder.rebuildWorkspaceModel(tracedProjects);

		}
	}

	private void traverseJavaModelRecursive(IJavaElementDelta delta) {
		if (delta.getKind() == IJavaElementDelta.REMOVED) {
			traverseJavaModelRecursiveInverse(delta);
		} else {
			traverseJavaModelRecursiveNormal(delta);
		}
	}

	private void traverseJavaModelRecursiveNormal(IJavaElementDelta delta) {
		for (IJavaElementDelta child : delta.getAffectedChildren()) {
			traverseJavaModelRecursiveNormal(child);
		}
		// Handling after the traverse part.
		handleDelta(delta);
	}

	private void traverseJavaModelRecursiveInverse(IJavaElementDelta delta) {
		// Handling before the traverse part.
		handleDelta(delta);
		for (IJavaElementDelta child : delta.getAffectedChildren()) {
			traverseJavaModelRecursiveInverse(child);
		}
	}

	private void handleDelta(IJavaElementDelta delta) {
		// Debug
		System.out.println(delta);
		System.out.println("----------------------------------------------------------------------");
		
		// Check if it is on a project which the user enabled the discovery.
		if (isTracedProject(delta.getElement().getJavaProject())) {
			builder.updateWorkspaceModel(delta);
		}
	}
}
