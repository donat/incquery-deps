package cern.devtools.deps.query.repo.addedclasses;

import cern.devtools.deps.query.repo.addedclasses.AddedClassesMatch;
import hu.bme.incquery.deps.wsmodel.WType;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the addedClasses pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class AddedClassesProcessor implements IMatchProcessor<AddedClassesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pC the value of pattern parameter c in the currently processed match 
   * 
   */
  public abstract void process(final WType c);
  
  @Override
  public void process(final AddedClassesMatch match) {
    process(match.getC());  				
    
  }
}
