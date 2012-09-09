package cern.devtools.deps.query.repo.joinmethod;

import cern.devtools.deps.query.repo.joinmethod.JoinMethodMatch;
import hu.bme.incquery.deps.repomodel.RMethod;
import hu.bme.incquery.deps.wsmodel.WMethod;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the joinMethod pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class JoinMethodProcessor implements IMatchProcessor<JoinMethodMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRm the value of pattern parameter rm in the currently processed match 
   * @param pWm the value of pattern parameter wm in the currently processed match 
   * 
   */
  public abstract void process(final RMethod rm, final WMethod wm);
  
  @Override
  public void process(final JoinMethodMatch match) {
    process(match.getRm(), match.getWm());  				
    
  }
}
