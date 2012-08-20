package cern.devtools.depanalysis.modelfinder.builder;

import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;

import cern.devtools.depanalysis.modelfinder.Activator;
import cern.devtools.depanalysis.modelfinder.ModelBuilder;
import cern.devtools.depanalysis.modelfinder.WsBuildPrimitives;
import cern.devtools.depanalysis.wsmodel.EclipseWorkspace;

public class RemoveProject implements ModelBuilder {

	private WsBuildPrimitives buildPrimitives;
	private IJavaElementDelta delta;

	public RemoveProject(EclipseWorkspace workspace, IJavaElementDelta delta) {
		this.delta = delta;
		this.buildPrimitives = new WsBuildPrimitives(workspace);
	}

	@Override
	public void build() {
		if (delta.getMovedToElement() == null) {
			removeProject((IJavaProject) delta.getElement());
		}
	}
	
	private void removeProject(IJavaProject project) {
		if (!Activator.getDefault().getWsService().isTracedProject(project)) {
			return;
		}
		buildPrimitives.removeProject(project);
		Activator.getDefault().getWsService().removeTracedProject(project);
	}
}
