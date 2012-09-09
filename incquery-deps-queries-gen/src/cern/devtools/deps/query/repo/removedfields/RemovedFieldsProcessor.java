package cern.devtools.deps.query.repo.removedfields;

import cern.devtools.deps.query.repo.removedfields.RemovedFieldsMatch;
import hu.bme.incquery.deps.repomodel.RField;
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
   * @param pF the value of pattern parameter f in the currently processed match 
   * 
   */
  public abstract void process(final RField f);
  
  @Override
  public void process(final RemovedFieldsMatch match) {
    process(match.getF());  				
    
  }
}
