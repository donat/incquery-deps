package cern.devtools.deps.query.cp1.addedfields;

import cern.devtools.deps.query.cp1.addedfields.AddedFieldsMatch;
import hu.bme.incquery.deps.wsmodel.WField;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the addedFields pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class AddedFieldsProcessor implements IMatchProcessor<AddedFieldsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pWsField the value of pattern parameter wsField in the currently processed match 
   * 
   */
  public abstract void process(final WField wsField);
  
  @Override
  public void process(final AddedFieldsMatch match) {
    process(match.getWsField());  				
    
  }
}
