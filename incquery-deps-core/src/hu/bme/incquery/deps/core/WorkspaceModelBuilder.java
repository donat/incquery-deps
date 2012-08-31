package hu.bme.incquery.deps.core;

import hu.bme.incquery.deps.wsmodel.WWorkspace;
import hu.bme.incquery.deps.wsmodel.WsmodelFactory;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;

public class WorkspaceModelBuilder {

	private final WWorkspace workspace;

	private WorkspaceModelBuilder() {
		workspace = WsmodelFactory.eINSTANCE.createWWorkspace();
	}

	private WorkspaceModelBuilder(WWorkspace workspace) {
		this.workspace = workspace;
	}

	public static WorkspaceModelBuilder forModel(WWorkspace workspace) {
		return new WorkspaceModelBuilder(workspace);
	}

	public static WorkspaceModelBuilder fromScratch(List<IJavaProject> tracedProjects) {
		WorkspaceModelBuilder builder = new WorkspaceModelBuilder();
		builder.addNewProjects(tracedProjects);
		return builder;
	}

	public WWorkspace getWorkspace() {
		return workspace;
	}

	public void modifyModel(IJavaElementDelta delta) {	
		@SuppressWarnings("unused")
		List<IJavaElementDelta> flattenedDelta = gatherDeltas(new LinkedList<IJavaElementDelta>(), delta);
		// Here is where the magic happens.
		ModelComparer.compareAndUpdateModel(workspace, delta);
	}
	
	private List<IJavaElementDelta> gatherDeltas(List<IJavaElementDelta> container, IJavaElementDelta delta) {
		container.add(delta);
		for (IJavaElementDelta child : delta.getAffectedChildren()) {
			gatherDeltas(container, child);
		}
		return container;
	}
	

	public void addNewProject(IJavaProject project) {
		WsStructure.buildEntireProject(workspace, Arrays.asList(project));
	}
	
	private void addNewProjects(List<IJavaProject> projects) {
		WsStructure.buildEntireProject(workspace, projects);
	}

	public void removeEntireProject(IJavaProject project) {
		WsStructure.removeEntireProject(workspace, Arrays.asList(project));
	}
	
	
}
