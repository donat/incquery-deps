package cern.devtools.deps.query.cp1.impactcausedbyremovedfields;

import cern.devtools.deps.query.cp1.impactcausedbyremovedfields.ImpactCausedByRemovedFieldsMatch;
import cern.devtools.deps.query.cp1.impactcausedbyremovedfields.ImpactCausedByRemovedFieldsMatcherFactory;
import hu.bme.incquery.deps.cp1model.CP1DependencyType;
import hu.bme.incquery.deps.cp1model.CP1Field;
import hu.bme.incquery.deps.cp1model.CP1Method;
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
 * Generated pattern matcher API of the impactCausedByRemovedFields pattern, 
 * providing pattern-specific query methods.
 * 
 * 
 * 
 * // ----------------------------------------------------------------------------
 * // 4) Impact analysis
 * // ----------------------------------------------------------------------------
 * 
 *  
 * pattern impactCausedByRemovedFields(repoFrom : CP1Method, repoTo : CP1Field, type : CP1DependencyType) = {
 * 	find removedFields(repoTo);
 * 	CP1Dependency.from(d, repoFrom);
 * 	CP1Dependency.to(d, repoTo);
 * 	CP1Dependency.type(d, ::FIELD_REFERENCE);
 * 	CP1Dependency.type(d, type);
 * }
 * 
 * @see ImpactCausedByRemovedFieldsMatch
 * @see ImpactCausedByRemovedFieldsMatcherFactory
 * @see ImpactCausedByRemovedFieldsProcessor
 * 
 */
public class ImpactCausedByRemovedFieldsMatcher extends BaseGeneratedMatcher<ImpactCausedByRemovedFieldsMatch> implements IncQueryMatcher<ImpactCausedByRemovedFieldsMatch> {
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
  public ImpactCausedByRemovedFieldsMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public ImpactCausedByRemovedFieldsMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRepoFrom the fixed value of pattern parameter repoFrom, or null if not bound.
   * @param pRepoTo the fixed value of pattern parameter repoTo, or null if not bound.
   * @param pType the fixed value of pattern parameter type, or null if not bound.
   * @return matches represented as a ImpactCausedByRemovedFieldsMatch object.
   * 
   */
  public Collection<ImpactCausedByRemovedFieldsMatch> getAllMatches(final CP1Method pRepoFrom, final CP1Field pRepoTo, final CP1DependencyType pType) {
    return rawGetAllMatches(new Object[]{pRepoFrom, pRepoTo, pType});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRepoFrom the fixed value of pattern parameter repoFrom, or null if not bound.
   * @param pRepoTo the fixed value of pattern parameter repoTo, or null if not bound.
   * @param pType the fixed value of pattern parameter type, or null if not bound.
   * @return a match represented as a ImpactCausedByRemovedFieldsMatch object, or null if no match is found.
   * 
   */
  public ImpactCausedByRemovedFieldsMatch getOneArbitraryMatch(final CP1Method pRepoFrom, final CP1Field pRepoTo, final CP1DependencyType pType) {
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
  public boolean hasMatch(final CP1Method pRepoFrom, final CP1Field pRepoTo, final CP1DependencyType pType) {
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
  public int countMatches(final CP1Method pRepoFrom, final CP1Field pRepoTo, final CP1DependencyType pType) {
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
  public void forEachMatch(final CP1Method pRepoFrom, final CP1Field pRepoTo, final CP1DependencyType pType, final IMatchProcessor<? super ImpactCausedByRemovedFieldsMatch> processor) {
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
  public boolean forOneArbitraryMatch(final CP1Method pRepoFrom, final CP1Field pRepoTo, final CP1DependencyType pType, final IMatchProcessor<? super ImpactCausedByRemovedFieldsMatch> processor) {
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
  public DeltaMonitor<ImpactCausedByRemovedFieldsMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final CP1Method pRepoFrom, final CP1Field pRepoTo, final CP1DependencyType pType) {
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
  public ImpactCausedByRemovedFieldsMatch newMatch(final CP1Method pRepoFrom, final CP1Field pRepoTo, final CP1DependencyType pType) {
    return new ImpactCausedByRemovedFieldsMatch(pRepoFrom, pRepoTo, pType);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoFrom.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Method> rawAccumulateAllValuesOfrepoFrom(final Object[] parameters) {
    Set<CP1Method> results = new HashSet<CP1Method>();
    rawAccumulateAllValues(POSITION_REPOFROM, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoFrom.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Method> getAllValuesOfrepoFrom() {
    return rawAccumulateAllValuesOfrepoFrom(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoFrom.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Method> getAllValuesOfrepoFrom(final ImpactCausedByRemovedFieldsMatch partialMatch) {
    return rawAccumulateAllValuesOfrepoFrom(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoFrom.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Method> getAllValuesOfrepoFrom(final CP1Field pRepoTo, final CP1DependencyType pType) {
    CP1Method pRepoFrom = null;
    return rawAccumulateAllValuesOfrepoFrom(new Object[]{pRepoFrom, pRepoTo, pType});
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoTo.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Field> rawAccumulateAllValuesOfrepoTo(final Object[] parameters) {
    Set<CP1Field> results = new HashSet<CP1Field>();
    rawAccumulateAllValues(POSITION_REPOTO, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoTo.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Field> getAllValuesOfrepoTo() {
    return rawAccumulateAllValuesOfrepoTo(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoTo.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Field> getAllValuesOfrepoTo(final ImpactCausedByRemovedFieldsMatch partialMatch) {
    return rawAccumulateAllValuesOfrepoTo(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoTo.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Field> getAllValuesOfrepoTo(final CP1Method pRepoFrom, final CP1DependencyType pType) {
    CP1Field pRepoTo = null;
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
  public Set<CP1DependencyType> getAllValuesOftype(final ImpactCausedByRemovedFieldsMatch partialMatch) {
    return rawAccumulateAllValuesOftype(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for type.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1DependencyType> getAllValuesOftype(final CP1Method pRepoFrom, final CP1Field pRepoTo) {
    CP1DependencyType pType = null;
    return rawAccumulateAllValuesOftype(new Object[]{pRepoFrom, pRepoTo, pType});
  }
  
  @Override
  public ImpactCausedByRemovedFieldsMatch tupleToMatch(final Tuple t) {
    try {
    	return new ImpactCausedByRemovedFieldsMatch((hu.bme.incquery.deps.cp1model.CP1Method) t.get(POSITION_REPOFROM), (hu.bme.incquery.deps.cp1model.CP1Field) t.get(POSITION_REPOTO), (hu.bme.incquery.deps.cp1model.CP1DependencyType) t.get(POSITION_TYPE));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public ImpactCausedByRemovedFieldsMatch arrayToMatch(final Object[] match) {
    try {
    	return new ImpactCausedByRemovedFieldsMatch((hu.bme.incquery.deps.cp1model.CP1Method) match[POSITION_REPOFROM], (hu.bme.incquery.deps.cp1model.CP1Field) match[POSITION_REPOTO], (hu.bme.incquery.deps.cp1model.CP1DependencyType) match[POSITION_TYPE]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<ImpactCausedByRemovedFieldsMatcher> factory() throws IncQueryException {
    return ImpactCausedByRemovedFieldsMatcherFactory.instance();
  }
}
