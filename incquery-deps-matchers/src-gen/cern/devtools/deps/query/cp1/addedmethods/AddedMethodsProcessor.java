package cern.devtools.deps.query.cp1.addedmethods;

import cern.devtools.deps.query.cp1.addedmethods.AddedMethodsMatch;
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
   * @param pWsMethod the value of pattern parameter wsMethod in the currently processed match 
   * 
   */
  public abstract void process(final WMethod wsMethod);
  
  @Override
  public void process(final AddedMethodsMatch match) {
    process(match.getWsMethod());  				
    
  }
}
