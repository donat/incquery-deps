package cern.devtools.depanalysis.modelfinder;

import java.util.List;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;

import cern.devtools.depanalysis.modelfinder.builder.AddPackageFragment;
import cern.devtools.depanalysis.modelfinder.builder.AddPackageFragmentRoot;
import cern.devtools.depanalysis.modelfinder.builder.AddProject;
import cern.devtools.depanalysis.modelfinder.builder.NullBuilder;
import cern.devtools.depanalysis.modelfinder.builder.RemoveEntireProject;
import cern.devtools.depanalysis.modelfinder.builder.RemoveProject;
import cern.devtools.depanalysis.wsmodel.EclipseWorkspace;


public class ModelBuilderFactory {
	public static ModelBuilder forSingleItem(EclipseWorkspace ws, IJavaElementDelta delta) {
		int kind = delta.getKind();

		if (delta.getElement().getJavaProject() != null) {
			switch (kind) {
			case IJavaElementDelta.ADDED:
				return forAdd(ws, delta);
			case IJavaElementDelta.REMOVED:
				return forRemove(ws, delta);
			case IJavaElementDelta.CHANGED:
				return forChange(ws, delta);
			default:
				throw new RuntimeException("That's not true! That's impossible!");
			}
		} else {
			return new NullBuilder(delta);
		}
	}

	private static ModelBuilder forAdd(EclipseWorkspace ws, IJavaElementDelta delta) {
		IJavaElement elem = delta.getElement();
		IJavaElement from = delta.getMovedFromElement();

		switch (elem.getElementType()) {
		case IJavaElement.JAVA_PROJECT:
			return new AddProject(ws, delta);
		case IJavaElement.PACKAGE_FRAGMENT_ROOT:
			return new NullBuilder(delta);
		case IJavaElement.PACKAGE_FRAGMENT:
			return new AddPackageFragment(ws, delta);
		default:
			return new NullBuilder(delta);
		}
	}

	private static ModelBuilder forRemove(EclipseWorkspace ws, IJavaElementDelta delta) {
		IJavaElement elem = delta.getElement();
		IJavaElement to = delta.getMovedToElement();

		switch (elem.getElementType()) {
		case IJavaElement.JAVA_PROJECT:
			return new RemoveProject(ws,  delta);
		case IJavaElement.PACKAGE_FRAGMENT_ROOT:
			return new AddPackageFragmentRoot(ws, delta);
		case IJavaElement.PACKAGE_FRAGMENT:
			return new AddPackageFragment(ws, delta);
		default:
			return new NullBuilder(delta);
		}

	}

	private static ModelBuilder forChange(EclipseWorkspace ws, IJavaElementDelta delta) {
		return new NullBuilder(delta);

	}

	public static ModelBuilder addFullProjects(EclipseWorkspace workspace, List<IJavaProject> project) {
		return new AddEntireProject(workspace, project);
	}

	public static ModelBuilder removeFullProjects(EclipseWorkspace workspace, List<IJavaProject> project) {
		return new RemoveEntireProject(workspace, project);
	}
}
