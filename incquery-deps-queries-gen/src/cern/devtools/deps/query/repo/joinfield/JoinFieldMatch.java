package cern.devtools.deps.query.repo.joinfield;

import hu.bme.incquery.deps.repomodel.RField;
import hu.bme.incquery.deps.wsmodel.WField;
import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the joinField pattern, 
 * to be used in conjunction with JoinFieldMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see JoinFieldMatcher
 * @see JoinFieldProcessor
 * 
 */
public final class JoinFieldMatch extends BasePatternMatch implements IPatternMatch {
  private RField fRm;
  
  private WField fWm;
  
  private static String[] parameterNames = {"rm", "wm"};
  
  JoinFieldMatch(final RField pRm, final WField pWm) {
    this.fRm = pRm;
    this.fWm = pWm;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("rm".equals(parameterName)) return this.fRm;
    if ("wm".equals(parameterName)) return this.fWm;
    return null;
    
  }
  
  public RField getRm() {
    return this.fRm;
    
  }
  
  public WField getWm() {
    return this.fWm;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("rm".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.repomodel.RField) {
    	this.fRm = (hu.bme.incquery.deps.repomodel.RField) newValue;
    	return true;
    }
    if ("wm".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.wsmodel.WField) {
    	this.fWm = (hu.bme.incquery.deps.wsmodel.WField) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setRm(final RField pRm) {
    this.fRm = pRm;
    
  }
  
  public void setWm(final WField pWm) {
    this.fWm = pWm;
    
  }
  
  @Override
  public String patternName() {
    return "joinField";
    
  }
  
  @Override
  public String[] parameterNames() {
    return JoinFieldMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRm, fWm};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"rm\"=" + prettyPrintValue(fRm) + ", ");
    result.append("\"wm\"=" + prettyPrintValue(fWm));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRm == null) ? 0 : fRm.hashCode()); 
    result = prime * result + ((fWm == null) ? 0 : fWm.hashCode()); 
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
    if (!JoinFieldMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    JoinFieldMatch other = (JoinFieldMatch) obj;
    if (fRm == null) {if (other.fRm != null) return false;}
    else if (!fRm.equals(other.fRm)) return false;
    if (fWm == null) {if (other.fWm != null) return false;}
    else if (!fWm.equals(other.fWm)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return JoinFieldMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
