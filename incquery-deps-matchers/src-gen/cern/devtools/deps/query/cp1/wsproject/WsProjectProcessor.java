package cern.devtools.deps.query.cp1.wsproject;

import cern.devtools.deps.query.cp1.wsproject.WsProjectMatch;
import hu.bme.incquery.deps.wsmodel.WProject;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the wsProject pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class WsProjectProcessor implements IMatchProcessor<WsProjectMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pP the value of pattern parameter p in the currently processed match 
   * 
   */
  public abstract void process(final WProject p);
  
  @Override
  public void process(final WsProjectMatch match) {
    process(match.getP());  				
    
  }
}
