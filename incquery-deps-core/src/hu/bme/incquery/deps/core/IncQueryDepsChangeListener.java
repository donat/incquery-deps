package hu.bme.incquery.deps.core;

import java.util.Set;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;

public interface IncQueryDepsChangeListener {
	public void matchesChanged(Set<IncQueryMatcher<?>> matchers);
}
