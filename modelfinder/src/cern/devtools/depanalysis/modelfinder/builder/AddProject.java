package cern.devtools.depanalysis.modelfinder.builder;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;

import cern.devtools.depanalysis.modelfinder.Activator;
import cern.devtools.depanalysis.modelfinder.ModelBuilder;
import cern.devtools.depanalysis.modelfinder.WsBuildPrimitives;
import cern.devtools.depanalysis.wsmodel.EclipseWorkspace;

public class AddProject implements ModelBuilder {

	private IJavaElementDelta delta;
	private WsBuildPrimitives buildPrimitives;

	public AddProject(EclipseWorkspace workspace, IJavaElementDelta delta) {
		this.delta = delta;
		this.buildPrimitives = new WsBuildPrimitives(workspace);
	}

	@Override
	public void build() {
		IJavaElement from = delta.getMovedFromElement();
		IJavaElement elem = delta.getElement();

		if (from != null) {
			moveProject((IJavaProject) elem, (IJavaProject) from);
		} else {
			addProject((IJavaProject) delta.getElement());
		}

	}

	private void addProject(IJavaProject project) {
		if (!Activator.getDefault().getWsService().isTracedProject(project)) {
			return;
		}
		buildPrimitives.addProject(project);
	}

	private void moveProject(IJavaProject moved, IJavaProject original) {
		// If the original project was not traced, then dump it.
		if (!Activator.getDefault().getWsService().isTracedProject(original)) {
			return;
		}

		// Create and delete the project.
		Activator.getDefault().getWsService().addTracedProject(moved);
		addProject(moved);

		// Update children element
		updatePackageFragments(original, moved);

		// Modify traced projects accordingly.
		// new RemoveProject(workspace, original).build();
		if (Activator.getDefault().getWsService().isTracedProject(original)) {
			buildPrimitives.removeProject(original);
			Activator.getDefault().getWsService().removeTracedProject(original);
		}
	}

	private void updatePackageFragments(IJavaProject oldProject, IJavaProject newProject) {
		buildPrimitives.moveProjectChildren(oldProject, newProject);
	}

}
