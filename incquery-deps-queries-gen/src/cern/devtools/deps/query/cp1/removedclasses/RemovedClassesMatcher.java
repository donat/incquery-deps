package cern.devtools.deps.query.cp1.removedclasses;

import cern.devtools.deps.query.cp1.removedclasses.RemovedClassesMatch;
import cern.devtools.deps.query.cp1.removedclasses.RemovedClassesMatcherFactory;
import hu.bme.incquery.deps.cp1model.CP1Class;
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
 * Generated pattern matcher API of the removedClasses pattern, 
 * providing pattern-specific query methods.
 * 
 * 
 * 
 *  
 * pattern removedClasses(wsClass : CP1Class) = {
 * 	CP1Class.simpleName(wsClass, simpleName);
 * 	CP1Class.packageName(wsClass, packageName);
 * 	CP1Project.classes(repoProject, wsClass);
 * 
 * 	// Find the project in the workspace.
 * 	find projectsWithSameName(repoProject, wsProject);
 * 
 * 	// Check that the workspace does not contain a class with the same name.
 * 	neg find classNamesInWorkspaceProjects(wsProject, packageName, simpleName);
 * }
 * 
 * @see RemovedClassesMatch
 * @see RemovedClassesMatcherFactory
 * @see RemovedClassesProcessor
 * 
 */
public class RemovedClassesMatcher extends BaseGeneratedMatcher<RemovedClassesMatch> implements IncQueryMatcher<RemovedClassesMatch> {
  private final static int POSITION_WSCLASS = 0;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public RemovedClassesMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public RemovedClassesMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @return matches represented as a RemovedClassesMatch object.
   * 
   */
  public Collection<RemovedClassesMatch> getAllMatches(final CP1Class pWsClass) {
    return rawGetAllMatches(new Object[]{pWsClass});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @return a match represented as a RemovedClassesMatch object, or null if no match is found.
   * 
   */
  public RemovedClassesMatch getOneArbitraryMatch(final CP1Class pWsClass) {
    return rawGetOneArbitraryMatch(new Object[]{pWsClass});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final CP1Class pWsClass) {
    return rawHasMatch(new Object[]{pWsClass});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final CP1Class pWsClass) {
    return rawCountMatches(new Object[]{pWsClass});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final CP1Class pWsClass, final IMatchProcessor<? super RemovedClassesMatch> processor) {
    rawForEachMatch(new Object[]{pWsClass}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final CP1Class pWsClass, final IMatchProcessor<? super RemovedClassesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pWsClass}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<RemovedClassesMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final CP1Class pWsClass) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pWsClass});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public RemovedClassesMatch newMatch(final CP1Class pWsClass) {
    return new RemovedClassesMatch(pWsClass);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for wsClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Class> rawAccumulateAllValuesOfwsClass(final Object[] parameters) {
    Set<CP1Class> results = new HashSet<CP1Class>();
    rawAccumulateAllValues(POSITION_WSCLASS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for wsClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Class> getAllValuesOfwsClass() {
    return rawAccumulateAllValuesOfwsClass(emptyArray());
  }
  
  @Override
  public RemovedClassesMatch tupleToMatch(final Tuple t) {
    try {
    	return new RemovedClassesMatch((hu.bme.incquery.deps.cp1model.CP1Class) t.get(POSITION_WSCLASS));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public RemovedClassesMatch arrayToMatch(final Object[] match) {
    try {
    	return new RemovedClassesMatch((hu.bme.incquery.deps.cp1model.CP1Class) match[POSITION_WSCLASS]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<RemovedClassesMatcher> factory() throws IncQueryException {
    return RemovedClassesMatcherFactory.instance();
  }
}
