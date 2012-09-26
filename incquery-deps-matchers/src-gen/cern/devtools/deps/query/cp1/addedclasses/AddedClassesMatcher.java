package cern.devtools.deps.query.cp1.addedclasses;

import cern.devtools.deps.query.cp1.addedclasses.AddedClassesMatch;
import cern.devtools.deps.query.cp1.addedclasses.AddedClassesMatcherFactory;
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
 * Generated pattern matcher API of the addedClasses pattern, 
 * providing pattern-specific query methods.
 * 
 * 
 * 
 * 
 *  
 * pattern addedClasses(wsClass : WType) = {
 * 	// Find the following attributes for the selected type: package name, simple name, project.
 * 	WPackageFragment.compilationUnits.types(wsPackage, wsClass);
 * 	WPackageFragment.name(wsPackage, packageName);
 * 	WType.name(wsClass, simpleName);
 * 	WProject.packageFragmentRoots.packageFragments.compilationUnits.types(wsProject, wsClass);
 * 
 * 	// Find the project in the repository.
 * 	find projectsWithSameName(repoProject, wsProject);
 * 
 * 	// Check that the repository project does not contain a class with the same name.
 * 	neg find classNamesInRepoProjects(repoProject, packageName, simpleName);
 * }
 * 
 * @see AddedClassesMatch
 * @see AddedClassesMatcherFactory
 * @see AddedClassesProcessor
 * 
 */
public class AddedClassesMatcher extends BaseGeneratedMatcher<AddedClassesMatch> implements IncQueryMatcher<AddedClassesMatch> {
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
  public AddedClassesMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public AddedClassesMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @return matches represented as a AddedClassesMatch object.
   * 
   */
  public Collection<AddedClassesMatch> getAllMatches(final WType pWsClass) {
    return rawGetAllMatches(new Object[]{pWsClass});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @return a match represented as a AddedClassesMatch object, or null if no match is found.
   * 
   */
  public AddedClassesMatch getOneArbitraryMatch(final WType pWsClass) {
    return rawGetOneArbitraryMatch(new Object[]{pWsClass});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final WType pWsClass) {
    return rawHasMatch(new Object[]{pWsClass});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final WType pWsClass) {
    return rawCountMatches(new Object[]{pWsClass});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final WType pWsClass, final IMatchProcessor<? super AddedClassesMatch> processor) {
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
  public boolean forOneArbitraryMatch(final WType pWsClass, final IMatchProcessor<? super AddedClassesMatch> processor) {
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
  public DeltaMonitor<AddedClassesMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final WType pWsClass) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pWsClass});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public AddedClassesMatch newMatch(final WType pWsClass) {
    return new AddedClassesMatch(pWsClass);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for wsClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WType> rawAccumulateAllValuesOfwsClass(final Object[] parameters) {
    Set<WType> results = new HashSet<WType>();
    rawAccumulateAllValues(POSITION_WSCLASS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for wsClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WType> getAllValuesOfwsClass() {
    return rawAccumulateAllValuesOfwsClass(emptyArray());
  }
  
  @Override
  public AddedClassesMatch tupleToMatch(final Tuple t) {
    try {
    	return new AddedClassesMatch((hu.bme.incquery.deps.wsmodel.WType) t.get(POSITION_WSCLASS));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public AddedClassesMatch arrayToMatch(final Object[] match) {
    try {
    	return new AddedClassesMatch((hu.bme.incquery.deps.wsmodel.WType) match[POSITION_WSCLASS]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<AddedClassesMatcher> factory() throws IncQueryException {
    return AddedClassesMatcherFactory.instance();
  }
}
