package cern.devtools.deps.query.cp1.impactcausedbyremovedclasses;

import cern.devtools.deps.query.cp1.impactcausedbyremovedclasses.ImpactCausedByRemovedClassesMatch;
import hu.bme.incquery.deps.cp1model.CP1Class;
import hu.bme.incquery.deps.cp1model.CP1DependencyType;
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
   * @param pRepoFrom the value of pattern parameter repoFrom in the currently processed match 
   * @param pRepoTo the value of pattern parameter repoTo in the currently processed match 
   * @param pType the value of pattern parameter type in the currently processed match 
   * 
   */
  public abstract void process(final CP1Class repoFrom, final CP1Class repoTo, final CP1DependencyType type);
  
  @Override
  public void process(final ImpactCausedByRemovedClassesMatch match) {
    process(match.getRepoFrom(), match.getRepoTo(), match.getType());  				
    
  }
}
