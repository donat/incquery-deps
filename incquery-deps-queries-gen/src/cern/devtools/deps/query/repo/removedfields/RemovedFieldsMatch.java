package cern.devtools.deps.query.repo.removedfields;

import hu.bme.incquery.deps.repomodel.RField;
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
  private RField fF;
  
  private static String[] parameterNames = {"f"};
  
  RemovedFieldsMatch(final RField pF) {
    this.fF = pF;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("f".equals(parameterName)) return this.fF;
    return null;
    
  }
  
  public RField getF() {
    return this.fF;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("f".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.repomodel.RField) {
    	this.fF = (hu.bme.incquery.deps.repomodel.RField) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setF(final RField pF) {
    this.fF = pF;
    
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
    return new Object[]{fF};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"f\"=" + prettyPrintValue(fF));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fF == null) ? 0 : fF.hashCode()); 
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
    if (fF == null) {if (other.fF != null) return false;}
    else if (!fF.equals(other.fF)) return false;
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
