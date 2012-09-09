package cern.devtools.deps.query.cp1.incomingfieldaccesses;

import cern.devtools.deps.query.cp1.incomingfieldaccesses.IncomingFieldAccessesMatch;
import hu.bme.incquery.deps.cp1model.CP1Method;
import hu.bme.incquery.deps.wsmodel.WField;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the incomingFieldAccesses pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class IncomingFieldAccessesProcessor implements IMatchProcessor<IncomingFieldAccessesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRepoSource the value of pattern parameter repoSource in the currently processed match 
   * @param pWsTarget the value of pattern parameter wsTarget in the currently processed match 
   * 
   */
  public abstract void process(final CP1Method repoSource, final WField wsTarget);
  
  @Override
  public void process(final IncomingFieldAccessesMatch match) {
    process(match.getRepoSource(), match.getWsTarget());  				
    
  }
}
