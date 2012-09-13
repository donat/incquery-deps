package cern.devtools.deps.query.cp1.incomingfieldaccesses;

import cern.devtools.deps.query.cp1.incomingfieldaccesses.IncomingFieldAccessesMatch;
import cern.devtools.deps.query.cp1.incomingfieldaccesses.IncomingFieldAccessesMatcherFactory;
import hu.bme.incquery.deps.cp1model.CP1Method;
import hu.bme.incquery.deps.wsmodel.WField;
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
 * Generated pattern matcher API of the incomingFieldAccesses pattern, 
 * providing pattern-specific query methods.
 * 
 * 
 * 
 *  
 * pattern incomingFieldAccesses(repoSource : CP1Method, wsTarget : WField) = {
 * // Join the fields.
 * 	find fieldsWithSameSignatureAndSameProject(repoTarget, wsTarget);
 * 
 * 	// Join on dependencies.
 * 	CP1Dependency(dependency);
 * 	CP1Dependency.from(dependency, repoSource);
 * 	CP1Dependency.to(dependency, repoTarget);
 * 
 * 	// Select only the classes usage dependencies.
 * 	CP1Dependency.type(dependency, CP1DependencyType::FIELD_REFERENCE);
 * }
 * 
 * @see IncomingFieldAccessesMatch
 * @see IncomingFieldAccessesMatcherFactory
 * @see IncomingFieldAccessesProcessor
 * 
 */
public class IncomingFieldAccessesMatcher extends BaseGeneratedMatcher<IncomingFieldAccessesMatch> implements IncQueryMatcher<IncomingFieldAccessesMatch> {
  private final static int POSITION_REPOSOURCE = 0;
  
  private final static int POSITION_WSTARGET = 1;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public IncomingFieldAccessesMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public IncomingFieldAccessesMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRepoSource the fixed value of pattern parameter repoSource, or null if not bound.
   * @param pWsTarget the fixed value of pattern parameter wsTarget, or null if not bound.
   * @return matches represented as a IncomingFieldAccessesMatch object.
   * 
   */
  public Collection<IncomingFieldAccessesMatch> getAllMatches(final CP1Method pRepoSource, final WField pWsTarget) {
    return rawGetAllMatches(new Object[]{pRepoSource, pWsTarget});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRepoSource the fixed value of pattern parameter repoSource, or null if not bound.
   * @param pWsTarget the fixed value of pattern parameter wsTarget, or null if not bound.
   * @return a match represented as a IncomingFieldAccessesMatch object, or null if no match is found.
   * 
   */
  public IncomingFieldAccessesMatch getOneArbitraryMatch(final CP1Method pRepoSource, final WField pWsTarget) {
    return rawGetOneArbitraryMatch(new Object[]{pRepoSource, pWsTarget});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRepoSource the fixed value of pattern parameter repoSource, or null if not bound.
   * @param pWsTarget the fixed value of pattern parameter wsTarget, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final CP1Method pRepoSource, final WField pWsTarget) {
    return rawHasMatch(new Object[]{pRepoSource, pWsTarget});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRepoSource the fixed value of pattern parameter repoSource, or null if not bound.
   * @param pWsTarget the fixed value of pattern parameter wsTarget, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final CP1Method pRepoSource, final WField pWsTarget) {
    return rawCountMatches(new Object[]{pRepoSource, pWsTarget});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRepoSource the fixed value of pattern parameter repoSource, or null if not bound.
   * @param pWsTarget the fixed value of pattern parameter wsTarget, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final CP1Method pRepoSource, final WField pWsTarget, final IMatchProcessor<? super IncomingFieldAccessesMatch> processor) {
    rawForEachMatch(new Object[]{pRepoSource, pWsTarget}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRepoSource the fixed value of pattern parameter repoSource, or null if not bound.
   * @param pWsTarget the fixed value of pattern parameter wsTarget, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final CP1Method pRepoSource, final WField pWsTarget, final IMatchProcessor<? super IncomingFieldAccessesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRepoSource, pWsTarget}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pRepoSource the fixed value of pattern parameter repoSource, or null if not bound.
   * @param pWsTarget the fixed value of pattern parameter wsTarget, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<IncomingFieldAccessesMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final CP1Method pRepoSource, final WField pWsTarget) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pRepoSource, pWsTarget});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pRepoSource the fixed value of pattern parameter repoSource, or null if not bound.
   * @param pWsTarget the fixed value of pattern parameter wsTarget, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public IncomingFieldAccessesMatch newMatch(final CP1Method pRepoSource, final WField pWsTarget) {
    return new IncomingFieldAccessesMatch(pRepoSource, pWsTarget);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoSource.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Method> rawAccumulateAllValuesOfrepoSource(final Object[] parameters) {
    Set<CP1Method> results = new HashSet<CP1Method>();
    rawAccumulateAllValues(POSITION_REPOSOURCE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoSource.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Method> getAllValuesOfrepoSource() {
    return rawAccumulateAllValuesOfrepoSource(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoSource.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Method> getAllValuesOfrepoSource(final IncomingFieldAccessesMatch partialMatch) {
    return rawAccumulateAllValuesOfrepoSource(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoSource.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Method> getAllValuesOfrepoSource(final WField pWsTarget) {
    CP1Method pRepoSource = null;
    return rawAccumulateAllValuesOfrepoSource(new Object[]{pRepoSource, pWsTarget});
  }
  
  /**
   * Retrieve the set of values that occur in matches for wsTarget.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WField> rawAccumulateAllValuesOfwsTarget(final Object[] parameters) {
    Set<WField> results = new HashSet<WField>();
    rawAccumulateAllValues(POSITION_WSTARGET, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for wsTarget.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WField> getAllValuesOfwsTarget() {
    return rawAccumulateAllValuesOfwsTarget(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for wsTarget.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WField> getAllValuesOfwsTarget(final IncomingFieldAccessesMatch partialMatch) {
    return rawAccumulateAllValuesOfwsTarget(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for wsTarget.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WField> getAllValuesOfwsTarget(final CP1Method pRepoSource) {
    WField pWsTarget = null;
    return rawAccumulateAllValuesOfwsTarget(new Object[]{pRepoSource, pWsTarget});
  }
  
  @Override
  public IncomingFieldAccessesMatch tupleToMatch(final Tuple t) {
    try {
    	return new IncomingFieldAccessesMatch((hu.bme.incquery.deps.cp1model.CP1Method) t.get(POSITION_REPOSOURCE), (hu.bme.incquery.deps.wsmodel.WField) t.get(POSITION_WSTARGET));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public IncomingFieldAccessesMatch arrayToMatch(final Object[] match) {
    try {
    	return new IncomingFieldAccessesMatch((hu.bme.incquery.deps.cp1model.CP1Method) match[POSITION_REPOSOURCE], (hu.bme.incquery.deps.wsmodel.WField) match[POSITION_WSTARGET]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<IncomingFieldAccessesMatcher> factory() throws IncQueryException {
    return IncomingFieldAccessesMatcherFactory.instance();
  }
}
