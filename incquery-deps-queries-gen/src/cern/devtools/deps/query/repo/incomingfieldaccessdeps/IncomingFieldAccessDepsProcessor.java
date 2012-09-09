package cern.devtools.deps.query.repo.incomingfieldaccessdeps;

import cern.devtools.deps.query.repo.incomingfieldaccessdeps.IncomingFieldAccessDepsMatch;
import hu.bme.incquery.deps.repomodel.RField;
import hu.bme.incquery.deps.repomodel.RMethod;
import hu.bme.incquery.deps.wsmodel.WField;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the incomingFieldAccessDeps pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class IncomingFieldAccessDepsProcessor implements IMatchProcessor<IncomingFieldAccessDepsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pFrom the value of pattern parameter from in the currently processed match 
   * @param pTo the value of pattern parameter to in the currently processed match 
   * @param pWsTo the value of pattern parameter wsTo in the currently processed match 
   * 
   */
  public abstract void process(final RMethod from, final RField to, final WField wsTo);
  
  @Override
  public void process(final IncomingFieldAccessDepsMatch match) {
    process(match.getFrom(), match.getTo(), match.getWsTo());  				
    
  }
}
