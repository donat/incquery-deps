package cern.devtools.deps.query.repo.impactcausedbyremovedmethods;

import cern.devtools.deps.query.repo.impactcausedbyremovedmethods.ImpactCausedByRemovedMethodsMatch;
import hu.bme.incquery.deps.repomodel.RMethod;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the impactCausedByRemovedMethods pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class ImpactCausedByRemovedMethodsProcessor implements IMatchProcessor<ImpactCausedByRemovedMethodsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pFrom the value of pattern parameter from in the currently processed match 
   * @param pTo the value of pattern parameter to in the currently processed match 
   * 
   */
  public abstract void process(final RMethod from, final RMethod to);
  
  @Override
  public void process(final ImpactCausedByRemovedMethodsMatch match) {
    process(match.getFrom(), match.getTo());  				
    
  }
}
