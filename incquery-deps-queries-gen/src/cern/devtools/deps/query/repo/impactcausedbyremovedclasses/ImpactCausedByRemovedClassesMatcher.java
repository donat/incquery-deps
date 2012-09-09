package cern.devtools.deps.query.repo.impactcausedbyremovedclasses;

import cern.devtools.deps.query.repo.impactcausedbyremovedclasses.ImpactCausedByRemovedClassesMatch;
import cern.devtools.deps.query.repo.impactcausedbyremovedclasses.ImpactCausedByRemovedClassesMatcherFactory;
import hu.bme.incquery.deps.repomodel.RClass;
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
 * Generated pattern matcher API of the impactCausedByRemovedClasses pattern, 
 * providing pattern-specific query methods.
 * 
 * 
 * 
 * pattern impactCausedByRemovedClasses(from : RClass, to : RClass) = {
 * 	// class usage.
 * 	find removedClasses(to);
 * 	RDependency.rFrom(d, from);
 * 	RDependency.rTo(d, to);
 * 	RDependency.depType(d, 4);
 * } 
 * or {
 * 	// or inheritance
 * 	find removedClasses(to);
 * 	RDependency.rFrom(d, from);
 * 	RDependency.rTo(d, to);
 * 	RDependency.depType(d, 5);
 * }
 * 
 * @see ImpactCausedByRemovedClassesMatch
 * @see ImpactCausedByRemovedClassesMatcherFactory
 * @see ImpactCausedByRemovedClassesProcessor
 * 
 */
public class ImpactCausedByRemovedClassesMatcher extends BaseGeneratedMatcher<ImpactCausedByRemovedClassesMatch> implements IncQueryMatcher<ImpactCausedByRemovedClassesMatch> {
  private final static int POSITION_FROM = 0;
  
  private final static int POSITION_TO = 1;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public ImpactCausedByRemovedClassesMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public ImpactCausedByRemovedClassesMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pFrom the fixed value of pattern parameter from, or null if not bound.
   * @param pTo the fixed value of pattern parameter to, or null if not bound.
   * @return matches represented as a ImpactCausedByRemovedClassesMatch object.
   * 
   */
  public Collection<ImpactCausedByRemovedClassesMatch> getAllMatches(final RClass pFrom, final RClass pTo) {
    return rawGetAllMatches(new Object[]{pFrom, pTo});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pFrom the fixed value of pattern parameter from, or null if not bound.
   * @param pTo the fixed value of pattern parameter to, or null if not bound.
   * @return a match represented as a ImpactCausedByRemovedClassesMatch object, or null if no match is found.
   * 
   */
  public ImpactCausedByRemovedClassesMatch getOneArbitraryMatch(final RClass pFrom, final RClass pTo) {
    return rawGetOneArbitraryMatch(new Object[]{pFrom, pTo});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pFrom the fixed value of pattern parameter from, or null if not bound.
   * @param pTo the fixed value of pattern parameter to, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final RClass pFrom, final RClass pTo) {
    return rawHasMatch(new Object[]{pFrom, pTo});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pFrom the fixed value of pattern parameter from, or null if not bound.
   * @param pTo the fixed value of pattern parameter to, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final RClass pFrom, final RClass pTo) {
    return rawCountMatches(new Object[]{pFrom, pTo});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pFrom the fixed value of pattern parameter from, or null if not bound.
   * @param pTo the fixed value of pattern parameter to, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final RClass pFrom, final RClass pTo, final IMatchProcessor<? super ImpactCausedByRemovedClassesMatch> processor) {
    rawForEachMatch(new Object[]{pFrom, pTo}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pFrom the fixed value of pattern parameter from, or null if not bound.
   * @param pTo the fixed value of pattern parameter to, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final RClass pFrom, final RClass pTo, final IMatchProcessor<? super ImpactCausedByRemovedClassesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pFrom, pTo}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pFrom the fixed value of pattern parameter from, or null if not bound.
   * @param pTo the fixed value of pattern parameter to, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<ImpactCausedByRemovedClassesMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final RClass pFrom, final RClass pTo) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pFrom, pTo});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pFrom the fixed value of pattern parameter from, or null if not bound.
   * @param pTo the fixed value of pattern parameter to, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ImpactCausedByRemovedClassesMatch newMatch(final RClass pFrom, final RClass pTo) {
    return new ImpactCausedByRemovedClassesMatch(pFrom, pTo);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for from.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RClass> rawAccumulateAllValuesOffrom(final Object[] parameters) {
    Set<RClass> results = new HashSet<RClass>();
    rawAccumulateAllValues(POSITION_FROM, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for from.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RClass> getAllValuesOffrom() {
    return rawAccumulateAllValuesOffrom(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for from.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RClass> getAllValuesOffrom(final ImpactCausedByRemovedClassesMatch partialMatch) {
    return rawAccumulateAllValuesOffrom(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for from.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RClass> getAllValuesOffrom(final RClass pTo) {
    RClass pFrom = null;
    return rawAccumulateAllValuesOffrom(new Object[]{pFrom, pTo});
  }
  
  /**
   * Retrieve the set of values that occur in matches for to.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RClass> rawAccumulateAllValuesOfto(final Object[] parameters) {
    Set<RClass> results = new HashSet<RClass>();
    rawAccumulateAllValues(POSITION_TO, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for to.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RClass> getAllValuesOfto() {
    return rawAccumulateAllValuesOfto(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for to.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RClass> getAllValuesOfto(final ImpactCausedByRemovedClassesMatch partialMatch) {
    return rawAccumulateAllValuesOfto(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for to.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RClass> getAllValuesOfto(final RClass pFrom) {
    RClass pTo = null;
    return rawAccumulateAllValuesOfto(new Object[]{pFrom, pTo});
  }
  
  @Override
  public ImpactCausedByRemovedClassesMatch tupleToMatch(final Tuple t) {
    try {
    	return new ImpactCausedByRemovedClassesMatch((hu.bme.incquery.deps.repomodel.RClass) t.get(POSITION_FROM), (hu.bme.incquery.deps.repomodel.RClass) t.get(POSITION_TO));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public ImpactCausedByRemovedClassesMatch arrayToMatch(final Object[] match) {
    try {
    	return new ImpactCausedByRemovedClassesMatch((hu.bme.incquery.deps.repomodel.RClass) match[POSITION_FROM], (hu.bme.incquery.deps.repomodel.RClass) match[POSITION_TO]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<ImpactCausedByRemovedClassesMatcher> factory() throws IncQueryException {
    return ImpactCausedByRemovedClassesMatcherFactory.instance();
  }
}
