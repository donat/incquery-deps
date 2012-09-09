package cern.devtools.deps.query.repo.incominginheritancedeps;

import cern.devtools.deps.query.repo.incominginheritancedeps.IncomingInheritanceDepsMatch;
import hu.bme.incquery.deps.repomodel.RClass;
import hu.bme.incquery.deps.wsmodel.WType;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the incomingInheritanceDeps pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class IncomingInheritanceDepsProcessor implements IMatchProcessor<IncomingInheritanceDepsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pFrom the value of pattern parameter from in the currently processed match 
   * @param pTo the value of pattern parameter to in the currently processed match 
   * @param pWsTo the value of pattern parameter wsTo in the currently processed match 
   * 
   */
  public abstract void process(final RClass from, final RClass to, final WType wsTo);
  
  @Override
  public void process(final IncomingInheritanceDepsMatch match) {
    process(match.getFrom(), match.getTo(), match.getWsTo());  				
    
  }
}
