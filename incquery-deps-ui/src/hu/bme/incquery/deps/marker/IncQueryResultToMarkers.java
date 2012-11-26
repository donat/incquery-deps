package hu.bme.incquery.deps.marker;

import hu.bme.incquery.deps.core.PreferenceStore;
import hu.bme.incquery.deps.pub.IncQueryDepsChangeListener;

import java.util.Collection;
import java.util.Set;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.text.Position;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;

import cern.devtools.deps.query.cp3.addedmethods.AddedMethodsMatch;
import cern.devtools.deps.query.cp3.addedmethods.AddedMethodsMatcher;
import cern.devtools.deps.query.cp3.incomingclassusages.IncomingClassUsagesMatch;
import cern.devtools.deps.query.cp3.incomingclassusages.IncomingClassUsagesMatcher;
import cern.devtools.deps.query.cp3.incomingfieldaccesses.IncomingFieldAccessesMatch;
import cern.devtools.deps.query.cp3.incomingfieldaccesses.IncomingFieldAccessesMatcher;
import cern.devtools.deps.query.cp3.incominginheritances.IncomingInheritancesMatch;
import cern.devtools.deps.query.cp3.incominginheritances.IncomingInheritancesMatcher;
import cern.devtools.deps.query.cp3.incomingmethodcalls.IncomingMethodCallsMatch;
import cern.devtools.deps.query.cp3.incomingmethodcalls.IncomingMethodCallsMatcher;
import cern.devtools.deps.query.cp3.incomingmethodoverride.IncomingMethodOverrideMatch;
import cern.devtools.deps.query.cp3.incomingmethodoverride.IncomingMethodOverrideMatcher;

public class IncQueryResultToMarkers implements IncQueryDepsChangeListener {
	JavaModelLocationMapper mapper = new JavaModelLocationMapper(PreferenceStore.getStore().tracedProjectNames());
	MarkerManager mm = new MarkerManager();
	private DeltaMonitor<?> addedMethodsDelta;
	private DeltaMonitor<?> incomingMethodCallsDelta;
	private DeltaMonitor<?> incomingMethodOverrideDelta;
	private DeltaMonitor<?> incomingClassUsageDelta;
	private DeltaMonitor<?> incomingInheritanceDelta;
	private DeltaMonitor<?> incomingFieldAccessDelta;

	@Override
	public void init(Set<IncQueryMatcher<IPatternMatch>> matchers) {
		for (IncQueryMatcher<?> matcher : matchers) {
			// Added methods
			if (matcher instanceof AddedMethodsMatcher) {
				addedMethodsDelta = matcher.newDeltaMonitor(true);
				maintainAddedMethodsMarker();
			} else if (matcher instanceof IncomingMethodCallsMatcher) {
				incomingMethodCallsDelta = matcher.newDeltaMonitor(true);
				maintainIncomingMethodCallsMarker();
			} else if (matcher instanceof IncomingMethodOverrideMatcher) {
				incomingMethodOverrideDelta = matcher.newDeltaMonitor(true);
				maintainIncomingMethodOverridesMarkers();
			} else if (matcher instanceof IncomingClassUsagesMatcher) {
				incomingClassUsageDelta = matcher.newDeltaMonitor(true);
				maintainIncomingClassUsageMarkers();
			} else if (matcher instanceof IncomingInheritancesMatcher) {
				incomingInheritanceDelta = matcher.newDeltaMonitor(true);
				maintainIncominginherInheritanceMarkers();
			} else if (matcher instanceof IncomingFieldAccessesMatcher) {
				incomingFieldAccessDelta = matcher.newDeltaMonitor(true);
				maintainIncomingFieldAccessMarkers();
			}
		}
	}

	private void maintainAddedMethodsMarker() {
		// get found and lost events
		@SuppressWarnings("unchecked")
		Collection<AddedMethodsMatch> foundMatches = (Collection<AddedMethodsMatch>) addedMethodsDelta.matchFoundEvents;
		@SuppressWarnings("unchecked")
		Collection<AddedMethodsMatch> lostMatches = (Collection<AddedMethodsMatch>) addedMethodsDelta.matchLostEvents;

		// maintain markers
		removelLostAddedMethodsMarkers(lostMatches);
		addFoundAddedMethodsMarkers(foundMatches);

		// clear delta
		addedMethodsDelta.matchFoundEvents.clear();
		addedMethodsDelta.matchLostEvents.clear();
		addedMethodsDelta.clear();
	}

	private void maintainIncomingMethodCallsMarker() {
		// get found and lost events
		@SuppressWarnings("unchecked")
		Collection<IncomingMethodCallsMatch> foundMatches = (Collection<IncomingMethodCallsMatch>) incomingMethodCallsDelta.matchFoundEvents;
		@SuppressWarnings("unchecked")
		Collection<IncomingMethodCallsMatch> lostMatches = (Collection<IncomingMethodCallsMatch>) incomingMethodCallsDelta.matchLostEvents;

		removelLostIncomingMethodCallsMarkers(lostMatches);
		addFoundIncomingMethodCallsMarkers(foundMatches);

		// clear delta
		incomingMethodCallsDelta.matchFoundEvents.clear();
		incomingMethodCallsDelta.matchLostEvents.clear();
		incomingMethodCallsDelta.clear();
	}

	private void maintainIncomingMethodOverridesMarkers() {
		// get found and lost events
		@SuppressWarnings("unchecked")
		Collection<IncomingMethodOverrideMatch> foundMatches = (Collection<IncomingMethodOverrideMatch>) incomingMethodOverrideDelta.matchFoundEvents;
		@SuppressWarnings("unchecked")
		Collection<IncomingMethodOverrideMatch> lostMatches = (Collection<IncomingMethodOverrideMatch>) incomingMethodOverrideDelta.matchLostEvents;

		removelLostIncomingMethodOverridesMarkers(lostMatches);
		addFoundIncomingMethodOverrideMarkers(foundMatches);

		// clear delta
		incomingMethodOverrideDelta.matchFoundEvents.clear();
		incomingMethodOverrideDelta.matchLostEvents.clear();
		incomingMethodOverrideDelta.clear();
	}

	private void maintainIncomingClassUsageMarkers() {
		// get found and lost events
		@SuppressWarnings("unchecked")
		Collection<IncomingClassUsagesMatch> foundMatches = (Collection<IncomingClassUsagesMatch>) incomingClassUsageDelta.matchFoundEvents;
		@SuppressWarnings("unchecked")
		Collection<IncomingClassUsagesMatch> lostMatches = (Collection<IncomingClassUsagesMatch>) incomingClassUsageDelta.matchLostEvents;

		removelLostIncomingClassUsageMarkers(lostMatches);
		addFoundIncomingClassUsageMarkers(foundMatches);

		// clear delta
		incomingClassUsageDelta.matchFoundEvents.clear();
		incomingClassUsageDelta.matchLostEvents.clear();
		incomingClassUsageDelta.clear();

	}

	private void maintainIncominginherInheritanceMarkers() {
		// get found and lost events
		@SuppressWarnings("unchecked")
		Collection<IncomingInheritancesMatch> foundMatches = (Collection<IncomingInheritancesMatch>) incomingInheritanceDelta.matchFoundEvents;
		@SuppressWarnings("unchecked")
		Collection<IncomingInheritancesMatch> lostMatches = (Collection<IncomingInheritancesMatch>) incomingInheritanceDelta.matchLostEvents;

		removelLostIncomingInheritanceMarkers(lostMatches);
		addFoundIncomingInheritanceMarkers(foundMatches);

		// clear delta
		incomingInheritanceDelta.matchFoundEvents.clear();
		incomingInheritanceDelta.matchLostEvents.clear();
		incomingInheritanceDelta.clear();
	}

	private void maintainIncomingFieldAccessMarkers() {
		// get found and lost events
		@SuppressWarnings("unchecked")
		Collection<IncomingFieldAccessesMatch> foundMatches = (Collection<IncomingFieldAccessesMatch>) incomingFieldAccessDelta.matchFoundEvents;
		@SuppressWarnings("unchecked")
		Collection<IncomingFieldAccessesMatch> lostMatches = (Collection<IncomingFieldAccessesMatch>) incomingFieldAccessDelta.matchLostEvents;

		removelLostIncomingFieldAccessMarkers(lostMatches);
		addFoundIncomingFieldAccessMarkers(foundMatches);

		// clear delta
		incomingFieldAccessDelta.matchFoundEvents.clear();
		incomingFieldAccessDelta.matchLostEvents.clear();
		incomingFieldAccessDelta.clear();
	}

	private void removelLostIncomingMethodCallsMarkers(Collection<IncomingMethodCallsMatch> lostMatches) {
		for (IncomingMethodCallsMatch match : lostMatches) {
			IJavaElement item = JavaCore.create(match.getWsTarget().getHandler());
			mm.removeMarkerFromResource(MyMarkerFactory.MARKER_INCDEP_MCALL, item.getResource());
		}

	}

	private void addFoundIncomingMethodCallsMarkers(Collection<IncomingMethodCallsMatch> foundMatches) {
		for (IncomingMethodCallsMatch match : foundMatches) {
			IJavaElement item = JavaCore.create(match.getWsTarget().getHandler());
			Position pos = mapper.position(item);
			mm.addMarkerToJavaModelElement(MyMarkerFactory.MARKER_INCDEP_MCALL, item, pos, "Incoming method call: "
					+ match.getRepoSource().getName() + "()");
		}
	}

	private void removelLostAddedMethodsMarkers(Collection<AddedMethodsMatch> lostMatchs) {
		for (AddedMethodsMatch match : lostMatchs) {
			IJavaElement item = JavaCore.create(match.getWsMethod().getHandler());
			mm.removeMarkerFromResource(MyMarkerFactory.MARKER_ADDED_METHOD, item.getResource());
		}

	}

	private void addFoundAddedMethodsMarkers(Collection<AddedMethodsMatch> foundMatches) {
		for (AddedMethodsMatch match : foundMatches) {
			IJavaElement item = JavaCore.create(match.getWsMethod().getHandler());
			Position pos = mapper.position(item);
			mm.addMarkerToJavaModelElement(MyMarkerFactory.MARKER_ADDED_METHOD, item, pos, "This is a new method");
		}
	}

	private void removelLostIncomingMethodOverridesMarkers(Collection<IncomingMethodOverrideMatch> lostMatches) {
		for (IncomingMethodOverrideMatch match : lostMatches) {
			IJavaElement item = JavaCore.create(match.getWsTarget().getHandler());
			mm.removeMarkerFromResource(MyMarkerFactory.MARKER_INCDEP_MOVERR, item.getResource());
		}
	}

	private void addFoundIncomingMethodOverrideMarkers(Collection<IncomingMethodOverrideMatch> foundMatches) {
		for (IncomingMethodOverrideMatch match : foundMatches) {
			IJavaElement item = JavaCore.create(match.getWsTarget().getHandler());
			Position pos = mapper.position(item);
			mm.addMarkerToJavaModelElement(MyMarkerFactory.MARKER_INCDEP_MOVERR, item, pos,
					"Incoming method override: " + match.getRepoSource().getName());
		}
	}

	private void removelLostIncomingClassUsageMarkers(Collection<IncomingClassUsagesMatch> lostMatches) {
		for (IncomingClassUsagesMatch match : lostMatches) {
			IJavaElement item = JavaCore.create(match.getWsTarget().getHandler());
			mm.removeMarkerFromResource(MyMarkerFactory.MARKER_INCDEP_CLUSAGE, item.getResource());
		}
	}

	private void addFoundIncomingClassUsageMarkers(Collection<IncomingClassUsagesMatch> foundMatches) {
		for (IncomingClassUsagesMatch match : foundMatches) {
			IJavaElement item = JavaCore.create(match.getWsTarget().getHandler());
			Position pos = mapper.position(item);
			mm.addMarkerToJavaModelElement(MyMarkerFactory.MARKER_INCDEP_CLUSAGE, item, pos, "Incoming class usage: "
					+ match.getRepoSource().getName());
		}
	}

	private void removelLostIncomingInheritanceMarkers(Collection<IncomingInheritancesMatch> lostMatches) {
		for (IncomingInheritancesMatch match : lostMatches) {
			IJavaElement item = JavaCore.create(match.getWsTarget().getHandler());
			mm.removeMarkerFromResource(MyMarkerFactory.MARKER_INCDEP_INH, item.getResource());
		}
	}

	private void addFoundIncomingInheritanceMarkers(Collection<IncomingInheritancesMatch> foundMatches) {
		for (IncomingInheritancesMatch match : foundMatches) {
			IJavaElement item = JavaCore.create(match.getWsTarget().getHandler());
			Position pos = mapper.position(item);
			mm.addMarkerToJavaModelElement(MyMarkerFactory.MARKER_INCDEP_INH, item, pos, "Incoming inheritance: "
					+ match.getRepoSource().getName());
		}
	}

	private void removelLostIncomingFieldAccessMarkers(Collection<IncomingFieldAccessesMatch> lostMatches) {
		for (IncomingFieldAccessesMatch match : lostMatches) {
			IJavaElement item = JavaCore.create(match.getWsTarget().getHandler());
			mm.removeMarkerFromResource(MyMarkerFactory.MARKER_INCDEP_FACCESS, item.getResource());
		}
	}

	private void addFoundIncomingFieldAccessMarkers(Collection<IncomingFieldAccessesMatch> foundMatches) {
		for (IncomingFieldAccessesMatch match : foundMatches) {
			IJavaElement item = JavaCore.create(match.getWsTarget().getHandler());
			Position pos = mapper.position(item);
			mm.addMarkerToJavaModelElement(MyMarkerFactory.MARKER_INCDEP_FACCESS, item, pos, "Incoming field access: "
					+ match.getRepoSource().getName() + "()");
		}
	}

	@Override
	public void matchesChanged(Set<IncQueryMatcher<IPatternMatch>> matcher) {
		maintainAddedMethodsMarker();

		// incoming dependencies
		maintainIncomingMethodCallsMarker();
		maintainIncomingMethodOverridesMarkers();
		maintainIncomingClassUsageMarkers();
		maintainIncominginherInheritanceMarkers();
		maintainIncomingFieldAccessMarkers();
	}
}
