package cern.devtools.depanalysis.modelfinder.builder;

import java.util.List;

import org.eclipse.jdt.core.IJavaProject;

import cern.devtools.depanalysis.modelfinder.ModelBuilder;
import cern.devtools.depanalysis.modelfinder.WsBuildPrimitives;
import cern.devtools.depanalysis.wsmodel.EclipseWorkspace;

public class RemoveEntireProject implements ModelBuilder {

	private List<IJavaProject> projects;
	private WsBuildPrimitives buildPrimitives;

	public RemoveEntireProject(EclipseWorkspace workspace, List<IJavaProject> projects) {
		this.projects = projects;
		this.buildPrimitives = new WsBuildPrimitives(workspace);
	}

	@Override
	public void build() {
		for (IJavaProject project : projects) {
			buildPrimitives.removeEntireProject(project);
		}
	}

}
