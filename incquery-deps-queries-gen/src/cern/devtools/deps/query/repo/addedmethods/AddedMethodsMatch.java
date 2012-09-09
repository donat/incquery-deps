package cern.devtools.deps.query.repo.addedmethods;

import hu.bme.incquery.deps.wsmodel.WMethod;
import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the addedMethods pattern, 
 * to be used in conjunction with AddedMethodsMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AddedMethodsMatcher
 * @see AddedMethodsProcessor
 * 
 */
public final class AddedMethodsMatch extends BasePatternMatch implements IPatternMatch {
  private WMethod fC;
  
  private static String[] parameterNames = {"c"};
  
  AddedMethodsMatch(final WMethod pC) {
    this.fC = pC;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("c".equals(parameterName)) return this.fC;
    return null;
    
  }
  
  public WMethod getC() {
    return this.fC;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("c".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.wsmodel.WMethod) {
    	this.fC = (hu.bme.incquery.deps.wsmodel.WMethod) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setC(final WMethod pC) {
    this.fC = pC;
    
  }
  
  @Override
  public String patternName() {
    return "addedMethods";
    
  }
  
  @Override
  public String[] parameterNames() {
    return AddedMethodsMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fC};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"c\"=" + prettyPrintValue(fC));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fC == null) ? 0 : fC.hashCode()); 
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
    if (!AddedMethodsMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    AddedMethodsMatch other = (AddedMethodsMatch) obj;
    if (fC == null) {if (other.fC != null) return false;}
    else if (!fC.equals(other.fC)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return AddedMethodsMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
