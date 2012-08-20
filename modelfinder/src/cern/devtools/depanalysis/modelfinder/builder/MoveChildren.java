package cern.devtools.depanalysis.modelfinder.builder;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;

import cern.devtools.depanalysis.modelfinder.ModelBuilder;
import cern.devtools.depanalysis.modelfinder.WsBuildPrimitives;
import cern.devtools.depanalysis.wsmodel.EclipseWorkspace;

public class MoveChildren implements ModelBuilder {

	private IJavaElement from;
	private IJavaElement to;
	private EclipseWorkspace workspace;
	private WsBuildPrimitives buildPrimitives;

	public MoveChildren(EclipseWorkspace ws, IJavaElement from, IJavaElement to) {
		this.from = from;
		this.to = to;
		buildPrimitives = new WsBuildPrimitives(workspace);
	}

	@Override
	public void build() {
		if (from instanceof IJavaProject) {
			moveJavaProjectChildren((IJavaProject) from, (IJavaProject) to);
		}
	}

	private void moveJavaProjectChildren(IJavaProject from, IJavaProject to) {
		buildPrimitives.moveProjectChildren(from, to);
		//for (IPackageFragmentRoot oldPfr : from.getPackageFragmentRoots()) {
			
	//	}
	}
	
	private void movePackageFragmentRootChildren() {
		
	}

}
