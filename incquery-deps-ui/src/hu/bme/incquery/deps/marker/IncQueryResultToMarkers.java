package hu.bme.incquery.deps.marker;

import hu.bme.incquery.deps.core.PreferenceStore;
import hu.bme.incquery.deps.pub.IncQueryDepsChangeListener;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.text.Position;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;

import cern.devtools.deps.query.cp3.addedmethods.AddedMethodsMatch;
import cern.devtools.deps.query.cp3.addedmethods.AddedMethodsMatcher;

public class IncQueryResultToMarkers implements IncQueryDepsChangeListener {
	JavaModelLocationMapper mapper = new JavaModelLocationMapper(PreferenceStore.getStore().tracedProjectNames());
	MarkerManager mm = new MarkerManager();
	@Override
	public void matchesChanged(@SuppressWarnings("rawtypes") IncQueryMatcher matcher) {

		if (matcher instanceof AddedMethodsMatcher) {
			handleAddedMethods((AddedMethodsMatcher) matcher);
		}
	}

	private void handleAddedMethods(AddedMethodsMatcher matcher) {
		mapper.refresh();
		for (AddedMethodsMatch m : matcher.getAllMatches()) {
			IJavaElement item = JavaCore.create(m.getWsMethod().getHandler());
			
			Position pos = mapper.position(item);
			mm.addMarkerToJavaModelElement(item, pos, "This is a new method");
		}
	}

}
