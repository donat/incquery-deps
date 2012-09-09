package cern.devtools.deps.query.repo.joinproject;

import cern.devtools.deps.query.repo.joinproject.JoinProjectMatch;
import hu.bme.incquery.deps.repomodel.RProject;
import hu.bme.incquery.deps.wsmodel.WProject;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the joinProject pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class JoinProjectProcessor implements IMatchProcessor<JoinProjectMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRp the value of pattern parameter rp in the currently processed match 
   * @param pWp the value of pattern parameter wp in the currently processed match 
   * 
   */
  public abstract void process(final RProject rp, final WProject wp);
  
  @Override
  public void process(final JoinProjectMatch match) {
    process(match.getRp(), match.getWp());  				
    
  }
}
