package cern.devtools.deps.query.cp1.classeswithsamefqnandsameproject;

import cern.devtools.deps.query.cp1.classeswithsamefqnandsameproject.ClassesWithSameFQNAndSameProjectMatch;
import cern.devtools.deps.query.cp1.classeswithsamefqnandsameproject.ClassesWithSameFQNAndSameProjectMatcherFactory;
import hu.bme.incquery.deps.cp1model.CP1Class;
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
 * Generated pattern matcher API of the classesWithSameFQNAndSameProject pattern, 
 * providing pattern-specific query methods.
 * 
 * 
 * 
 *  
 * pattern classesWithSameFQNAndSameProject(repoClass : CP1Class, wsClass : WType) = {
 * 	// Pattern applies only classes within a project with the same name.
 * 	CP1Project.classes(repoProject, repoClass);
 * 	WProject.packageFragmentRoots.packageFragments.compilationUnits.types(wsProject, wsClass);
 * 	find projectsWithSameName(repoProject, wsProject);
 * 
 * 	// Classes must have the same name...
 * 	CP1Class.simpleName(repoClass, commonSimpleName);
 * 	WType.name(wsClass, commonSimpleName);
 * 
 * 	// ... and the same package name.
 * 	CP1Class.packageName(repoClass, commonPackageName);
 * 	WPackageFragment.compilationUnits.types(wsClassContPkg, wsClass);
 * 	WPackageFragment.name(wsClassContPkg, commonPackageName);
 * }
 * 
 * @see ClassesWithSameFQNAndSameProjectMatch
 * @see ClassesWithSameFQNAndSameProjectMatcherFactory
 * @see ClassesWithSameFQNAndSameProjectProcessor
 * 
 */
public class ClassesWithSameFQNAndSameProjectMatcher extends BaseGeneratedMatcher<ClassesWithSameFQNAndSameProjectMatch> implements IncQueryMatcher<ClassesWithSameFQNAndSameProjectMatch> {
  private final static int POSITION_REPOCLASS = 0;
  
  private final static int POSITION_WSCLASS = 1;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public ClassesWithSameFQNAndSameProjectMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public ClassesWithSameFQNAndSameProjectMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRepoClass the fixed value of pattern parameter repoClass, or null if not bound.
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @return matches represented as a ClassesWithSameFQNAndSameProjectMatch object.
   * 
   */
  public Collection<ClassesWithSameFQNAndSameProjectMatch> getAllMatches(final CP1Class pRepoClass, final WType pWsClass) {
    return rawGetAllMatches(new Object[]{pRepoClass, pWsClass});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRepoClass the fixed value of pattern parameter repoClass, or null if not bound.
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @return a match represented as a ClassesWithSameFQNAndSameProjectMatch object, or null if no match is found.
   * 
   */
  public ClassesWithSameFQNAndSameProjectMatch getOneArbitraryMatch(final CP1Class pRepoClass, final WType pWsClass) {
    return rawGetOneArbitraryMatch(new Object[]{pRepoClass, pWsClass});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRepoClass the fixed value of pattern parameter repoClass, or null if not bound.
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final CP1Class pRepoClass, final WType pWsClass) {
    return rawHasMatch(new Object[]{pRepoClass, pWsClass});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRepoClass the fixed value of pattern parameter repoClass, or null if not bound.
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final CP1Class pRepoClass, final WType pWsClass) {
    return rawCountMatches(new Object[]{pRepoClass, pWsClass});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRepoClass the fixed value of pattern parameter repoClass, or null if not bound.
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final CP1Class pRepoClass, final WType pWsClass, final IMatchProcessor<? super ClassesWithSameFQNAndSameProjectMatch> processor) {
    rawForEachMatch(new Object[]{pRepoClass, pWsClass}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRepoClass the fixed value of pattern parameter repoClass, or null if not bound.
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final CP1Class pRepoClass, final WType pWsClass, final IMatchProcessor<? super ClassesWithSameFQNAndSameProjectMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRepoClass, pWsClass}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pRepoClass the fixed value of pattern parameter repoClass, or null if not bound.
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<ClassesWithSameFQNAndSameProjectMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final CP1Class pRepoClass, final WType pWsClass) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pRepoClass, pWsClass});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pRepoClass the fixed value of pattern parameter repoClass, or null if not bound.
   * @param pWsClass the fixed value of pattern parameter wsClass, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ClassesWithSameFQNAndSameProjectMatch newMatch(final CP1Class pRepoClass, final WType pWsClass) {
    return new ClassesWithSameFQNAndSameProjectMatch(pRepoClass, pWsClass);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Class> rawAccumulateAllValuesOfrepoClass(final Object[] parameters) {
    Set<CP1Class> results = new HashSet<CP1Class>();
    rawAccumulateAllValues(POSITION_REPOCLASS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Class> getAllValuesOfrepoClass() {
    return rawAccumulateAllValuesOfrepoClass(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Class> getAllValuesOfrepoClass(final ClassesWithSameFQNAndSameProjectMatch partialMatch) {
    return rawAccumulateAllValuesOfrepoClass(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Class> getAllValuesOfrepoClass(final WType pWsClass) {
    CP1Class pRepoClass = null;
    return rawAccumulateAllValuesOfrepoClass(new Object[]{pRepoClass, pWsClass});
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
  
  /**
   * Retrieve the set of values that occur in matches for wsClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WType> getAllValuesOfwsClass(final ClassesWithSameFQNAndSameProjectMatch partialMatch) {
    return rawAccumulateAllValuesOfwsClass(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for wsClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WType> getAllValuesOfwsClass(final CP1Class pRepoClass) {
    WType pWsClass = null;
    return rawAccumulateAllValuesOfwsClass(new Object[]{pRepoClass, pWsClass});
  }
  
  @Override
  public ClassesWithSameFQNAndSameProjectMatch tupleToMatch(final Tuple t) {
    try {
    	return new ClassesWithSameFQNAndSameProjectMatch((hu.bme.incquery.deps.cp1model.CP1Class) t.get(POSITION_REPOCLASS), (hu.bme.incquery.deps.wsmodel.WType) t.get(POSITION_WSCLASS));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public ClassesWithSameFQNAndSameProjectMatch arrayToMatch(final Object[] match) {
    try {
    	return new ClassesWithSameFQNAndSameProjectMatch((hu.bme.incquery.deps.cp1model.CP1Class) match[POSITION_REPOCLASS], (hu.bme.incquery.deps.wsmodel.WType) match[POSITION_WSCLASS]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<ClassesWithSameFQNAndSameProjectMatcher> factory() throws IncQueryException {
    return ClassesWithSameFQNAndSameProjectMatcherFactory.instance();
  }
}
