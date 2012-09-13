package cern.devtools.deps.query.cp1.fieldswithsamesignatureandsameproject;

import hu.bme.incquery.deps.cp1model.CP1Field;
import hu.bme.incquery.deps.wsmodel.WField;
import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the fieldsWithSameSignatureAndSameProject pattern, 
 * to be used in conjunction with FieldsWithSameSignatureAndSameProjectMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see FieldsWithSameSignatureAndSameProjectMatcher
 * @see FieldsWithSameSignatureAndSameProjectProcessor
 * 
 */
public final class FieldsWithSameSignatureAndSameProjectMatch extends BasePatternMatch implements IPatternMatch {
  private CP1Field fRepoField;
  
  private WField fWsField;
  
  private static String[] parameterNames = {"repoField", "wsField"};
  
  FieldsWithSameSignatureAndSameProjectMatch(final CP1Field pRepoField, final WField pWsField) {
    this.fRepoField = pRepoField;
    this.fWsField = pWsField;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("repoField".equals(parameterName)) return this.fRepoField;
    if ("wsField".equals(parameterName)) return this.fWsField;
    return null;
    
  }
  
  public CP1Field getRepoField() {
    return this.fRepoField;
    
  }
  
  public WField getWsField() {
    return this.fWsField;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("repoField".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.cp1model.CP1Field) {
    	this.fRepoField = (hu.bme.incquery.deps.cp1model.CP1Field) newValue;
    	return true;
    }
    if ("wsField".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.wsmodel.WField) {
    	this.fWsField = (hu.bme.incquery.deps.wsmodel.WField) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setRepoField(final CP1Field pRepoField) {
    this.fRepoField = pRepoField;
    
  }
  
  public void setWsField(final WField pWsField) {
    this.fWsField = pWsField;
    
  }
  
  @Override
  public String patternName() {
    return "fieldsWithSameSignatureAndSameProject";
    
  }
  
  @Override
  public String[] parameterNames() {
    return FieldsWithSameSignatureAndSameProjectMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRepoField, fWsField};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"repoField\"=" + prettyPrintValue(fRepoField) + ", ");
    result.append("\"wsField\"=" + prettyPrintValue(fWsField));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRepoField == null) ? 0 : fRepoField.hashCode()); 
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
    if (!FieldsWithSameSignatureAndSameProjectMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    FieldsWithSameSignatureAndSameProjectMatch other = (FieldsWithSameSignatureAndSameProjectMatch) obj;
    if (fRepoField == null) {if (other.fRepoField != null) return false;}
    else if (!fRepoField.equals(other.fRepoField)) return false;
    if (fWsField == null) {if (other.fWsField != null) return false;}
    else if (!fWsField.equals(other.fWsField)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return FieldsWithSameSignatureAndSameProjectMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
