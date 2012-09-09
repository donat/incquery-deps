package cern.devtools.deps.query.cp1.fieldswithsamesignatureandsameproject;

import cern.devtools.deps.query.cp1.fieldswithsamesignatureandsameproject.FieldsWithSameSignatureAndSameProjectMatch;
import cern.devtools.deps.query.cp1.fieldswithsamesignatureandsameproject.FieldsWithSameSignatureAndSameProjectMatcherFactory;
import hu.bme.incquery.deps.cp1model.CP1Field;
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
 * Generated pattern matcher API of the fieldsWithSameSignatureAndSameProject pattern, 
 * providing pattern-specific query methods.
 * 
 * 
 * 
 *  
 * pattern fieldsWithSameSignatureAndSameProject(repoField : CP1Field, wsField : WField) = {
 * 	// Find the items contained by the same named projects.
 * 	CP1Project.classes.fields(repoProject, repoField);
 * 	WProject.packageFragmentRoots.packageFragments.compilationUnits.types.fields(wsProject, wsField);
 * 	find projectsWithSameName(repoProject, wsProject);
 * 
 * 	// Join the fields by signature.
 * 	CP1Field.signature(repoField, commonSignature);
 * 	WField.signature(wsField, commonSignature);
 * }
 * 
 * @see FieldsWithSameSignatureAndSameProjectMatch
 * @see FieldsWithSameSignatureAndSameProjectMatcherFactory
 * @see FieldsWithSameSignatureAndSameProjectProcessor
 * 
 */
public class FieldsWithSameSignatureAndSameProjectMatcher extends BaseGeneratedMatcher<FieldsWithSameSignatureAndSameProjectMatch> implements IncQueryMatcher<FieldsWithSameSignatureAndSameProjectMatch> {
  private final static int POSITION_REPOFIELD = 0;
  
  private final static int POSITION_WSFIELD = 1;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public FieldsWithSameSignatureAndSameProjectMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public FieldsWithSameSignatureAndSameProjectMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRepoField the fixed value of pattern parameter repoField, or null if not bound.
   * @param pWsField the fixed value of pattern parameter wsField, or null if not bound.
   * @return matches represented as a FieldsWithSameSignatureAndSameProjectMatch object.
   * 
   */
  public Collection<FieldsWithSameSignatureAndSameProjectMatch> getAllMatches(final CP1Field pRepoField, final WField pWsField) {
    return rawGetAllMatches(new Object[]{pRepoField, pWsField});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRepoField the fixed value of pattern parameter repoField, or null if not bound.
   * @param pWsField the fixed value of pattern parameter wsField, or null if not bound.
   * @return a match represented as a FieldsWithSameSignatureAndSameProjectMatch object, or null if no match is found.
   * 
   */
  public FieldsWithSameSignatureAndSameProjectMatch getOneArbitraryMatch(final CP1Field pRepoField, final WField pWsField) {
    return rawGetOneArbitraryMatch(new Object[]{pRepoField, pWsField});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRepoField the fixed value of pattern parameter repoField, or null if not bound.
   * @param pWsField the fixed value of pattern parameter wsField, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final CP1Field pRepoField, final WField pWsField) {
    return rawHasMatch(new Object[]{pRepoField, pWsField});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRepoField the fixed value of pattern parameter repoField, or null if not bound.
   * @param pWsField the fixed value of pattern parameter wsField, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final CP1Field pRepoField, final WField pWsField) {
    return rawCountMatches(new Object[]{pRepoField, pWsField});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRepoField the fixed value of pattern parameter repoField, or null if not bound.
   * @param pWsField the fixed value of pattern parameter wsField, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final CP1Field pRepoField, final WField pWsField, final IMatchProcessor<? super FieldsWithSameSignatureAndSameProjectMatch> processor) {
    rawForEachMatch(new Object[]{pRepoField, pWsField}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRepoField the fixed value of pattern parameter repoField, or null if not bound.
   * @param pWsField the fixed value of pattern parameter wsField, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final CP1Field pRepoField, final WField pWsField, final IMatchProcessor<? super FieldsWithSameSignatureAndSameProjectMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRepoField, pWsField}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pRepoField the fixed value of pattern parameter repoField, or null if not bound.
   * @param pWsField the fixed value of pattern parameter wsField, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<FieldsWithSameSignatureAndSameProjectMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final CP1Field pRepoField, final WField pWsField) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pRepoField, pWsField});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pRepoField the fixed value of pattern parameter repoField, or null if not bound.
   * @param pWsField the fixed value of pattern parameter wsField, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public FieldsWithSameSignatureAndSameProjectMatch newMatch(final CP1Field pRepoField, final WField pWsField) {
    return new FieldsWithSameSignatureAndSameProjectMatch(pRepoField, pWsField);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoField.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Field> rawAccumulateAllValuesOfrepoField(final Object[] parameters) {
    Set<CP1Field> results = new HashSet<CP1Field>();
    rawAccumulateAllValues(POSITION_REPOFIELD, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoField.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Field> getAllValuesOfrepoField() {
    return rawAccumulateAllValuesOfrepoField(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoField.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Field> getAllValuesOfrepoField(final FieldsWithSameSignatureAndSameProjectMatch partialMatch) {
    return rawAccumulateAllValuesOfrepoField(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for repoField.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CP1Field> getAllValuesOfrepoField(final WField pWsField) {
    CP1Field pRepoField = null;
    return rawAccumulateAllValuesOfrepoField(new Object[]{pRepoField, pWsField});
  }
  
  /**
   * Retrieve the set of values that occur in matches for wsField.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WField> rawAccumulateAllValuesOfwsField(final Object[] parameters) {
    Set<WField> results = new HashSet<WField>();
    rawAccumulateAllValues(POSITION_WSFIELD, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for wsField.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WField> getAllValuesOfwsField() {
    return rawAccumulateAllValuesOfwsField(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for wsField.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WField> getAllValuesOfwsField(final FieldsWithSameSignatureAndSameProjectMatch partialMatch) {
    return rawAccumulateAllValuesOfwsField(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for wsField.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WField> getAllValuesOfwsField(final CP1Field pRepoField) {
    WField pWsField = null;
    return rawAccumulateAllValuesOfwsField(new Object[]{pRepoField, pWsField});
  }
  
  @Override
  public FieldsWithSameSignatureAndSameProjectMatch tupleToMatch(final Tuple t) {
    try {
    	return new FieldsWithSameSignatureAndSameProjectMatch((hu.bme.incquery.deps.cp1model.CP1Field) t.get(POSITION_REPOFIELD), (hu.bme.incquery.deps.wsmodel.WField) t.get(POSITION_WSFIELD));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public FieldsWithSameSignatureAndSameProjectMatch arrayToMatch(final Object[] match) {
    try {
    	return new FieldsWithSameSignatureAndSameProjectMatch((hu.bme.incquery.deps.cp1model.CP1Field) match[POSITION_REPOFIELD], (hu.bme.incquery.deps.wsmodel.WField) match[POSITION_WSFIELD]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<FieldsWithSameSignatureAndSameProjectMatcher> factory() throws IncQueryException {
    return FieldsWithSameSignatureAndSameProjectMatcherFactory.instance();
  }
}
