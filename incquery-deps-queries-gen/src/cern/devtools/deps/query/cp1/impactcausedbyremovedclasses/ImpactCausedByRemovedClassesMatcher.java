package cern.devtools.deps.query.cp1.impactcausedbyremovedclasses;

import cern.devtools.deps.query.cp1.impactcausedbyremovedclasses.ImpactCausedByRemovedClassesMatch;
import cern.devtools.deps.query.cp1.impactcausedbyremovedclasses.ImpactCausedByRemovedClassesMatcherFactory;
import hu.bme.incquery.deps.cp1model.CP1Class;
import hu.bme.incquery.deps.cp1model.CP1DependencyType;
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
 * pattern impactCausedByRemovedClasses(repoFrom : CP1Class, repoTo : CP1Class, type : CP1DependencyType) = {
 * 	// class usage.
 * 	find removedClasses(repoTo);
 * 	CP1Dependency.from(d, repoFrom);
 * 	CP1Dependency.to(d, repoTo);
 * 	CP1Dependency.type(d, ::CLASS_USAGE);
 * 	CP1Dependency.type(d, type);
 * } or {
 * 	// or inheritance
 * 	find removedClasses(repoTo);
 * 	CP1Dependency.from(d, repoFrom);
 * 	CP1Dependency.to(d, repoTo);
 * 	CP1Dependency.type(d, ::INHERITANCE);
 * 	CP1Dependency.type(d, type);
 * }
 * 
 * @see ImpactCausedByRemovedClassesMatch
 * @see ImpactCausedByRemovedClassesMatcherFactory
 * @see ImpactCausedByRemovedClassesProcessor
 * 
 */
public class ImpactCausedByRemovedClassesMatcher extends BaseGeneratedMatcher<ImpactCausedByRemovedClassesMatch> implements IncQueryMatcher<ImpactCausedByRemovedClassesMatch> {
  private final static int POSITION_REPOFROM = 0;
  
  private final static int POSITION_REPOTO = 1;
  
  private final static int POSITION_TYPE = 2;
  
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
   * @param pRepoFrom the fixed value of pattern parameter repoFrom, or null if not bound.
   * @param pRepoTo the fixed value of pattern parameter repoTo, or null if not bound.
   * @param pType the fixed value of pattern parameter type, or null if not bound.
   * @return matches represented as a ImpactCausedByRemovedClassesMatch object.
   * 
   */
  public Collection<ImpactCausedByRemovedClassesMatch> getAllMatches(final CP1Class pRepoFrom, final CP1Class pRepoTo, final CP1DependencyType pType) {
    return rawGetAllMatches(new Object[]{pRepoFrom, pRepoTo, pType});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRepoFrom the fixed value of pattern parameter repoFrom, or null if not bound.
   * @param pRepoTo the fixed value of pattern parameter repoTo, or null if not bound.
   * @param pType the fixed value of pattern parameter type, or null if not bound.
   * @return a match represented as a ImpactCausedByRemovedClassesMatch object, or null if no match is found.
   * 
   */
  public ImpactCausedByRemovedClassesMatch getOneArbitraryMatch(final CP1Class pRepoFrom, final CP1Class pRepoTo, final CP1DependencyType pType) {
    return rawGetOneArbitraryMatch(new Object[]{pRepoFrom, pRepoTo, pType});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRepoFrom the fixed value of pattern parameter repoFrom, or null if not bound.
   * @param pRepoTo the fixed value of pattern parameter repoTo, or null if not bound.
   * @param pType the fixed value of pattern parameter type, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final CP1Class pRepoFrom, final CP1Class pRepoTo, final CP1DependencyType pType) {
    return rawHasMatch(new Object[]{pRepoFrom, pRepoTo, pType});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRepoFrom the fixed value of pattern parameter repoFrom, or null if not bound.
   * @param pRepoTo the fixed value of pattern parameter repoTo, or null if not bound.
   * @param pType the fixed value of pattern parameter type, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final CP1Class pRepoFrom, final CP1Class pRepoTo, final CP1DependencyType pType) {
    return rawCountMatches(new Object[]{pRepoFrom, pRepoTo, pType});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRepoFrom the fixed value of pattern parameter repoFrom, or null if not bound.
   * @param pRepoTo the fixed value of pattern parameter repoTo, or null if not bound.
   * @param pType the fixed value of pattern parameter type, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final CP1Class pRepoFrom, final CP1Class pRepoTo, final CP1DependencyType pType, final IMatchProcessor<? super ImpactCausedByRemovedClassesMatch> processor) {
    rawForEachMatch(new Object[]{pRepoFrom, pRepoTo, pType}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRepoFrom the fixed value of pattern parameter repoFrom, or null if not bound.
   * @param pRepoTo the fixed value of pattern parameter repoTo, or null if not bound.
   * @param pType the fixed value of pattern parameter type, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final CP1Class pRepoFrom, final CP1Class pRepoTo, final CP1DependencyType pType, final IMatchProcessor<? super ImpactCausedByRemovedClassesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRepoFrom, pRepoTo, pType}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pRepoFrom the fixed value of pattern parameter repoFrom, or null if not bound.
   * @param pRepoTo the fixed value of pattern parameter repoTo, or null if not bound.
   * @param pType the fixed value of pattern parameter type, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<ImpactCausedByRemovedClassesMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final CP1Class pRepoFrom, final CP1Class pRepoTo, final CP1DependencyType pType) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pRepoFrom, pRepoTo, pType});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pRepoFrom the fixed value of pattern parameter repoFrom, or null if not bound.
   * @param pRepoTo the fixed value of pattern parameter repoTo, or null if not bound.
   * @param pType the fixed value of pattern parameter type, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ImpactCausedByRemovedClassesMatch newMatch(final CP1Class pRepoFrom, final CP1Class pRepoTo, final CP1DependencyType pType) {
    return new ImpactCausedByRemovedClassesMatch(pRepoFrom, pRepoTo, pType);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoFrom.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Class> rawAccumulateAllValuesOfrepoFrom(final Object[] parameters) {
    Set<CP1Class> results = new HashSet<CP1Class>();
    rawAccumulateAllValues(POSITION_REPOFROM, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoFrom.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Class> getAllValuesOfrepoFrom() {
    return rawAccumulateAllValuesOfrepoFrom(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoFrom.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Class> getAllValuesOfrepoFrom(final ImpactCausedByRemovedClassesMatch partialMatch) {
    return rawAccumulateAllValuesOfrepoFrom(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoFrom.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Class> getAllValuesOfrepoFrom(final CP1Class pRepoTo, final CP1DependencyType pType) {
    CP1Class pRepoFrom = null;
    return rawAccumulateAllValuesOfrepoFrom(new Object[]{pRepoFrom, pRepoTo, pType});
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoTo.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Class> rawAccumulateAllValuesOfrepoTo(final Object[] parameters) {
    Set<CP1Class> results = new HashSet<CP1Class>();
    rawAccumulateAllValues(POSITION_REPOTO, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoTo.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Class> getAllValuesOfrepoTo() {
    return rawAccumulateAllValuesOfrepoTo(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoTo.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Class> getAllValuesOfrepoTo(final ImpactCausedByRemovedClassesMatch partialMatch) {
    return rawAccumulateAllValuesOfrepoTo(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoTo.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Class> getAllValuesOfrepoTo(final CP1Class pRepoFrom, final CP1DependencyType pType) {
    CP1Class pRepoTo = null;
    return rawAccumulateAllValuesOfrepoTo(new Object[]{pRepoFrom, pRepoTo, pType});
  }
  
  /**
   * Retrieve the set of values that occur in matches for type.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1DependencyType> rawAccumulateAllValuesOftype(final Object[] parameters) {
    Set<CP1DependencyType> results = new HashSet<CP1DependencyType>();
    rawAccumulateAllValues(POSITION_TYPE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for type.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1DependencyType> getAllValuesOftype() {
    return rawAccumulateAllValuesOftype(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for type.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1DependencyType> getAllValuesOftype(final ImpactCausedByRemovedClassesMatch partialMatch) {
    return rawAccumulateAllValuesOftype(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for type.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1DependencyType> getAllValuesOftype(final CP1Class pRepoFrom, final CP1Class pRepoTo) {
    CP1DependencyType pType = null;
    return rawAccumulateAllValuesOftype(new Object[]{pRepoFrom, pRepoTo, pType});
  }
  
  @Override
  public ImpactCausedByRemovedClassesMatch tupleToMatch(final Tuple t) {
    try {
    	return new ImpactCausedByRemovedClassesMatch((hu.bme.incquery.deps.cp1model.CP1Class) t.get(POSITION_REPOFROM), (hu.bme.incquery.deps.cp1model.CP1Class) t.get(POSITION_REPOTO), (hu.bme.incquery.deps.cp1model.CP1DependencyType) t.get(POSITION_TYPE));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public ImpactCausedByRemovedClassesMatch arrayToMatch(final Object[] match) {
    try {
    	return new ImpactCausedByRemovedClassesMatch((hu.bme.incquery.deps.cp1model.CP1Class) match[POSITION_REPOFROM], (hu.bme.incquery.deps.cp1model.CP1Class) match[POSITION_REPOTO], (hu.bme.incquery.deps.cp1model.CP1DependencyType) match[POSITION_TYPE]);
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
