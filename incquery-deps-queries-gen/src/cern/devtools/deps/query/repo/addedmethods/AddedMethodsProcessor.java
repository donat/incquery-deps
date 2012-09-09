package cern.devtools.deps.query.repo.addedmethods;

import cern.devtools.deps.query.repo.addedmethods.AddedMethodsMatch;
import hu.bme.incquery.deps.wsmodel.WMethod;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the addedMethods pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class AddedMethodsProcessor implements IMatchProcessor<AddedMethodsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pC the value of pattern parameter c in the currently processed match 
   * 
   */
  public abstract void process(final WMethod c);
  
  @Override
  public void process(final AddedMethodsMatch match) {
    process(match.getC());  				
    
  }
}
