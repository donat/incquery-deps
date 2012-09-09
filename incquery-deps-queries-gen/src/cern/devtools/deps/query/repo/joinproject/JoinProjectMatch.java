package cern.devtools.deps.query.repo.joinproject;

import hu.bme.incquery.deps.repomodel.RProject;
import hu.bme.incquery.deps.wsmodel.WProject;
import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the joinProject pattern, 
 * to be used in conjunction with JoinProjectMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see JoinProjectMatcher
 * @see JoinProjectProcessor
 * 
 */
public final class JoinProjectMatch extends BasePatternMatch implements IPatternMatch {
  private RProject fRp;
  
  private WProject fWp;
  
  private static String[] parameterNames = {"rp", "wp"};
  
  JoinProjectMatch(final RProject pRp, final WProject pWp) {
    this.fRp = pRp;
    this.fWp = pWp;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("rp".equals(parameterName)) return this.fRp;
    if ("wp".equals(parameterName)) return this.fWp;
    return null;
    
  }
  
  public RProject getRp() {
    return this.fRp;
    
  }
  
  public WProject getWp() {
    return this.fWp;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("rp".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.repomodel.RProject) {
    	this.fRp = (hu.bme.incquery.deps.repomodel.RProject) newValue;
    	return true;
    }
    if ("wp".equals(parameterName) && newValue instanceof hu.bme.incquery.deps.wsmodel.WProject) {
    	this.fWp = (hu.bme.incquery.deps.wsmodel.WProject) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setRp(final RProject pRp) {
    this.fRp = pRp;
    
  }
  
  public void setWp(final WProject pWp) {
    this.fWp = pWp;
    
  }
  
  @Override
  public String patternName() {
    return "joinProject";
    
  }
  
  @Override
  public String[] parameterNames() {
    return JoinProjectMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRp, fWp};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"rp\"=" + prettyPrintValue(fRp) + ", ");
    result.append("\"wp\"=" + prettyPrintValue(fWp));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRp == null) ? 0 : fRp.hashCode()); 
    result = prime * result + ((fWp == null) ? 0 : fWp.hashCode()); 
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
    if (!JoinProjectMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    JoinProjectMatch other = (JoinProjectMatch) obj;
    if (fRp == null) {if (other.fRp != null) return false;}
    else if (!fRp.equals(other.fRp)) return false;
    if (fWp == null) {if (other.fWp != null) return false;}
    else if (!fWp.equals(other.fWp)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return JoinProjectMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
