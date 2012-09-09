package cern.devtools.deps.query.cp1.incomingmethodoverrides;

import hu.bme.incquery.deps.cp1model.CP1Method;
import hu.bme.incquery.deps.wsmodel.WMethod;
import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the incomingMethodOverrides pattern, 
 * to be used in conjunction with IncomingMethodOverridesMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see IncomingMethodOverridesMatcher
 * @see IncomingMethodOverridesProcessor
 * 
 */
public final class IncomingMethodOverridesMatch extends BasePatternMatch implements IPatternMatch {
  private CP1Method fRepoSource;
  
  private WMethod fWsTarget;
  
  private static String[] parameterNames = {"repoSource", "wsTarget"};
  
  IncomingMethodOverridesMatch(final CP1Method pRepoSource, final WMethod pWsTarget) {
    this.fRepoSource = pRepoSource;
    this.fWsTarget = pWsTarget;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("repoSource".equals(parameterName)) return this.fRepoSource;
    if ("wsTarget".equals(parameterName)) return this.fWsTarget;
    return null;
    
  }
  
  public CP1Method getRepoSource() {
    return this.fRepoSource;
    
  }
  
  public WMethod getWsTarget() {
    return this.fWsTarget;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("repoSource".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.cp1model.CP1Method) {
    	this.fRepoSource = (hu.bme.incquery.deps.cp1model.CP1Method) newValue;
    	return true;
    }
    if ("wsTarget".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.wsmodel.WMethod) {
    	this.fWsTarget = (hu.bme.incquery.deps.wsmodel.WMethod) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setRepoSource(final CP1Method pRepoSource) {
    this.fRepoSource = pRepoSource;
    
  }
  
  public void setWsTarget(final WMethod pWsTarget) {
    this.fWsTarget = pWsTarget;
    
  }
  
  @Override
  public String patternName() {
    return "incomingMethodOverrides";
    
  }
  
  @Override
  public String[] parameterNames() {
    return IncomingMethodOverridesMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRepoSource, fWsTarget};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"repoSource\"=" + prettyPrintValue(fRepoSource) + ", ");
    result.append("\"wsTarget\"=" + prettyPrintValue(fWsTarget));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRepoSource == null) ? 0 : fRepoSource.hashCode()); 
    result = prime * result + ((fWsTarget == null) ? 0 : fWsTarget.hashCode()); 
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
    if (!IncomingMethodOverridesMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    IncomingMethodOverridesMatch other = (IncomingMethodOverridesMatch) obj;
    if (fRepoSource == null) {if (other.fRepoSource != null) return false;}
    else if (!fRepoSource.equals(other.fRepoSource)) return false;
    if (fWsTarget == null) {if (other.fWsTarget != null) return false;}
    else if (!fWsTarget.equals(other.fWsTarget)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return IncomingMethodOverridesMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
