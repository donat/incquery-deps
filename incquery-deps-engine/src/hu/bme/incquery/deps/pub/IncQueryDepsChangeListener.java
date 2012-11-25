package hu.bme.incquery.deps.pub;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;

public interface IncQueryDepsChangeListener {
	public void matchesChanged(IncQueryMatcher matcher);
}
