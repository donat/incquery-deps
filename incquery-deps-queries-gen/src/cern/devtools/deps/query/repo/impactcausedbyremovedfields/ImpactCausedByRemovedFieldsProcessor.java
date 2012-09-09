package cern.devtools.deps.query.repo.impactcausedbyremovedfields;

import cern.devtools.deps.query.repo.impactcausedbyremovedfields.ImpactCausedByRemovedFieldsMatch;
import hu.bme.incquery.deps.repomodel.RField;
import hu.bme.incquery.deps.repomodel.RMethod;
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
   * @param pFrom the value of pattern parameter from in the currently processed match 
   * @param pTo the value of pattern parameter to in the currently processed match 
   * 
   */
  public abstract void process(final RMethod from, final RField to);
  
  @Override
  public void process(final ImpactCausedByRemovedFieldsMatch match) {
    process(match.getFrom(), match.getTo());  				
    
  }
}
