package cern.devtools.deps.query.cp1.wsproject;

import hu.bme.incquery.deps.wsmodel.WProject;
import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the wsProject pattern, 
 * to be used in conjunction with WsProjectMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see WsProjectMatcher
 * @see WsProjectProcessor
 * 
 */
public final class WsProjectMatch extends BasePatternMatch implements IPatternMatch {
  private WProject fP;
  
  private static String[] parameterNames = {"p"};
  
  WsProjectMatch(final WProject pP) {
    this.fP = pP;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("p".equals(parameterName)) return this.fP;
    return null;
    
  }
  
  public WProject getP() {
    return this.fP;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("p".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.wsmodel.WProject) {
    	this.fP = (hu.bme.incquery.deps.wsmodel.WProject) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setP(final WProject pP) {
    this.fP = pP;
    
  }
  
  @Override
  public String patternName() {
    return "wsProject";
    
  }
  
  @Override
  public String[] parameterNames() {
    return WsProjectMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fP};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"p\"=" + prettyPrintValue(fP));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fP == null) ? 0 : fP.hashCode()); 
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
    if (!WsProjectMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    WsProjectMatch other = (WsProjectMatch) obj;
    if (fP == null) {if (other.fP != null) return false;}
    else if (!fP.equals(other.fP)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return WsProjectMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
