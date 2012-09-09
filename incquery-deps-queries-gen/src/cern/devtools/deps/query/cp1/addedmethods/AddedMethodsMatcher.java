package cern.devtools.deps.query.cp1.addedmethods;

import cern.devtools.deps.query.cp1.addedmethods.AddedMethodsMatch;
import cern.devtools.deps.query.cp1.addedmethods.AddedMethodsMatcherFactory;
import hu.bme.incquery.deps.wsmodel.WMethod;
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
 * Generated pattern matcher API of the addedMethods pattern, 
 * providing pattern-specific query methods.
 * 
 * 
 *  
 * pattern addedMethods(wsMethod : WMethod) = {
 * 	// Find the method's project.
 * 	WMethod.signature(wsMethod, signature);
 * 	WProject.packageFragmentRoots.packageFragments.compilationUnits.types.methods(wsProject, wsMethod);
 * 
 * 	// Find the project in the repository.
 * 	find projectsWithSameName(repoProject, wsProject);
 * 
 * 	// Ensure that the method does not exist in the selected repository project.
 * 	neg find methodSignaturesInRepoProjects(repoProject, signature);
 * }
 * 
 * @see AddedMethodsMatch
 * @see AddedMethodsMatcherFactory
 * @see AddedMethodsProcessor
 * 
 */
public class AddedMethodsMatcher extends BaseGeneratedMatcher<AddedMethodsMatch> implements IncQueryMatcher<AddedMethodsMatch> {
  private final static int POSITION_WSMETHOD = 0;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public AddedMethodsMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public AddedMethodsMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pWsMethod the fixed value of pattern parameter wsMethod, or null if not bound.
   * @return matches represented as a AddedMethodsMatch object.
   * 
   */
  public Collection<AddedMethodsMatch> getAllMatches(final WMethod pWsMethod) {
    return rawGetAllMatches(new Object[]{pWsMethod});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pWsMethod the fixed value of pattern parameter wsMethod, or null if not bound.
   * @return a match represented as a AddedMethodsMatch object, or null if no match is found.
   * 
   */
  public AddedMethodsMatch getOneArbitraryMatch(final WMethod pWsMethod) {
    return rawGetOneArbitraryMatch(new Object[]{pWsMethod});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pWsMethod the fixed value of pattern parameter wsMethod, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final WMethod pWsMethod) {
    return rawHasMatch(new Object[]{pWsMethod});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pWsMethod the fixed value of pattern parameter wsMethod, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final WMethod pWsMethod) {
    return rawCountMatches(new Object[]{pWsMethod});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pWsMethod the fixed value of pattern parameter wsMethod, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final WMethod pWsMethod, final IMatchProcessor<? super AddedMethodsMatch> processor) {
    rawForEachMatch(new Object[]{pWsMethod}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pWsMethod the fixed value of pattern parameter wsMethod, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final WMethod pWsMethod, final IMatchProcessor<? super AddedMethodsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pWsMethod}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pWsMethod the fixed value of pattern parameter wsMethod, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<AddedMethodsMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final WMethod pWsMethod) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pWsMethod});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pWsMethod the fixed value of pattern parameter wsMethod, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public AddedMethodsMatch newMatch(final WMethod pWsMethod) {
    return new AddedMethodsMatch(pWsMethod);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for wsMethod.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WMethod> rawAccumulateAllValuesOfwsMethod(final Object[] parameters) {
    Set<WMethod> results = new HashSet<WMethod>();
    rawAccumulateAllValues(POSITION_WSMETHOD, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for wsMethod.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WMethod> getAllValuesOfwsMethod() {
    return rawAccumulateAllValuesOfwsMethod(emptyArray());
  }
  
  @Override
  public AddedMethodsMatch tupleToMatch(final Tuple t) {
    try {
    	return new AddedMethodsMatch((hu.bme.incquery.deps.wsmodel.WMethod) t.get(POSITION_WSMETHOD));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public AddedMethodsMatch arrayToMatch(final Object[] match) {
    try {
    	return new AddedMethodsMatch((hu.bme.incquery.deps.wsmodel.WMethod) match[POSITION_WSMETHOD]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<AddedMethodsMatcher> factory() throws IncQueryException {
    return AddedMethodsMatcherFactory.instance();
  }
}
