package cern.devtools.deps.query.repo.removedmethod;

import cern.devtools.deps.query.repo.removedmethod.RemovedMethodMatch;
import cern.devtools.deps.query.repo.removedmethod.RemovedMethodMatcherFactory;
import hu.bme.incquery.deps.repomodel.RMethod;
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
 * Generated pattern matcher API of the removedMethod pattern, 
 * providing pattern-specific query methods.
 * 
 * 
 * 
 * pattern removedMethod(m : RMethod) = {
 * 	RMethod.signature(m, signature);
 * 	RProject.rClasses.rMethods(rp, m);
 * 
 * 	find joinProject(rp, wp);
 * 	neg find workspaceMethodSignatures(wp, signature);
 * 
 * 	check(! signature.contains(\"<clinit>\"));
 * }
 * 
 * @see RemovedMethodMatch
 * @see RemovedMethodMatcherFactory
 * @see RemovedMethodProcessor
 * 
 */
public class RemovedMethodMatcher extends BaseGeneratedMatcher<RemovedMethodMatch> implements IncQueryMatcher<RemovedMethodMatch> {
  private final static int POSITION_M = 0;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public RemovedMethodMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public RemovedMethodMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @return matches represented as a RemovedMethodMatch object.
   * 
   */
  public Collection<RemovedMethodMatch> getAllMatches(final RMethod pM) {
    return rawGetAllMatches(new Object[]{pM});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @return a match represented as a RemovedMethodMatch object, or null if no match is found.
   * 
   */
  public RemovedMethodMatch getOneArbitraryMatch(final RMethod pM) {
    return rawGetOneArbitraryMatch(new Object[]{pM});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final RMethod pM) {
    return rawHasMatch(new Object[]{pM});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final RMethod pM) {
    return rawCountMatches(new Object[]{pM});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final RMethod pM, final IMatchProcessor<? super RemovedMethodMatch> processor) {
    rawForEachMatch(new Object[]{pM}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final RMethod pM, final IMatchProcessor<? super RemovedMethodMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pM}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<RemovedMethodMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final RMethod pM) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pM});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public RemovedMethodMatch newMatch(final RMethod pM) {
    return new RemovedMethodMatch(pM);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for m.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RMethod> rawAccumulateAllValuesOfm(final Object[] parameters) {
    Set<RMethod> results = new HashSet<RMethod>();
    rawAccumulateAllValues(POSITION_M, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for m.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RMethod> getAllValuesOfm() {
    return rawAccumulateAllValuesOfm(emptyArray());
  }
  
  @Override
  public RemovedMethodMatch tupleToMatch(final Tuple t) {
    try {
    	return new RemovedMethodMatch((hu.bme.incquery.deps.repomodel.RMethod) t.get(POSITION_M));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public RemovedMethodMatch arrayToMatch(final Object[] match) {
    try {
    	return new RemovedMethodMatch((hu.bme.incquery.deps.repomodel.RMethod) match[POSITION_M]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<RemovedMethodMatcher> factory() throws IncQueryException {
    return RemovedMethodMatcherFactory.instance();
  }
}
