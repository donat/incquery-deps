package cern.devtools.deps.query.cp1.removedclasses;

import cern.devtools.deps.query.cp1.removedclasses.RemovedClassesMatch;
import hu.bme.incquery.deps.cp1model.CP1Class;
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
   * @param pWsClass the value of pattern parameter wsClass in the currently processed match 
   * 
   */
  public abstract void process(final CP1Class wsClass);
  
  @Override
  public void process(final RemovedClassesMatch match) {
    process(match.getWsClass());  				
    
  }
}
