package hu.bme.incquery.deps.internal;

import hu.bme.incquery.deps.engine.IncQueryDepsChangeListener;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;

import cern.devtools.deps.query.cp1.addedmethods.AddedMethodsMatch;
import cern.devtools.deps.query.cp1.addedmethods.AddedMethodsMatcher;

public class MarkerManager implements IncQueryDepsChangeListener {

	Set<IMarker> markers = new HashSet<IMarker>();

	@Override
	public void matchesChanged(Set<IncQueryMatcher<?>> matchers) {
		try {
			clearMarkers();

			for (IncQueryMatcher<?> m : matchers) {
				if (m instanceof AddedMethodsMatcher) {
					updateAddedMethodMarkers(((AddedMethodsMatcher) m));
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private void clearMarkers() throws CoreException {
		for (IMarker marker : markers) {
			marker.delete();
		}
	}

	private void updateAddedMethodMarkers(AddedMethodsMatcher addedMethodsMatcher) throws CoreException {
		for (AddedMethodsMatch match : addedMethodsMatcher.getAllMatches()) {
			IJavaElement jdtElem = JavaCore.create(match.getWsMethod().getHandler());
			IMarker marker = jdtElem.getResource().createMarker("hu.bme.incquery.deps.ui.depsinfo");
			marker.setAttribute(IMarker.MESSAGE, "This method does not exist in the repository");
			marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
			
			//marker.setAttribute("type", DepMarkerType.ADDED_METHOD);
			System.out.println(marker.exists());
		}
	}
}
