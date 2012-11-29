package hu.bme.incquery.deps.marker;

import hu.bme.incquery.deps.core.PreferenceStore;
import hu.bme.incquery.deps.pub.IncQueryDepsChangeListener;
import hu.bme.incquery.deps.wsmodel.WType;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.text.Position;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;

import cern.devtools.deps.query.cp3.addedmethods.AddedMethodsMatcher;
import cern.devtools.deps.query.cp3.incominginheritances.IncomingInheritancesMatcher;
import cern.devtools.deps.query.cp3.incompatiblesuperclasseschanges.IncompatibleSuperClassesChangesMatch;
import cern.devtools.deps.query.cp3.incompatiblesuperclasseschanges.IncompatibleSuperClassesChangesMatcher;

public class IncQueryResultToMarkers implements IncQueryDepsChangeListener {
	JavaModelLocationMapper mapper = new JavaModelLocationMapper(PreferenceStore.getStore().tracedProjectNames());
	MarkerManager mm = new MarkerManager();
	
	Map<IResource, Set<Long>> resourceMarkerIds = new HashMap<IResource, Set<Long>>();

	final Class<?>[] requiredMatchers = new Class<?>[] { IncompatibleSuperClassesChangesMatcher.class };
	Map<Class<?>, IncQueryMatcher<? extends IPatternMatch>> matcherMap = new HashMap<Class<?>, IncQueryMatcher<? extends IPatternMatch>>();
	private DeltaMonitor<IncompatibleSuperClassesChangesMatch> incompatClassMonitor;

	@Override
	public void init(Set<IncQueryMatcher<IPatternMatch>> matchers) {
		fillMatcherMap(matchers);
		registerDeltas();
		updateIncompatClassMarkers();
	}

	private void registerDeltas() {
		incompatClassMonitor = getMatcher(IncompatibleSuperClassesChangesMatcher.class).newDeltaMonitor(true);
	}

	private void updateIncompatClassMarkers() {
		Collection<IncompatibleSuperClassesChangesMatch> foundEvents = incompatClassMonitor.matchFoundEvents;
		Collection<IncompatibleSuperClassesChangesMatch> lostEvents = incompatClassMonitor.matchLostEvents;
		for (IncompatibleSuperClassesChangesMatch found : foundEvents) {
			addIncomatClassMarker(found.getWsClass());
		}
		for (IncompatibleSuperClassesChangesMatch lost : lostEvents) {
			removeIncompatClassMarker(lost.getWsClass());
		}

		incompatClassMonitor.matchFoundEvents.clear();
		incompatClassMonitor.matchLostEvents.clear();
		incompatClassMonitor.clear();
	}

	private void removeIncompatClassMarker(WType wsClass) {
		IJavaElement item = JavaCore.create(wsClass.getHandler());
		IResource resource = item.getResource();
		if (resource == null) {
			return;
		}
		else if (!resource.exists()) {
			resourceMarkerIds.remove(resource);
		}
		else {
			Set<Long> idSet = resourceMarkerIds.get(resource);
			for (Long id : idSet) {
				try {
					resource.getMarker(id).delete();
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
			idSet.clear();
		}
	}

	private void addIncomatClassMarker(WType wsClass) {
		IJavaElement item = JavaCore.create(wsClass.getHandler());
		Position pos = mapper.position(item);
		
		

		long markerid = constructMarker(item, pos, wsClass);
		// TODO add added and removed class information to this eleemnt.
		
		Set<Long> markerIdSet = resourceMarkerIds.get(item.getResource());
		if (markerIdSet == null) {
			markerIdSet = new HashSet<Long>();
			resourceMarkerIds.put(item.getResource(), markerIdSet);
		} 
		markerIdSet.add(markerid);
	}

	private long constructMarker(IJavaElement item, Position pos, WType wsClass) {
		String msg = "This type is inherited by %s classes and have %s added and %s removed classes.";
		
		IncomingInheritancesMatcher inhMatcher = getMatcher(IncomingInheritancesMatcher.class);
		int incomingSize = inhMatcher.getAllMatches().size();
		AddedMethodsMatcher addedMethodsMatcher = getMatcher(AddedMethodsMatcher.class);
		int addedethodsSize = addedMethodsMatcher.getAllMatches(null, wsClass).size();
		int removedMethodsSize = 0;
		
		
		msg = String.format(msg, incomingSize, addedethodsSize, removedMethodsSize);
		
		long markerid = mm.addMarkerToJavaModelElement(MyMarkerFactory.MARKER_INCOMPAT_SUPERTYPE, item, pos,
				msg);
		return markerid;
	}

	private void fillMatcherMap(Set<IncQueryMatcher<IPatternMatch>> matchers) {
		for (IncQueryMatcher<? extends IPatternMatch> matcher : matchers) {
			matcherMap.put(matcher.getClass(), matcher);
		}
		validateMap();
	}

	private void validateMap() {
		for (Class<?> reqMatcherClass : requiredMatchers) {
			if (!matcherMap.containsKey(reqMatcherClass)) {
				throw new RuntimeException("Required matcher did not load:" + reqMatcherClass.getName());
			}
		}
	}

	@SuppressWarnings("unchecked")
	private <T> T getMatcher(Class<T> mClass) {
		return (T) matcherMap.get(mClass);
	}

	@Override
	public void matchesChanged(Set<IncQueryMatcher<IPatternMatch>> matcher) {
		updateIncompatClassMarkers();
	}
}
