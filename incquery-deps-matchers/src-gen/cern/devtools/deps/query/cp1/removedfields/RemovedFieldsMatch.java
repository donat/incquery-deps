package cern.devtools.deps.query.cp1.removedfields;

import hu.bme.incquery.deps.cp1model.CP1Field;
import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the removedFields pattern, 
 * to be used in conjunction with RemovedFieldsMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see RemovedFieldsMatcher
 * @see RemovedFieldsProcessor
 * 
 */
public final class RemovedFieldsMatch extends BasePatternMatch implements IPatternMatch {
  private CP1Field fRepoField;
  
  private static String[] parameterNames = {"repoField"};
  
  RemovedFieldsMatch(final CP1Field pRepoField) {
    this.fRepoField = pRepoField;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("repoField".equals(parameterName)) return this.fRepoField;
    return null;
    
  }
  
  public CP1Field getRepoField() {
    return this.fRepoField;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("repoField".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.cp1model.CP1Field) {
    	this.fRepoField = (hu.bme.incquery.deps.cp1model.CP1Field) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setRepoField(final CP1Field pRepoField) {
    this.fRepoField = pRepoField;
    
  }
  
  @Override
  public String patternName() {
    return "removedFields";
    
  }
  
  @Override
  public String[] parameterNames() {
    return RemovedFieldsMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRepoField};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"repoField\"=" + prettyPrintValue(fRepoField));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRepoField == null) ? 0 : fRepoField.hashCode()); 
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
    if (!RemovedFieldsMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    RemovedFieldsMatch other = (RemovedFieldsMatch) obj;
    if (fRepoField == null) {if (other.fRepoField != null) return false;}
    else if (!fRepoField.equals(other.fRepoField)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return RemovedFieldsMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
