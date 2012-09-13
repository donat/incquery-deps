/*
 * File WsChangeListener.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at 25 May 2012.
 */
package hu.bme.incquery.deps.core;

import hu.bme.incquery.deps.wsmodel.WWorkspace;

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

	private final BuildScheduler builder;

	private List<IJavaProject> tracedProjects;

	private PreferenceStore prefs = PreferenceStore.getStore();

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

	public void addTracedProjectAndDiscoverIt(IJavaProject project) {
		if (tracedProjects == null) {
			initTracedProjectList();
		}
		prefs.addTracedProject(project.getElementName());
		tracedProjects.add(project);
		builder.addProject(project);
	}

	public void removeTracedProjectWithStructure(IJavaProject project) {
		if (tracedProjects == null) {
			initTracedProjectList();
		}
		prefs.removeTracedProject(project.getElementName());
		tracedProjects.remove(project);
		builder.removeProject(project);
	}

	public boolean isTracedProject(IJavaProject project) {
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
			for (IJavaProject project : JdtModelWalker.childrenOf(jdtWsRoot)) {
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
		if (eventDisposable(event)) {
			return;
		}

		try {
			// Handle delta.
			builder.updateWorkspaceModel(delta);
		} catch (Exception e) {
			// Print the reconcile process.
			System.err.println("<<Model out of sync>>");
			e.printStackTrace();
			System.err.println("<<Reinitializing model>>");
			builder.rebuildWorkspaceModel(tracedProjects);

		}
	}

	private boolean eventDisposable(ElementChangedEvent event) {
		// Interested only the java model changes
		if (event.getDelta().getElement().getElementType() != IJavaElement.JAVA_MODEL) {
			return true;
		}

		// we want to enable two things:

		List<IJavaElementDelta> flattenDeltas = gatherDeltas(new LinkedList<IJavaElementDelta>(), event.getDelta());
		return !containsImportantModifications(flattenDeltas);
	}

	private boolean containsImportantModifications(List<IJavaElementDelta> flattenDeltas) {
		for (IJavaElementDelta delta : flattenDeltas) {
			// If at least one element is added or removed (== Not changed), than it should be forwarded.
			if (delta.getKind() != IJavaElementDelta.CHANGED) {
				return true;
			}
			// The second option is when a compilation unit is saved.
			else if (delta.getElement().getElementType() == IJavaElement.COMPILATION_UNIT
					&& (delta.getFlags() & IJavaElementDelta.F_PRIMARY_RESOURCE) != 0) {
				return true;
			}
		}
		return false;
	}

	private List<IJavaElementDelta> gatherDeltas(List<IJavaElementDelta> container, IJavaElementDelta delta) {
		container.add(delta);
		for (IJavaElementDelta child : delta.getAffectedChildren()) {
			gatherDeltas(container, child);
		}
		return container;
	}

	public WWorkspace getWorkspace() {
		return builder.getWorkspace();
	}

}
