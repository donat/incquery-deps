package cern.devtools.deps.query.repo.removedclasses;

import cern.devtools.deps.query.repo.removedclasses.RemovedClassesMatch;
import hu.bme.incquery.deps.repomodel.RClass;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the removedClasses pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class RemovedClassesProcessor implements IMatchProcessor<RemovedClassesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pC the value of pattern parameter c in the currently processed match 
   * 
   */
  public abstract void process(final RClass c);
  
  @Override
  public void process(final RemovedClassesMatch match) {
    process(match.getC());  				
    
  }
}
