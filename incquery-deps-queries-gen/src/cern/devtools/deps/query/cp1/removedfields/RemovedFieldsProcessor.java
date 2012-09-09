package cern.devtools.deps.query.cp1.removedfields;

import cern.devtools.deps.query.cp1.removedfields.RemovedFieldsMatch;
import hu.bme.incquery.deps.cp1model.CP1Field;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the removedFields pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class RemovedFieldsProcessor implements IMatchProcessor<RemovedFieldsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRepoField the value of pattern parameter repoField in the currently processed match 
   * 
   */
  public abstract void process(final CP1Field repoField);
  
  @Override
  public void process(final RemovedFieldsMatch match) {
    process(match.getRepoField());  				
    
  }
}
