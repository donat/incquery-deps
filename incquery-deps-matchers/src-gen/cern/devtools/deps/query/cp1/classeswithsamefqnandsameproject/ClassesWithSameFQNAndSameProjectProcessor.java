package cern.devtools.deps.query.cp1.classeswithsamefqnandsameproject;

import cern.devtools.deps.query.cp1.classeswithsamefqnandsameproject.ClassesWithSameFQNAndSameProjectMatch;
import hu.bme.incquery.deps.cp1model.CP1Class;
import hu.bme.incquery.deps.wsmodel.WType;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the classesWithSameFQNAndSameProject pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class ClassesWithSameFQNAndSameProjectProcessor implements IMatchProcessor<ClassesWithSameFQNAndSameProjectMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRepoClass the value of pattern parameter repoClass in the currently processed match 
   * @param pWsClass the value of pattern parameter wsClass in the currently processed match 
   * 
   */
  public abstract void process(final CP1Class repoClass, final WType wsClass);
  
  @Override
  public void process(final ClassesWithSameFQNAndSameProjectMatch match) {
    process(match.getRepoClass(), match.getWsClass());  				
    
  }
}
