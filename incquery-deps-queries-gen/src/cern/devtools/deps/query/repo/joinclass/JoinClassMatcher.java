package cern.devtools.deps.query.repo.joinclass;

import cern.devtools.deps.query.repo.joinclass.JoinClassMatch;
import cern.devtools.deps.query.repo.joinclass.JoinClassMatcherFactory;
import hu.bme.incquery.deps.repomodel.RClass;
import hu.bme.incquery.deps.wsmodel.WType;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra2.emf.incquery.runtime.api.EngineManager;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;

/**
 * Generated pattern matcher API of the joinClass pattern, 
 * providing pattern-specific query methods.
 * 
 * 
 * 
 * pattern joinClass(rc : RClass, wc : WType) = {
 * // Join project.
 * 	RProject.rClasses(rp, rc);
 * 	WProject.packageFragmentRoots.packageFragments.compilationUnits.types(wp, wc);
 * 	find joinProject(rp, wp);
 * 
 * 	// Join class name.
 * 	RClass.simpleName(rc, simplename);
 * 	WType.name(wc, simplename);
 * 
 * 	// Join class' package name.
 * 	RClass.packageName(rc, packagename);
 * 	WPackageFragment.compilationUnits.types(wpfg, wc);
 * 	WPackageFragment.name(wpfg, packagename);
 * }
 * 
 * @see JoinClassMatch
 * @see JoinClassMatcherFactory
 * @see JoinClassProcessor
 * 
 */
public class JoinClassMatcher extends BaseGeneratedMatcher<JoinClassMatch> implements IncQueryMatcher<JoinClassMatch> {
  private final static int POSITION_RC = 0;
  
  private final static int POSITION_WC = 1;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public JoinClassMatcher(final Notifier emfRoot) throws IncQueryException {
    this(EngineManager.getInstance().getIncQueryEngine(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a lightweight reference is created.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public JoinClassMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRc the fixed value of pattern parameter rc, or null if not bound.
   * @param pWc the fixed value of pattern parameter wc, or null if not bound.
   * @return matches represented as a JoinClassMatch object.
   * 
   */
  public Collection<JoinClassMatch> getAllMatches(final RClass pRc, final WType pWc) {
    return rawGetAllMatches(new Object[]{pRc, pWc});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRc the fixed value of pattern parameter rc, or null if not bound.
   * @param pWc the fixed value of pattern parameter wc, or null if not bound.
   * @return a match represented as a JoinClassMatch object, or null if no match is found.
   * 
   */
  public JoinClassMatch getOneArbitraryMatch(final RClass pRc, final WType pWc) {
    return rawGetOneArbitraryMatch(new Object[]{pRc, pWc});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRc the fixed value of pattern parameter rc, or null if not bound.
   * @param pWc the fixed value of pattern parameter wc, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final RClass pRc, final WType pWc) {
    return rawHasMatch(new Object[]{pRc, pWc});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRc the fixed value of pattern parameter rc, or null if not bound.
   * @param pWc the fixed value of pattern parameter wc, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final RClass pRc, final WType pWc) {
    return rawCountMatches(new Object[]{pRc, pWc});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRc the fixed value of pattern parameter rc, or null if not bound.
   * @param pWc the fixed value of pattern parameter wc, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final RClass pRc, final WType pWc, final IMatchProcessor<? super JoinClassMatch> processor) {
    rawForEachMatch(new Object[]{pRc, pWc}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRc the fixed value of pattern parameter rc, or null if not bound.
   * @param pWc the fixed value of pattern parameter wc, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final RClass pRc, final WType pWc, final IMatchProcessor<? super JoinClassMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRc, pWc}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pRc the fixed value of pattern parameter rc, or null if not bound.
   * @param pWc the fixed value of pattern parameter wc, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<JoinClassMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final RClass pRc, final WType pWc) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pRc, pWc});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pRc the fixed value of pattern parameter rc, or null if not bound.
   * @param pWc the fixed value of pattern parameter wc, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public JoinClassMatch newMatch(final RClass pRc, final WType pWc) {
    return new JoinClassMatch(pRc, pWc);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for rc.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RClass> rawAccumulateAllValuesOfrc(final Object[] parameters) {
    Set<RClass> results = new HashSet<RClass>();
    rawAccumulateAllValues(POSITION_RC, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for rc.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RClass> getAllValuesOfrc() {
    return rawAccumulateAllValuesOfrc(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for rc.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RClass> getAllValuesOfrc(final JoinClassMatch partialMatch) {
    return rawAccumulateAllValuesOfrc(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for rc.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RClass> getAllValuesOfrc(final WType pWc) {
    RClass pRc = null;
    return rawAccumulateAllValuesOfrc(new Object[]{pRc, pWc});
  }
  
  /**
   * Retrieve the set of values that occur in matches for wc.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WType> rawAccumulateAllValuesOfwc(final Object[] parameters) {
    Set<WType> results = new HashSet<WType>();
    rawAccumulateAllValues(POSITION_WC, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for wc.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WType> getAllValuesOfwc() {
    return rawAccumulateAllValuesOfwc(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for wc.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WType> getAllValuesOfwc(final JoinClassMatch partialMatch) {
    return rawAccumulateAllValuesOfwc(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for wc.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WType> getAllValuesOfwc(final RClass pRc) {
    WType pWc = null;
    return rawAccumulateAllValuesOfwc(new Object[]{pRc, pWc});
  }
  
  @Override
  public JoinClassMatch tupleToMatch(final Tuple t) {
    try {
    	return new JoinClassMatch((hu.bme.incquery.deps.repomodel.RClass) t.get(POSITION_RC), (hu.bme.incquery.deps.wsmodel.WType) t.get(POSITION_WC));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public JoinClassMatch arrayToMatch(final Object[] match) {
    try {
    	return new JoinClassMatch((hu.bme.incquery.deps.repomodel.RClass) match[POSITION_RC], (hu.bme.incquery.deps.wsmodel.WType) match[POSITION_WC]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<JoinClassMatcher> factory() throws IncQueryException {
    return JoinClassMatcherFactory.instance();
  }
}
