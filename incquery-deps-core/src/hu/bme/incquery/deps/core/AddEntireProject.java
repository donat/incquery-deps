package hu.bme.incquery.deps.core;

import hu.bme.incquery.deps.wsmodel.WWorkspace;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;


public class AddEntireProject implements ModelBuilder {

	private WWorkspace workspace;
	private List<IJavaProject> project;

	public AddEntireProject(WWorkspace workspace, List<IJavaProject> project) {
		this.workspace = workspace;
		this.project = project;
	}

	@Override
	public void build() {
		new AddEntireProjectStructure(workspace, project).build();
		WsBuildPrimitives prim = new WsBuildPrimitives(workspace);
		try {
			WsDeps deps = new WsDeps(prim);
			for (IJavaElement elem : JdtModelWalker.allElements(project) ){
				if (elem instanceof IMethod || elem instanceof IField) {
					deps.addElementToSearch(elem);
				}
			}
			deps.execute();
			
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
