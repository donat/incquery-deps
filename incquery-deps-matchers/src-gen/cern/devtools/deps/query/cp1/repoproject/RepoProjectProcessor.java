package cern.devtools.deps.query.cp1.repoproject;

import cern.devtools.deps.query.cp1.repoproject.RepoProjectMatch;
import hu.bme.incquery.deps.cp1model.CP1Project;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the repoProject pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class RepoProjectProcessor implements IMatchProcessor<RepoProjectMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pP the value of pattern parameter p in the currently processed match 
   * 
   */
  public abstract void process(final CP1Project p);
  
  @Override
  public void process(final RepoProjectMatch match) {
    process(match.getP());  				
    
  }
}
