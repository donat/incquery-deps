package cern.devtools.depanalysis.modelfinder;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;

import cern.devtools.depanalysis.wsmodel.EclipseWorkspace;
import cern.devtools.depanalysis.wsmodel.JavaModelFactory;

public class WorkspaceModelBuilder {

	private final EclipseWorkspace workspace;

	private WorkspaceModelBuilder() {
		workspace = JavaModelFactory.eINSTANCE.createEclipseWorkspace();
	}

	private WorkspaceModelBuilder(EclipseWorkspace workspace) {
		this.workspace = workspace;
	}

	public static WorkspaceModelBuilder forModel(EclipseWorkspace workspace) {
		return new WorkspaceModelBuilder(workspace);
	}

	public static WorkspaceModelBuilder fromScratch(List<IJavaProject> tracedProjects) {
		WorkspaceModelBuilder builder = new WorkspaceModelBuilder();
		builder.addNewProjects(tracedProjects);
		return builder;
	}

	public EclipseWorkspace getWorkspace() {
		return workspace;
	}

	public void modifyModel(IJavaElementDelta delta) {	
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
		ModelBuilderFactory.addFullProjects(workspace, Arrays.asList(project)).build();
	}
	
	private void addNewProjects(List<IJavaProject> projects) {
		ModelBuilderFactory.addFullProjects(workspace, projects).build();
	}

	public void removeEntireProject(IJavaProject project) {
		ModelBuilderFactory.removeFullProjects(workspace, Arrays.asList(project)).build();
	}
	
	
}
