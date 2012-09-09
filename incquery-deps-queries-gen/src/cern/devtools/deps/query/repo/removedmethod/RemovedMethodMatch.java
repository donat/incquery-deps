package cern.devtools.deps.query.repo.removedmethod;

import hu.bme.incquery.deps.repomodel.RMethod;
import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the removedMethod pattern, 
 * to be used in conjunction with RemovedMethodMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see RemovedMethodMatcher
 * @see RemovedMethodProcessor
 * 
 */
public final class RemovedMethodMatch extends BasePatternMatch implements IPatternMatch {
  private RMethod fM;
  
  private static String[] parameterNames = {"m"};
  
  RemovedMethodMatch(final RMethod pM) {
    this.fM = pM;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("m".equals(parameterName)) return this.fM;
    return null;
    
  }
  
  public RMethod getM() {
    return this.fM;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("m".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.repomodel.RMethod) {
    	this.fM = (hu.bme.incquery.deps.repomodel.RMethod) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setM(final RMethod pM) {
    this.fM = pM;
    
  }
  
  @Override
  public String patternName() {
    return "removedMethod";
    
  }
  
  @Override
  public String[] parameterNames() {
    return RemovedMethodMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fM};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"m\"=" + prettyPrintValue(fM));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fM == null) ? 0 : fM.hashCode()); 
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
    if (!RemovedMethodMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    RemovedMethodMatch other = (RemovedMethodMatch) obj;
    if (fM == null) {if (other.fM != null) return false;}
    else if (!fM.equals(other.fM)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return RemovedMethodMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
