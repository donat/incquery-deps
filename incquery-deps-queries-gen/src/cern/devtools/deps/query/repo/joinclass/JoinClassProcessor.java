package cern.devtools.deps.query.repo.joinclass;

import cern.devtools.deps.query.repo.joinclass.JoinClassMatch;
import hu.bme.incquery.deps.repomodel.RClass;
import hu.bme.incquery.deps.wsmodel.WType;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the joinClass pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class JoinClassProcessor implements IMatchProcessor<JoinClassMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRc the value of pattern parameter rc in the currently processed match 
   * @param pWc the value of pattern parameter wc in the currently processed match 
   * 
   */
  public abstract void process(final RClass rc, final WType wc);
  
  @Override
  public void process(final JoinClassMatch match) {
    process(match.getRc(), match.getWc());  				
    
  }
}
