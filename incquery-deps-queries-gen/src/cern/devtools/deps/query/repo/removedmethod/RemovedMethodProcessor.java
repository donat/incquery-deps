package cern.devtools.deps.query.repo.removedmethod;

import cern.devtools.deps.query.repo.removedmethod.RemovedMethodMatch;
import hu.bme.incquery.deps.repomodel.RMethod;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the removedMethod pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class RemovedMethodProcessor implements IMatchProcessor<RemovedMethodMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pM the value of pattern parameter m in the currently processed match 
   * 
   */
  public abstract void process(final RMethod m);
  
  @Override
  public void process(final RemovedMethodMatch match) {
    process(match.getM());  				
    
  }
}
