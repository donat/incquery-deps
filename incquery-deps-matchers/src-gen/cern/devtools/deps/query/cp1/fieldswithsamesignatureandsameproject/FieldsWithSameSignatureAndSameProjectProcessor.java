package cern.devtools.deps.query.cp1.fieldswithsamesignatureandsameproject;

import cern.devtools.deps.query.cp1.fieldswithsamesignatureandsameproject.FieldsWithSameSignatureAndSameProjectMatch;
import hu.bme.incquery.deps.cp1model.CP1Field;
import hu.bme.incquery.deps.wsmodel.WField;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the fieldsWithSameSignatureAndSameProject pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class FieldsWithSameSignatureAndSameProjectProcessor implements IMatchProcessor<FieldsWithSameSignatureAndSameProjectMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRepoField the value of pattern parameter repoField in the currently processed match 
   * @param pWsField the value of pattern parameter wsField in the currently processed match 
   * 
   */
  public abstract void process(final CP1Field repoField, final WField wsField);
  
  @Override
  public void process(final FieldsWithSameSignatureAndSameProjectMatch match) {
    process(match.getRepoField(), match.getWsField());  				
    
  }
}
