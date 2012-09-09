package cern.devtools.deps.query.repo.joinclass;

import hu.bme.incquery.deps.repomodel.RClass;
import hu.bme.incquery.deps.wsmodel.WType;
import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the joinClass pattern, 
 * to be used in conjunction with JoinClassMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see JoinClassMatcher
 * @see JoinClassProcessor
 * 
 */
public final class JoinClassMatch extends BasePatternMatch implements IPatternMatch {
  private RClass fRc;
  
  private WType fWc;
  
  private static String[] parameterNames = {"rc", "wc"};
  
  JoinClassMatch(final RClass pRc, final WType pWc) {
    this.fRc = pRc;
    this.fWc = pWc;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("rc".equals(parameterName)) return this.fRc;
    if ("wc".equals(parameterName)) return this.fWc;
    return null;
    
  }
  
  public RClass getRc() {
    return this.fRc;
    
  }
  
  public WType getWc() {
    return this.fWc;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("rc".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.repomodel.RClass) {
    	this.fRc = (hu.bme.incquery.deps.repomodel.RClass) newValue;
    	return true;
    }
    if ("wc".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.wsmodel.WType) {
    	this.fWc = (hu.bme.incquery.deps.wsmodel.WType) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setRc(final RClass pRc) {
    this.fRc = pRc;
    
  }
  
  public void setWc(final WType pWc) {
    this.fWc = pWc;
    
  }
  
  @Override
  public String patternName() {
    return "joinClass";
    
  }
  
  @Override
  public String[] parameterNames() {
    return JoinClassMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRc, fWc};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"rc\"=" + prettyPrintValue(fRc) + ", ");
    result.append("\"wc\"=" + prettyPrintValue(fWc));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRc == null) ? 0 : fRc.hashCode()); 
    result = prime * result + ((fWc == null) ? 0 : fWc.hashCode()); 
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
    if (!JoinClassMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    JoinClassMatch other = (JoinClassMatch) obj;
    if (fRc == null) {if (other.fRc != null) return false;}
    else if (!fRc.equals(other.fRc)) return false;
    if (fWc == null) {if (other.fWc != null) return false;}
    else if (!fWc.equals(other.fWc)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return JoinClassMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
