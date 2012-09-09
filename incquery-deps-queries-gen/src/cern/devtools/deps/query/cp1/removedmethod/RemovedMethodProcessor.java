package cern.devtools.deps.query.cp1.removedmethod;

import cern.devtools.deps.query.cp1.removedmethod.RemovedMethodMatch;
import hu.bme.incquery.deps.cp1model.CP1Method;
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
   * @param pRepoMethod the value of pattern parameter repoMethod in the currently processed match 
   * 
   */
  public abstract void process(final CP1Method repoMethod);
  
  @Override
  public void process(final RemovedMethodMatch match) {
    process(match.getRepoMethod());  				
    
  }
}
