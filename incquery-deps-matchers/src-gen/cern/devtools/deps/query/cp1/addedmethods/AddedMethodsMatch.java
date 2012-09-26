package cern.devtools.deps.query.cp1.addedmethods;

import hu.bme.incquery.deps.wsmodel.WMethod;
import hu.bme.incquery.deps.wsmodel.WType;
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
  private WMethod fWsMethod;
  
  private WType fWsClass;
  
  private static String[] parameterNames = {"wsMethod", "wsClass"};
  
  AddedMethodsMatch(final WMethod pWsMethod, final WType pWsClass) {
    this.fWsMethod = pWsMethod;
    this.fWsClass = pWsClass;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("wsMethod".equals(parameterName)) return this.fWsMethod;
    if ("wsClass".equals(parameterName)) return this.fWsClass;
    return null;
    
  }
  
  public WMethod getWsMethod() {
    return this.fWsMethod;
    
  }
  
  public WType getWsClass() {
    return this.fWsClass;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("wsMethod".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.wsmodel.WMethod) {
    	this.fWsMethod = (hu.bme.incquery.deps.wsmodel.WMethod) newValue;
    	return true;
    }
    if ("wsClass".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.wsmodel.WType) {
    	this.fWsClass = (hu.bme.incquery.deps.wsmodel.WType) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setWsMethod(final WMethod pWsMethod) {
    this.fWsMethod = pWsMethod;
    
  }
  
  public void setWsClass(final WType pWsClass) {
    this.fWsClass = pWsClass;
    
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
    return new Object[]{fWsMethod, fWsClass};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"wsMethod\"=" + prettyPrintValue(fWsMethod) + ", ");
    result.append("\"wsClass\"=" + prettyPrintValue(fWsClass));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fWsMethod == null) ? 0 : fWsMethod.hashCode()); 
    result = prime * result + ((fWsClass == null) ? 0 : fWsClass.hashCode()); 
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
    if (fWsMethod == null) {if (other.fWsMethod != null) return false;}
    else if (!fWsMethod.equals(other.fWsMethod)) return false;
    if (fWsClass == null) {if (other.fWsClass != null) return false;}
    else if (!fWsClass.equals(other.fWsClass)) return false;
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
