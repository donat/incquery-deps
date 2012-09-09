package cern.devtools.deps.query.repo.joinproject;

import cern.devtools.deps.query.repo.joinproject.JoinProjectMatch;
import cern.devtools.deps.query.repo.joinproject.JoinProjectMatcherFactory;
import hu.bme.incquery.deps.repomodel.RProject;
import hu.bme.incquery.deps.wsmodel.WProject;
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
 * Generated pattern matcher API of the joinProject pattern, 
 * providing pattern-specific query methods.
 * 
 * 
 * 
 * // ----------------------------------------------------------------------------
 * // Join queries
 * // ----------------------------------------------------------------------------
 * pattern joinProject(rp : RProject, wp : WProject) = {
 * 	RProject.name(rp, commonName);
 * 	WProject.name(wp, commonName);
 * }
 * 
 * @see JoinProjectMatch
 * @see JoinProjectMatcherFactory
 * @see JoinProjectProcessor
 * 
 */
public class JoinProjectMatcher extends BaseGeneratedMatcher<JoinProjectMatch> implements IncQueryMatcher<JoinProjectMatch> {
  private final static int POSITION_RP = 0;
  
  private final static int POSITION_WP = 1;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public JoinProjectMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public JoinProjectMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRp the fixed value of pattern parameter rp, or null if not bound.
   * @param pWp the fixed value of pattern parameter wp, or null if not bound.
   * @return matches represented as a JoinProjectMatch object.
   * 
   */
  public Collection<JoinProjectMatch> getAllMatches(final RProject pRp, final WProject pWp) {
    return rawGetAllMatches(new Object[]{pRp, pWp});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRp the fixed value of pattern parameter rp, or null if not bound.
   * @param pWp the fixed value of pattern parameter wp, or null if not bound.
   * @return a match represented as a JoinProjectMatch object, or null if no match is found.
   * 
   */
  public JoinProjectMatch getOneArbitraryMatch(final RProject pRp, final WProject pWp) {
    return rawGetOneArbitraryMatch(new Object[]{pRp, pWp});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRp the fixed value of pattern parameter rp, or null if not bound.
   * @param pWp the fixed value of pattern parameter wp, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final RProject pRp, final WProject pWp) {
    return rawHasMatch(new Object[]{pRp, pWp});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRp the fixed value of pattern parameter rp, or null if not bound.
   * @param pWp the fixed value of pattern parameter wp, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final RProject pRp, final WProject pWp) {
    return rawCountMatches(new Object[]{pRp, pWp});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRp the fixed value of pattern parameter rp, or null if not bound.
   * @param pWp the fixed value of pattern parameter wp, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final RProject pRp, final WProject pWp, final IMatchProcessor<? super JoinProjectMatch> processor) {
    rawForEachMatch(new Object[]{pRp, pWp}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRp the fixed value of pattern parameter rp, or null if not bound.
   * @param pWp the fixed value of pattern parameter wp, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final RProject pRp, final WProject pWp, final IMatchProcessor<? super JoinProjectMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRp, pWp}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pRp the fixed value of pattern parameter rp, or null if not bound.
   * @param pWp the fixed value of pattern parameter wp, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<JoinProjectMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final RProject pRp, final WProject pWp) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pRp, pWp});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pRp the fixed value of pattern parameter rp, or null if not bound.
   * @param pWp the fixed value of pattern parameter wp, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public JoinProjectMatch newMatch(final RProject pRp, final WProject pWp) {
    return new JoinProjectMatch(pRp, pWp);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for rp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RProject> rawAccumulateAllValuesOfrp(final Object[] parameters) {
    Set<RProject> results = new HashSet<RProject>();
    rawAccumulateAllValues(POSITION_RP, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for rp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RProject> getAllValuesOfrp() {
    return rawAccumulateAllValuesOfrp(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for rp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RProject> getAllValuesOfrp(final JoinProjectMatch partialMatch) {
    return rawAccumulateAllValuesOfrp(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for rp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RProject> getAllValuesOfrp(final WProject pWp) {
    RProject pRp = null;
    return rawAccumulateAllValuesOfrp(new Object[]{pRp, pWp});
  }
  
  /**
   * Retrieve the set of values that occur in matches for wp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WProject> rawAccumulateAllValuesOfwp(final Object[] parameters) {
    Set<WProject> results = new HashSet<WProject>();
    rawAccumulateAllValues(POSITION_WP, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for wp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WProject> getAllValuesOfwp() {
    return rawAccumulateAllValuesOfwp(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for wp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WProject> getAllValuesOfwp(final JoinProjectMatch partialMatch) {
    return rawAccumulateAllValuesOfwp(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for wp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WProject> getAllValuesOfwp(final RProject pRp) {
    WProject pWp = null;
    return rawAccumulateAllValuesOfwp(new Object[]{pRp, pWp});
  }
  
  @Override
  public JoinProjectMatch tupleToMatch(final Tuple t) {
    try {
    	return new JoinProjectMatch((hu.bme.incquery.deps.repomodel.RProject) t.get(POSITION_RP), (hu.bme.incquery.deps.wsmodel.WProject) t.get(POSITION_WP));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public JoinProjectMatch arrayToMatch(final Object[] match) {
    try {
    	return new JoinProjectMatch((hu.bme.incquery.deps.repomodel.RProject) match[POSITION_RP], (hu.bme.incquery.deps.wsmodel.WProject) match[POSITION_WP]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<JoinProjectMatcher> factory() throws IncQueryException {
    return JoinProjectMatcherFactory.instance();
  }
}
