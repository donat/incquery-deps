package cern.devtools.deps.query.repo.incomingmethodoverridedeps;

import cern.devtools.deps.query.repo.incomingmethodoverridedeps.IncomingMethodOverrideDepsMatch;
import hu.bme.incquery.deps.repomodel.RMethod;
import hu.bme.incquery.deps.wsmodel.WMethod;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the incomingMethodOverrideDeps pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class IncomingMethodOverrideDepsProcessor implements IMatchProcessor<IncomingMethodOverrideDepsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pFrom the value of pattern parameter from in the currently processed match 
   * @param pTo the value of pattern parameter to in the currently processed match 
   * @param pWsTo the value of pattern parameter wsTo in the currently processed match 
   * 
   */
  public abstract void process(final RMethod from, final RMethod to, final WMethod wsTo);
  
  @Override
  public void process(final IncomingMethodOverrideDepsMatch match) {
    process(match.getFrom(), match.getTo(), match.getWsTo());  				
    
  }
}
