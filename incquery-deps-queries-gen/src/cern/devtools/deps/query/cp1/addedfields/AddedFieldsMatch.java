package cern.devtools.deps.query.cp1.addedfields;

import hu.bme.incquery.deps.wsmodel.WField;
import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the addedFields pattern, 
 * to be used in conjunction with AddedFieldsMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AddedFieldsMatcher
 * @see AddedFieldsProcessor
 * 
 */
public final class AddedFieldsMatch extends BasePatternMatch implements IPatternMatch {
  private WField fWsField;
  
  private static String[] parameterNames = {"wsField"};
  
  AddedFieldsMatch(final WField pWsField) {
    this.fWsField = pWsField;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("wsField".equals(parameterName)) return this.fWsField;
    return null;
    
  }
  
  public WField getWsField() {
    return this.fWsField;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("wsField".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.wsmodel.WField) {
    	this.fWsField = (hu.bme.incquery.deps.wsmodel.WField) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setWsField(final WField pWsField) {
    this.fWsField = pWsField;
    
  }
  
  @Override
  public String patternName() {
    return "addedFields";
    
  }
  
  @Override
  public String[] parameterNames() {
    return AddedFieldsMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fWsField};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"wsField\"=" + prettyPrintValue(fWsField));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fWsField == null) ? 0 : fWsField.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (obj == null)
    	return false;
    if (!(obj instanceof IPatternMatch))
    	return false;
    IPatternMatch otherSig  = (IPatternMatch) obj;
    if (!pattern().equals(otherSig.pattern()))
    	return false;
    if (!AddedFieldsMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    AddedFieldsMatch other = (AddedFieldsMatch) obj;
    if (fWsField == null) {if (other.fWsField != null) return false;}
    else if (!fWsField.equals(other.fWsField)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return AddedFieldsMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
