package cern.devtools.depanalysis.modelfinder;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;

import cern.devtools.depanalysis.wsmodel.EclipseWorkspace;

public class AddEntireProject implements ModelBuilder {

	private EclipseWorkspace workspace;
	private List<IJavaProject> project;

	public AddEntireProject(EclipseWorkspace workspace, List<IJavaProject> project) {
		this.workspace = workspace;
		this.project = project;
	}

	@Override
	public void build() {
		new AddEntireProjectStructure(workspace, project).build();
		WsBuildPrimitives prim = new WsBuildPrimitives(workspace);
		try {
			for (IJavaElement elem : JavaModelWalker.allElements(project) ){
				if (elem instanceof IType) {
					WsDeps.searchAndInsertOutgoingDependencies(elem, prim);
				}
			}
			
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
