package cern.devtools.depanalysis.modelfinder.builder;

import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IPackageFragment;

import cern.devtools.depanalysis.modelfinder.ModelBuilder;
import cern.devtools.depanalysis.modelfinder.WsBuildPrimitives;
import cern.devtools.depanalysis.wsmodel.EclipseWorkspace;
import cern.devtools.depanalysis.wsmodel.PackageFragmentRoot;

public class AddPackageFragment implements ModelBuilder {

	private EclipseWorkspace workspace;
	private IJavaElementDelta delta;
	private WsBuildPrimitives buildPrimitives;

	public AddPackageFragment(EclipseWorkspace workspace, IJavaElementDelta delta) {
		this.workspace = workspace;
		this.delta = delta;
		this.buildPrimitives = new WsBuildPrimitives(workspace);
	}

	@Override
	public void build() {
		PackageFragmentRoot container = (PackageFragmentRoot) buildPrimitives.findJdtElementInEmfModel(delta.getElement().getParent());
		buildPrimitives.addPackageFragment(container, (IPackageFragment)delta.getElement());
	}

}
