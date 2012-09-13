package cern.devtools.deps.query.cp1.methodswithsamesignatureandsameproject;

import hu.bme.incquery.deps.cp1model.CP1Method;
import hu.bme.incquery.deps.wsmodel.WMethod;
import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the methodsWithSameSignatureAndSameProject pattern, 
 * to be used in conjunction with MethodsWithSameSignatureAndSameProjectMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see MethodsWithSameSignatureAndSameProjectMatcher
 * @see MethodsWithSameSignatureAndSameProjectProcessor
 * 
 */
public final class MethodsWithSameSignatureAndSameProjectMatch extends BasePatternMatch implements IPatternMatch {
  private CP1Method fRepoMethod;
  
  private WMethod fWsMethod;
  
  private static String[] parameterNames = {"repoMethod", "wsMethod"};
  
  MethodsWithSameSignatureAndSameProjectMatch(final CP1Method pRepoMethod, final WMethod pWsMethod) {
    this.fRepoMethod = pRepoMethod;
    this.fWsMethod = pWsMethod;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("repoMethod".equals(parameterName)) return this.fRepoMethod;
    if ("wsMethod".equals(parameterName)) return this.fWsMethod;
    return null;
    
  }
  
  public CP1Method getRepoMethod() {
    return this.fRepoMethod;
    
  }
  
  public WMethod getWsMethod() {
    return this.fWsMethod;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("repoMethod".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.cp1model.CP1Method) {
    	this.fRepoMethod = (hu.bme.incquery.deps.cp1model.CP1Method) newValue;
    	return true;
    }
    if ("wsMethod".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.wsmodel.WMethod) {
    	this.fWsMethod = (hu.bme.incquery.deps.wsmodel.WMethod) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setRepoMethod(final CP1Method pRepoMethod) {
    this.fRepoMethod = pRepoMethod;
    
  }
  
  public void setWsMethod(final WMethod pWsMethod) {
    this.fWsMethod = pWsMethod;
    
  }
  
  @Override
  public String patternName() {
    return "methodsWithSameSignatureAndSameProject";
    
  }
  
  @Override
  public String[] parameterNames() {
    return MethodsWithSameSignatureAndSameProjectMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRepoMethod, fWsMethod};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"repoMethod\"=" + prettyPrintValue(fRepoMethod) + ", ");
    result.append("\"wsMethod\"=" + prettyPrintValue(fWsMethod));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRepoMethod == null) ? 0 : fRepoMethod.hashCode()); 
    result = prime * result + ((fWsMethod == null) ? 0 : fWsMethod.hashCode()); 
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
    if (!MethodsWithSameSignatureAndSameProjectMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    MethodsWithSameSignatureAndSameProjectMatch other = (MethodsWithSameSignatureAndSameProjectMatch) obj;
    if (fRepoMethod == null) {if (other.fRepoMethod != null) return false;}
    else if (!fRepoMethod.equals(other.fRepoMethod)) return false;
    if (fWsMethod == null) {if (other.fWsMethod != null) return false;}
    else if (!fWsMethod.equals(other.fWsMethod)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return MethodsWithSameSignatureAndSameProjectMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
