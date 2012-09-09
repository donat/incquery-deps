package cern.devtools.deps.query.repo.impactcausedbyremovedclasses;

import cern.devtools.deps.query.repo.impactcausedbyremovedclasses.ImpactCausedByRemovedClassesMatch;
import hu.bme.incquery.deps.repomodel.RClass;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the impactCausedByRemovedClasses pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class ImpactCausedByRemovedClassesProcessor implements IMatchProcessor<ImpactCausedByRemovedClassesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pFrom the value of pattern parameter from in the currently processed match 
   * @param pTo the value of pattern parameter to in the currently processed match 
   * 
   */
  public abstract void process(final RClass from, final RClass to);
  
  @Override
  public void process(final ImpactCausedByRemovedClassesMatch match) {
    process(match.getFrom(), match.getTo());  				
    
  }
}
