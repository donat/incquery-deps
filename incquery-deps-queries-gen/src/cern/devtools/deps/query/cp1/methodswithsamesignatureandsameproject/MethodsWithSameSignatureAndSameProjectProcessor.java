package cern.devtools.deps.query.cp1.methodswithsamesignatureandsameproject;

import cern.devtools.deps.query.cp1.methodswithsamesignatureandsameproject.MethodsWithSameSignatureAndSameProjectMatch;
import hu.bme.incquery.deps.cp1model.CP1Method;
import hu.bme.incquery.deps.wsmodel.WMethod;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the methodsWithSameSignatureAndSameProject pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class MethodsWithSameSignatureAndSameProjectProcessor implements IMatchProcessor<MethodsWithSameSignatureAndSameProjectMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRepoMethod the value of pattern parameter repoMethod in the currently processed match 
   * @param pWsMethod the value of pattern parameter wsMethod in the currently processed match 
   * 
   */
  public abstract void process(final CP1Method repoMethod, final WMethod wsMethod);
  
  @Override
  public void process(final MethodsWithSameSignatureAndSameProjectMatch match) {
    process(match.getRepoMethod(), match.getWsMethod());  				
    
  }
}
