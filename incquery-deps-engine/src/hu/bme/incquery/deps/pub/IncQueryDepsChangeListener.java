package hu.bme.incquery.deps.pub;

import java.util.Set;

import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;

public interface IncQueryDepsChangeListener {
	void init(Set<IncQueryMatcher<IPatternMatch>> matchers);
	public void matchesChanged(Set<IncQueryMatcher<IPatternMatch>> matcher);
}
