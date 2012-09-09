package cern.devtools.deps.query.repo.incomingmethodcalldeps;

import cern.devtools.deps.query.repo.incomingmethodcalldeps.IncomingMethodCallDepsMatch;
import hu.bme.incquery.deps.repomodel.RMethod;
import hu.bme.incquery.deps.wsmodel.WMethod;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the incomingMethodCallDeps pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class IncomingMethodCallDepsProcessor implements IMatchProcessor<IncomingMethodCallDepsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pFrom the value of pattern parameter from in the currently processed match 
   * @param pTo the value of pattern parameter to in the currently processed match 
   * @param pWsTo the value of pattern parameter wsTo in the currently processed match 
   * 
   */
  public abstract void process(final RMethod from, final RMethod to, final WMethod wsTo);
  
  @Override
  public void process(final IncomingMethodCallDepsMatch match) {
    process(match.getFrom(), match.getTo(), match.getWsTo());  				
    
  }
}
