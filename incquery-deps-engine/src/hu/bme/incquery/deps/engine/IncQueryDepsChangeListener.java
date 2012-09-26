package hu.bme.incquery.deps.engine;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;

public interface IncQueryDepsChangeListener {
	public void matchesChanged(IncQueryMatcher matcher);
}
