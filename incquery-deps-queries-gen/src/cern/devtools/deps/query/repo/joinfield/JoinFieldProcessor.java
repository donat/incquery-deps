package cern.devtools.deps.query.repo.joinfield;

import cern.devtools.deps.query.repo.joinfield.JoinFieldMatch;
import hu.bme.incquery.deps.repomodel.RField;
import hu.bme.incquery.deps.wsmodel.WField;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the joinField pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class JoinFieldProcessor implements IMatchProcessor<JoinFieldMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRm the value of pattern parameter rm in the currently processed match 
   * @param pWm the value of pattern parameter wm in the currently processed match 
   * 
   */
  public abstract void process(final RField rm, final WField wm);
  
  @Override
  public void process(final JoinFieldMatch match) {
    process(match.getRm(), match.getWm());  				
    
  }
}
