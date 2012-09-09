package cern.devtools.deps.query.cp1.impactcausedbyremovedfields;

import cern.devtools.deps.query.cp1.impactcausedbyremovedfields.ImpactCausedByRemovedFieldsMatch;
import hu.bme.incquery.deps.cp1model.CP1DependencyType;
import hu.bme.incquery.deps.cp1model.CP1Field;
import hu.bme.incquery.deps.cp1model.CP1Method;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the impactCausedByRemovedFields pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class ImpactCausedByRemovedFieldsProcessor implements IMatchProcessor<ImpactCausedByRemovedFieldsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRepoFrom the value of pattern parameter repoFrom in the currently processed match 
   * @param pRepoTo the value of pattern parameter repoTo in the currently processed match 
   * @param pType the value of pattern parameter type in the currently processed match 
   * 
   */
  public abstract void process(final CP1Method repoFrom, final CP1Field repoTo, final CP1DependencyType type);
  
  @Override
  public void process(final ImpactCausedByRemovedFieldsMatch match) {
    process(match.getRepoFrom(), match.getRepoTo(), match.getType());  				
    
  }
}
