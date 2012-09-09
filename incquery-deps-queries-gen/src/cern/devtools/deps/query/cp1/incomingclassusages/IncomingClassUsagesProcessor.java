package cern.devtools.deps.query.cp1.incomingclassusages;

import cern.devtools.deps.query.cp1.incomingclassusages.IncomingClassUsagesMatch;
import hu.bme.incquery.deps.cp1model.CP1Class;
import hu.bme.incquery.deps.wsmodel.WType;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the incomingClassUsages pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class IncomingClassUsagesProcessor implements IMatchProcessor<IncomingClassUsagesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRepoSource the value of pattern parameter repoSource in the currently processed match 
   * @param pWsTarget the value of pattern parameter wsTarget in the currently processed match 
   * 
   */
  public abstract void process(final CP1Class repoSource, final WType wsTarget);
  
  @Override
  public void process(final IncomingClassUsagesMatch match) {
    process(match.getRepoSource(), match.getWsTarget());  				
    
  }
}
