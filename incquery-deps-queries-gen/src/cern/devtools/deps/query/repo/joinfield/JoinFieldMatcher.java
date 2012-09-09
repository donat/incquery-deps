package cern.devtools.deps.query.repo.joinfield;

import cern.devtools.deps.query.repo.joinfield.JoinFieldMatch;
import cern.devtools.deps.query.repo.joinfield.JoinFieldMatcherFactory;
import hu.bme.incquery.deps.repomodel.RField;
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
 * Generated pattern matcher API of the joinField pattern, 
 * providing pattern-specific query methods.
 * 
 * 
 * 
 * pattern joinField(rm : RField, wm : WField) = {
 * // Join project.
 * 	RProject.rClasses.rFields(rp, rm);
 * 	WProject.packageFragmentRoots.packageFragments.compilationUnits.types.fields(wp, wm);
 * 	find joinProject(rp, wp);
 * 
 * 	// Join classes.
 * 	// There is no need for it: signature contains the fully qualified names.
 * 	// RClass.rMethods(rc, rm);
 * 	// WType.methods(wc, wm);
 * 	// find joinClass(rc, wc);
 * 
 * 	// join methods by signature 
 * 	RField.signature(rm, signature);
 * 	WField.signature(wm, signature);
 * }
 * 
 * @see JoinFieldMatch
 * @see JoinFieldMatcherFactory
 * @see JoinFieldProcessor
 * 
 */
public class JoinFieldMatcher extends BaseGeneratedMatcher<JoinFieldMatch> implements IncQueryMatcher<JoinFieldMatch> {
  private final static int POSITION_RM = 0;
  
  private final static int POSITION_WM = 1;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public JoinFieldMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public JoinFieldMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRm the fixed value of pattern parameter rm, or null if not bound.
   * @param pWm the fixed value of pattern parameter wm, or null if not bound.
   * @return matches represented as a JoinFieldMatch object.
   * 
   */
  public Collection<JoinFieldMatch> getAllMatches(final RField pRm, final WField pWm) {
    return rawGetAllMatches(new Object[]{pRm, pWm});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRm the fixed value of pattern parameter rm, or null if not bound.
   * @param pWm the fixed value of pattern parameter wm, or null if not bound.
   * @return a match represented as a JoinFieldMatch object, or null if no match is found.
   * 
   */
  public JoinFieldMatch getOneArbitraryMatch(final RField pRm, final WField pWm) {
    return rawGetOneArbitraryMatch(new Object[]{pRm, pWm});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRm the fixed value of pattern parameter rm, or null if not bound.
   * @param pWm the fixed value of pattern parameter wm, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final RField pRm, final WField pWm) {
    return rawHasMatch(new Object[]{pRm, pWm});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRm the fixed value of pattern parameter rm, or null if not bound.
   * @param pWm the fixed value of pattern parameter wm, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final RField pRm, final WField pWm) {
    return rawCountMatches(new Object[]{pRm, pWm});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRm the fixed value of pattern parameter rm, or null if not bound.
   * @param pWm the fixed value of pattern parameter wm, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final RField pRm, final WField pWm, final IMatchProcessor<? super JoinFieldMatch> processor) {
    rawForEachMatch(new Object[]{pRm, pWm}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRm the fixed value of pattern parameter rm, or null if not bound.
   * @param pWm the fixed value of pattern parameter wm, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final RField pRm, final WField pWm, final IMatchProcessor<? super JoinFieldMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRm, pWm}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pRm the fixed value of pattern parameter rm, or null if not bound.
   * @param pWm the fixed value of pattern parameter wm, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<JoinFieldMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final RField pRm, final WField pWm) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pRm, pWm});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pRm the fixed value of pattern parameter rm, or null if not bound.
   * @param pWm the fixed value of pattern parameter wm, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public JoinFieldMatch newMatch(final RField pRm, final WField pWm) {
    return new JoinFieldMatch(pRm, pWm);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for rm.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RField> rawAccumulateAllValuesOfrm(final Object[] parameters) {
    Set<RField> results = new HashSet<RField>();
    rawAccumulateAllValues(POSITION_RM, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for rm.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RField> getAllValuesOfrm() {
    return rawAccumulateAllValuesOfrm(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for rm.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RField> getAllValuesOfrm(final JoinFieldMatch partialMatch) {
    return rawAccumulateAllValuesOfrm(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for rm.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RField> getAllValuesOfrm(final WField pWm) {
    RField pRm = null;
    return rawAccumulateAllValuesOfrm(new Object[]{pRm, pWm});
  }
  
  /**
   * Retrieve the set of values that occur in matches for wm.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WField> rawAccumulateAllValuesOfwm(final Object[] parameters) {
    Set<WField> results = new HashSet<WField>();
    rawAccumulateAllValues(POSITION_WM, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for wm.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WField> getAllValuesOfwm() {
    return rawAccumulateAllValuesOfwm(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for wm.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WField> getAllValuesOfwm(final JoinFieldMatch partialMatch) {
    return rawAccumulateAllValuesOfwm(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for wm.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WField> getAllValuesOfwm(final RField pRm) {
    WField pWm = null;
    return rawAccumulateAllValuesOfwm(new Object[]{pRm, pWm});
  }
  
  @Override
  public JoinFieldMatch tupleToMatch(final Tuple t) {
    try {
    	return new JoinFieldMatch((hu.bme.incquery.deps.repomodel.RField) t.get(POSITION_RM), (hu.bme.incquery.deps.wsmodel.WField) t.get(POSITION_WM));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public JoinFieldMatch arrayToMatch(final Object[] match) {
    try {
    	return new JoinFieldMatch((hu.bme.incquery.deps.repomodel.RField) match[POSITION_RM], (hu.bme.incquery.deps.wsmodel.WField) match[POSITION_WM]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<JoinFieldMatcher> factory() throws IncQueryException {
    return JoinFieldMatcherFactory.instance();
  }
}
